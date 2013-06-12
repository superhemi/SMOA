package superhemi.SMOA;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import superhemi.SMOA.lib.Reference;

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
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = "[1.0.0]")
 
public class BaseForgeSMOA
{
	 @Instance("SMOA")
	  public static BaseForgeSMOA instance;
	  private GuiHandler guihandler = new GuiHandler();
	  public static Item EggCooked;
	  public static Item EggScrambled;
	  public static Item BaconRaw;
	  public static Item BaconCooked;
	  public static Item EggsnBacon;
	  public static Block OsmiumBlock;
	  public static Block OsmiumOre;   
	  public static Item OsmiumIngot;
	  public static CreativeTabs tabSMOA;
	  public static Item OsmiumShovel;
      public static Item OsmiumPickaxe;
      public static Item OsmiumAxe;
      public static Item OsmiumSword;
      public static Item OsmiumHoe; 
      public static Item OsmiumHelmet;
      public static Item OsmiumPlate;
      public static Item OsmiumLegs;
      public static Item OsmiumBoots;
      public static Item OsmiumFishPole;
      public static Item OsmiumBucket;
      public static Item OsmiumShears;
      public static Block OsmiumFurnaceIdle;
   	  public static Block OsmiumFurnaceBurning;
   	  public static Block OrangeCrop;
   	  public static ItemSeeds OrangeSeeds;
   	  public static Item OrangeFruit;
   	  public static SMOAWorldGenerator worldGen;
   	  
        @SidedProxy(clientSide = "superhemi.client.ClientProxy", serverSide = "superhemi.CommonProxy")
        public static CommonProxy proxy;
       
        public class SMOA
        {
               
        }

        @Init
        public void load(FMLInitializationEvent event)
        {
          proxy.registerRenderers();
   
          EnumArmorMaterial OsmiumArmor = EnumHelper.addArmorMaterial("Osmium", 34, new int[]{3,8,6,3},25);
          EnumToolMaterial toolOsmium = EnumHelper.addToolMaterial("Osmium", 3, 2000, 12.0F, 6, 22);
          tabSMOA = new CreativeTabs("tabSMOA") { public ItemStack getIconItemStack() { return new ItemStack(Item.eyeOfEnder, 1, 0);}};
      		
          worldGen = new SMOAWorldGenerator();
          
          //Declaring Items
          EggCooked = new ItemEggCooked(5000, 2, 1.5F, false).setCreativeTab(BaseForgeSMOA.tabSMOA);
          EggScrambled = new ItemEggScrambled(5001, 2, 2.0F, false).setCreativeTab(BaseForgeSMOA.tabSMOA);
          BaconRaw = new ItemBaconRaw(5002, 1, 1.5F, true).setCreativeTab(BaseForgeSMOA.tabSMOA);
          BaconCooked = new ItemBaconCooked(5003, 4, 6.4F, false).setCreativeTab(BaseForgeSMOA.tabSMOA);
          EggsnBacon = new ItemEggsnBacon(5004, 10, 15.0F, false).setPotionEffect(Potion.moveSpeed.id, 10, 5, 1.0F).setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumIngot = new ItemOsmiumIngot(5005).setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumShovel = (new ItemOsmiumSpade(5010, toolOsmium)).setUnlocalizedName("Osmium Shovel").setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumPickaxe = (new ItemOsmiumPickaxe(5011, toolOsmium)).setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumAxe = (new ItemOsmiumAxe(5012, toolOsmium)).setUnlocalizedName("Osmium Axe").setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumSword = (new ItemOsmiumSword(5013, toolOsmium)).setUnlocalizedName("Osmium Sword").setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumHoe = (new ItemOsmiumHoe(5014, toolOsmium)).setUnlocalizedName("Osmium Hoe").setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumHelmet = new ItemOsmiumArmor(5020, OsmiumArmor, proxy.addArmor("OSMIUM"), 0).setUnlocalizedName("OsmiumHelmet").setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OsmiumPlate = new ItemOsmiumArmor(5021, OsmiumArmor, proxy.addArmor("OSMIUM"), 1).setUnlocalizedName("OsmiumPlate").setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OsmiumLegs = new ItemOsmiumArmor(5022, OsmiumArmor, proxy.addArmor("OSMIUM"), 2).setUnlocalizedName("OsmiumLegs").setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OsmiumBoots = new ItemOsmiumArmor(5023, OsmiumArmor, proxy.addArmor("OSMIUM"), 3).setUnlocalizedName("OsmiumBoots").setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OsmiumFishPole = new ItemOsmiumFishPole(5015).setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OsmiumBucket = new ItemOsmiumBucket(5016, 0).setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OsmiumShears = new ItemOsmiumShears(5017).setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  //OrangeSeeds = (ItemSeeds) new ItemSeeds(5006, OrangeCrop.blockID, Block.tilledField.blockID);
  		  OrangeFruit = new ItemOrangeFruit(5007, 3, 5.0f, false).setCreativeTab(BaseForgeSMOA.tabSMOA);
  	 

          
          //Declaring Blocks
          OsmiumBlock = new BlockOsmiumBlock(501, 1, Material.ground).setHardness(3.5F).setUnlocalizedName("Osmium Block").setStepSound(Block.soundStoneFootstep).setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumOre = new BlockOsmiumOre(500, 1, Material.rock).setHardness(3.5F).setUnlocalizedName("Osmium Ore").setStepSound(Block.soundStoneFootstep).setCreativeTab(BaseForgeSMOA.tabSMOA);
          OsmiumFurnaceIdle = new OsmiumFurnace(502, false).setHardness(3.5F).setUnlocalizedName("Osmium Furnace Idle").setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OsmiumFurnaceBurning = new OsmiumFurnace(503, true).setHardness(3.5F).setUnlocalizedName("Osmium Furnace Burning").setCreativeTab(BaseForgeSMOA.tabSMOA);
  		  OrangeCrop = new OrangeCrop(504);
        		  
          //Language Registry 
          LanguageRegistry.instance().addStringLocalization("itemGroup.tabSMOA", "en_US", "superhemi's Mod of Awesomeness");
          LanguageRegistry.addName(EggCooked, "Cooked Egg");
          LanguageRegistry.addName(EggScrambled, "Scrambled Egg");
          LanguageRegistry.addName(BaconRaw, "Raw Bacon");
          LanguageRegistry.addName(BaconCooked, "Cooked Bacon");
          LanguageRegistry.addName(EggsnBacon, "Eggs N' Bacon");          
          LanguageRegistry.addName(OsmiumBlock, "Osmium Block");
          LanguageRegistry.addName(OsmiumOre, "Osmium Ore");
          LanguageRegistry.addName(OsmiumIngot, "Osmium Ingot");
          LanguageRegistry.addName(OsmiumShovel, "Osmium Shovel");
          LanguageRegistry.addName(OsmiumPickaxe, "Osmium Pickaxe");
          LanguageRegistry.addName(OsmiumAxe, "Osmium Axe");
          LanguageRegistry.addName(OsmiumSword, "Osmium Sword");
          LanguageRegistry.addName(OsmiumHoe, "Osmium Hoe");
          LanguageRegistry.addName(OsmiumHelmet, "Osmium Helmet");
          LanguageRegistry.addName(OsmiumPlate, "Osmium Chestplate");
          LanguageRegistry.addName(OsmiumLegs, "Osmium Leggings");
          LanguageRegistry.addName(OsmiumBoots, "Osmium Boots");
          LanguageRegistry.addName(OsmiumFishPole, "Osmium Fishing Rod");
          LanguageRegistry.addName(OsmiumBucket, "Osmium Bucket");
          LanguageRegistry.addName(OsmiumShears, "Osmium Shears");
          LanguageRegistry.addName(OsmiumFurnaceIdle, "Osmium Furnace");
  		  LanguageRegistry.addName(OsmiumFurnaceBurning, "Osmium Furnace");
  		  LanguageRegistry.addName(OsmiumBlock, "Osmium Block");
  		  LanguageRegistry.addName(OsmiumOre, "Osmium Ore");
  		  //LanguageRegistry.addName(OrangeSeeds, "Orange Seeds");
  		  LanguageRegistry.addName(OrangeFruit, "Orange");
  		  
          
          MinecraftForge.setBlockHarvestLevel(OsmiumBlock, "pickaxe", 3);
          MinecraftForge.setBlockHarvestLevel(OsmiumOre, "pickaxe", 3);

          
          
          new ItemStack(Item.egg);
          new ItemStack(Item.porkRaw);
          new ItemStack(Item.stick);
          ItemStack swordenchanted = new ItemStack(OsmiumSword);
          swordenchanted.addEnchantment(Enchantment.sharpness, 5);
          ItemStack picenchanted = new ItemStack(OsmiumPickaxe);
          picenchanted.addEnchantment(Enchantment.efficiency, 5);
          //MinecraftForge.addGrassSeed(new ItemStack(OrangeSeeds), 10);
          
          //Game Registry
          GameRegistry.registerWorldGenerator(worldGen);
          GameRegistry.registerBlock(OsmiumFurnaceIdle, "Osmium.FurnaceIdle");
  		  GameRegistry.registerBlock(OsmiumFurnaceIdle, "Osmium.FurnaceBurning");
  		  GameRegistry.registerTileEntity(TileEntityOsmiumFurnace.class, "tileentityosmiumfurnace");
  		  NetworkRegistry.instance().registerGuiHandler(this, guihandler);
          GameRegistry.addShapelessRecipe(new ItemStack(EggScrambled), new Object[] { new ItemStack(EggCooked) });
          GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(EggCooked), 0.35F);
          GameRegistry.addShapelessRecipe(new ItemStack(BaconRaw), new Object[] { Item.porkRaw });
          GameRegistry.addSmelting(BaconRaw.itemID, new ItemStack(BaconCooked), 0.35F);
          GameRegistry.addRecipe(new ItemStack(EggsnBacon), new Object[] { "xy", "yx", Character.valueOf('x'), EggScrambled, Character.valueOf('y'), BaconCooked });
          GameRegistry.registerBlock(OsmiumBlock, "OsmiumBlock");
          GameRegistry.registerBlock(OsmiumOre, "OsmiumOre");
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumShovel), new Object[] { " x "," y "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumPickaxe), new Object[] { "xxx"," y "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumAxe), new Object[] { "xx ","xy "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumSword), new Object[] { " x "," x "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumHoe), new Object[] { "xx "," y "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumHelmet), new Object[] { "xxx","x x", Character.valueOf('x'), OsmiumIngot});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumPlate), new Object[] { "x x","xxx","xxx", Character.valueOf('x'), OsmiumIngot});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumLegs), new Object[] { "xxx","x x","x x", Character.valueOf('x'), OsmiumIngot});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumBoots), new Object[] { "x x","x x", Character.valueOf('x'), OsmiumIngot});
          GameRegistry.addShapedRecipe(new ItemStack(OsmiumFurnaceIdle), new Object[] { "xxx","x x","xxx", Character.valueOf('x'), OsmiumIngot});
          GameRegistry.addShapelessRecipe(swordenchanted, new Object[]{new ItemStack(OsmiumSword), new ItemStack(Item.eyeOfEnder)});
          GameRegistry.addShapelessRecipe(picenchanted, new Object[]{new ItemStack(OsmiumPickaxe), new ItemStack(Item.eyeOfEnder)});
          //GameRegistry.addShapelessRecipe(new ItemStack(OrangeSeeds, 4), new ItemStack(OrangeFruit));
          GameRegistry.registerBlock(OrangeCrop, "OrangeCrop");
        }

        @PostInit
        public void postInit(FMLPostInitializationEvent event)
        {
        	
        }
	  }
	  




	  
