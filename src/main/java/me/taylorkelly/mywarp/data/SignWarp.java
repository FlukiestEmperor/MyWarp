package me.taylorkelly.mywarp.data;

import java.util.ArrayList;


import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.SignChangeEvent;

public class SignWarp {
    
    /**
     * Precondition: Only call if isSignWarp() returned true
     */
    public static void warpSign(Sign sign, WarpList list, Player player) {
        ArrayList<String> lines = new ArrayList<String>();
        for(int i = 0; i < 4; i++){
          lines.add(sign.getLine(i));
        }
        String name = lines.get(2);
        list.warpTo(name, player);
    }

    public static boolean isSignWarp(Sign sign) {
        ArrayList<String> lines = new ArrayList<String>();
        for(int i = 0; i < 4; i++){
          lines.add(sign.getLine(i));
        }
        if(lines.get(1).equalsIgnoreCase("[MyWarp]")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSignWarp(SignChangeEvent sign) {
        ArrayList<String> lines = new ArrayList<String>();
        for(int i = 0; i < 4; i++){
          lines.add(sign.getLine(i));
        }
        if(lines.get(1).equalsIgnoreCase("[MyWarp]")) {
            return true;
        } else {
            return false;
        }
    }
}
