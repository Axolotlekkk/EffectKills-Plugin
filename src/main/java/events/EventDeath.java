package events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import xyz.axo.effect.effectkills.EffectKills;

import javax.annotation.Nullable;

public class EventDeath implements Listener {
    private final EffectKills plugin;
    public EventDeath(EffectKills plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void PlayerDeathEvent(EntityDeathEvent e) {
        String subtitle = plugin.getConfig().getString("subtitle");
        Player attacker = (Player) e.getEntity().getKiller();
        attacker.sendTitle(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("title")), ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("subtitle").replaceAll("<attacker>", attacker.getName())), 1, 1, 1 );

    }
}

