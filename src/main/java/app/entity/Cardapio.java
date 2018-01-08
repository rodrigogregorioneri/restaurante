package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CARDAPIO
 * @generated
 */
@Entity
@Table(name = "\"CARDAPIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cardapio")
public class Cardapio implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nomeCardapio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeCardapio;

  /**
  * @generated
  */
  @Column(name = "Ingredientes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String ingredientes;

  /**
   * Construtor
   * @generated
   */
  public Cardapio(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Cardapio setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomeCardapio
   * return nomeCardapio
   * @generated
   */
  
  public java.lang.String getNomeCardapio(){
    return this.nomeCardapio;
  }

  /**
   * Define nomeCardapio
   * @param nomeCardapio nomeCardapio
   * @generated
   */
  public Cardapio setNomeCardapio(java.lang.String nomeCardapio){
    this.nomeCardapio = nomeCardapio;
    return this;
  }

  /**
   * Obtém ingredientes
   * return ingredientes
   * @generated
   */
  
  public java.lang.String getIngredientes(){
    return this.ingredientes;
  }

  /**
   * Define ingredientes
   * @param ingredientes ingredientes
   * @generated
   */
  public Cardapio setIngredientes(java.lang.String ingredientes){
    this.ingredientes = ingredientes;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cardapio object = (Cardapio)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
