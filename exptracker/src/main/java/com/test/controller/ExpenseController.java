package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.model.Expense;
import com.test.service.ExpenseService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import ch.qos.logback.core.model.Model;

//com.anisha.expensetracker.controller.ExpenseController
@Controller
public class ExpenseController {
 @Autowired
 private ExpenseService service;

 @GetMapping("/")

 public String viewHomePage(Model model) {
     model.addAttribute("listExpenses", service.getAllExpenses());
     return "index"; 
 }

 @GetMapping("/showNewExpenseForm")
 public String showNewExpenseForm(Model model) {
     model.addAttribute("expense", new Expense());
     return "new_expense";
 }

 @PostMapping("/saveExpense")
 public String saveExpense(@ModelAttribute("expense") Expense expense) {
     service.saveExpense(expense);
     return "redirect:/";
 }

 @GetMapping("/deleteExpense/{id}")
 public String deleteExpense(@PathVariable(value = "id") int id) {
     service.deleteExpense(id);
     return "redirect:/";
 }

 @GetMapping("/showFormForUpdate/{id}")
 public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
     Expense expense = service.getExpenseById(id);
     model.addAttribute("expense", expense);
     return "update_expense";
 }

}
