package superhemi;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockOsmiumBlock extends Block {
	
	public BlockOsmiumBlock (int id, int texture, Material material) {
                super(id, material);
                
        }
	public void registerIcons(IconRegister iconRegister)
	{
	         blockIcon = iconRegister.registerIcon("superhemi:OsmiumBlock");
	}
}