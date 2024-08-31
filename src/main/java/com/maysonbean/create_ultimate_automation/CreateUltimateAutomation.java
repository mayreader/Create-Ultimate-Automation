package com.maysonbean.create_ultimate_automation;

import com.simibubi.create.Create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateUltimateAutomation implements ModInitializer {
	public static final String MOD_ID = "create-ultimate-automation";
	public static final String NAME = "Create Ultimate Automation";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Create: Ultimate Automation is loading alongside Create [{}]!", Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), "Create: Ultimate Automation");
	}
}