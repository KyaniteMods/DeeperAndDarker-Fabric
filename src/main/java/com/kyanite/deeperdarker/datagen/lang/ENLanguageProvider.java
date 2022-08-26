package com.kyanite.deeperdarker.datagen.lang;

import com.kyanite.deeperdarker.miscellaneous.datagen_lang.FabricLanguageProvider;
import com.kyanite.deeperdarker.miscellaneous.datagen_lang.LanguageConsumer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ENLanguageProvider extends FabricLanguageProvider {
    public ENLanguageProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateLanguages(LanguageConsumer languageConsumer) {
        languageConsumer.addLanguage("itemGroup.deeperdarker.deeperdarkertab", "Deeper And Darker");
    }
}
