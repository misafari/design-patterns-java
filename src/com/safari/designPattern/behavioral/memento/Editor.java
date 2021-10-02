package com.safari.designPattern.behavioral.memento;

public class Editor {
    private String content;
    private String fontName;
    private int fontSize;

    public EditorState createState() {
        return new EditorState(this.content, this.fontName, this.fontSize);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
