package penguin.tutorialmod.util;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import penguin.tutorialmod.TutorialMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BLAZING_SWORD = createTag("needs_blazing_sword");
        public static final TagKey<Block> INCORRECT_FOR_BLAZING_SWORD = createTag("incorrect_for_blazing_sword");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, name));
        }
    }
}
