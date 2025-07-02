package com.inter;

import com.model.User;

public interface IMediator {
  void sendMessage(String message, User user);
  void addUser(User user);
}
