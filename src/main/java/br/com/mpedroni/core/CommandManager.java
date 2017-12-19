package br.com.mpedroni.core;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
	
	private List<Command> commands;
	public final String PREFIX = "!";

	public CommandManager() {
		this.commands = new ArrayList<Command>();
	}
	
	public List<Command> getCommands() {
		return this.commands;
	}
	
	public void registerCommand(Command cmd) {
		this.commands.add(cmd);
	}

}
