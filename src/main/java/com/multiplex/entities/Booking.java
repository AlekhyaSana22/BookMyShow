package com.multiplex.entities;
 
import java.time.LocalDate;
 
import java.time.LocalTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 

@Entity
@Table(name="booking")
public class Booking {
    @Id
    @Column(name="bookingid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="userId", unique = true)
    private User user;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="showId", unique = true)
    private Show show;
    private LocalDate date;
    private LocalTime time;

    public Booking() {
        super();
    }
 
    public Booking(Integer bookingId, User user, Show show, LocalDate date, LocalTime time) {
        super();
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.date = date;
        this.time = time;
    }
 
    public Integer getBookingId() {
        return bookingId;
    }
 
    public User getUser() {
        return user;
    }
 
    public Show getShow() {
        return show;
    }
 
    public LocalDate getDate() {
        return date;
    }
 
    public LocalTime getTime() {
        return time;
    }
 
    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
 
    public void setShow(Show show) {
        this.show = show;
    }
 
    public void setDate(LocalDate date) {
        this.date = date;
    }
 
    public void setTime(LocalTime time) {
        this.time = time;
    }
 
    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", user=" + user + ", show=" + show + ", date=" + date + ", time="
                + time + "]";
    }

}