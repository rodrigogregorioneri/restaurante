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
@Repository("CardapioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CardapioDAO extends JpaRepository<Cardapio, java.lang.String> {

  /**
   * Obtém a instância de Cardapio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cardapio entity WHERE entity.id = :id")
  public Cardapio findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cardapio utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cardapio entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cardapio.id = :id AND (entity.numeropedido like concat('%',coalesce(:search,''),'%'))")
  public Page<Pedido> findPedidoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cardapio.id = :id AND (:numeropedido is null OR entity.numeropedido like concat('%',:numeropedido,'%')) AND (:horariodopedido is null OR entity.horariodopedido = :horariodopedido)")
  public Page<Pedido> findPedidoSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="numeropedido") java.lang.String numeropedido, @Param(value="horariodopedido") java.util.Date horariodopedido, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cardapio.id = :id")
  public Page<Pedido> findPedido(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.cliente FROM Pedido entity WHERE entity.cardapio.id = :id AND (entity.cliente.nome like concat('%',coalesce(:search,''),'%') OR entity.cliente.sobrenome like concat('%',coalesce(:search,''),'%') OR entity.cliente.celular like concat('%',coalesce(:search,''),'%') OR entity.cliente.fixo like concat('%',coalesce(:search,''),'%') OR entity.cliente.cep like concat('%',coalesce(:search,''),'%') OR entity.cliente.bairro like concat('%',coalesce(:search,''),'%') OR entity.cliente.rua like concat('%',coalesce(:search,''),'%') OR entity.cliente.numero like concat('%',coalesce(:search,''),'%') OR entity.cliente.descricao like concat('%',coalesce(:search,''),'%'))")
  public Page<Cliente> listClienteGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.cliente FROM Pedido entity WHERE entity.cardapio.id = :id AND (:nome is null OR entity.cliente.nome like concat('%',:nome,'%')) AND (:sobrenome is null OR entity.cliente.sobrenome like concat('%',:sobrenome,'%')) AND (:celular is null OR entity.cliente.celular like concat('%',:celular,'%')) AND (:fixo is null OR entity.cliente.fixo like concat('%',:fixo,'%')) AND (:cep is null OR entity.cliente.cep like concat('%',:cep,'%')) AND (:bairro is null OR entity.cliente.bairro like concat('%',:bairro,'%')) AND (:rua is null OR entity.cliente.rua like concat('%',:rua,'%')) AND (:numero is null OR entity.cliente.numero like concat('%',:numero,'%')) AND (:descricao is null OR entity.cliente.descricao like concat('%',:descricao,'%'))")
  public Page<Cliente> listClienteSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, @Param(value="sobrenome") java.lang.String sobrenome, @Param(value="celular") java.lang.String celular, @Param(value="fixo") java.lang.String fixo, @Param(value="cep") java.lang.String cep, @Param(value="bairro") java.lang.String bairro, @Param(value="rua") java.lang.String rua, @Param(value="numero") java.lang.String numero, @Param(value="descricao") java.lang.String descricao, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.cliente FROM Pedido entity WHERE entity.cardapio.id = :id")
  public Page<Cliente> listCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Pedido entity WHERE entity.cardapio.id = :instanceId AND entity.cliente.id = :relationId")
  public int deleteCliente(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Cardapio entity WHERE entity.nomeCardapio like concat('%',coalesce(:search,''),'%') OR entity.ingredientes like concat('%',coalesce(:search,''),'%')")
  public Page<Cardapio> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Cardapio entity WHERE (:nomeCardapio is null OR entity.nomeCardapio like concat('%',:nomeCardapio,'%')) AND (:ingredientes is null OR entity.ingredientes like concat('%',:ingredientes,'%'))")
  public Page<Cardapio> specificSearch(@Param(value="nomeCardapio") java.lang.String nomeCardapio, @Param(value="ingredientes") java.lang.String ingredientes, Pageable pageable);
  
}
