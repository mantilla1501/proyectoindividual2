package org.example.modelo;

import org.example.utilidades.MetodeosPago;

public class Afilidos extends  Usuario
{
  private Integer valorMembresia;
  private MetodeosPago metodoPago;
  private String documenroReferido;

  private final Double IVA= 0.19;


  public Afilidos() {
  }

  @Override
  public Double calcularAnualidades() {
    //COSTOANUAL
    return this.getCostoAnual()-)(this.getValorMembresia()*0.20);
  }

  public Afilidos(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorMembresia,
                  MetodeosPago metodoPago, String documenroReferido) {
    super(id, documento, nombres, correo, ubicacion);
    this.valorMembresia = valorMembresia;
    this.metodoPago = metodoPago;
    this.documenroReferido = documenroReferido;

  }

  public Integer getValorMembresia() {
    return valorMembresia;
  }

  public void setValorMembresia(Integer valorMembresia) {
    this.valorMembresia = valorMembresia;
  }

  public MetodeosPago getMetodoPago() {
    return metodoPago;
  }

  public void setMetodoPago(MetodeosPago metodoPago) {
    this.metodoPago = metodoPago;
  }

  public String getDocumenroReferido() {
    return documenroReferido;
  }

  public void setDocumenroReferido(String documenroReferido) {
    this.documenroReferido = documenroReferido;
  }

  //METODOS ORDINARIOS

  public  Double  aplicarIvaMembresia ()
  {
    return this.valorMembresia+this.IVA*this.valorMembresia;
  }

}
