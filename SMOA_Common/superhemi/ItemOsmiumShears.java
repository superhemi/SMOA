package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemShears;

public class ItemOsmiumShears extends ItemShears {

	public ItemOsmiumShears(int par1) {
		super(par1);
		setUnlocalizedName("Osmium Shears");

	}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:OsmiumShears");
	}

}
