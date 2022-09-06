package com.kyanite.deeperdarker.registry.potions;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.registry.effects.DDEffects;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

public class DDPotions {
    public static Potion SCULK_AFFINITY;
    public static void registerPotions() {
        Registry.register(Registry.POTION, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_affinity"),  new Potion(new MobEffectInstance(DDEffects.SCULK_AFFINITY, 3600, 0)));
    }
}
