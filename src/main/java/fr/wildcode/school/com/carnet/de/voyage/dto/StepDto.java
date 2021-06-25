package fr.wildcode.school.com.carnet.de.voyage.dto;

import java.time.LocalDate;

public class StepDto {
    private String city;
    private LocalDate startDate;
    private String summary;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }







}
