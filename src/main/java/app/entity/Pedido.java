package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PEDIDO
 * @generated
 */
@Entity
@Table(name = "\"PEDIDO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pedido")
public class Pedido implements Serializable {

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
  @Column(name = "numeropedido", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String numeropedido = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "horariodopedido", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date horariodopedido;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cliente cliente;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cardapio", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cardapio cardapio;

  /**
   * Construtor
   * @generated
   */
  public Pedido(){
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
  public Pedido setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém numeropedido
   * return numeropedido
   * @generated
   */
  
  public java.lang.String getNumeropedido(){
    return this.numeropedido;
  }

  /**
   * Define numeropedido
   * @param numeropedido numeropedido
   * @generated
   */
  public Pedido setNumeropedido(java.lang.String numeropedido){
    this.numeropedido = numeropedido;
    return this;
  }

  /**
   * Obtém horariodopedido
   * return horariodopedido
   * @generated
   */
  
  public java.util.Date getHorariodopedido(){
    return this.horariodopedido;
  }

  /**
   * Define horariodopedido
   * @param horariodopedido horariodopedido
   * @generated
   */
  public Pedido setHorariodopedido(java.util.Date horariodopedido){
    this.horariodopedido = horariodopedido;
    return this;
  }

  /**
   * Obtém cliente
   * return cliente
   * @generated
   */
  
  public Cliente getCliente(){
    return this.cliente;
  }

  /**
   * Define cliente
   * @param cliente cliente
   * @generated
   */
  public Pedido setCliente(Cliente cliente){
    this.cliente = cliente;
    return this;
  }

  /**
   * Obtém cardapio
   * return cardapio
   * @generated
   */
  
  public Cardapio getCardapio(){
    return this.cardapio;
  }

  /**
   * Define cardapio
   * @param cardapio cardapio
   * @generated
   */
  public Pedido setCardapio(Cardapio cardapio){
    this.cardapio = cardapio;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pedido object = (Pedido)obj;
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
