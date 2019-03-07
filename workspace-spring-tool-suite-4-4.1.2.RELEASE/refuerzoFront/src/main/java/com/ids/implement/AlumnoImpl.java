package com.ids.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ids.interfaces.AlumnoService;
import com.ids.modelo.AlumnoRepository;
import com.ids.modelo.Alumnos;

public class AlumnoImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	public void setAlumnoRepository(AlumnoRepository alumnoRepository) {
		this.alumnoRepository = alumnoRepository;
	}
	@Override
	public List<Alumnos> consultaAlumno() {
		List<Alumnos> alumno = alumnoRepository.findAll();
		return alumno;
	}

	@Override
	public Alumnos consultaAlumno(Long alumnoId) {
		Optional<Alumnos> alumnos = alumnoRepository.findById(alumnoId);
		return alumnos.get();
	}

	@Override
	public void guardarAlumno(Alumnos alumno) {
		alumnoRepository.save(alumno);
		
	}

	@Override
	public void borrarAlumno(Long alumnoId) {
		alumnoRepository.deleteById(alumnoId);
		
	}

	@Override
	public void actualizarAlumno(Alumnos alumno) {
		alumnoRepository.save(alumno);
		
	}

}
