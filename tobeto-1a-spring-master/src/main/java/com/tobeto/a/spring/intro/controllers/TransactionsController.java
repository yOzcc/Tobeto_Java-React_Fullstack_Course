package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Transaction;
import com.tobeto.a.spring.intro.repositories.TransactionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/transactions")
public class TransactionsController {
    public final TransactionRepository transactionRepository;

    public TransactionsController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @GetMapping
    public List<Transaction> getAll() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions;
    }

    @GetMapping("{id}")
    public Transaction getById(@PathVariable int id) {
        return transactionRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Transaction transactionToDelete = transactionRepository.findById(id).orElseThrow();
        transactionRepository.delete(transactionToDelete);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Transaction transaction) {
        Transaction transactionToUpdate = transactionRepository.findById(id).orElseThrow();
        transactionToUpdate.setId(transaction.getId());
        transactionToUpdate.setTransDate(transaction.getTransDate());
        transactionToUpdate.setTransName(transaction.getTransName());
        transactionToUpdate.setRental(transaction.getRental());
        transactionToUpdate.setCar(transaction.getCar());
        transactionToUpdate.setCustomer(transaction.getCustomer());
        transactionToUpdate.setAdmin(transaction.getAdmin());
        transactionRepository.save(transactionToUpdate);
    }
}
