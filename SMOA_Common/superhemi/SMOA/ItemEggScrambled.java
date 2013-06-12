package superhemi.SMOA;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

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
        setUnlocalizedName("Scrambled Egg");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:EggScrambled");
	}
}

