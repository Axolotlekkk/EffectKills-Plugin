package xyz.axo.effect.effectkills;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EffectKills extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    public String replaceHexColors(String s) {
        Pattern patt = Pattern.compile("#[a-fA-F0-9]{6}");
        Matcher match = patt.matcher(s);

        while(match.find()) {
            String hex = s.substring(match.start(), match.end());
            s = s.replace(hex, ChatColor.of(hex) + "");
            match = patt.matcher(s);
        }

        return s;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}


