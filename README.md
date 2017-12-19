# Discord Commands

Open-source JDA commands library

## Getting Started

### Installing

* Download ZIP or clone the master source
```
git clone https://github.com/pedr0ni/discord-cmd.git
```

* Create a instance of CommandManager
```java
public static CommandManager commandManager = new CommandManager();
```

* Create you command class
```java
public class CommandHelp extends Command {}
```

* Implement Command class methods
```java
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
```

* Register your commands
```java
commandManager.registerCommand(new CommandHelp()); //Register CommandHelp (br.com.mpedroni.example.CommandHelp)
```

* Set your commands prefix in CommandManager class
```java
public final String PREFIX = "!";
```

## Built With

* [JDA](https://github.com/DV8FromTheWorld/JDA) - Java Discord API
* [Maven](https://maven.apache.org/) - Dependency Management
* [Eclipse](http://www.eclipse.org/downloads/eclipse-packages/) - Java IDE

## Authors

* **Matheus Pedroni** - [Pedr0ni](https://github.com/pedr0ni)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
