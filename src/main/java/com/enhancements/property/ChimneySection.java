package com.enhancements.property;

import net.minecraft.util.StringRepresentable;

public enum ChimneySection implements StringRepresentable {
    TOP("top"),
    BOTTOM("bottom");

    private final String name;

    private ChimneySection(final String s) {
        this.name = s;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
    
}