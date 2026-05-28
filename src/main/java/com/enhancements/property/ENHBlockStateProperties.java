package com.enhancements.property;

import net.minecraft.world.level.block.state.properties.EnumProperty;

public class ENHBlockStateProperties {
    public static final EnumProperty<CenterStairShape> CENTER_STAIR_SHAPE;

    public ENHBlockStateProperties() {}

    static {
        CENTER_STAIR_SHAPE = EnumProperty.create("shape", CenterStairShape.class);
    }
}
