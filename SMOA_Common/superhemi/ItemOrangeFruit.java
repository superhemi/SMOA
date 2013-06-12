package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemOrangeFruit extends ItemFood
{

	public ItemOrangeFruit(int id, int i, float f, boolean b) {
        super(id, i, b);
        
        maxStackSize = 64;
        setUnlocalizedName("Orange");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:OrangeFruit");
	}
}

