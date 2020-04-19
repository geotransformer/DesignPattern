package designpattern.Observer;

import java.util.Observable;


/**
 * Intent
 * Define a one-to-many dependency between objects so that
 * one object changes (subject), all its dependents are notified
 * and updated automatically 
 * 
 *
 */
public class Subject extends Observable {
	private String content;
	
	public void changeSubjectContent(String content) {
		this.content = content;
		this.setChanged();
		this.notifyObservers(content);
	}
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.addObserver(new SubjectManagerObserver());
		subject.addObserver(new SubjectTeamLeadObserver());
		subject.addObserver(new SubjectTeamMemberObserver());
		subject.changeSubjectContent("Monday's update");
		subject.changeSubjectContent("Tuesday's update");
		subject.changeSubjectContent("Wednesday's update");		
	}

}
