package Lecture1_adt;

import java.util.Calendar;

/**
 * This Lecture1_adt.Transaction3 class adds code to correct potential exposure issues in Transaction2.
 * Methods that return objects of reference types use defensive copying to enhance invariant preservation.
 */
public class Transaction3 {
    private final int amount;
    private final Calendar date;

    public Transaction3(int amount, Calendar date) {
        this.amount = amount;
        this.date = date; // Defensive copying not required for constructor arguments in this class
    }

    public int getAmount() {
        return amount; // Value types like integers can be returned directly
    }

    public Calendar getDate() {
        return (Calendar) date.clone(); // Defensive copying ensures reference types are not altered externally
    }
}