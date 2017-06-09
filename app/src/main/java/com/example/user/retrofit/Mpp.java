package com.example.user.retrofit;

import com.google.gson.annotations.SerializedName;



// Created by User on 6/7/2017.


public class Mpp {

    @SerializedName("Title")
    String title;

    @SerializedName("Author")
    String author;

    @SerializedName("Publisher")
    String publisher;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return publisher;
    }

    public void setPages(String pages) {
        this.publisher = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}





//
//    @SerializedName("ID")
//    int ID;
//    @SerializedName("MPP_SN")
//    int MPP_SN;
//    @SerializedName("Title")
//    String Title;
//    @SerializedName("Author")
//    String Author;
//    @SerializedName("Publisher")
//    String Publisher;
//    @SerializedName("Publisher_Address")
//    String Publisher_Address;
//    @SerializedName("Subject")
//    String Subject;
//    @SerializedName("Pages")
//    int Pages;
//    @SerializedName("Size")
//    int Size;
//    @SerializedName("Edition")
//    String Edition;
//    @SerializedName("Press")
//    String Press;
//    @SerializedName("Press_Address")
//    String Press_Address;
//    @SerializedName("Price")
//    int Price;
//    @SerializedName("Published_Date")
//    int Published_Date;
//    @SerializedName("ISBN")
//    int ISBN;
//    @SerializedName("Remarks")
//    String Remarks;
//
//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public int getMPP_SN() {
//        return MPP_SN;
//    }
//
//    public void setMPP_SN(int MPP_SN) {
//        this.MPP_SN = MPP_SN;
//    }
//
//    public String getTitle() {
//        return Title;
//    }
//
//    public void setTitle(String title) {
//        Title = title;
//    }
//
//    public String getAuthor() {
//        return Author;
//    }
//
//    public void setAuthor(String author) {
//        Author = author;
//    }
//
//    public String getPublisher() {
//        return Publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        Publisher = publisher;
//    }
//
//    public String getPublisher_Address() {
//        return Publisher_Address;
//    }
//
//    public void setPublisher_Address(String publisher_Address) {
//        Publisher_Address = publisher_Address;
//    }
//
//    public String getSubject() {
//        return Subject;
//    }
//
//    public void setSubject(String subject) {
//        Subject = subject;
//    }
//
//    public int getPages() {
//        return Pages;
//    }
//
//    public void setPages(int pages) {
//        Pages = pages;
//    }
//
//    public int getSize() {
//        return Size;
//    }
//
//    public void setSize(int size) {
//        Size = size;
//    }
//
//    public String getEdition() {
//        return Edition;
//    }
//
//    public void setEdition(String edition) {
//        Edition = edition;
//    }
//
//    public String getPress() {
//        return Press;
//    }
//
//    public void setPress(String press) {
//        Press = press;
//    }
//
//    public String getPress_Address() {
//        return Press_Address;
//    }
//
//    public void setPress_Address(String press_Address) {
//        Press_Address = press_Address;
//    }
//
//    public int getPrice() {
//        return Price;
//    }
//
//    public void setPrice(int price) {
//        Price = price;
//    }
//
//    public int getPublished_Date() {
//        return Published_Date;
//    }
//
//    public void setPublished_Date(int published_Date) {
//        Published_Date = published_Date;
//    }
//
//    public int getISBN() {
//        return ISBN;
//    }
//
//    public void setISBN(int ISBN) {
//        this.ISBN = ISBN;
//    }
//
//    public String getRemarks() {
//        return Remarks;
//    }
//
//    public void setRemarks(String remarks) {
//        Remarks = remarks;
//    }
//
//
//
//
//}