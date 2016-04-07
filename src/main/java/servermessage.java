import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Edit Soundofdarkness 07.04.16
 */

    public class servermessage extends JavaPlugin {

        public void onEnable(){
            this.getLogger().info("Servermessage has been enabled. You are using verion 1.0");
        }

        public void onDisable(){
            this.getLogger().info("Servermessage has been disabled.");
        }

        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
            if(cmd.getName().equalsIgnoreCase("welcome")){ // Wenn /welcome ausgeführt wird wird ein Willkommen in den chat geschrieben
                getServer().broadcastMessage(ChatColor.GOLD + "Willkommen auf dem MMO-Server der Lux Caeli!");
                this.getLogger().info( "Welcomed new players on the server");
                return true;
            } // Wenn das passiert, wird die Funktion abbrechen und true als Wert zurückgeben.
            this.getLogger().info("Fehler beim ausführen von Welcome");
            return false;

        }



    }

