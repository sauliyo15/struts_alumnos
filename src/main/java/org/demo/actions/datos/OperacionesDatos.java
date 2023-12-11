package org.demo.actions.datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperacionesDatos {

    private List<AlumnoBean> listaAlumnos;

    public OperacionesDatos() {
        inicializarListaAlumnos();
    }

    private void setListaAlumnos(List<AlumnoBean> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    private List<AlumnoBean> getListaAlumnos() {
        return listaAlumnos;
    }

    public void agregarAlumno(AlumnoBean alumno) {
        listaAlumnos.add(alumno);
    }

    private void inicializarListaAlumnos() {

        listaAlumnos = new ArrayList<>();

        AlumnoBean alumno1 = new AlumnoBean();
        alumno1.setDni("11111111A");
        alumno1.setNombre("Felipe Juan Froilán");
        alumno1.setApellidos("de Todos los Santos de Marichalar");
        alumno1.setFechaNacimiento(new Date());
        alumno1.setEmail("froilan@gmail.com");
        alumno1.setTelefono("91885566");
        alumno1.setDireccion("Calle Fiesta de la Zarzuela, 3");
        alumno1.setPoblacion("Madrid");
        alumno1.setNacionalidad("Española");
        alumno1.setObservaciones("Las observaciones de FROILAN");

        AlumnoBean alumno2 = new AlumnoBean();
        alumno2.setDni("22222222B");
        alumno2.setNombre("Omar Ismael");
        alumno2.setApellidos("Montes Moreno");
        alumno2.setFechaNacimiento(new Date());
        alumno2.setEmail("omar_montes@gmail.com");
        alumno2.setTelefono("91885566");
        alumno2.setDireccion("Calle Bendita, 10");
        alumno2.setPoblacion("Madrid");
        alumno2.setNacionalidad("Española");
        alumno2.setObservaciones("Las observaciones de OMAR MONTES");

        AlumnoBean alumno3 = new AlumnoBean();
        alumno3.setDni("33333333C");
        alumno3.setNombre("José María");
        alumno3.setApellidos("Martínez-Bordiú y Bassó");
        alumno3.setFechaNacimiento(new Date());
        alumno3.setEmail("pocholo@gmail.com");
        alumno3.setTelefono("91885566");
        alumno3.setDireccion("Avenida de la Mochila, 7");
        alumno3.setPoblacion("Madrid");
        alumno3.setNacionalidad("Española");
        alumno3.setObservaciones("Las observaciones de POCHOLO");

        agregarAlumno(alumno1);
        agregarAlumno(alumno2);
        agregarAlumno(alumno3);
    }

    public AlumnoBean comprobarAlumno(String dni) {
        for (AlumnoBean alumno : listaAlumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno;
            }
        }
        return null;
    }
}
