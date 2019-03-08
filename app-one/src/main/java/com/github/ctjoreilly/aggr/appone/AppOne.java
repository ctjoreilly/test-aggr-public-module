package com.github.ctjoreilly.aggr.appone;

import com.github.ctjoreilly.aggr.liba.LibA;

public class AppOne {
  public static void main(String[] args) {
    System.out.println("AppOne: " + new LibA().doSomething(args.length));
  }
}
