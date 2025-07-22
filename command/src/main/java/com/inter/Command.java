package com.inter;

import com.model.Product;

public interface Command {
  void execute(Product p);
}
