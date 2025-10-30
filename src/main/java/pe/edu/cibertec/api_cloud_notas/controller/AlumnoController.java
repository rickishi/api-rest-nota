package pe.edu.cibertec.api_cloud_notas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.api_cloud_notas.model.Alumno;
import pe.edu.cibertec.api_cloud_notas.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public ResponseEntity<List<Alumno>> listarAlumnos(){
        return ResponseEntity.ok(alumnoService.listarAlumnos());
    }

}
