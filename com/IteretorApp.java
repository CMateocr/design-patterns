package com;

import com.impl.ScienceSchool;
import com.inter.IIterator;
import com.inter.IMajors;

import java.util.Arrays;
import java.util.LinkedList;

public class IteretorApp {
  public static void main(String[] args) {
    IMajors scienceSchool = new ScienceSchool();
    IIterator scienceIterator = scienceSchool.creteIterator();

    IIterator scienceIteratorNormal = new ScienceSchool().new ScienceIterator(new LinkedList<>(Arrays.asList("Physics", "Chemistry", "Biology")));

    printMajors(scienceIteratorNormal);
  }

  public static void printMajors(IIterator iterator) {
    iterator.first();
    while (!iterator.isDone()) {
      System.out.println(iterator.next());
    }
  }
}
