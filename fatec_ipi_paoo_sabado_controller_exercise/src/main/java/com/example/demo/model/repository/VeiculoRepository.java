package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.bean.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}

