package com.ids.refuerzoFront.beans;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ids.refuerzoFront.AlumnoRepository.AlumnoRepository;
import com.ids.refuerzoFront.AlumnoRepository.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public void setAlumnoRepository( AlumnoRepository alumnoRepository) {
		this.alumnoRepository= alumnoRepository;
	}
	
	public List<Alumno> consultaAlumno() {
		List<Alumno>alumno = alumnoRepository.findAll();
		return alumno;
	}

	public Alumno consultaAlumno(Long alumnoId) {
		Optional<Alumno>alumno= alumnoRepository.findById(alumnoId);
		return alumno.get();
	}	
	
	public void guardaAlumno(Alumno alumno) {
		alumnoRepository.save(alumno);

	}
	
	public void borraAlumno(Long alumnoId) {
		alumnoRepository.deleteById(alumnoId);

	}

	public void actualizarAlumno(Alumno alumno) {
		alumnoRepository.save(alumno);

	}

}
