package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemBaconRaw extends ItemFood
{

	public ItemBaconRaw(int id, int i, float f, boolean b) {
        super(id, i, b);
        
        maxStackSize = 64;
        setUnlocalizedName("Raw Bacon");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:BaconRaw");
	}
}

