package com.kevin.gestionhistoriaclinica.dao.shedule;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.gestionhistoriaclinica.models.entities.shedule.Speciality;

public interface SpecialityJpaDao extends JpaRepository<Speciality, Long> {
}
