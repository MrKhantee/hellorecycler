package com.mrkhantee.hellorecycler;
import java.util.*;

public class Player
{
    private String name;
    private String club;
	private String address;

    public Player( String name, String club )
	{
        this.name = name;
        this.club = club;
    }
	
	public Player( String name, String club, String address )
	{
        this.name = name;
        this.club = club;
		this.address = address;
    }

	public void setAddress( String address )
	{
		this.address = address;
	}

	public String getAddress( )
	{
		return address;
	}

    public String getName( )
	{
        return name;
    }

    public void setName( String name )
	{
        this.name = name;
    }

    public String getClub( )
	{
        return club;
    }

    public void setClub( String club )
	{
        this.club = club;
    }
	
}
