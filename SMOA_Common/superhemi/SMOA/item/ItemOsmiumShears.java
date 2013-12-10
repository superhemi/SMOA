package superhemi.SMOA.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemShears;
import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.lib.Strings;

/**
 * SMOA
 * 
 * ItemOsmiumShears
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumShears extends ItemShears 
{
	public ItemOsmiumShears(int par1) {
		super(par1);
		this.setUnlocalizedName(Strings.OSMIUM_SHEARS_NAME);
        this.setCreativeTab(BaseForgeSMOA.tabsSMOA);

	}
	public void registerIcons(IconRegister iconRegister) 
	{
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}
}
