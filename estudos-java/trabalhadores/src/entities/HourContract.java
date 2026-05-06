package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract {
    private LocalDate date;
    private double valuePerHour;
    private int hours;

    public HourContract() {
    }

    private LocalDate formatDate(String date) {
        var dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var formattedDate = LocalDate.parse(date, dateFormat);

        return formattedDate;
    }

    public void setDate(String date) {
        this.date = this.formatDate(date);
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double calculateTotalValue() {
        return this.hours * this.valuePerHour;
    }
}
