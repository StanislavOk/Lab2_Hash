package com.crypto;

import org.apache.commons.codec.binary.Hex;

public class Main {
  public static void main(String[] args) {
    String message = "stanislav";
    GOSTDigest hasher = new GOST3411_2012_256();
    hasher.engineUpdate(message.getBytes(), 0, message.length());
    System.out.println(message + " - " + Hex.encodeHexString(hasher.engineDigest()));
  }
}
