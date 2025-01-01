package com.example.demo.services;

import com.example.demo.models.ToDoItem;
import com.example.demo.repositories.ToDoItemRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class ToDoItemService {

    private ToDoItemRepository toDoItemRepository;

    public Iterable<ToDoItem> getAll() {
        return toDoItemRepository.findAll();
    }

    public Optional<ToDoItem> getByID(Long id) {
        return toDoItemRepository.findById(id);
    }

    public ToDoItem save(ToDoItem toDoItem) {
        if (toDoItem.getId() == null) {
            toDoItem.setCreatedAt(Instant.now());
        }

        toDoItem.setUptadetAt(Instant.now());
        return toDoItemRepository.save(toDoItem);
    }

    public void delete(ToDoItem toDoItem) {
        toDoItemRepository.delete(toDoItem);
    }
}
