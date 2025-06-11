package com.impl;

import com.inter.IIterator;
import com.inter.IMajors;

public class IngeneeringSchool implements IMajors {
  private String[] majors;

  private IngeneeringSchool() {
    majors = new String[] {
      "Computer",
      "Civil",
      "Software",
      "Industrial",
      "Mechanical",
    };
  }

  @Override
  public IIterator creteIterator() {
    return new EngineeringIterator(majors);
  }

  public class EngineeringIterator implements IIterator {
    private String[] majors;
    private int index;

    public EngineeringIterator(String[] majors) {
      this.majors = majors;
    }

    @Override
    public void first() {
      this.index = 0;
    }

    @Override
    public String next() {
      return this.majors[this.index++];
    }

    @Override
    public boolean isDone() {
      return this.index >= this.majors.length;
    }

    @Override
    public String currentItem() {
      return this.majors[this.index];
    }
  }

}
