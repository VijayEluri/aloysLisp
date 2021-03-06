/**
 * aloysLisp.
 * <p>
 * A LISP interpreter, compiler and library.
 * <p>
 * Copyright (C) 2010-2011 kilroySoft <aloyslisp@kilroysoft.ch>
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
// IP 12 sept. 2010-2011 Creation
// --------------------------------------------------------------------------

package aloyslisp.core.sequences;

import java.util.*;

import aloyslisp.annotations.aBuiltIn;
import aloyslisp.core.*;
import aloyslisp.core.conditions.*;
import aloyslisp.internal.iterators.*;
import static aloyslisp.core.L.*;

/**
 * cVECTOR
 * 
 * @author Ivan Pierre {ivan@kilroysoft.ch}
 * @author George Kilroy {george@kilroysoft.ch}
 * 
 */
@aBuiltIn(lispClass = "vector", doc = "t_vector")
public class cVECTOR extends cCELL implements tVECTOR
{
	public ArrayList<tT>	array;

	private tT				type	= T;

	private Integer			base	= 0;

	private Integer			size	= -1;

	/**
	 * Create emplty array
	 */
	public cVECTOR()
	{
		array = new ArrayList<tT>();
	}

	/**
	 * Add an array as array values
	 * 
	 * @param arr
	 *            array to copy
	 */
	public cVECTOR(tT[] arr)
	{
		array = new ArrayList<tT>();
		for (tT walk : arr)
		{
			array.add(walk);
		}
	}

	/**
	 * Add a list as array
	 * 
	 * @param arr
	 */
	public cVECTOR(tLIST arr)
	{
		array = new ArrayList<tT>();
		for (tT walk : arr)
		{
			array.add(walk);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.cCELL#copy()
	 */
	public tT COPY_CELL()
	{
		// return new cVECTOR(new cCONS(array.toArray()));
		return this;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tARRAY#getType()
	 */
	public tT ARRAY_ELEMENT_TYPE()
	{
		return type;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tARRAY#setType(aloyslisp.core.tT)
	 */
	public tARRAY SET_ARRAY_ELEMENT_TYPE(tT type)
	{
		this.type = type;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.cCELL#TO_STRING()
	 */
	public String TO_STRING()
	{
		String res = "#(";
		String sep = "";

		for (tT walk : array)
		{
			res += sep;
			sep = " ";
			res += walk.TO_STRING();
		}

		res += ")";

		return res;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#LENGTH()
	 */
	public Integer LENGTH()
	{
		return array.size();
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#ELT(java.lang.Integer)
	 */
	public tT ELT(Integer pos)
	{
		if (!testLimits(pos))
			return null;

		return array.get(pos);
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#SET_ELT(java.lang.Integer,
	 * aloyslisp.core.tT)
	 */
	public tSEQUENCE SET_ELT(tT value, Integer pos)
	{
		if (!testLimits(pos))
			return null;

		// throw new LispException("sElt(" + pos + ", " + value.printable() +
		// ")");
		array.add(value);
		// array.set(pos, value);
		return (tSEQUENCE) this;
	}

	/**
	 * @param pos
	 * @return
	 */
	private boolean testLimits(int pos)
	{
		if (pos < base)
		{
			throw new LispException("Index (" + pos + ") < base (" + base
					+ ") of array");
		}

		if (pos - base >= size && size > 0)
		{
			throw new LispException("Index (" + pos + ") > size (" + base
					+ ") of array with base = (" + base + ")");
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#SUBSEQ(java.lang.Integer,
	 * java.lang.Integer)
	 */
	public tSEQUENCE SUBSEQ(Integer start, Integer end)
	{
		// TODO Subsequence
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#REVERSE()
	 */
	public tSEQUENCE REVERSE()
	{
		// TODO Reverse
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#NREVERSE()
	 */
	public tSEQUENCE NREVERSE()
	{
		// TODO Nreverse
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#VALUES_LIST()
	 */
	public tT[] VALUES_LIST()
	{
		tT[] res = new tT[LENGTH()];
		int i = 0;
		for (tT walk : this)
		{
			res[i++] = walk;
		}
		return res;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.cCELL#EQUAL(aloyslisp.core.tT)
	 */
	public boolean EQUAL(tT cell)
	{
		return EQ(cell);
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#SET_SUBSEQ(java.lang.Integer,
	 * java.lang.Integer, aloyslisp.core.tT)
	 */
	public tSEQUENCE SET_SUBSEQ(tT value, Integer start, Integer end)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	public VECTORIterator iterator()
	{
		return iterator(false);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * aloyslisp.core.sequences.tSEQUENCE#sequenceIterator(aloyslisp.core.sequences
	 * .tSEQUENCE, boolean)
	 */
	@Override
	public VECTORIterator iterator(boolean destructive)
	{
		return new VECTORIterator(this, destructive);
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.tT#hashCode()
	 */
	@Override
	public Integer SXHASH()
	{
		Integer res = 0;
		for (tT elem : array)
		{
			res = res ^ elem.SXHASH();
		}
		return res;
	}

	/*
	 * (non-Javadoc)
	 * @see aloyslisp.core.sequences.tSEQUENCE#FIND(aloyslisp.core.tT)
	 */
	@Override
	public tT FIND(tT item)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
