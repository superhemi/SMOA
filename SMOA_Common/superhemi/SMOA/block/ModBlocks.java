package superhemi.SMOA.block;

import superhemi.SMOA.lib.BlockIds;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * SMOA
 * 
 * ModBlocks
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModBlocks extends Block {

    public ModBlocks(int par1, Material par2Material) {
        super(par1, par2Material);
    }

    /* Mod block instances */
    public static Block osmiumblock;
    public static Block osmiumore;
    public static Block osmiumfurnace;
    public static int osmiumfurnaceidle;
    public static int osmiumfurnaceburning;

    public static void init() {

        osmiumblock = new BlockOsmiumBlock(BlockIds.OSMIUM_BLOCK, 1, Material.ground);
        osmiumore = new BlockOsmiumOre(BlockIds.OSMIUM_ORE, 1, Material.rock);
        osmiumfurnace = new OsmiumFurnace(BlockIds.OSMIUM_FURNACE, false);


        GameRegistry.registerBlock(osmiumblock, Strings.OSMIUM_BLOCK_NAME);
        GameRegistry.registerBlock(osmiumore, Strings.OSMIUM_ORE_NAME);
        GameRegistry.registerBlock(osmiumfurnace, Strings.OSMIUM_FURNACE_NAME);

        initBlockRecipes();
    }

    private static void initBlockRecipes() {

       
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}