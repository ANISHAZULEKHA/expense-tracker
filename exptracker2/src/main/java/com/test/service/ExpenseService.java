package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Expense;
import com.test.repository.ExpenseRepository;


@Service
public class ExpenseService {
 @Autowired
 private ExpenseRepository repo;
 public List<Expense> getAllExpenses() {
     return repo.findAll();
 }

 public Expense getExpenseById(int id) {
     return repo.findById(id).orElse(null);
 }

 public void saveExpense(Expense expense) {
     repo.save(expense);
 }

 public void deleteExpense(int id) {
     repo.deleteById(id);
 }
 
}
