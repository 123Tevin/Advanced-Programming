import java.util.Calendar;

/**
 * This Lecture1_adt.Transaction2 Class takes the first step to resolve the ADT design issues of Transaction1:
 * 1. Representation Independence: --- Encapsulation - Providing access methods to the internal data.
 *                                     External client code only accesses via allowable operations
 *                                 --- Changes to internal representation can still be accessed via the same methods defined
 *
 * 2. Preservation of Invariants: --- Access modifies private final fields to make the data unchangeable
 */
public class Transaction2 {
    private final int amount;
    private final Calendar date;

    public Transaction2(int amount, Calendar date) {
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