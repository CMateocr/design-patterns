package org.com.impl;

import org.com.inter.IHandler;
import org.com.model.Request;

public class ManagerHandler implements IHandler<Request> {
  private IHandler<Request> nextHandler;

  @Override
  public void handlerRequest(Request request) {
    if( request.getAmount() <= 5000 ) {
      System.out.println("En manager ha respondido la solicitud: " + request.getAmount() + " para el motivo asociado: " + request.getDescription());
    } else if(this.nextHandler != null) {
      nextHandler.handlerRequest( request );
    }
  }

  @Override
  public void setNext(IHandler<Request> handler) {
    this.nextHandler = handler;
  }
}
