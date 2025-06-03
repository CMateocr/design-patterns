package com.inter;

import com.model.Tamagotchi;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

public sealed interface IState permits HappyState, SleepState, HungryState {
  static final BehaviorSubject<String> state = BehaviorSubject.create();

  void play(Tamagotchi tamagotchi);

  void feed(Tamagotchi tamagotchi);

  void sleep(Tamagotchi tamagotchi);
}
