package jack123f1.jack123f1;

import jack123f1.jack123f1.events.OP;
import jack123f1.jack123f1.events.ReadYaml;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jack123F1 extends JavaPlugin {

    public static Jack123F1 main;
    FileConfiguration config = getConfig();


    @Override
    public void onEnable() {
        // Plugin startup logic
        this.main = Jack123F1.this;
        getServer().getPluginManager().registerEvents(new OP(),this);
        config.options().copyDefaults(true);
        saveConfig();
        ReadYaml urlYml = new ReadYaml("url.yml");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
