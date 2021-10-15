package org.mineacademy.winter.commands;

import org.mineacademy.fo.annotation.AutoRegister;
import org.mineacademy.fo.command.ReloadCommand;
import org.mineacademy.fo.command.SimpleCommandGroup;

@AutoRegister
public final class WinterCommandGroup extends SimpleCommandGroup {

	@Override
	protected void registerSubcommands() {
		registerSubcommand(new SnowCommand());
		registerSubcommand(new PsychoCommand());
		registerSubcommand(new PopulateCommand());
		registerSubcommand(new ReloadCommand());
	}
}
