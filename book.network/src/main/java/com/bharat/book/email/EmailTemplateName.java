package com.bharat.book.email;

public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activation_account");
    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
