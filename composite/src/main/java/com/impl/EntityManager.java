package com.impl;

import com.inter.IEntity;

import java.util.ArrayList;
import java.util.List;

public class EntityManager implements IEntity {
  private List<IEntity> entites = new ArrayList<>();

  public void addEntity(IEntity entity) {
    entites.add( entity );
  }

  public void removeEntity(IEntity entity) {
    entites.remove( entity );
  }

  public List<IEntity> getEntites() {
    return entites;
  }

  @Override
  public void render() {
    System.out.println("whole entity rendered");
    entites.forEach(IEntity::render);
  }
}
