package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLIENTE
 * @generated
 */
@Entity
@Table(name = "\"CLIENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cliente")
public class Cliente implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "sobrenome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String sobrenome;

  /**
  * @generated
  */
  @Column(name = "celular", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String celular;

  /**
  * @generated
  */
  @Column(name = "fixo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String fixo;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String bairro;

  /**
  * @generated
  */
  @Column(name = "rua", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String rua;

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String numero;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "complemento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String complemento;

  /**
  * @generated
  */
  @Column(name = "avenida", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String avenida;

  /**
   * Construtor
   * @generated
   */
  public Cliente(){
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
  public Cliente setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Cliente setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém sobrenome
   * return sobrenome
   * @generated
   */
  
  public java.lang.String getSobrenome(){
    return this.sobrenome;
  }

  /**
   * Define sobrenome
   * @param sobrenome sobrenome
   * @generated
   */
  public Cliente setSobrenome(java.lang.String sobrenome){
    this.sobrenome = sobrenome;
    return this;
  }

  /**
   * Obtém celular
   * return celular
   * @generated
   */
  
  public java.lang.String getCelular(){
    return this.celular;
  }

  /**
   * Define celular
   * @param celular celular
   * @generated
   */
  public Cliente setCelular(java.lang.String celular){
    this.celular = celular;
    return this;
  }

  /**
   * Obtém fixo
   * return fixo
   * @generated
   */
  
  public java.lang.String getFixo(){
    return this.fixo;
  }

  /**
   * Define fixo
   * @param fixo fixo
   * @generated
   */
  public Cliente setFixo(java.lang.String fixo){
    this.fixo = fixo;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Cliente setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  
  public java.lang.String getBairro(){
    return this.bairro;
  }

  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Cliente setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }

  /**
   * Obtém rua
   * return rua
   * @generated
   */
  
  public java.lang.String getRua(){
    return this.rua;
  }

  /**
   * Define rua
   * @param rua rua
   * @generated
   */
  public Cliente setRua(java.lang.String rua){
    this.rua = rua;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.String getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Cliente setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Cliente setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém complemento
   * return complemento
   * @generated
   */
  
  public java.lang.String getComplemento(){
    return this.complemento;
  }

  /**
   * Define complemento
   * @param complemento complemento
   * @generated
   */
  public Cliente setComplemento(java.lang.String complemento){
    this.complemento = complemento;
    return this;
  }

  /**
   * Obtém avenida
   * return avenida
   * @generated
   */
  
  public java.lang.String getAvenida(){
    return this.avenida;
  }

  /**
   * Define avenida
   * @param avenida avenida
   * @generated
   */
  public Cliente setAvenida(java.lang.String avenida){
    this.avenida = avenida;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cliente object = (Cliente)obj;
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
