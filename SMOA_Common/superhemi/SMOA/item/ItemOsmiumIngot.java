package superhemi.SMOA.item;

import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Strings;

/**
 * SMOA
 * 
 * ItemOsmiumIngot
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumIngot extends ItemSMOA {
	
	public ItemOsmiumIngot(int id) {
	    
        super(id);
        this.setUnlocalizedName(Strings.OSMIUM_INGOT_NAME);
        this.setCreativeTab(BaseForgeSMOA.tabsSMOA);
        
	}

}
