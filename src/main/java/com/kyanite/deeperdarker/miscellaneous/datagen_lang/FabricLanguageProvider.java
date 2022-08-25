package com.kyanite.deeperdarker.miscellaneous.datagen_lang;

import com.google.common.cache.Cache;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.server.commands.data.DataCommands;

import java.io.DataOutput;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public abstract class FabricLanguageProvider implements DataProvider {
    protected final FabricDataGenerator dataGenerator;
    private final String languageCode;

    protected FabricLanguageProvider(FabricDataGenerator dataGenerator) {
        this(dataGenerator, "en_us");
    }

    protected FabricLanguageProvider(FabricDataGenerator dataGenerator, String languageCode) {
        this.dataGenerator = dataGenerator;
        this.languageCode = languageCode;
    }

    /**
     * Implement this method to register languages.
     *
     * <p>Call {@link LanguageConsumer#addLanguage(String, String)} to add a language entry.
     */
    public abstract void generateLanguages(LanguageConsumer languageConsumer);

    @Override
    public void run(CachedOutput writer) throws IOException {
        TreeMap<String, String> languageEntries = new TreeMap<>();

        generateLanguages(languageEntries::put);

        JsonObject langEntryJson = new JsonObject();

        for (Map.Entry<String, String> entry : languageEntries.entrySet()) {
            langEntryJson.addProperty(entry.getKey(), entry.getValue());
        }

        DataProvider.saveStable(writer, langEntryJson, getLangFilePath(this.languageCode));
    }

    private Path getLangFilePath(String code) {
        return dataGenerator.getOutputFolder().resolve("assets/%s/lang/%s.json".formatted(dataGenerator.getModId(), code));
    }

    @Override
    public String getName() {
        return "Languages";
    }
}