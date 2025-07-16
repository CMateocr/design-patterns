package com.inter;

import com.impl.ProductoDescuento;
import com.impl.ProductoNormal;

public interface IVisitor {
  double visit( ProductoNormal normal );
  double visit( ProductoDescuento descuento );
}
