package superhemi.SMOA.core.proxy;

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
  public void registerRenderers()
  {

  }
  public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
}