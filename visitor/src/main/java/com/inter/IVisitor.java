package com.inter;

import com.impl.ProductoDescuento;
import com.impl.ProductoNormal;

public interface IVisitor {
  double visit(ProductoDescuento p);
  double visit(ProductoNormal p);
}
