package io.noni.smptweaks.utils;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtils {

    private ChatUtils() {
        throw new AssertionError("This utility class cannot be instantiated");
    }

    /**
     * Message a player a positive or neutral message
     * @param player
     * @param message
     */
    public static void notify(Player player, String message) {
        player.sendMessage(ChatColor.AQUA + message);
    }

    /**
     * Message a player an array of positive or neutral messages
     * @param player
     * @param messages
     */
    public static void notify(Player player, String[] messages) {
        for (String message : messages) {
            notify(player, message);
        }
    }

    /**
     * Message a player a negative message
     * @param player
     * @param message
     */
    public static void negative(Player player, String message) {
        player.sendMessage(ChatColor.RED + message);
    }

    /**
     * Message a player an array of negative messages
     * @param player
     * @param messages
     */
    public static void negative(Player player, String[] messages) {
        for (String message : messages) {
            negative(player, message);
        }
    }

    /**
     * Message a player a system message
     * @param player
     * @param message
     */
    public static void system(Player player, String message) {
        player.sendMessage(ChatColor.GOLD + message);
    }

    /**
     * Message a player an array of system messages
     * @param player
     * @param messages
     */
    public static void system(Player player, String[] messages) {
        for (String message : messages) {
            system(player, message);
        }
    }

    /**
     * Send a simple message to player
     * @param message
     */
    public static void chat(Player player, String message) {
        player.sendMessage(ChatColor.WHITE + message);
    }

    /**
     * Send an array of simple messages
     * @param messages
     */
    public static void chat(Player player, String[] messages) {
        for (String message : messages) {
            chat(player, message);
        }
    }

    /**
     * Send TextComponent message to player
     * @param player
     * @param textComponent
     */
    public static void chatRaw(Player player, TextComponent textComponent) {
        player.spigot().sendMessage(textComponent);
    }

    /**
     * Send an array of TextComponent messages to player
     * @param player
     * @param textComponents
     */
    public static void chatRaw(Player player, TextComponent[] textComponents) {
        for (TextComponent textComponent : textComponents) {
            chatRaw(player, textComponent);
        }
    }

    /**
     * Broadcast message
     * @param message
     */
    public static void broadcast(String message) {
        Bukkit.broadcastMessage(ChatColor.WHITE + message);
    }

    /**
     * Broadcast an array of messages
     * @param messages
     */
    public static void broadcast(String[] messages) {
        for(String message : messages) {
            broadcast(message);
        }
    }

    /**
     * Broadcast a TextComponent
     * @param textComponent
     */
    public static void broadcastRaw(TextComponent textComponent) {
        Bukkit.getServer().spigot().broadcast(textComponent);
    }

    /**
     * Broadcast an array of TextComponents
     * @param textComponents
     */
    public static void broadcastRaw(TextComponent[] textComponents) {
        for(TextComponent textComponent : textComponents) {
            broadcastRaw(textComponent);
        }
    }

}
