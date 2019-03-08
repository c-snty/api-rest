package com.ids.refuerzoFront.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ids.refuerzoFront.AlumnoRepository.AlumnoService;



@RestController
public class AlumnoRestController {
    
    @Autowired
    private AlumnoService alumnoService;
    
    public void setAlumnoService(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }

    @GetMapping("/api/alumnos")
    public List<Alumno> consultaAlumnos(){
        List<Alumno> alumnos = alumnoService.consultaAlumno();
        return alumnos;
    }
    //
    @CrossOrigin(origins = "*")
    @GetMapping("/api/alumnos/{alumnoId}")
    public Alumno consultaAlumno(@PathVariable(name="alumnoId") Long alumnoId){
        return alumnoService.consultaAlumno(alumnoId);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/api/alumnos/{alumnoId}")
   public void guardaAlumno(@RequestBody Alumno alumno) {
       alumnoService.guardaAlumno(alumno);
       System.out.println("Alumno guardado con éxito!");
   }
    
    @DeleteMapping("/api/alumno/{alumnoId}")
    public void borraAlumno(@PathVariable(name="alumnoId") Long alumnoId){
        alumnoService.borraAlumno(alumnoId);
       System.out.println("Alumno eliminado con éxito!");
    }
    
    @PutMapping("/api/alumnos/{alumnoId}")
   public void actualizaAlumno(@RequestBody Alumno alumno,
           @PathVariable(name="alumnoId") Long alumnoId) {
       Alumno alum = alumnoService.consultaAlumno(alumnoId);
       if(alum != null) {
           alumnoService.actualizarAlumno(alumno);
           System.out.println("Alumno actualizado con éxito!");
       }
   }
    
}