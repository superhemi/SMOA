package superhemi.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import superhemi.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;


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