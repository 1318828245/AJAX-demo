package com.msj.pojo;

public class Book {
    private Integer bookId;
    private String   bookName;
    private Integer  bookPrice;
    private String   publishName;

    public Book(){}
    public Book(Integer bookId,String bookName,Integer bookPrice,String publishName){
        this.bookId=bookId;
        this.bookName=bookName;
        this.bookPrice=bookPrice;
        this.publishName=publishName;
    }



    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", publishName='" + publishName + '\'' +
                '}';
    }
}
