package superhemi;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemOsmiumIngot extends Item {
	
	public ItemOsmiumIngot(int id) {
        super(id);
        
        maxStackSize = 64;
        setUnlocalizedName("Osmium Ingot");
}
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("superhemi:OsmiumIngot");
	}
}
