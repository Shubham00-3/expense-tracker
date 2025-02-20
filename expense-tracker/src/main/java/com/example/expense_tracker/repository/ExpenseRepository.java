package com.example.expense_tracker.repository;


import com.example.expense_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // JpaRepository automatically provides CRUD methods like save, findAll, delete, etc.
}
