package com.example.expense_tracker.service;

import com.example.expense_tracker.model.Expense;
import com.example.expense_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository= expenseRepository;
    }

    //Method to get all expense

    public List<Expense>getAllExpenses(){
        return expenseRepository.findAll();
    }

    //Method to save a new expense

    public Expense saveExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    //Method to delete an expense by Id

    public void deleteExpense(Long id){
        expenseRepository.deleteById(id);
    }
}
