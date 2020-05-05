package br.com.darksun.RPGDiceRoller;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DiceRoller
{
	static Pattern patExpression = Pattern.compile( "([+-]?[0-9]*[Dd]?[0-9]+)(([+-][0-9]*[Dd]?[0-9]+)*)" );
	static Pattern patDice = Pattern.compile( "([+-]?[0-9]*[Dd]?[0-9]+)" );

	public static Integer roll( String rollExpression )
	{
		rollExpression = rollExpression.replaceAll( " ", "" );

		Matcher matcher = patExpression.matcher( rollExpression );
		Boolean match = matcher.matches( );
		matcher = patDice.matcher( rollExpression );
		if ( match )
		{
			int resultado = 0;
			while ( matcher.find( ) )
			{
				String dice = matcher.group( 0 );

				if ( dice.startsWith( "-" ) )
				{
					dice = dice.replaceAll( "-", "" );
					if ( dice.contains( "D" ) || dice.contains( "d" ) )
					{
						resultado -= rollDice( dice );
					} else
					{
						resultado -= Integer.parseInt( dice );
					}
				} else
				{
					dice = dice.replaceAll( "//+", "" );
					if ( dice.contains( "D" ) || dice.contains( "d" ) )
					{
						resultado += rollDice( dice );
					} else
					{
						resultado += Integer.parseInt( dice );
					}
				}
			}

			return resultado;
		} else
		{
			return null;
		}
	}

	public static Integer rollDice( String dice )
	{
		Integer result = 0;
		String[ ] values = dice.split( "[Dd]" );
		Integer quantity = 0;
		Integer size = 0;

		if ( values[0].equals( "" ) )
		{
			quantity = 1;
		} else
		{
			quantity = Integer.parseInt( values[0] );
		}

		size = Integer.parseInt( values[1] );

		for ( int i = 0; i < quantity; i++ )
		{
			result += new Random( ).nextInt( size ) + 1;
		}

		return result;
	}
}
