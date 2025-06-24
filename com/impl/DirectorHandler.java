package org.com.impl;

import org.com.inter.IHandler;
import org.com.model.Request;

public class DirectorHandler implements IHandler<Request> {
  private IHandler<Request> nextHandler;

  @Override
  public void handlerRequest(Request request) {
    if( request.getAmount() > 5000 && request.getAmount() < 10000 ) {
      System.out.println("En Director ha respondido la solicitud: " + request.getAmount() + " para el motivo asociado: " + request.getDescription());
    } else if(this.nextHandler != null) {
      nextHandler.handlerRequest( request );
    }
  }

  @Override
  public void setNext(IHandler<Request> handler) {
    this.nextHandler = handler;
  }
}
