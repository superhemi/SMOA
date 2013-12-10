package superhemi.SMOA.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

/**
 * SMOA
 * 
 * ItemOsmiumArmor
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumArmor extends ItemSMOA {

	public ItemOsmiumArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1);

	}

	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ModItems.OsmiumHelmet.itemID || itemstack.itemID == ModItems.OsmiumPlate.itemID || itemstack.itemID == ModItems.OsmiumBoots.itemID){
		return "/armor/Osmium_1.png";
		}
		
		if(itemstack.itemID == ModItems.OsmiumLegs.itemID){
			return "/armor/Osmium_2.png";
		}
		
		else return null;
		
	}
	
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("superhemi:"+this.getUnlocalizedName().substring(5));
		}
}