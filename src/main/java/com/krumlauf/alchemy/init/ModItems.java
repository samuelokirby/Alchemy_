package com.krumlauf.alchemy.init;

import com.krumlauf.alchemy.tools.Gauntlet;
import net.minecraftforge.common.util.EnumHelper;
import java.util.ArrayList;
import java.util.List;

import com.krumlauf.alchemy.items.ItemBase;
import com.krumlauf.alchemy.items.armor.ArmorBase;
import com.krumlauf.alchemy.items.food.ItemCustomFood;
import com.krumlauf.alchemy.items.food.ItemManaEssenceSeeds;
import com.krumlauf.alchemy.items.tools.ToolAxe;
import com.krumlauf.alchemy.items.tools.ToolPickaxe;
import com.krumlauf.alchemy.items.tools.ToolSpade;
import com.krumlauf.alchemy.items.tools.ToolSword;
import com.krumlauf.alchemy.util.Reference;
import com.krumlauf.alchemy.items.tools.ToolHoe;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_SPELLBOUND_INGOT = EnumHelper.addToolMaterial("material_spellbound_ingot", 3, 250, 8.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_SPELLBOUND_INGOT = EnumHelper.addArmorMaterial("armor_material_spellbound_ingot", Reference.MOD_ID + ":spellbound_ingot", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item LESSER_FLUX = new ItemBase("lesser_flux");
	public static final Item STABLE_FLUX = new ItemBase("stable_flux");
	public static final Item GREATER_FLUX = new ItemBase("greater_flux");
	public static final Item GIGA_FLUX = new ItemBase("giga_flux");
	public static final Item EMPTY_RUNE = new ItemBase("empty_rune");
	public static final Item FIRE_RUNE = new ItemBase("fire_rune");
	public static final Item WATER_RUNE = new ItemBase("water_rune");
	public static final Item AIR_RUNE = new ItemBase("air_rune");
	public static final Item EARTH_RUNE = new ItemBase("earth_rune");	
	public static final Item AIR_SPELL_TOME = new ItemBase("air_spell_tome");
	public static final Item EARTH_SPELL_TOME = new ItemBase("earth_spell_tome");
	public static final Item FIRE_SPELL_TOME = new ItemBase("fire_spell_tome");
	public static final Item WATER_SPELL_TOME = new ItemBase("water_spell_tome");
	
	//Ingots & Gems
	public static final Item SPELLBOUND_INGOT = new ItemBase("spellbound_ingot");
	public static final Item VOID_CRYSTAL = new ItemBase("void_crystal");
	public static final Item CATALYST = new ItemBase("catalyst");
	
	//Food & Seeds
	public static final Item MANA_BUNS = new ItemCustomFood("mana_buns", 5, false);
	public static final Item MANA_ESSENCE_SEEDS = new ItemManaEssenceSeeds("mana_essence_seeds", 1, false);
	
	//Tools
	public static final ItemSword SPELLBOUND_SWORD = new ToolSword("spellbound_sword", MATERIAL_SPELLBOUND_INGOT);
	public static final ItemSpade SPELLBOUND_SPADE = new ToolSpade("spellbound_spade", MATERIAL_SPELLBOUND_INGOT);
	public static final ItemPickaxe SPELLBOUND_PICKAXE = new ToolPickaxe("spellbound_pickaxe", MATERIAL_SPELLBOUND_INGOT);
	public static final ItemAxe SPELLBOUND_AXE = new ToolAxe("spellbound_axe", MATERIAL_SPELLBOUND_INGOT);
	public static final ItemHoe SPELLBOUND_HOE = new ToolHoe("spellbound_hoe", MATERIAL_SPELLBOUND_INGOT);
	public static final Item GAUNTLET = new Gauntlet("gauntlet");
	
	//Armor
	public static final Item SPELLSLINGERS_HELMET = new ArmorBase("spellslingers_helmet", ARMOR_MATERIAL_SPELLBOUND_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPELLSLINGERS_CHESTPLATE = new ArmorBase("spellslingers_chestplate", ARMOR_MATERIAL_SPELLBOUND_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item SPELLSLINGERS_LEGGINGS = new ArmorBase("spellslingers_leggings", ARMOR_MATERIAL_SPELLBOUND_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item SPELLSLINGERS_BOOTS = new ArmorBase("spellslingers_boots", ARMOR_MATERIAL_SPELLBOUND_INGOT, 1, EntityEquipmentSlot.FEET);
}
