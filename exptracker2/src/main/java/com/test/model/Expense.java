package com.test.model;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private BigDecimal amount;
    private String category;

    @Column(name = "expense_date")
    private LocalDate expenseDate;

    private String notes;

    // Constructors
    public Expense() {}

    public Expense(String title, BigDecimal amount, String category, LocalDate expenseDate, String notes) {
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.expenseDate = expenseDate;
        this.notes = notes;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd") // ✅ This goes directly above the field
    @Column(name = "expense_date")
    
    public LocalDate getExpenseDate() {
    	
        return expenseDate;
    }

    public String getNotes() {
        return notes;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
