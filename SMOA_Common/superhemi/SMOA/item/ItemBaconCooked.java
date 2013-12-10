package superhemi.SMOA.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.lib.Strings;

/**
 * SMOA
 * 
 * ItemBaconCooked
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemBaconCooked extends ItemFood {

	public ItemBaconCooked(int id, int i, float f, boolean b) 
	{    
	    super(id, i, b); 
        this.setUnlocalizedName(Strings.BACON_COOKED_NAME);
        this.setCreativeTab(BaseForgeSMOA.tabsSMOA);
        maxStackSize = 64;
}
	public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}
}

