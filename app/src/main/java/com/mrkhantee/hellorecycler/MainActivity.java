package com.mrkhantee.hellorecycler;

import android.app.*;
import android.os.*;
import android.support.v7.widget.*;
import java.util.*;
import android.*;

public class MainActivity extends Activity
{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate( Bundle savedInstanceState )
	{
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main );

        mRecyclerView = (RecyclerView) findViewById( R.id.recycler_view );

        mRecyclerView.setHasFixedSize( true );

        mLayoutManager = new LinearLayoutManager( this );
        mRecyclerView.setLayoutManager( mLayoutManager );

        mAdapter = new CustomAdapter( this, initPlayer( ) );
        mRecyclerView.setAdapter( mAdapter );
    }

	private List<Player> initPlayer( )
	{

		Player messi = new Player( "Leonel Missi", "Barcelona" );
		Player ronaldo = new Player( "Cristiano Ronaldo", "Real Madrid" );
		Player suarez = new Player( "Luis Suarez", "Liverpool" );

		List<Player> dataset = new ArrayList<Player>( );

		dataset.add( messi );
		dataset.add( ronaldo );
		dataset.add( suarez );

		return dataset;
	}

}
