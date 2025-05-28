package com.impl;

public class FastAntivirus extends FastAnalysis {
  @Override
  public void init() {
    System.out.println("FastAntivirus: Initializing fast analysis...");
  }

  @Override
  public void skipCompressed() {
    System.out.println("FastAntivirus: Skipping compressed files for quick analysis...");
  }

  @Override
  public void stop() {
    System.out.println("FastAntivirus: Stopping fast analysis...");
  }
}
