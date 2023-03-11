package io.javabrains.javacollections;

import java.time.LocalDateTime;
import java.util.NavigableSet;

// Implement the  AppointmentScheduler using a NavigableSet internally

public class AppointmentScheduler {

    public void addAppointment(LocalDateTime datetime) {
        throw new RuntimeException("Not implemented");
    }

    public LocalDateTime getNextAvailableSlot(LocalDateTime datetime) {
        throw new RuntimeException("Not implemented");
    }

    public LocalDateTime removeFirstAppointment() {
        throw new RuntimeException("Not implemented");
    }

    public LocalDateTime removeLastAppointment() {
        throw new RuntimeException("Not implemented");
    }

    public NavigableSet<LocalDateTime> getAppointmentsAfter(LocalDateTime datetime) {
        throw new RuntimeException("Not implemented");
    }

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();

        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 10, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 11, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 12, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 13, 0));

        LocalDateTime datetime1 = LocalDateTime.of(2023, 3, 4, 10, 30);
        LocalDateTime nextSlot1 = scheduler.getNextAvailableSlot(datetime1);
        System.out.println("Next available slot after " + datetime1 + ": " + nextSlot1);

        LocalDateTime first = scheduler.removeFirstAppointment();
        System.out.println("Removed first appointment: " + first);

        LocalDateTime last = scheduler.removeLastAppointment();
        System.out.println("Removed last appointment: " + last);

        LocalDateTime datetime3 = LocalDateTime.of(2023, 3, 4, 11, 0);
        NavigableSet<LocalDateTime> appointmentsAfter = scheduler.getAppointmentsAfter(datetime3);
        System.out.println("Appointments after " + datetime3 + ": " + appointmentsAfter);
    }
}
