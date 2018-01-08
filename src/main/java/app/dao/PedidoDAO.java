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
@Repository("PedidoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PedidoDAO extends JpaRepository<Pedido, java.lang.String> {

  /**
   * Obtém a instância de Pedido utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pedido entity WHERE entity.id = :id")
  public Pedido findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pedido utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pedido entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.numeropedido like concat('%',coalesce(:search,''),'%')")
  public Page<Pedido> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE (:numeropedido is null OR entity.numeropedido like concat('%',:numeropedido,'%')) AND (:horariodopedido is null OR entity.horariodopedido = :horariodopedido)")
  public Page<Pedido> specificSearch(@Param(value="numeropedido") java.lang.String numeropedido, @Param(value="horariodopedido") java.util.Date horariodopedido, Pageable pageable);
  
  /**
   * Foreign Key cliente
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cliente.id = :id")
  public Page<Pedido> findPedidosByCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key cardapio
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cardapio.id = :id")
  public Page<Pedido> findPedidosByCardapio(@Param(value="id") java.lang.String id, Pageable pageable);

}
