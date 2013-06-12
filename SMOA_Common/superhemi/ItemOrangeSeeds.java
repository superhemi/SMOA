package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;

public class ItemOrangeSeeds extends ItemSeeds
{

	public ItemOrangeSeeds(int id, int i, float f, int b) {
        super(id, i, b);
        
        maxStackSize = 64;
        setUnlocalizedName("Orange Seeds");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:OrangeSeeds");
	}
}

