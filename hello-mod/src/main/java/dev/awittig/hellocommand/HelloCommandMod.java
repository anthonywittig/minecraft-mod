package dev.awittig.hellocommand;

import com.mojang.brigadier.Command;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class HelloCommandMod implements ModInitializer {
	public static final String MOD_ID = "hellocommand";

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
			dispatcher.register(Commands.literal("hello").executes(context -> {
				context.getSource().sendSuccess(() -> Component.literal("Hello from your mod!"), false);
				return Command.SINGLE_SUCCESS;
			}))
		);
	}
}
