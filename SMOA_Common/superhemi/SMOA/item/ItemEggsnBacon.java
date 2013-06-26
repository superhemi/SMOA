package superhemi.SMOA.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

/**
 * SMOA
 * 
 * ItemEggsnBacon
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemEggsnBacon extends ItemFood
{

	public ItemEggsnBacon(int id, int i, float f, boolean b) {
        super(id, i, b);
        
        maxStackSize = 64;
        setUnlocalizedName("Eggs N' Bacon");
        setAlwaysEdible();
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:EggsnBacon");
	}
}

