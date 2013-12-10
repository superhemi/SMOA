package superhemi.SMOA.block;

import superhemi.SMOA.lib.BlockIds;
import superhemi.SMOA.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * SMOA
 * 
 * ModBlocks
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModBlocks {

    /* Mod block instances */
    public static Block OsmiumBlock;
    public static Block OsmiumOre;
    public static Block OsmiumFurnace;
    public static int osmiumfurnaceidle;
    public static int osmiumfurnaceburning;

    public static void init() {

        OsmiumBlock = new BlockOsmiumBlock(BlockIds.OSMIUM_BLOCK_DEFAULT, 1, Material.ground);
        OsmiumOre = new BlockOsmiumOre(BlockIds.OSMIUM_ORE_DEFAULT, 1, Material.rock);
        OsmiumFurnace = new OsmiumFurnace(BlockIds.OSMIUM_FURNACE_DEFAULT, false);


        GameRegistry.registerBlock(OsmiumBlock, Strings.OSMIUM_BLOCK_NAME);
        GameRegistry.registerBlock(OsmiumOre, Strings.OSMIUM_ORE_NAME);
        GameRegistry.registerBlock(OsmiumFurnace, Strings.OSMIUM_FURNACE_NAME);

        initBlockRecipes();
    }

    private static void initBlockRecipes() {

       
    }
    
}