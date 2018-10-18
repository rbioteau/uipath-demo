enum JobState {
	PENDING("Pending"),
	SUCCESSFUL("Successful"),
	FAULTED("Faulted"),
	TERMINATING("Terminating"),
	RUNNING("Running"),
	STOPPING("Stopping"),
	STOPPED("Stopped")

	private final String value

	JobState(String value){
		this.value = value
	}

	@Override
	public String toString() {
		return value;
	}
}