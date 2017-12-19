package br.com.mpedroni.core;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public abstract class Command {

	public void execute(String[] args, MessageReceivedEvent e) {}
	public String getCommand() {return null;}
	public String getHelp() {return null;}
	
}
