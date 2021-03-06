/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra Core Addons are licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in this module's root directory.
 */

package com.dfsek.terra.addons.structure.command.structure.argument;

import com.dfsek.terra.api.Platform;
import com.dfsek.terra.api.command.arg.ArgumentParser;
import com.dfsek.terra.api.entity.CommandSender;
import com.dfsek.terra.api.entity.Player;
import com.dfsek.terra.api.inject.annotations.Inject;
import com.dfsek.terra.api.structure.Structure;


public class ScriptArgumentParser implements ArgumentParser<Structure> {
    @Inject
    private Platform platform;
    
    @Override
    public Structure parse(CommandSender sender, String arg) {
        return ((Player) sender).world().getConfig().getRegistry(Structure.class).get(arg);
    }
}
