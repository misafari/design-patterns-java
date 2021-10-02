package com.safari.designPattern.behavioral.memento;

public class EditorState {
    private final String content;
    private String fontName;
    private int fontSize;

    public EditorState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
