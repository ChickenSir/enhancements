package com.enhancements.property;

import net.minecraft.world.level.block.state.properties.EnumProperty;

public class ENHBlockStateProperties {
    public static final EnumProperty<CenterStairShape> CENTER_STAIR_SHAPE;
    public static final EnumProperty<ChimneySection> CHIMNEY_SECTION;
    public static final EnumProperty<Cushion> CUSHION;

    public ENHBlockStateProperties() {}

    static {
        CENTER_STAIR_SHAPE = EnumProperty.create("shape", CenterStairShape.class);
        CHIMNEY_SECTION = EnumProperty.create("section", ChimneySection.class);
        CUSHION = EnumProperty.create("cushion", Cushion.class);
    }
}
