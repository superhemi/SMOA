package superhemi.SMOA.item;

import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

/**
 * SMOA
 * 
 * ItemOsmiumHoe
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumHoe extends ItemHoe
{
        
        public ItemOsmiumHoe(int par1, EnumToolMaterial par2EnumToolMaterial)
        {
            super(par1, par2EnumToolMaterial);
            this.setUnlocalizedName(Strings.OSMIUM_HOE_NAME);
            this.setCreativeTab(BaseForgeSMOA.tabsSMOA);    
        }
        public void registerIcons(IconRegister iconRegister) 
        {
            itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
