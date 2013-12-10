package superhemi.SMOA.item;

import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.lib.Strings;
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
        this.setUnlocalizedName(Strings.EGGS_N_BACON_NAME);
        this.setCreativeTab(BaseForgeSMOA.tabsSMOA);
        setAlwaysEdible();
}

    public ItemFood setPotionEffect(int id, int i, int j, float f) {
        // TODO Auto-generated method stub
        return null;
    }
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}
}

