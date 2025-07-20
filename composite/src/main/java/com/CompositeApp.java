package com;

import com.impl.BottomBody;
import com.impl.EntityManager;
import com.impl.TopBody;
import com.inter.IEntity;

public class CompositeApp {
  public static void main(String[] args) {
    IEntity leg = new BottomBody("leg");
    IEntity feets = new BottomBody("feet");

    EntityManager bottomBody = new EntityManager();
    bottomBody.addEntity( leg );
    bottomBody.addEntity( feets );

    IEntity arms = new TopBody("arms");
    IEntity hands = new TopBody("hands");

    EntityManager topBody = new EntityManager();
    topBody.addEntity( arms );
    topBody.addEntity( hands );

    EntityManager entity = new EntityManager();
    entity.addEntity( topBody );
    entity.addEntity( bottomBody );

    entity.render();
  }
}
