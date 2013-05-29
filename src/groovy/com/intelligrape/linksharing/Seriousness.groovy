package com.intelligrape.linksharing
public enum Seriousness {

    CASUAL("Casual"), SERIOUS("Serious"), VERY_SERIOUS("Very_serious")

    final String showSeriousness

    Seriousness(String value) {
        this.showSeriousness = value
    }

}
