package com.intelligrape.linksharing

public enum TopicVisibilityEnum {

    PUBLIC("Public"), PRIVATE("Private")
    final String showVisibility

    TopicVisibilityEnum(String value) {
        this.showVisibility = value
    }
}
