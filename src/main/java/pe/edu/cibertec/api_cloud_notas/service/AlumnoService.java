package pe.edu.cibertec.api_cloud_notas.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_cloud_notas.model.Alumno;
import pe.edu.cibertec.api_cloud_notas.repository.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public List<Alumno> listarAlumnos(){
        return alumnoRepository.findAll();
    }
}
