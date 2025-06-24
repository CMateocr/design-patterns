package org.com;

import org.com.impl.CEOHandler;
import org.com.impl.DirectorHandler;
import org.com.impl.ManagerHandler;
import org.com.inter.IHandler;
import org.com.model.Request;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    IHandler<Request> manager  = new ManagerHandler();
    IHandler<Request> director = new DirectorHandler();
    IHandler<Request> ceo      = new CEOHandler();

    manager.setNext( director );
    director.setNext( ceo );

    List<Request> requests = new ArrayList<>();

    requests.add( new Request(40000.0, "Inversion constructora") );

    requests.add( new Request(4700.0, "Remodelacion casa") );

    requests.add( new Request(8700, "Pago matricula U") );

    requests.add(new Request(25000, "Credito transacciones"));

    requests.stream().forEach(req -> {
      System.out.println("Procesando solicitud: ");
      manager.handlerRequest(req);
    });
  }
}