package me.nozembr;

import me.nozembr.events.baumanager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class baumain extends JavaPlugin {

    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new baumanager(), this);//para declarar eventos


        Bukkit.getConsoleSender().sendMessage("§a[BAU NOZEM] Plugin carregado.");

    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[BAU NOZEM] Plugin descarregado.");

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (label.equals("baun")) {//Se o cara for player vai digitar
            Player p = (Player) sender;
            sender.sendMessage("§aPlugin está funcionando");

        }
        return true;
    }
}