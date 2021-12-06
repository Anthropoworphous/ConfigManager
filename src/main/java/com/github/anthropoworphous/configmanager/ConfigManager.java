package com.github.anthropoworphous.configmanager;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class ConfigManager extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "ConfigManager loaded");
    }
}
