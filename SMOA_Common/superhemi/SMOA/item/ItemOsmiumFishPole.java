package superhemi.SMOA.item;

import superhemi.SMOA.BaseForgeSMOA;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * SMOA
 * 
 * ItemOsmiumFishPole
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumFishPole extends ItemSMOA {

	 @SideOnly(Side.CLIENT)
	    private Icon theIcon;

	    public ItemOsmiumFishPole(int par1)
	    {
	        super(par1);
	        this.setUnlocalizedName(Strings.OSMIUM_FISHPOLE_NAME);
	        this.setCreativeTab(BaseForgeSMOA.tabsSMOA);
	    }

	    @SideOnly(Side.CLIENT)

	    /**
	     * Returns True is the item is renderer in full 3D when hold.
	     */
	    public boolean isFull3D()
	    {
	        return true;
	    }

	    @SideOnly(Side.CLIENT)

	    /**
	     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
	     * hands.
	     */
	    public boolean shouldRotateAroundWhenRendering()
	    {
	        return true;
	    }

	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        if (par3EntityPlayer.fishEntity != null)
	        {
	            int i = par3EntityPlayer.fishEntity.catchFish();
	            par1ItemStack.damageItem(i, par3EntityPlayer);
	            par3EntityPlayer.swingItem();
	        }
	        else
	        {
	            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	            if (!par2World.isRemote)
	            {
	                par2World.spawnEntityInWorld(new EntityFishHook(par2World, par3EntityPlayer));
	            }

	            par3EntityPlayer.swingItem();
	        }

	        return par1ItemStack;
	    }
	    public void registerIcons(IconRegister iconRegister) 
        {
            itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
	 
}
