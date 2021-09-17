package com.bluesoft.solid.singleresponsibilityprinciple.betterexample;

class Text {
    private String text;
    private String author;
    private int length;

    String getText() {
        return text;
    }

    void setText(final String text) {
        this.text = text;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(final String author) {
        this.author = author;
    }

    int getLength() {
        return length;
    }

    void setLength(final int length) {
        this.length = length;
    }

    /*method to change text*/
    void allLettersToUpperCase(){}
    void findSubTextAndDelete(String s){}
}

class Printer{
    private final Text text;

    Printer(final Text text) {
        this.text = text;
    }

    void printText(){}
}
