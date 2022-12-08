package com.springjava.marketSpring.persistence.crud;

import com.springjava.marketSpring.persistence.entity.Compra;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<List<Compra>> findByIdCliente(String idCliente);
}
