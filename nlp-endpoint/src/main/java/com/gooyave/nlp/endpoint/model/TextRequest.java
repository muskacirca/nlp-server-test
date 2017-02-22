package com.gooyave.nlp.endpoint.model;

import javax.validation.constraints.NotNull;

public class TextRequest {

    @NotNull
    private String accessToken;

    @NotNull
    private String sentence;

    @NotNull
    private String language;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
