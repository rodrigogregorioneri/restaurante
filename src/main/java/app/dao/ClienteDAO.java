package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ClienteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClienteDAO extends JpaRepository<Cliente, java.lang.String> {

  /**
   * Obtém a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cliente entity WHERE entity.id = :id")
  public Cliente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cliente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cliente.id = :id AND (entity.numeropedido like concat('%',coalesce(:search,''),'%'))")
  public Page<Pedido> findPedidoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cliente.id = :id AND (:numeropedido is null OR entity.numeropedido like concat('%',:numeropedido,'%')) AND (:horariodopedido is null OR entity.horariodopedido = :horariodopedido)")
  public Page<Pedido> findPedidoSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="numeropedido") java.lang.String numeropedido, @Param(value="horariodopedido") java.util.Date horariodopedido, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cliente.id = :id")
  public Page<Pedido> findPedido(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.cardapio FROM Pedido entity WHERE entity.cliente.id = :id AND (entity.cardapio.nomeCardapio like concat('%',coalesce(:search,''),'%') OR entity.cardapio.ingredientes like concat('%',coalesce(:search,''),'%'))")
  public Page<Cardapio> listCardapioGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.cardapio FROM Pedido entity WHERE entity.cliente.id = :id AND (:nomeCardapio is null OR entity.cardapio.nomeCardapio like concat('%',:nomeCardapio,'%')) AND (:ingredientes is null OR entity.cardapio.ingredientes like concat('%',:ingredientes,'%'))")
  public Page<Cardapio> listCardapioSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nomeCardapio") java.lang.String nomeCardapio, @Param(value="ingredientes") java.lang.String ingredientes, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.cardapio FROM Pedido entity WHERE entity.cliente.id = :id")
  public Page<Cardapio> listCardapio(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Pedido entity WHERE entity.cliente.id = :instanceId AND entity.cardapio.id = :relationId")
  public int deleteCardapio(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Cliente entity WHERE entity.nome like concat('%',coalesce(:search,''),'%') OR entity.sobrenome like concat('%',coalesce(:search,''),'%') OR entity.celular like concat('%',coalesce(:search,''),'%') OR entity.fixo like concat('%',coalesce(:search,''),'%') OR entity.cep like concat('%',coalesce(:search,''),'%') OR entity.bairro like concat('%',coalesce(:search,''),'%') OR entity.rua like concat('%',coalesce(:search,''),'%') OR entity.numero like concat('%',coalesce(:search,''),'%') OR entity.descricao like concat('%',coalesce(:search,''),'%')")
  public Page<Cliente> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Cliente entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:sobrenome is null OR entity.sobrenome like concat('%',:sobrenome,'%')) AND (:celular is null OR entity.celular like concat('%',:celular,'%')) AND (:fixo is null OR entity.fixo like concat('%',:fixo,'%')) AND (:cep is null OR entity.cep like concat('%',:cep,'%')) AND (:bairro is null OR entity.bairro like concat('%',:bairro,'%')) AND (:rua is null OR entity.rua like concat('%',:rua,'%')) AND (:numero is null OR entity.numero like concat('%',:numero,'%')) AND (:descricao is null OR entity.descricao like concat('%',:descricao,'%'))")
  public Page<Cliente> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="sobrenome") java.lang.String sobrenome, @Param(value="celular") java.lang.String celular, @Param(value="fixo") java.lang.String fixo, @Param(value="cep") java.lang.String cep, @Param(value="bairro") java.lang.String bairro, @Param(value="rua") java.lang.String rua, @Param(value="numero") java.lang.String numero, @Param(value="descricao") java.lang.String descricao, Pageable pageable);
  
}
