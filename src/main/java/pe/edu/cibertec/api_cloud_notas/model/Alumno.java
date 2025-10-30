package pe.edu.cibertec.api_cloud_notas.model;

import jakarta.persistence.*;

@Table(name = "alumno")
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idalumno;
    private String apealumno;
    private String nomalumno;
    private String proce;
    @ManyToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;

    public Integer getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }

    public String getApealumno() {
        return apealumno;
    }

    public void setApealumno(String apealumno) {
        this.apealumno = apealumno;
    }

    public String getNomalumno() {
        return nomalumno;
    }

    public void setNomalumno(String nomalumno) {
        this.nomalumno = nomalumno;
    }

    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
