package jack123f1.jack123f1.events;

import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class OP implements Listener {
    @EventHandler
    public void onPlayerClickSign(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        Browser b=new Browser();
        if (event.getClickedBlock().getType() == Material.OAK_SIGN) {
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                Sign sign = (Sign) event.getClickedBlock().getState();
                //^^ .getState(); really important
                if (sign.getLine(1).equalsIgnoreCase("YOURTEXT")) {
                    p.sendMessage(sign.getLine(1));
                    b.test(sign.getLine(1));
                    sign.update();
                }
            }
        }
    }
}
