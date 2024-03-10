package com.backend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="movilidadEntrante")
@Data
public class MovilidadEntrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado")
    private Long idEmpleados;


    @Column(name = "nombre")
    private String nombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "numero_documento")
    private Long numeroDocumento;

    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "ciudad_residencia")
    private String ciudadResidencia;

    @Column(name = "genero")
    private String genero;

    @Column(name = "email")
    private String email;

    @Column(name = "celular")
    private Long celular;

    @Column(name = "nivel_estudios")
    private String nivelEstudios;

    @Column(name = "programa_curricular")
    private String programaCurricular;

    @Column(name = "pais_origen")
    private String paisOrigen;

    @Column(name="institucion_origen")
    private String institucionOrigen;

    @Column(name = "Escuela_o_lab")
    private String escuelaoLab;

    @Column(name = "sede_llegada")
    private String sedeLlegada;

    @Column(name = "facultad_llegada")
    private String facultadLlegada;

    @Column(name = "fecha_inicio_movilidad")
    private Date fechaInicioMovilidad;

    @Column(name = "fecha_final_movilidad")
    private Date fechaFinalMovilidad;

    public Long getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(Long idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public String getProgramaCurricular() {
        return programaCurricular;
    }

    public void setProgramaCurricular(String programaCurricular) {
        this.programaCurricular = programaCurricular;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getInstitucionOrigen() {
        return institucionOrigen;
    }

    public void setInstitucionOrigen(String institucionOrigen) {
        this.institucionOrigen = institucionOrigen;
    }

    public String getEscuelaoLab() {
        return escuelaoLab;
    }

    public void setEscuelaoLab(String escuelaoLab) {
        this.escuelaoLab = escuelaoLab;
    }

    public String getSedeLlegada() {
        return sedeLlegada;
    }

    public void setSedeLlegada(String sedeLlegada) {
        this.sedeLlegada = sedeLlegada;
    }

    public String getFacultadLlegada() {
        return facultadLlegada;
    }

    public void setFacultadLlegada(String facultadLlegada) {
        this.facultadLlegada = facultadLlegada;
    }

    public Date getFechaInicioMovilidad() {
        return fechaInicioMovilidad;
    }

    public void setFechaInicioMovilidad(Date fechaInicioMovilidad) {
        this.fechaInicioMovilidad = fechaInicioMovilidad;
    }

    public Date getFechaFinalMovilidad() {
        return fechaFinalMovilidad;
    }

    public void setFechaFinalMovilidad(Date fechaFinalMovilidad) {
        this.fechaFinalMovilidad = fechaFinalMovilidad;
    }
}
