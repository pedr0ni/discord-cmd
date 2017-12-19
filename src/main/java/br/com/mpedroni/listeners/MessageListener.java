package br.com.mpedroni.listeners;

import br.com.mpedroni.Main;
import br.com.mpedroni.core.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent e) {
		String msg = e.getMessage().getContentDisplay();
		if (msg.startsWith(Main.commandManager.PREFIX)) {
			boolean found = false;
			String cmd = toCmd(msg);
			String[] args = getPrams(msg);
			
			for (Command cmds : Main.commandManager.getCommands()) {
				if (cmds.getCommand().toLowerCase().equalsIgnoreCase(cmd.toLowerCase())) {
					cmds.execute(args, e);
					found = true;
					break;
				}
			}
			
			if (!found) {
				e.getTextChannel().sendMessage(":x: Command not found.").queue();
			}
			
		}
	}
	
	private String toCmd(String raw) {
		if (raw.indexOf(" ") == -1) {
			return raw.substring(1, raw.length());
		} else {
			return raw.substring(1, raw.indexOf(" "));
		}
	}
	
	private String[] getPrams(String raw) {
		if (raw.indexOf(" ") == -1) {
			return new String[0];
		} else {
			return raw.substring(raw.indexOf(" ") + 1, raw.length()).split(" ");
		}
	}

}
