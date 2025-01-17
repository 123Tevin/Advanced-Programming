package Lecture2_adt_specification;

import java.util.Calendar;

/**
 * This Lecture2_adt_specification.Transaction4 class extends the design considerations of the previous Transaction4 class.
 * It adds specifications for the requires and produces interfaces.
 */
public class Transaction4 {
    private final int amount;
    private final Calendar date;

    /**
     * Constructor for Transaction4
     * @param amount the transaction amount (must be an integer)
     * @param date the transaction date (must be a Calendar object and not null)
     */
    public Transaction4(int amount, Calendar date) {
        this.amount = amount;
        this.date = (Calendar) date.clone(); // Defensive copying ensures input reference is not shared
    }

    /**
     * Retrieves the transaction amount.
     * @return an integer representing the amount
     */
    public int getAmount() {
        return amount; // Value types like integers can be returned directly
    }

    /**
     * Retrieves the transaction date.
     * @return a Calendar object representing the transaction date
     */
    public Calendar getDate() {
        return (Calendar) date.clone(); // Defensive copying ensures reference types are not altered externally
    }
}