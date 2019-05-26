package com.griefcraft.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionUtil {


    /**
     * method that determines which signs Set to use for the LimitsV2 class
     * @return set of signs
     */
    public static Set<Material> getLimitV2Set(){
        int versionNum = versionCheck();
        Set<Material> signs = new HashSet<Material>();
        if (versionNum == 14){
            signs = getLimitV2Set1_14();
        }else{
            signs = getLimitV2Set1_13();
        }
        return signs;
    }

    /**
     * method that determines which signs Set to use for the GravityMatcher class
     * @return set of signs
     */
    public static Set<Material> getGravityMatcherSet(){
        int versionNum = versionCheck();
        Set<Material> gravityMatcher = new HashSet<Material>();
        if (versionNum == 14){
            gravityMatcher = getGravityMatcherSet1_14();
        }else{
            gravityMatcher = getGravityMatcherSet1_13();
        }
        return gravityMatcher;
    }

    /**
     * method that determines which signs Set to use for the WallMatcher class
     * @return set of signs
     */
    public static Set<Material> getWallMatcherSet(){
        int versionNum = versionCheck();
        Set<Material> wallMatcher = new HashSet<Material>();
        if (versionNum == 14){
            wallMatcher = getWallMatcherSet1_14();
        }else{
            wallMatcher = getWallMatcherSet1_13();
        }
        return wallMatcher;
    }

    /**
     * finds the version of the server and returns it
     * @return version int
     */
    public static int versionCheck(){
        Matcher versionCheck = Pattern.compile("\\d[.]\\d+").matcher(Bukkit.getVersion());
        if (!versionCheck.find()) {
            return 0;
        }
        int minorVersion = Integer.parseInt(versionCheck.group().substring(2));
        return minorVersion;
    }

    /**
     * private helper methods that assigns proper sign types for 1.13 and 1.14
     * @return a set of legacy signs for 1.13 and updated sign types for 1.14
     */
    private static Set<Material> getLimitV2Set1_13(){
        return EnumSet.of(Material.LEGACY_SIGN, Material.LEGACY_WALL_SIGN);
    }

    private static Set<Material> getLimitV2Set1_14(){
        return EnumSet.of(Material.OAK_WALL_SIGN, Material.BIRCH_WALL_SIGN,
                Material.SPRUCE_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.ACACIA_WALL_SIGN,
                Material.DARK_OAK_WALL_SIGN, Material.OAK_SIGN, Material.BIRCH_SIGN, Material.SPRUCE_SIGN,
                Material.JUNGLE_SIGN, Material.ACACIA_SIGN, Material.DARK_OAK_SIGN);
    }

    private static Set<Material> getWallMatcherSet1_13(){
        return EnumSet.of(Material.LEGACY_WALL_SIGN, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER,
                Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER,
                Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER,
                Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER,
                Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER,
                Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER);
    }

    private static Set<Material> getWallMatcherSet1_14(){
        return EnumSet.of(Material.OAK_WALL_SIGN, Material.BIRCH_WALL_SIGN,
                Material.SPRUCE_WALL_SIGN, Material.JUNGLE_WALL_SIGN, Material.ACACIA_WALL_SIGN,
                Material.DARK_OAK_WALL_SIGN, Material.WHITE_WALL_BANNER, Material.ORANGE_WALL_BANNER,
                Material.MAGENTA_WALL_BANNER, Material.LIGHT_BLUE_WALL_BANNER, Material.YELLOW_WALL_BANNER,
                Material.LIME_WALL_BANNER, Material.PINK_WALL_BANNER, Material.GRAY_WALL_BANNER,
                Material.LIGHT_GRAY_WALL_BANNER, Material.CYAN_WALL_BANNER, Material.PURPLE_WALL_BANNER,
                Material.BLUE_WALL_BANNER, Material.BROWN_WALL_BANNER, Material.GREEN_WALL_BANNER,
                Material.RED_WALL_BANNER, Material.BLACK_WALL_BANNER);
    }

    private static Set<Material> getGravityMatcherSet1_13(){
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

    private static Set<Material> getGravityMatcherSet1_14(){
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
