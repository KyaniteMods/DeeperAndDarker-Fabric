package com.kyanite.deeperdarker.datagen.lang;

import com.kyanite.deeperdarker.miscellaneous.datagen_lang.FabricLanguageProvider;
import com.kyanite.deeperdarker.miscellaneous.datagen_lang.LanguageConsumer;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.entities.DDEntities;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class ENLanguageProvider extends FabricLanguageProvider {
    private static final String NORMAL_CHARS = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_,;.?!/\\'";
    private static final String UPSIDE_DOWN_CHARS = " ɐqɔpǝɟbɥıظʞןɯuodbɹsʇnʌʍxʎzⱯᗺƆᗡƎℲ⅁HIſʞꞀWNOԀὉᴚS⟘∩ΛMXʎZ0ƖᄅƐㄣϛ9ㄥ86‾'؛˙¿¡/\\,";
    private final boolean upsideDown;

    public ENLanguageProvider(FabricDataGenerator dataGenerator, String languageCode, boolean upsideDown) {
        super(dataGenerator, languageCode);
        this.upsideDown = upsideDown;
    }


    @Override
    public void generateLanguages(LanguageConsumer languageConsumer) {
        for(Map.Entry<String, Item> item : DDItems.REGISTERED_ITEMS.entrySet()) if(!(item.getValue() instanceof BlockItem)) languageConsumer.addLanguage(item.getValue(), convertToName(item.getKey()));
        for(Map.Entry<String, Block> block : DDBlocks.BLOCKS.entrySet()) languageConsumer.addLanguage(block.getValue(), convertToName(block.getKey()));
        for(Map.Entry<String, EntityType> entity : DDEntities.ENTITIES.entrySet()) languageConsumer.addLanguage(entity.getValue(), convertToName(entity.getKey()));

        add(languageConsumer,"itemGroup.deeperdarker.deeperdarkertab", "Deeper And Darker");

        add(languageConsumer,"advancements.deeperdarker.root.title", "Sculk Story");
        add(languageConsumer,"advancements.deeperdarker.root.description", "You feel something pulling you toward the underground...");
        add(languageConsumer,"advancements.deeperdarker.obtain_membrane.title", "Sleepless Nights");
        add(languageConsumer,"advancements.deeperdarker.obtain_membrane.description", "Slay a monster of the night sky");
        add(languageConsumer,"advancements.deeperdarker.locate_ancient_city.title", "A Metropolis of Restless Souls");
        add(languageConsumer,"advancements.deeperdarker.locate_ancient_city.description", "Find an Ancient City");
        add(languageConsumer,"advancements.deeperdarker.kill_warden.title", "Phantom Thief");
        add(languageConsumer,"advancements.deeperdarker.kill_warden.description", "Slay the Warden and take its heart... ew");
        add(languageConsumer,"advancements.deeperdarker.enter_otherside.title", "Below the Bedrock");
        add(languageConsumer,"advancements.deeperdarker.enter_otherside.description", "Deep below the bedrock... the darkness awaits");
        add(languageConsumer,"advancements.deeperdarker.explore_otherside.title", "Echolocation");
        add(languageConsumer,"advancements.deeperdarker.explore_otherside.description", "Explore all Otherside biomes");
        add(languageConsumer,"advancements.deeperdarker.reinforce_shard.title", "Sculk Engineer");
        add(languageConsumer,"advancements.deeperdarker.reinforce_shard.description", "Reinforce an Echo Shard");
        add(languageConsumer,"advancements.deeperdarker.obtain_transmitter.title", "Remote Storage");
        add(languageConsumer,"advancements.deeperdarker.obtain_transmitter.description", "Acquire a Sculk Transmitter");

        add(languageConsumer,"subtitles.ambience.portal.groan", "The Otherside forebodes");
        add(languageConsumer,"subtitles.entity.snapper.ambient", "Sculk Snapper breathes");
        add(languageConsumer,"subtitles.entity.snapper.bite", "Sculk Snapper bites");
        add(languageConsumer,"subtitles.entity.snapper.hurt", "Sculk Snapper hurts");
        add(languageConsumer,"subtitles.entity.snapper.sniff", "Sculk Snapper sniffs");

        add(languageConsumer,"item.deeperdarker.sculk_transmitter.linked", "Linked");
        add(languageConsumer,"item.deeperdarker.sculk_transmitter.not_container", "Cannot link to block");
        add(languageConsumer,"item.deeperdarker.sculk_transmitter.not_found", "The linked block is missing or obstructed");
        add(languageConsumer,"item.deeperdarker.sculk_transmitter.not_linked", "Unlinked");
        add(languageConsumer,"subtitles.item.transmitter.link", "Transmitter links");
        add(languageConsumer, "subtitles.item.transmitter.transmit", "Transmitter transmits");
    }

    public void add(LanguageConsumer languageConsumer, String key, String value) {
        if(upsideDown) languageConsumer.addLanguage(key, toUpsideDown(value));
        else languageConsumer.addLanguage(key, value);
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

        return upsideDown ? toUpsideDown(name) : name;
    }

    private static String toUpsideDown(String value) {
        char[] valueUD = new char[value.length()];

        for(int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(c == '%') {
                StringBuilder builder = new StringBuilder();
                while (Character.isDigit(c) || c == '%' || c == '$' || c == 's' || c == 'd') {
                    builder.append(c);
                    i++;
                    c = i == value.length() ? 0 : value.charAt(i);
                }
                i--;

                for(int j = 0; j < builder.length(); j++) {
                    valueUD[value.length() - 1 - i + j] = builder.charAt(j);
                }

                continue;
            }

            int lookup = NORMAL_CHARS.indexOf(c);
            if(lookup >= 0) {
                c = UPSIDE_DOWN_CHARS.charAt(lookup);
            }

            valueUD[value.length() - 1 - i] = c;
        }
        return new String(valueUD);
    }
}
