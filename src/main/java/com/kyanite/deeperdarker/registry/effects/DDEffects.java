package com.kyanite.deeperdarker.registry.effects;

import com.kyanite.deeperdarker.DeeperAndDarker;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class DDEffects {
    public static MobEffect SCULK_AFFINITY;

    public static void registerEffects() {
        SCULK_AFFINITY = Registry.register(Registry.MOB_EFFECT, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_affinity"), new SculkAffinity(MobEffectCategory.BENEFICIAL, 0x38DBE1));
    }
}
