package com.kyanite.deeperdarker.datagen;

import com.kyanite.deeperdarker.datagen.advancements.DDAdvancementProvider;
import com.kyanite.deeperdarker.datagen.lang.ENLanguageProvider;
import com.kyanite.deeperdarker.datagen.models.DDModelProvider;
import com.kyanite.deeperdarker.datagen.recipes.CraftingRecipeProvider;
import com.kyanite.deeperdarker.datagen.tags.DDBlockTagsProvider;
import com.kyanite.deeperdarker.datagen.tags.DDItemTagsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DDDataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(new ENLanguageProvider(fabricDataGenerator, "en_us", false));
        fabricDataGenerator.addProvider(new ENLanguageProvider(fabricDataGenerator, "en_ud", true));
        fabricDataGenerator.addProvider(DDModelProvider::new);
        fabricDataGenerator.addProvider(DDBlockTagsProvider::new);
        fabricDataGenerator.addProvider(DDItemTagsProvider::new);
        fabricDataGenerator.addProvider(CraftingRecipeProvider::new);
        fabricDataGenerator.addProvider(DDAdvancementProvider::new);
    }
}
