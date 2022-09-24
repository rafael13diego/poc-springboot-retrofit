package com.drafael.professional.clientfuninterfaces.models;

import lombok.Data;

import java.util.Date;

@Data
public class ComicResult{

    public int id;
    public String digitalId;
    public String title;
    public String issueNumber;
    public String variantDescription;
    public String description;
    public String modified;
    public String isbn;
    public String upc;
    public String diamondCode;
    public String ean;
    public String issn;
    public String format;
    public String pageCount;
    public String resourceURI;
}