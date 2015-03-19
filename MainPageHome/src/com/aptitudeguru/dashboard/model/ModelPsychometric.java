package com.aptitudeguru.dashboard.model;

public class ModelPsychometric {

	private static String scenario = "You are a Retail Assistant working in the Saldringham branch of More Than Pens plc, a national stationer's chain. More Than Pens has over 1000 stores, primarily in the UK, including 451 travel outlets at airports, train stations and motorway service areas and 627 high street stores. More Than Pens sells a wide range of newspapers, magazines, books, stationery and impulse products; most branches are open 7 days a week between 8.30am and 5.30pm. As a Retail Assistant you are responsible for providing exceptional customer service whilst demonstrating product knowledge to maximise sales. You work primarily in the book section of the Saldringham branch, however all the branch staff work as a unified team and therefore you are often required to work in other sections throughout the store."
			+ "A customer has been browsing in your section for about 10 minutes and is looking increasingly dissatisfied and frustrated. He approaches you and asks whether you have a particular book that he is looking for, and after checking on your computer, you have to inform him that it is currently 'out of stock'.";
	private static String answerA = "A: Apologise that the book is unavailable and suggest he try Morethanpens.co.uk or another online retailer instead.";
	private static String answerB = "B: Offer to order the book for the customer and let him know how long this will take. Offer to call him when the book arrives.";
	private static String answerC = "C: Give the customer the ISBN (book serial number) of the book so that he can easily and quickly search it out elsewhere, either online or at another bookshop.";
	private static String answerD = "D: Suggest he try the Alpston branch of More Than Pens (which is the nearest neighbouring town, 40 minutes drive away) or other bookshops in Saldringham.";
	private String resultA = "This is the least effective response as you are not giving the customer any direct help and you are unaware as to whether the customer has access to a computer and is able to shop 'online'.";
	private String resultB = "This is the most effective response as you are trying to give the customer what he wants without him having to do too much more. By telling the customer how long it will take to order, he can make an informed decision as to whether he wishes to take this option.";
	private String resultC= "A reasonable response but you are doing little to directly help the customer find the book; he will still have to make quite an effort himself.";
	private String resultD= "Not a particularly appropriate response as it is, almost certainly, obvious to the customer that he could try elsewhere and so your response is not adding any value to what he already know. You have managed to make him aware of an alternative branch of More Than Pens, which is positive, but perhaps you could have offered to ring that branch to check the availability of the book before the customer set off to Alpston. You could also have improved this response by giving the customer specific details of other local bookshops and how to find them as well as the address of the Alpston More Than Pens branch.";
	
	
	public static String getScenario() {
		return scenario;
	}
	
	public static String getAnswerA() {
		return answerA;
	}
	
	public static String getAnswerB() {
		return answerB;
	}
	
	public static String getAnswerC() {
		return answerC;
	}
	
	public static String getAnswerD() {
		return answerD;
	}
	
	public String getResultA() {
		return resultA;
	}

	
	public String getResultB() {
		return resultB;
	}
	
	public String getResultC() {
		return resultC;
	}
	
	public String getResultD() {
		return resultD;
	}
	
}
