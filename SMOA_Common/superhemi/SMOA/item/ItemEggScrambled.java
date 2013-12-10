package superhemi.SMOA.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.lib.Strings;

/**
 * SMOA
 * 
 * ItemEggScrambled
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemEggScrambled extends ItemFood
{

	public ItemEggScrambled(int id, int i, float f, boolean b) {
        super(id, i, b);
        
        maxStackSize = 32;
        this.setUnlocalizedName(Strings.EGG_SCRAMBLED_NAME);
        this.setCreativeTab(BaseForgeSMOA.tabsSMOA);
}
	public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}
}

