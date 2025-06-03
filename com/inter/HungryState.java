package com.inter;

import com.model.Tamagotchi;

public final class HungryState implements IState{
  @Override
  public void play(Tamagotchi tamagotchi) {
    IState.state.onNext("I dont wanna play I wanna eat");
  }

  @Override
  public void feed(Tamagotchi tamagotchi) {
    IState.state.onNext("I wanna eat");
    tamagotchi.setState( new HappyState() );
  }

  @Override
  public void sleep(Tamagotchi tamagotchi) {
    IState.state.onNext("I dont wanna sleep I wanna eat");
  }
}
