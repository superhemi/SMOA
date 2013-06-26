package superhemi.SMOA.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import superhemi.SMOA.lib.ItemIds;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * SMOA
 * 
 * CreativeTabSMOA
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CreativeTabSMOA extends CreativeTabs {

    public CreativeTabSMOA(int par1, String par2Str) {

        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {

        return ItemIds.OSMIUM_INGOT;
        
    }

}