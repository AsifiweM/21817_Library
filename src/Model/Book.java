package Model;
// Generated 10-May-2020 21:35:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String publishinghouse;
     private Date publishingdate;
     private String author;
     private int pages;
     private Set checkinouts = new HashSet(0);

    public Book() {
    }

	
    public Book(String title, String publishinghouse, Date publishingdate, String author, int pages) {
        this.title = title;
        this.publishinghouse = publishinghouse;
        this.publishingdate = publishingdate;
        this.author = author;
        this.pages = pages;
    }
    public Book(String title, String publishinghouse, Date publishingdate, String author, int pages, Set checkinouts) {
       this.title = title;
       this.publishinghouse = publishinghouse;
       this.publishingdate = publishingdate;
       this.author = author;
       this.pages = pages;
       this.checkinouts = checkinouts;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublishinghouse() {
        return this.publishinghouse;
    }
    
    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse;
    }
    public Date getPublishingdate() {
        return this.publishingdate;
    }
    
    public void setPublishingdate(Date publishingdate) {
        this.publishingdate = publishingdate;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return this.pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    public Set getCheckinouts() {
        return this.checkinouts;
    }
    
    public void setCheckinouts(Set checkinouts) {
        this.checkinouts = checkinouts;
    }




}

