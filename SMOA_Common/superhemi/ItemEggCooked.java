package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemEggCooked extends ItemFood
{

	public ItemEggCooked(int id, int i, float f, boolean b) {
        super(id, i, b);
        
        maxStackSize = 16;
        setUnlocalizedName("Cooked Egg");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:EggCooked");
	}
}

