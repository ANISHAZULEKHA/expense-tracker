package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Expense;

//com.anisha.expensetracker.repository.ExpenseRepository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {}
