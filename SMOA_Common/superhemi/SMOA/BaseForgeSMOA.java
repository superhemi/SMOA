package superhemi.SMOA;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import superhemi.SMOA.item.ModItems;
import superhemi.SMOA.lib.Reference;
import superhemi.SMOA.block.ModBlocks;
import superhemi.SMOA.core.handlers.LocalizationHandler;
import superhemi.SMOA.core.proxy.CommonProxy;
import superhemi.SMOA.creativetab.CreativeTabSMOA;
import superhemi.SMOA.tileentity.TileEntityOsmiumFurnace;

/**
 * SMOA
 * 
 * BaseForgeSMOA
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = "0.0.1")
public class BaseForgeSMOA{
	 
   	    @Instance(Reference.MOD_ID)
        public static BaseForgeSMOA instance;


        @SidedProxy(clientSide = "superhemi.SMOA.core.proxy.ClientProxy", serverSide = "superhemi.SMOA.core.proxy.CommonProxy")
        public static CommonProxy proxy;

        public static CreativeTabs tabsSMOA = new CreativeTabSMOA(
        		CreativeTabs.getNextID(), Reference.MOD_ID);
        
       
        public void preInit(FMLPreInitializationEvent event) {
            
            // Load the localization files into the LanguageRegistry
            LocalizationHandler.loadLanguages();
            
            // Initialize mod blocks
            ModBlocks.init();

            // Initialize mod items
            ModItems.init();
        }
       
        public void load(FMLInitializationEvent event)
        {
          LanguageRegistry.instance().addStringLocalization("itemGroup.SMOA", "en_US", "superhemi's Mod of Awesomeness");

  		  GameRegistry.registerTileEntity(TileEntityOsmiumFurnace.class, "tileentityosmiumfurnace");
  		  //NetworkRegistry.instance().registerGuiHandler(this, guihandler);
          //GameRegistry.addShapedRecipe(new ItemStack(OsmiumFurnaceIdle), new Object[] { "xxx","x x","xxx", Character.valueOf('x'), OsmiumIngot});
        }

       
        public void postInit(FMLPostInitializationEvent event)
        {
        	
        }
	  }
	  




	  
