package sandbox;

public enum DaysOfTheWeek {
	MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);

	private final boolean isWeekend;

	private DaysOfTheWeek(final boolean isWeekend) {
		this.isWeekend = isWeekend;
	}

	public boolean isWeekend() {
		return isWeekend;
	}
}
