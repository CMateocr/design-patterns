package com.inter;

import com.model.Tamagotchi;

public final class SleepState implements IState {
  @Override
  public void play(Tamagotchi tamagotchi) {
    IState.state.onNext("I dont wanna play Im falling asleep");
  }

  @Override
  public void feed(Tamagotchi tamagotchi) {
    IState.state.onNext("I dont wanna eat Im falling asleep");
  }

  @Override
  public void sleep(Tamagotchi tamagotchi) {
    IState.state.onNext("Im falling asleep");
    tamagotchi.setState( new HungryState() );
  }
}
