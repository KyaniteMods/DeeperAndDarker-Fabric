package com.kyanite.deeperdarker.miscellaneous.datagen_lang;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.stats.StatType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import org.checkerframework.checker.signature.qual.Identifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

@FunctionalInterface
public interface LanguageConsumer {
    void addLanguage(String languageKey, String value);

    default void addLanguage(Item item, String value) {
        addLanguage(item.getDescriptionId(), value);
    };

    default void addLanguage(Block block, String value) {
        addLanguage(block.getDescriptionId(), value);
    }

    default void addLanguage(CreativeModeTab group, String value) {
        addLanguage("itemGroup." + group.getDisplayName(), value);
    }

    default void addLanguage(EntityType<?> entityType, String value) {
        addLanguage(entityType.getDescriptionId(), value);
    }
    default void addLanguage(Enchantment enchantment, String value) {
        addLanguage(enchantment.getDescriptionId(), value);
    }

    default void addLanguage(MobEffect statusEffect, String value) {
        addLanguage(statusEffect.getDescriptionId(), value);
    }

    default void addLanguage(Path existingLanguageFile) throws IOException {
        Gson gson = new Gson();

        JsonObject langEntryJson = gson.fromJson(Files.readString(existingLanguageFile), JsonObject.class);

        for (Map.Entry<String, JsonElement> stringJsonElementEntry : langEntryJson.entrySet()) {
            addLanguage(stringJsonElementEntry.getKey(), stringJsonElementEntry.getValue().getAsString());
        }
    }
}