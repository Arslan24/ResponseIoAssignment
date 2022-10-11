package pages;

public class MaintainCounter {
	static int counter = 0;
	static int subcount = 0;
	static int accessCount = 0;
	static int fileCount = 0;
	static int searched = 0;

	public void fileinc() {
		fileCount++;

	}

	public void increment() {
		counter++;

	}

	public int getSearchedCount() {
		return searched;
	}

	public void setSearchedCount() {
		searched = 0;
	}

	public void searchInc() {
		searched++;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter() {
		counter = 0;
	}

	public int getsub_Counter() {
		return subcount;
	}

	public void setsub_Counter_zero() {
		subcount = 0;
	}

	public void setsub_Counter_one() {
		subcount = 1;
	}

	public int getaccess_Counter() {
		return accessCount;
	}
}
