package com.enhancements.property;

import net.minecraft.util.StringRepresentable;

public enum Cushion implements StringRepresentable {
    NONE("none"),
    RED("red"),
    BLUE("blue"),
    YELLOW("yellow"),
    GREEN("green"),
    LIME("lime"),
    CYAN("cyan"),
    LIGHT_BLUE("light_blue"),
    PURPLE("purple"),
    MAGENTA("magenta"),
    PINK("pink"),
    ORANGE("orange"),
    BROWN("brown"),
    LIGHT_GRAY("light_gray"),
    GRAY("gray"),
    BLACK("black"),
    WHITE("white");

    private final String name;

    private Cushion(final String s) {
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