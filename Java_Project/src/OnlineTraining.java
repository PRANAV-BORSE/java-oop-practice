
public class OnlineTraining extends Training {
	
	private String meetingLink;
	
	public OnlineTraining() {
		meetingLink = "https://zoom.us/48575";
	}
	
	
	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}


	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	
	public void conduct() {
		String currentModule = getModuleName();
		int currentDuration = getDuration();
		System.out.println("Conducting the training on " + currentModule);
		System.out.println("for " + currentDuration + " hours");
		System.out.println("using the link  "+ meetingLink);
	}	
	
	public String getDetails() {
		return super.getDetails() + ", " +  meetingLink;
	}
}