package com.kyanite.deeperdarker.miscellaneous;

import com.kyanite.deeperdarker.registry.items.DDItems;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.state.properties.WoodType;

public class DDTypes {
    public static final MobType SCULK = new MobType();
    public static final Tier WARDEN = new Tier() {
        @Override
        public int getUses() {
            return 2464;
        }

        @Override
        public float getSpeed() {
            return 11f;
        }

        @Override
        public float getAttackDamageBonus() {
            return 7f;
        }

        @Override
        public int getLevel() {
            return 4;
        }

        @Override
        public int getEnchantmentValue() {
            return 21;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(DDItems.REINFORCED_ECHO_SHARD);
        }
    };
}
