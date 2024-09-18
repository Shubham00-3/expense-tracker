package com.example.expense_tracker.controller;

import com.example.expense_tracker.model.Expense;
import com.example.expense_tracker.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    //Endpoint tp get all expenses

    @GetMapping
public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    //Endpoint to add new expense

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense){
        return expenseService.saveExpense(expense);

    }

    //Endpoint to delete an expense by id
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id){
        expenseService.deleteExpense(id);
    }
}

