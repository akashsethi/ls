package com.intelligrape.linksharing

public enum Visibility {

    PUBLIC("Public"), PRIVATE("Private")
    final String showVisibility

    Visibility(String value) {
        this.showVisibility = value
    }
}
