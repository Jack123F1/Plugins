package jack123f1.jack123f1.events;

import jack123f1.jack123f1.Jack123F1;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;
import java.io.IOException;
public class ReadYaml {
    private String confName;
    private File file;
    private FileConfiguration confFile;
    private static Server server = Jack123F1.main.getServer();

    public ReadYaml(String confName){
        this.confName = confName;
        this.file = new File(server.getPluginManager().getPlugin("Jack123F1").getDataFolder(), this.confName);
        if(!file.exists()){
            try{
                this.file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        this.confFile = YamlConfiguration.loadConfiguration(this.file);
    }

    public String getName(){
        return this.confName;
    }

    public FileConfiguration getConf(){
        return this.confFile;
    }

    public void save(){
        try{
            this.confFile.save(this.file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void reload(){
        this.confFile = YamlConfiguration.loadConfiguration(this.file);
    }
}
