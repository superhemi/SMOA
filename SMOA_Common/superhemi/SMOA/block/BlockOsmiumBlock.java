package superhemi.SMOA.block;

import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * SMOA
 * 
 * BlockOsmiumBlock
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockOsmiumBlock extends BlockSMOA {
	
	public BlockOsmiumBlock (int id, int texture, Material material) {
                super(id, material);
                this.setUnlocalizedName(Strings.OSMIUM_BLOCK_NAME);
                this.setCreativeTab(BaseForgeSMOA.tabsSMOA);
                this.setHardness(3.5F);      
        }

    public TileEntity createNewTileEntity(World world) {
        // TODO Auto-generated method stub
        return null;
    }
}