package superhemi.SMOA.item;

import cpw.mods.fml.common.registry.GameRegistry;
import superhemi.SMOA.core.proxy.CommonProxy;
import superhemi.SMOA.lib.ItemIds;
import net.minecraft.enchantment.Enchantment;
//import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.EnumHelper;

/**
 * SMOA
 * 
 * ModItems
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ModItems {
    


    /* Mod item instances */
    public static Item EggCooked;
    public static Item EggScrambled;
    public static Item BaconRaw;
    public static Item BaconCooked;
    public static Item EggsnBacon;
    public static Item OsmiumIngot;
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
    public static ItemSeeds OrangeSeeds;
    public static Item OrangeFruit;
    public static CommonProxy proxy;

    
    
    public static void init() {
        
        //EnumArmorMaterial OsmiumArmor = EnumHelper.addArmorMaterial("Osmium", 34, new int[]{3,8,6,3},25);
        EnumToolMaterial toolOsmium = EnumHelper.addToolMaterial("Osmium", 3, 2000, 12.0F, 6, 22);
          
        /* Initialize each mod item individually */
        EggCooked = new ItemEggCooked(ItemIds.EGG_COOKED_DEFAULT, 2, 1.5F, false);
        EggScrambled = new ItemEggScrambled(ItemIds.EGG_SCRAMBLED_DEFAULT, 2, 2.0F, false);
        BaconRaw = new ItemBaconRaw(ItemIds.BACON_RAW_DEFAULT, 1, 1.5F, true);
        BaconCooked = new ItemBaconCooked(ItemIds.BACON_COOKED_DEFAULT, 4, 6.4F, false);
        EggsnBacon = new ItemEggsnBacon(ItemIds.EGGS_N_BACON_DEFAULT, 10, 15.0F, false).setPotionEffect(Potion.moveSpeed.id, 10, 5, 1.0F);
        OsmiumIngot = new ItemOsmiumIngot(ItemIds.OSMIUM_INGOT_DEFAULT);
        OsmiumShovel = (new ItemOsmiumSpade(ItemIds.OSMIUM_SPADE_DEFAULT, toolOsmium));
        OsmiumPickaxe = (new ItemOsmiumPickaxe(ItemIds.OSMIUM_PICKAXE_DEFAULT, toolOsmium));
        OsmiumAxe = (new ItemOsmiumAxe(ItemIds.OSMIUM_AXE_DEFAULT, toolOsmium));
        OsmiumSword = (new ItemOsmiumSword(ItemIds.OSMIUM_SWORD_DEFAULT, toolOsmium));
        OsmiumHoe = (new ItemOsmiumHoe(ItemIds.OSMIUM_HOE_DEFAULT, toolOsmium));
        //OsmiumHelmet = new ItemOsmiumArmor(5020, OsmiumArmor, proxy.addArmor("OSMIUM"), 0).setUnlocalizedName("OsmiumHelmet").setCreativeTab(BaseForgeSMOA.tabSMOA);
        //OsmiumPlate = new ItemOsmiumArmor(5021, OsmiumArmor, proxy.addArmor("OSMIUM"), 1).setUnlocalizedName("OsmiumPlate").setCreativeTab(BaseForgeSMOA.tabSMOA);
        //OsmiumLegs = new ItemOsmiumArmor(5022, OsmiumArmor, proxy.addArmor("OSMIUM"), 2).setUnlocalizedName("OsmiumLegs").setCreativeTab(BaseForgeSMOA.tabSMOA);
        //OsmiumBoots = new ItemOsmiumArmor(5023, OsmiumArmor, proxy.addArmor("OSMIUM"), 3).setUnlocalizedName("OsmiumBoots").setCreativeTab(BaseForgeSMOA.tabSMOA);
        OsmiumFishPole = new ItemOsmiumFishPole(ItemIds.OSMIUM_FISHPOLE_DEFAULT);
        OsmiumBucket = new ItemOsmiumBucket(ItemIds.OSMIUM_BUCKET_DEFAULT, 0);
        OsmiumShears = new ItemOsmiumShears(ItemIds.OSMIUM_SHEARS_DEFAULT);
        //OrangeSeeds = (ItemSeeds) new ItemSeeds(ItemIds.ORANGE_SEEDS_DEFAULT, OrangeCrop.blockID, Block.tilledField.blockID);
        OrangeFruit = new ItemOrangeFruit(ItemIds.ORANGE_FRUIT_DEFAULT, 3, 5.0f, false);

        ItemStack swordenchanted = new ItemStack(OsmiumSword);
        swordenchanted.addEnchantment(Enchantment.sharpness, 5);
        ItemStack picenchanted = new ItemStack(OsmiumPickaxe);
        picenchanted.addEnchantment(Enchantment.efficiency, 5);
        
        GameRegistry.addShapelessRecipe(new ItemStack(EggScrambled), new Object[] { new ItemStack(EggCooked) });
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(EggCooked), 0.35F);
        GameRegistry.addShapelessRecipe(new ItemStack(BaconRaw), new Object[] { Item.porkRaw });
        GameRegistry.addSmelting(BaconRaw.itemID, new ItemStack(BaconCooked), 0.35F);
        //GameRegistry.addRecipe(new ItemStack(EggsnBacon), new Object[] { "xy", "yx", Character.valueOf('x'), EggScrambled, Character.valueOf('y'), BaconCooked });
        GameRegistry.addShapedRecipe(new ItemStack(OsmiumShovel), new Object[] { " x "," y "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
        GameRegistry.addShapedRecipe(new ItemStack(OsmiumPickaxe), new Object[] { "xxx"," y "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
        GameRegistry.addShapedRecipe(new ItemStack(OsmiumAxe), new Object[] { "xx ","xy "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
        GameRegistry.addShapedRecipe(new ItemStack(OsmiumSword), new Object[] { " x "," x "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
        GameRegistry.addShapedRecipe(new ItemStack(OsmiumHoe), new Object[] { "xx "," y "," y ", Character.valueOf('x'), OsmiumIngot, Character.valueOf('y'), Item.stick});
        //GameRegistry.addShapedRecipe(new ItemStack(OsmiumHelmet), new Object[] { "xxx","x x", Character.valueOf('x'), OsmiumIngot});
        //GameRegistry.addShapedRecipe(new ItemStack(OsmiumPlate), new Object[] { "x x","xxx","xxx", Character.valueOf('x'), OsmiumIngot});
        //GameRegistry.addShapedRecipe(new ItemStack(OsmiumLegs), new Object[] { "xxx","x x","x x", Character.valueOf('x'), OsmiumIngot});
        //GameRegistry.addShapedRecipe(new ItemStack(OsmiumBoots), new Object[] { "x x","x x", Character.valueOf('x'), OsmiumIngot});
        GameRegistry.addShapelessRecipe(swordenchanted, new Object[]{new ItemStack(OsmiumSword), new ItemStack(Item.eyeOfEnder)});
        GameRegistry.addShapelessRecipe(picenchanted, new Object[]{new ItemStack(OsmiumPickaxe), new ItemStack(Item.eyeOfEnder)});
        //GameRegistry.addShapelessRecipe(new ItemStack(OrangeSeeds, 4), new ItemStack(OrangeFruit));

      
    }
}