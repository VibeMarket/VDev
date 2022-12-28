package me.kevind;

import me.kevind.commands.GamemodeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class VDev extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new GamemodeCommand());
    }
    @Override
    public void onDisable() {

    }
}
