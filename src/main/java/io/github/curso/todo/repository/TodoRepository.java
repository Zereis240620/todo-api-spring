package io.github.curso.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.curso.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
}
