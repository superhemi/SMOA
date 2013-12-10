package superhemi.SMOA.block;

import java.util.Random;

import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Strings;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * SMOA
 * 
 * BlockOsmiumOre
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockOsmiumOre extends BlockSMOA 
{    
    public BlockOsmiumOre(int id, int texture, Material material) {
        super(id, material);
        this.setUnlocalizedName(Strings.OSMIUM_ORE_NAME);
        this.setCreativeTab(BaseForgeSMOA.tabsSMOA);
        this.setHardness(3.5F);      
               }
    
    
    public int idDropped(int par1, Random random, int par2) {
		return ModBlocks.OsmiumOre.blockID;
				}
    

    public TileEntity createNewTileEntity(World world) {
        // TODO Auto-generated method stub
        return null;
    }
}