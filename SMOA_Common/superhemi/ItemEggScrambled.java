package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemEggScrambled extends ItemFood
{

	public ItemEggScrambled(int id, int i, float f, boolean b) {
        super(id, i, b);
        
        maxStackSize = 32;
        setUnlocalizedName("Scrambled Egg");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:EggScrambled");
	}
}

