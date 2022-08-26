package com.kyanite.deeperdarker.datagen.lang;

import com.kyanite.deeperdarker.miscellaneous.datagen_lang.FabricLanguageProvider;
import com.kyanite.deeperdarker.miscellaneous.datagen_lang.LanguageConsumer;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.world.item.Item;

import java.util.Map;

public class ENLanguageProvider extends FabricLanguageProvider {
    public ENLanguageProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateLanguages(LanguageConsumer languageConsumer) {
        for(Map.Entry<String, Item> item : DDItems.REGISTERED_ITEMS.entrySet()) languageConsumer.addLanguage(item.getValue(), convertToName(item.getKey()));
        languageConsumer.addLanguage("itemGroup.deeperdarker.deeperdarkertab", "Deeper And Darker");

        languageConsumer.addLanguage("subtitles.ambience.portal.groan", "The Otherside forebodes");
        languageConsumer.addLanguage("subtitles.entity.snapper.ambient", "Sculk Snapper breathes");
        languageConsumer.addLanguage("subtitles.entity.snapper.bite", "Sculk Snapper bites");
        languageConsumer.addLanguage("subtitles.entity.snapper.hurt", "Sculk Snapper hurts");
        languageConsumer.addLanguage("subtitles.entity.snapper.sniff", "Sculk Snapper sniffs");

        languageConsumer.addLanguage("item.deeperdarker.sculk_transmitter.linked", "Linked");
        languageConsumer.addLanguage("item.deeperdarker.sculk_transmitter.not_container", "Cannot link to block");
        languageConsumer.addLanguage("item.deeperdarker.sculk_transmitter.not_found", "The linked block is missing or obstructed");
        languageConsumer.addLanguage("item.deeperdarker.sculk_transmitter.not_linked", "Unlinked");
        languageConsumer.addLanguage("subtitles.item.transmitter.link", "Transmitter links");
        languageConsumer.addLanguage("subtitles.item.transmitter.transmit", "Transmitter transmits");
    }

    private String convertToName(String key) {
        StringBuilder builder = new StringBuilder(key.substring(0, 1).toUpperCase() + key.substring(1));
        for(int i = 1; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        String name = builder.toString();
        if(name.contains("Chest Boat")) name = name.substring(0, name.indexOf("Chest")) + "Boat with Chest";
        if(name.equals("Heart Of The Deep")) name = "Heart of the Deep";

        return name;
    }
}
