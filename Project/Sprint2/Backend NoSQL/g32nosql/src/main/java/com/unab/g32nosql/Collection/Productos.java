package com.unab.g32nosql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Productos")
public class Productos {

	@Id    
    private String id;
    
	@Field("nombre")
    private String nombre;
	
	@Field("descripcion")
    private String descripcion;
	
	@Field("estado")
    private boolean estado;
	
	@DBRef
    private Marcas marcaId;
	
	@DBRef
    private Categorias categoriaId;
	
	@DBRef
    private UnidadesMedidas unidadMedidaId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Marcas getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Marcas marcaId) {
		this.marcaId = marcaId;
	}

	public Categorias getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Categorias categoriaId) {
		this.categoriaId = categoriaId;
	}

	public UnidadesMedidas getUnidadMedidaId() {
		return unidadMedidaId;
	}

	public void setUnidadMedidaId(UnidadesMedidas unidadMedidaId) {
		this.unidadMedidaId = unidadMedidaId;
	}	
	
}
