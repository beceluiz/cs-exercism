import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
            DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
            LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, parser);
            return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime dataAtual = LocalDateTime.now();
        return appointmentDate.isBefore(dataAtual);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18 ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
            DateTimeFormatter pattern = DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a.");
            String description = pattern.format(appointmentDate);
            return description;
    }

    public LocalDate getAnniversaryDate() {
        LocalDate date = LocalDate.now();
        LocalDate anniversaryDate = LocalDate.of(date.getYear(), 9, 15);
        return anniversaryDate;
        
    }
}
