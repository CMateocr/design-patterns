package com.impl;


import com.inter.IIterator;
import com.inter.IMajors;

import java.util.LinkedList;

public class ScienceSchool implements IMajors {
  private LinkedList<String> majors;

  public ScienceSchool() {
    majors = new LinkedList<>();
    majors.add("Physics");
    majors.add("Data Science");
    majors.add("Mathematics");
  }

  @Override
  public IIterator creteIterator() {
    return new ScienceIterator(majors);
  }

  public class ScienceIterator implements IIterator {
    private LinkedList<String> majors;
    private int index;

    public ScienceIterator(LinkedList<String> majors) {
      this.majors = majors;
    }

    @Override
    public void first() {
      index = 0;
    }

    @Override
    public String next() {
      return this.majors.get(index++);
    }

    @Override
    public boolean isDone() {
      return index >= this.majors.size();
    }

    @Override
    public String currentItem() {
      return this.majors.get(index);
    }
  }
}
