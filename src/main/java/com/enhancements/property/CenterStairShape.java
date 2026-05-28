package com.enhancements.property;

import net.minecraft.util.StringRepresentable;

public enum CenterStairShape implements StringRepresentable {
    FRONT("front"),
    BACK("back"),
    CROSS("cross"),
    STRAIGHT("straight");

    private final String name;

    private CenterStairShape(final String s) {
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
