package com.multiplex.entities;

import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="show")
public class Show {
	@Id
	@Column(name="showid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer showId;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="hallId")
	private Hall hall;
	@JoinColumn(name="showTime")
	private LocalTime showTime;
	public Show() {
		super();
	}
	public Show(Integer showId, Hall hall, LocalTime showTime) {
		super();
		this.showId = showId;
		this.hall = hall;
		this.showTime = showTime;
	}
	public Integer getShowId() {
		return showId;
	}
	public Hall getHall() {
		return hall;
	}
	public LocalTime getShowTime() {
		return showTime;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", hall=" + hall + ", showTime=" + showTime + "]";
	}
	
}

























