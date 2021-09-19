package com.java.datatypes;

import java.time.Instant;

public class TrackingTimeOfEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant nowInstant= Instant.now();
		System.out.println(nowInstant);
		//checkRelationship(otherInstant);

	}

	static void checkRelationship(Instant otherInstant)
	{
		Instant nowInstant= Instant.now();
		if(otherInstant.compareTo(nowInstant)>0)
		{
			System.out.println(" instant is in the future");
		}
		else if (otherInstant.compareTo(nowInstant)<0)
		{
			System.out.println("instant is in the past");
		}
		else
			System.out.println("instant is now");
	}
}
