package superhemi.SMOA.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;

/**
 * SMOA
 * 
 * ItemOrangeSeeds
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

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

