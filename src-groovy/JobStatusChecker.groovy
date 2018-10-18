class JobStatusChecker {

	static boolean hasFailed(String state) {
		state != null && !state.endsWith("ing") && state != JobState.SUCCESSFUL.toString()
	}
	
	static boolean isSuccessful(String state) {
		state != null &&  state == JobState.SUCCESSFUL.toString()
	}
	
}
