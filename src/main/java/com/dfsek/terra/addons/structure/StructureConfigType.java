/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra Core Addons are licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in this module's root directory.
 */

package com.dfsek.terra.addons.structure;

import com.dfsek.terra.api.Platform;
import com.dfsek.terra.api.config.ConfigFactory;
import com.dfsek.terra.api.config.ConfigPack;
import com.dfsek.terra.api.config.ConfigType;
import com.dfsek.terra.api.registry.OpenRegistry;
import com.dfsek.terra.api.structure.configured.ConfiguredStructure;
import com.dfsek.terra.api.util.reflection.TypeKey;

import java.util.function.Supplier;


public class StructureConfigType implements ConfigType<StructureTemplate, ConfiguredStructure> {
    private final ConfigFactory<StructureTemplate, ConfiguredStructure> factory = new StructureFactory();
    public static final TypeKey<ConfiguredStructure> CONFIGURED_STRUCTURE_TYPE_KEY = new TypeKey<>(){};
    
    @Override
    public StructureTemplate getTemplate(ConfigPack pack, Platform platform) {
        return new StructureTemplate();
    }
    
    @Override
    public ConfigFactory<StructureTemplate, ConfiguredStructure> getFactory() {
        return factory;
    }
    
    @Override
    public TypeKey<ConfiguredStructure> getTypeKey() {
        return CONFIGURED_STRUCTURE_TYPE_KEY;
    }
}
