package me.bigbananaturtle.jlmessage;

import me.bigbananaturtle.jlmessage.Listeners.JoinLeaveListeners;
import org.bukkit.plugin.java.JavaPlugin;

public final class JLMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[=====================-> BigBananaTurtle Developments <-=====================]");
        System.out.println();
        System.out.println("                       -> Join&Leave Message Plugin <-                       ");
        System.out.println("- 1.19.x");
        System.out.println("- Spigot");
        System.out.println("- High Performance");
        System.out.println("- Chat Colors");
        System.out.println();
        System.out.println("[=====================-> BigBananaTurtle Developments <-=====================]");

        getServer().getPluginManager().registerEvents(new JoinLeaveListeners(), this);

    }
}
