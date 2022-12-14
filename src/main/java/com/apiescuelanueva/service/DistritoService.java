package com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;

import com.apiescuelanueva.entity.DistritoEntity;

public interface DistritoService {
    public List<DistritoEntity>findAll();
    public List<DistritoEntity>findAllCustom();
    Optional<DistritoEntity>findById(Long id);
    DistritoEntity add(DistritoEntity d);
    DistritoEntity update(DistritoEntity d);
    DistritoEntity delete(DistritoEntity d);
}
