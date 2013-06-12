package superhemi.client;

import net.minecraftforge.client.MinecraftForgeClient;
import superhemi.SMOA.CommonProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * SMOA
 * 
 * ClientProxy
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ClientProxy extends CommonProxy
{
  @SuppressWarnings("deprecation")
public void registerRenderers()
  {
    MinecraftForgeClient.preloadTexture(ITEMS_PNG);
    MinecraftForgeClient.preloadTexture(BLOCK_PNG);
  }
  public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}