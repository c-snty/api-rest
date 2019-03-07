package com.ids.interfaces;

import java.util.List;

import com.ids.modelo.Alumnos;

public interface AlumnoService {
	public List<Alumnos> consultaAlumno();
	
	public Alumnos consultaAlumno(Long alumnoId);
	
	public void guardarAlumno(Alumnos alumno);
	
	public void borrarAlumno(Long alumnoId);
	
	public void actualizarAlumno(Alumnos alumno);
}
