package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String textToBeautify, PoemDecorator beautifier){
        String textBeautified = beautifier.decorate(textToBeautify);
        System.out.println("Original text: " + textToBeautify + "; Modified text: " + textBeautified);
    }

}
