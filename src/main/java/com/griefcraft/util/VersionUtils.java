package com.griefcraft.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is for various parts of the plugin to get the proper sign type in versions 1.13 and 1.14
 */
public class VersionUtils {


    /**
     * method that determines which signs Set to use for the LimitsV2 class
     * - gets version from bukkit
     * - finds the version number
     * - checks if it is 1.14 and assigns the Set accordingly
     * @return signs
     */
    public static Set<Material> getSignSet(){
        String version = Bukkit.getServer().getClass().getPackage().getName();
        int vNumIndex = version.indexOf("_");
        String vSub = version.substring(vNumIndex + 1, vNumIndex + 3);
        int versionNum = Integer.parseInt(vSub);
        Set<Material> signs = new HashSet<Material>();
        if (versionNum == 14){
            signs = getSigns1_14();
        }else{
            signs = getSigns1_13();
        }
        return signs;
    }

    /**
     * private helper method that assigns proper sign types for 1.13
     * @return a set of legacy signs for 1.13
     */
    private static Set<Material> getSigns1_13(){
        return EnumSet.of(Material.LEGACY_SIGN, Material.LEGACY_WALL_SIGN);
    }

    /**
     * private helper method that assigns proper sign types for 1.14
     * @return a set of signs for 1.14
     */
    private static Set<Material> getSigns1_14(){
        return EnumSet.of(Material.OAK_WALL_SIGN, Material.BIRCH_WALL_SIGN,
                Material.SPRUCE_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.ACACIA_WALL_SIGN,
                Material.DARK_OAK_WALL_SIGN, Material.OAK_SIGN, Material.BIRCH_SIGN, Material.SPRUCE_SIGN,
                Material.JUNGLE_SIGN, Material.ACACIA_SIGN, Material.DARK_OAK_SIGN);
    }

    /**
     * method that determines which signs Set to use for the WallMatcher class
     * - gets version from bukkit
     * - finds the version number
     * - checks if it is 1.14 and assigns the Set accordingly
     * @return signs
     */
    public static Set<Material> wallMatcherSet(){
        String version = Bukkit.getServer().getClass().getPackage().getName();
        int vNumIndex = version.indexOf("_");
        String vSub = version.substring(vNumIndex + 1, vNumIndex + 3);
        int versionNum = Integer.parseInt(vSub);
        Set<Material> wallMatcher = new HashSet<Material>();
        if (versionNum == 14){
            wallMatcher = wallMatcherSet1_14();
        }else{
            wallMatcher = wallMatcherSet1_13();
        }
        return wallMatcher;
    }

    /**
     * private helper method that assigns proper Material values for 1.13
     * @return a set of legacy signs and other material values for 1.13
     */
    private static Set<Material> wallMatcherSet1_13(){
        return EnumSet.of(Material.LEGACY_WALL_SIGN, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER,
                Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER,
                Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER,
                Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER,
                Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER,
                Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER);
    }

    /**
     * private helper method that assigns proper Material values for 1.14
     * @return a set of signs and other material values for 1.14
     */
    private static Set<Material> wallMatcherSet1_14(){
        return EnumSet.of(Material.OAK_WALL_SIGN, Material.BIRCH_WALL_SIGN,
                Material.SPRUCE_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.ACACIA_WALL_SIGN,
                Material.DARK_OAK_WALL_SIGN, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER,
                Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER,
                Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER,
                Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER,
                Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER,
                Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER);
    }

    /**
     * method that determines which signs Set to use for the GravityMatcher class
     * - gets version from bukkit
     * - finds the version number
     * - checks if it is 1.14 and assigns the Set accordingly
     * @return signs
     */
    public static Set<Material> gravityMatcherSet(){
        String version = Bukkit.getServer().getClass().getPackage().getName();
        int vNumIndex = version.indexOf("_");
        String vSub = version.substring(vNumIndex + 1, vNumIndex + 3);
        int versionNum = Integer.parseInt(vSub);
        Set<Material> gravityMatcher = new HashSet<Material>();
        if (versionNum == 14){
            gravityMatcher = gravityMatcherSet1_14();
        }else{
            gravityMatcher = gravityMatcherSet1_13();
        }
        return gravityMatcher;
    }

    /**
     * private helper method that assigns proper Material values for 1.13
     * @return a set of legacy signs and other material values for 1.13
     */
    private static Set<Material> gravityMatcherSet1_13(){
        return EnumSet.of(Material.LEGACY_SIGN, Material.RAIL,
                Material.ACTIVATOR_RAIL, Material.DETECTOR_RAIL, Material.POWERED_RAIL, Material.LEVER, Material.OAK_BUTTON,
                Material.BIRCH_BUTTON, Material.SPRUCE_BUTTON, Material.JUNGLE_BUTTON, Material.ACACIA_BUTTON,
                Material.DARK_OAK_BUTTON, Material.STONE_BUTTON, Material.OAK_PRESSURE_PLATE,
                Material.SPRUCE_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE,
                Material.ACACIA_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.STONE_PRESSURE_PLATE,
                Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.WHITE_BANNER,
                Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER,
                Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER,
                Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER,
                Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.ARMOR_STAND);
    }

    /**
     * private helper method that assigns proper Material values for 1.14
     * @return a set of signs and other material values for 1.14
     */
    private static Set<Material> gravityMatcherSet1_14(){
        return EnumSet.of(Material.OAK_SIGN, Material.BIRCH_SIGN,
                Material.SPRUCE_SIGN, Material.JUNGLE_SIGN, Material.ACACIA_SIGN, Material.DARK_OAK_SIGN, Material.RAIL,
                Material.ACTIVATOR_RAIL, Material.DETECTOR_RAIL, Material.POWERED_RAIL, Material.LEVER, Material.OAK_BUTTON,
                Material.BIRCH_BUTTON, Material.SPRUCE_BUTTON, Material.JUNGLE_BUTTON, Material.ACACIA_BUTTON,
                Material.DARK_OAK_BUTTON, Material.STONE_BUTTON, Material.OAK_PRESSURE_PLATE,
                Material.SPRUCE_PRESSURE_PLATE, Material.BIRCH_PRESSURE_PLATE, Material.JUNGLE_PRESSURE_PLATE,
                Material.ACACIA_PRESSURE_PLATE, Material.DARK_OAK_PRESSURE_PLATE, Material.STONE_PRESSURE_PLATE,
                Material.LIGHT_WEIGHTED_PRESSURE_PLATE, Material.HEAVY_WEIGHTED_PRESSURE_PLATE, Material.WHITE_BANNER,
                Material.ORANGE_BANNER, Material.MAGENTA_BANNER, Material.LIGHT_BLUE_BANNER, Material.YELLOW_BANNER,
                Material.LIME_BANNER, Material.PINK_BANNER, Material.GRAY_BANNER, Material.LIGHT_GRAY_BANNER,
                Material.CYAN_BANNER, Material.PURPLE_BANNER, Material.BLUE_BANNER, Material.BROWN_BANNER,
                Material.GREEN_BANNER, Material.RED_BANNER, Material.BLACK_BANNER, Material.ARMOR_STAND);
    }

}
