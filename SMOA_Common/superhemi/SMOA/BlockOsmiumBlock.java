package superhemi.SMOA;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * SMOA
 * 
 * BlockOsmiumBlock
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockOsmiumBlock extends Block {
	
	public BlockOsmiumBlock (int id, int texture, Material material) {
                super(id, material);
                
        }
	public void registerIcons(IconRegister iconRegister)
	{
	         blockIcon = iconRegister.registerIcon("superhemi:OsmiumBlock");
	}
}