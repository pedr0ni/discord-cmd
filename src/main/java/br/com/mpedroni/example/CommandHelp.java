package br.com.mpedroni.example;

import br.com.mpedroni.core.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class CommandHelp extends Command {
	
	@Override
	public void execute(String[] args, MessageReceivedEvent e) {
		
	}
	
	@Override
	public String getCommand() {
		return "help";
	}
	
	@Override
	public String getHelp() {
		return "Show all commands";
	}


}
