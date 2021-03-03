package com.testeTDD.exercicioTesteTDD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeTDD.exercicioTesteTDD.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}