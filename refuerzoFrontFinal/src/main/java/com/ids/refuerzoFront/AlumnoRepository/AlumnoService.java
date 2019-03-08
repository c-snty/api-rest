package com.ids.refuerzoFront.AlumnoRepository;

import java.util.List;

import com.ids.refuerzoFront.beans.Alumno;

public interface AlumnoService {

	public List <Alumno> consultaAlumno();
	
	public Alumno consultaAlumno(Long alumnoId);
	
	public void guardaAlumno(Alumno alumno);
	
	public void borraAlumno (Long alumnoId);
	
	public void actualizarAlumno (Alumno alumno);
	
	
}
