package Interfaces;

import java.util.ArrayList;

import java.util.List;

public class LambdaExpressionExample2 {

  public static void main(String[] args) {

    List<String> list=new ArrayList<>();

    list.add("ankit");

    list.add("mayank");

    list.add("irfan");

    list.add("jai");

    list.forEach(n->System.out.println(n));

  }

}

