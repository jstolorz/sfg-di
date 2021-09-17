package com.bluesoft.solid.singleresponsibilityprinciple.badexample;

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


    /*method to formatting output
    mix logic with presentation not good !
    * */
    void printText(){}

}
