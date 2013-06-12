package superhemi.SMOA;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

/**
 * SMOA
 * 
 * ItemOsmiumPickaxe
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumPickaxe extends ItemPickaxe
{
        
	    public ItemOsmiumPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
	    	super(par1, par2EnumToolMaterial);
	    	
	    }
        
        public void registerIcons(IconRegister iconRegister)
    	{
    	         itemIcon = iconRegister.registerIcon("superhemi:OsmiumPickaxe");
    	}
        
}