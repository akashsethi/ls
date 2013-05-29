package com.intelligrape.linksharing
public enum SubscriptionSeriousnessEnum {

    CASUAL("Casual"), SERIOUS("Serious"), VERY_SERIOUS("Very_serious")

    final String showSeriousness

    SubscriptionSeriousnessEnum(String value) {
        this.showSeriousness = value
    }

}
