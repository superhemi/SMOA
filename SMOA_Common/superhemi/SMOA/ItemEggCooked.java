package superhemi.SMOA;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

/**
 * SMOA
 * 
 * ItemEggCooked
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

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

