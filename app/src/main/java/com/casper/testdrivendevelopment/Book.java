package com.casper.testdrivendevelopment;

/**
 * Created by jszx on 2019/9/24.
 */

public class Book {
    public Book(String bookNames, int coverResourceId) {
        setBookNames(bookNames);
        this.setCoverResourceId(coverResourceId);
    }


    private String BookNames;
    private int coverResourceId;


    public String getBookNames() {
        return BookNames;
    }

    public void setBookNames(String bookNames) {
        BookNames = bookNames;
    }

    public int getCoverResourceId() {
        return coverResourceId;
    }

    public void setCoverResourceId(int coverResourceId) {
        this.coverResourceId = coverResourceId;
    }
}
