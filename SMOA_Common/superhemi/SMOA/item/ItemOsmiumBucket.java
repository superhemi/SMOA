package superhemi.SMOA.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.FillBucketEvent;

/**
 * SMOA
 * 
 * ItemOsmiumBucket
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemOsmiumBucket extends ItemBucket {

	private int isFull;
	   
	   public ItemOsmiumBucket(int par1, int par2) {
	      super(par1, par2);
	      this.isFull = par2;            // This is really important; That was what I've forgotten.
	      setUnlocalizedName("Osmium Bucket");
	   }
	   
	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        float f = 1.0F;
	        double d0 = par3EntityPlayer.prevPosX + (par3EntityPlayer.posX - par3EntityPlayer.prevPosX) * (double)f;
	        double d1 = par3EntityPlayer.prevPosY + (par3EntityPlayer.posY - par3EntityPlayer.prevPosY) * (double)f + 1.62D - (double)par3EntityPlayer.yOffset;
	        double d2 = par3EntityPlayer.prevPosZ + (par3EntityPlayer.posZ - par3EntityPlayer.prevPosZ) * (double)f;
	        boolean flag = this.isFull == 0;
	        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, flag);

	        if (movingobjectposition == null)
	        {
	            return par1ItemStack;
	        }
	        else
	        {
	            FillBucketEvent event = new FillBucketEvent(par3EntityPlayer, par1ItemStack, par2World, movingobjectposition);
	            if (MinecraftForge.EVENT_BUS.post(event))
	            {
	                return par1ItemStack;
	            }

	            if (event.getResult() == Event.Result.ALLOW)
	            {
	                if (par3EntityPlayer.capabilities.isCreativeMode)
	                {
	                    return par1ItemStack;
	                }

	                if (--par1ItemStack.stackSize <= 0)
	                {
	                    return event.result;
	                }

	                if (!par3EntityPlayer.inventory.addItemStackToInventory(event.result))
	                {
	                    par3EntityPlayer.dropPlayerItem(event.result);
	                }

	                return par1ItemStack;
	            }

	            if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
	            {
	                int i = movingobjectposition.blockX;
	                int j = movingobjectposition.blockY;
	                int k = movingobjectposition.blockZ;

	                if (!par2World.canMineBlock(par3EntityPlayer, i, j, k))
	                {
	                    return par1ItemStack;
	                }

	                if (this.isFull == 0)
	                {
	                    if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
	                    {
	                        return par1ItemStack;
	                    }

	                    if (par2World.getBlockMaterial(i, j, k) == Material.water && par2World.getBlockMetadata(i, j, k) == 0)
	                    {
	                        par2World.setBlockToAir(i, j, k);

	                        if (par3EntityPlayer.capabilities.isCreativeMode)
	                        {
	                            return par1ItemStack;
	                        }

	                        if (--par1ItemStack.stackSize <= 0)
	                        {
	                            return new ItemStack(Item.bucketWater);
	                        }

	                        if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.bucketWater)))
	                        {
	                            par3EntityPlayer.dropPlayerItem(new ItemStack(Item.bucketWater.itemID, 1, 0));
	                        }

	                        return par1ItemStack;
	                    }

	                    if (par2World.getBlockMaterial(i, j, k) == Material.lava && par2World.getBlockMetadata(i, j, k) == 0)
	                    {
	                        par2World.setBlockToAir(i, j, k);

	                        if (par3EntityPlayer.capabilities.isCreativeMode)
	                        {
	                            return par1ItemStack;
	                        }

	                        if (--par1ItemStack.stackSize <= 0)
	                        {
	                            return new ItemStack(Item.bucketLava);
	                        }

	                        if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.bucketLava)))
	                        {
	                            par3EntityPlayer.dropPlayerItem(new ItemStack(Item.bucketLava.itemID, 1, 0));
	                        }

	                        return par1ItemStack;
	                    }
	                }
	                else
	                {
	                    if (this.isFull < 0)
	                    {
	                        return new ItemStack(Item.bucketEmpty);
	                    }

	                    if (movingobjectposition.sideHit == 0)
	                    {
	                        --j;
	                    }

	                    if (movingobjectposition.sideHit == 1)
	                    {
	                        ++j;
	                    }

	                    if (movingobjectposition.sideHit == 2)
	                    {
	                        --k;
	                    }

	                    if (movingobjectposition.sideHit == 3)
	                    {
	                        ++k;
	                    }

	                    if (movingobjectposition.sideHit == 4)
	                    {
	                        --i;
	                    }

	                    if (movingobjectposition.sideHit == 5)
	                    {
	                        ++i;
	                    }

	                    if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
	                    {
	                        return par1ItemStack;
	                    }

	                    if (this.tryPlaceContainedLiquid(par2World, d0, d1, d2, i, j, k) && !par3EntityPlayer.capabilities.isCreativeMode)
	                    {
	                        return new ItemStack(Item.bucketEmpty);
	                    }
	                }
	            }
	            else if (this.isFull == 0 && movingobjectposition.entityHit instanceof EntityCow)
	            {
	                return new ItemStack(Item.bucketMilk);
	            }

	            return par1ItemStack;
	        }
	    }

	    /**
	     * Attempts to place the liquid contained inside the bucket.
	     */
	    public boolean tryPlaceContainedLiquid(World par1World, double par2, double par4, double par6, int par8, int par9, int par10)
	    {
	        if (this.isFull <= 0)
	        {
	            return false;
	        }
	        else if (!par1World.isAirBlock(par8, par9, par10) && par1World.getBlockMaterial(par8, par9, par10).isSolid())
	        {
	            return false;
	        }
	        else
	        {
	            if (par1World.provider.isHellWorld && this.isFull == Block.waterMoving.blockID)
	            {
	                par1World.playSoundEffect(par2 + 0.5D, par4 + 0.5D, par6 + 0.5D, "random.fizz", 0.5F, 2.6F + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.8F);

	                for (int l = 0; l < 8; ++l)
	                {
	                    par1World.spawnParticle("largesmoke", (double)par8 + Math.random(), (double)par9 + Math.random(), (double)par10 + Math.random(), 0.0D, 0.0D, 0.0D);
	                }
	            }
	            else
	            {
	                par1World.setBlock(par8, par9, par10, this.isFull, 0, 3);
	            }

	            return true;
	        }
	    }
	

	   public void registerIcons(IconRegister iconRegister)
		{
		         itemIcon = iconRegister.registerIcon("superhemi:OsmiumBucket");
		}
	   
}
