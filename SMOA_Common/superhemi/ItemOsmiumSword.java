package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;


public class ItemOsmiumSword extends ItemSword
{
        
        protected ItemOsmiumSword(int par1, EnumToolMaterial par2EnumToolMaterial)
        {
            super(par1, par2EnumToolMaterial);
                
        }


		public void registerIcons(IconRegister iconRegister)
    	{
    	         itemIcon = iconRegister.registerIcon("superhemi:OsmiumSword");
    	}
        
}
