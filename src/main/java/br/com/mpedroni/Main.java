package br.com.mpedroni;

import javax.security.auth.login.LoginException;

import br.com.mpedroni.core.CommandManager;
import br.com.mpedroni.example.CommandHelp;
import br.com.mpedroni.listeners.MessageListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.Game.GameType;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Main {
	
	public static CommandManager commandManager;

	public static void main(String[] args) {
		
		commandManager = new CommandManager();
		commandManager.registerCommand(new CommandHelp()); //Register CommandHelp (br.com.mpedroni.example.CommandHelp)
		
		try {
			JDA jda = new JDABuilder(AccountType.BOT).setToken("TOKEN").buildBlocking();
			jda.setAutoReconnect(true);
			jda.addEventListener(new MessageListener());
			jda.getPresence().setGame(Game.of(GameType.DEFAULT, "pedr0ni.github.io", "https://pedr0ni.github.io"));
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			e.printStackTrace();
		} 
	}

}
