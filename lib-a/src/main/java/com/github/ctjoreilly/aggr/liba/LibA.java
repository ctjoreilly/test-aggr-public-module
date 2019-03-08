package com.github.ctjoreilly.aggr.liba;

import com.github.ctjoreilly.aggr.libb.LibB;

public class LibA {
  public String doSomething(int arg) {
    return "lib-a: "+ new LibB().doSomething(arg);
  }
}
