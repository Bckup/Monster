package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterView;

public class MonsterAppController 
{

	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("George", 3.0, 4.5, 3, 5, 2, false);
		otherMonster = new MarshmallowMonster("Derf", 0.001, .2, 5, 0, 0, true);
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	public void start()

	{
		myAppView.displayInformation();
	}
	
}