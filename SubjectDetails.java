package com.company;
class Subject
{
	private String subId;
	private String name;
	private int maxMarks;
	private int marksObt;

	public Subject(String subId, String name, int maxMarks)
	{
		this.subId = subId;
		this.name = name;
		this.maxMarks = maxMarks;
	}
	public String getSubId() {return subId;}
	public String getName(){return name;}
	public  int getMaxMarks(){return maxMarks;}
	public int getMarksObt(){return marksObt;}

	public void setMarksObt(int mo)
	{
		marksObt = mo;
	}
	public void setMaxMarks(int mm) {maxMarks = mm; }

	public boolean isQualified()
	{
			return marksObt >= 40;
	}
	public String toString()
	{
		return "\nSubject ID: "+subId+"\nName: "+name+"\nMarks Obtained: "+marksObt+"\nQUalified: "+isQualified();
	}

}

public class SubjectDetails
{
	public static void main(String args[])
	{
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("SS-01","Social Science", 100); // Now this i.e Subs[0] itself is refernce to object,vid 117(6:40)
		subs[0].setMarksObt(80);
		subs[0].isQualified(); //this won't show result because we want it to be wriiten in loop so put in toString method
		subs[1] = new Subject("MH-02", "Modern History", 100); // Now subs[1] itself is refernce to object
		subs[1].setMarksObt(20);

		subs[2] = new Subject("MA-03", "Mathematics", 100); // Now subs[2] itself is refernce to object
		subs[2].setMarksObt(56);
		subs[2].isQualified(); //this won't show result because we want it to be wriiten in loop so put in toString method


		for(Subject s:subs)
		{
			System.out.println(s);
		}

	}

}
