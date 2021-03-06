package io.noni.smptweaks.events;

import io.noni.smptweaks.SMPTweaks;
import io.noni.smptweaks.tasks.PlayerMetaStorerTask;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitTask;

public class PlayerLeave implements Listener {

    @EventHandler
    void onPlayerLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        // Update SMPTweaks player in DB
        BukkitTask playerMetaStorerTask = new PlayerMetaStorerTask(player).runTaskAsynchronously(SMPTweaks.getPlugin());
    }
}
