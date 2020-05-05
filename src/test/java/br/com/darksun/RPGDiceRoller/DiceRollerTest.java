package br.com.darksun.RPGDiceRoller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiceRollerTest
{
	
	private final Integer testRepeat = 1_000_000;

	@BeforeEach
	void setUp( ) throws Exception
	{

	}
	
	@Test
	void testRollDice( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.rollDice( "4d20" );

			if ( roll < 4 || roll > 80 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}
	
	@Test
	void testRoll1d12( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.rollDice( "1d12" );

			if ( roll < 1 || roll > 12 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}
	
	@Test
	void testRolld6( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.rollDice( "d6" );

			if ( roll < 1 || roll > 6 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}
	
	@Test
	void testRollNegativeD100( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.roll( "-D100" );

			if ( roll < -100 || roll > 1 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}

	@Test
	void testRollSimpleSum( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.roll( "2d6 + 1" );

			if ( roll < 3 || roll > 13 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}
	
	@Test
	void testRollSimpleSubtraction( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.roll( "2d6 - 1" );

			if ( roll < 1 || roll > 11 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}
	
	@Test
	void testRollComplexSum( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.roll( "5d12 + 2d6 + 3D4 + 15" );

			if ( roll < 25 || roll > 99 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}

	@Test
	void testRollComplexSubtraction( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.roll( "5d12 - 2D6 - 3d4 - 15" );

			if ( roll < -34 || roll > 40 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}
	
	@Test
	void testRollComplexMixed( )
	{
		Boolean result = true;

		for ( int i = 0; i < testRepeat; i++ )
		{
			int roll = DiceRoller.roll( "5D12 - 2d6 + 3d4 - 15" );

			if ( roll < -19 || roll > 55 )
			{
				result = false;
				break;
			}
		}
		
		assertTrue( result );
		
	}
}
