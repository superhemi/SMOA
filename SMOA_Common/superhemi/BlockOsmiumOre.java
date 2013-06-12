package superhemi;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockOsmiumOre extends BlockOre {
    public BlockOsmiumOre(int id, int texture, Material material) {
            super(id);
            
               }
    
    
    public int idDropped(int par1, Random random, int par2) {
		return BaseForgeSMOA.OsmiumOre.blockID;
				}
    
    public void registerIcons(IconRegister iconRegister)
	{
	         blockIcon = iconRegister.registerIcon("superhemi:OsmiumOre");
	}
}