package com.shruthi.expensetracker;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public List<Expense> getExpensesByCategory(String category) {
        return expenseRepository.findByCategory(category);
    }

    public Double getTotalExpenses() {
        List<Expense> expenses = expenseRepository.findAll();

        double total = 0.0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}