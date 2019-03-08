package com.ids.refuerzoFront.AlumnoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ids.refuerzoFront.beans.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Long>{

}
