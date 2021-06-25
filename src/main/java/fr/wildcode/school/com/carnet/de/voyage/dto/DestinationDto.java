package fr.wildcode.school.com.carnet.de.voyage.dto;

import java.time.LocalDate;

public class DestinationDto {
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }




}
