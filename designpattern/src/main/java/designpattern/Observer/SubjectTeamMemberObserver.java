package designpattern.Observer;

import java.util.Observable;
import java.util.Observer;

public class SubjectTeamMemberObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String update = (String)arg;
		System.out.println("As a team memeber, I got the updates: " + update);		
	}

}
