/**
 * aloysLisp.
 * <p>
 * A LISP interpreter, compiler and library.
 * <p>
 * Copyright (C) 2010 kilroySoft <aloyslisp@kilroysoft.ch>
 * 
 * <p>
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
// --------------------------------------------------------------------------
// history
// --------------------------------------------------------------------------
// IP 16 oct. 2010 Creation
// --------------------------------------------------------------------------

package aloyslisp.core.math;

import static aloyslisp.commonlisp.L.*;
import aloyslisp.core.conditions.*;
import aloyslisp.core.numbers.*;

/**
 * NumComplex
 * 
 * @author Ivan Pierre {ivan@kilroysoft.ch}
 * @author George Kilroy {george@kilroysoft.ch}
 * 
 */
public class NumComplex implements IComplex
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 5745108518875400131L;

	/**
	 * 
	 */
	public tNUMBER				real;

	/**
	 * 
	 */
	public tNUMBER				imag;

	/**
	 * 
	 */
	/**
	 * @param real
	 * @param imag
	 */
	public NumComplex(tNUMBER real, tNUMBER imag)
	{
		this.real = real;
		this.imag = imag;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "#C(" + real + " " + imag + ")";
	}

	/**
	 * @return
	 */
	public NumRatio getRatioValue()
	{
		if (!imag.EQUAL(nInt(0)))
		{
			throw new LispException("Can't convert complex to ratio");
		}
		return realpart().getRatioValue();
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#getComplexValue()
	 */
	public NumComplex getComplexValue()
	{
		return this;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#getIntegerValue()
	 */
	public NumInteger getIntegerValue()
	{
		if (!imag.EQUAL(nInt(0)))
		{
			throw new LispException("Can't convert complex to integer");
		}
		return realpart().getIntegerValue();
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#getFloatValue()
	 */
	public NumFloat getFloatValue()
	{
		if (!imag.EQUAL(nInt(0)))
		{
			throw new LispException("Can't convert complex to float");
		}
		return realpart().getFloatValue();
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#getDoubleValue()
	 */
	public NumDouble getDoubleValue()
	{
		if (!imag.EQUAL(nInt(0)))
		{
			throw new LispException("Can't convert complex to double");
		}
		return realpart().getDoubleValue();
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#getShortValue()
	 */
	public NumShort getShortValue()
	{
		if (!imag.EQUAL(nInt(0)))
		{
			throw new LispException("Can't convert complex to short");
		}
		return realpart().getShortValue();
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#make()
	 */
	public COMPLEX make()
	{
		return new COMPLEX(this);
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#coerce(aloyslisp.core.math.INumber)
	 */
	@Override
	public INumber coerce(INumber var)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#add(aloyslisp.core.math.INumber)
	 */
	@Override
	public INumber add(INumber op)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#substract(aloyslisp.core.math.INumber)
	 */
	@Override
	public INumber substract(INumber op)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#minus()
	 */
	@Override
	public INumber minus()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#inversion()
	 */
	@Override
	public INumber inversion()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#multiply(aloyslisp.core.math.INumber)
	 */
	@Override
	public INumber multiply(INumber op)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#division(aloyslisp.core.math.INumber)
	 */
	@Override
	public INumber division(INumber op)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#realpart()
	 */
	@Override
	public INumber realpart()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#imagpart()
	 */
	@Override
	public INumber imagpart()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#conjugate()
	 */
	@Override
	public INumber conjugate()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#phase()
	 */
	@Override
	public INumber phase()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#abs()
	 */
	@Override
	public IReal abs()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#zerop()
	 */
	@Override
	public boolean zerop()
	{
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#cis()
	 */
	@Override
	public INumber cis()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#sin()
	 */
	@Override
	public INumber sin()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#cos()
	 */
	@Override
	public INumber cos()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#tan()
	 */
	@Override
	public INumber tan()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#asin()
	 */
	@Override
	public INumber asin()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#acos()
	 */
	@Override
	public INumber acos()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#atan()
	 */
	@Override
	public INumber atan()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#atan(aloyslisp.core.math.IReal)
	 */
	@Override
	public INumber atan(IReal opt)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#sinh()
	 */
	@Override
	public INumber sinh()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#cosh()
	 */
	@Override
	public INumber cosh()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#tanh()
	 */
	@Override
	public INumber tanh()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#asinh()
	 */
	@Override
	public INumber asinh()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#acosh()
	 */
	@Override
	public INumber acosh()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#atanh()
	 */
	@Override
	public INumber atanh()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#log()
	 */
	@Override
	public INumber log()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#sqrt()
	 */
	@Override
	public INumber sqrt()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#exp()
	 */
	@Override
	public INumber exp()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#expt(aloyslisp.core.math.INumber)
	 */
	@Override
	public INumber expt(INumber power)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.math.INumber#random()
	 */
	@Override
	public INumber random()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * aloyslisp.core.math.INumber#random(aloyslisp.core.numbers.tRANDOM_STATE)
	 */
	@Override
	public INumber random(tRANDOM_STATE st)
	{
		// TODO Auto-generated method stub
		return null;
	}

}