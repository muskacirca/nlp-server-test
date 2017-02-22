package com.gooyave.nlp;

class EmbeddedToken {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public EmbeddedToken(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "EmbeddedToken{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}