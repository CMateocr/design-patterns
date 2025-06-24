package org.com.impl;

import org.com.inter.IHandler;
import org.com.model.Request;

public class CEOHandler implements IHandler<Request> {
  private IHandler<Request> nextHandler;

  @Override
  public void handlerRequest(Request request) {
    if( request.getAmount() >= 10000 ) {
      System.out.println("En CEO ha respondido la solicitud: " + request.getAmount() + " para el motivo asociado: " + request.getDescription());
    }
  }

  @Override
  public void setNext(IHandler<Request> handler) {
    this.nextHandler = null;
  }
}
