package superhemi.SMOA.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemShears;

/**
 * SMOA
 * 
 * ItemOsmiumShears
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumShears extends ItemShears {

	public ItemOsmiumShears(int par1) {
		super(par1);
		setUnlocalizedName("Osmium Shears");

	}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:OsmiumShears");
	}

}
