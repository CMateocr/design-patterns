package com.inter;

import com.model.Tamagotchi;

public final class HappyState implements IState{
  @Override
  public void play(Tamagotchi tamagotchi) {
    IState.state.onNext("Vamos a jugar");
    tamagotchi.setState( new SleepState() );
  }

  @Override
  public void feed(Tamagotchi tamagotchi) {
    IState.state.onNext("No no quiero comer");
  }

  @Override
  public void sleep(Tamagotchi tamagotchi) {
    IState.state.onNext("No quiero dormir");
  }
}
