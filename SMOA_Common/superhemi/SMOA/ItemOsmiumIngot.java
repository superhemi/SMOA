package superhemi.SMOA;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * SMOA
 * 
 * ItemOsmiumIngot
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumIngot extends Item {
	
	public ItemOsmiumIngot(int id) {
        super(id);
        
        maxStackSize = 64;
        setUnlocalizedName("Osmium Ingot");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:OsmiumIngot");
	}
}
