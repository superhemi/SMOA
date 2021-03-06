package superhemi.SMOA.client.gui.inventory;

import superhemi.SMOA.ContainerOsmiumFurnace;
import superhemi.SMOA.OsmiumGuiFurnace;
import superhemi.SMOA.tileentity.TileEntityOsmiumFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

/**
 * SMOA
 * 
 * GuiHandler
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		
		if(tile_entity instanceof TileEntityOsmiumFurnace){
			return new ContainerOsmiumFurnace(player.inventory, (TileEntityOsmiumFurnace) tile_entity);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if(tile_entity instanceof TileEntityOsmiumFurnace){
			return new OsmiumGuiFurnace(player.inventory, (TileEntityOsmiumFurnace) tile_entity);
		}
		
		return null;
	}

}
