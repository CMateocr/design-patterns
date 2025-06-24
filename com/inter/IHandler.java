package org.com.inter;

public interface IHandler<T> {
  void handlerRequest(T request);

  void setNext(IHandler<T> handler);
}
