package com.csse.csse_tms_back_end.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Journey {

    //TODO
    //ADD PASSENGER

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Journey Identifier is required")
    @Column(updatable = false, unique = true)
    private String journeyIdentifier;

    private String checkedInLocation;

    private String checkedOutLocation;

    @Column(columnDefinition = "TIME")
    private LocalTime checkedInTime;

    @Column(columnDefinition = "TIME")
    private LocalTime checkedOutTime;

    //@NotBlank(message = "Date is required")
    @Column(columnDefinition = "DATE")
    private LocalDate date;

    private Double fare;

    public Journey() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJourneyIdentifier() {
        return journeyIdentifier;
    }

    public void setJourneyIdentifier(String journeyIdentifier) {
        this.journeyIdentifier = journeyIdentifier;
    }

    public String getCheckedInLocation() {
        return checkedInLocation;
    }

    public void setCheckedInLocation(String checkedInLocation) {
        this.checkedInLocation = checkedInLocation;
    }

    public String getCheckedOutLocation() {
        return checkedOutLocation;
    }

    public void setCheckedOutLocation(String checkedOutLocation) {
        this.checkedOutLocation = checkedOutLocation;
    }

    public LocalTime getCheckedInTime() {
        return checkedInTime;
    }

    public void setCheckedInTime(LocalTime checkedInTime) {
        this.checkedInTime = checkedInTime;
    }

    public LocalTime getCheckedOutTime() {
        return checkedOutTime;
    }

    public void setCheckedOutTime(LocalTime checkedOutTime) {
        this.checkedOutTime = checkedOutTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }
}
