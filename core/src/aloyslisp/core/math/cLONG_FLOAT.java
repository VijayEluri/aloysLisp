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
// IP 5 janv. 2011 Creation
// --------------------------------------------------------------------------

package aloyslisp.core.math;

import aloyslisp.annotations.aBuiltIn;

/**
 * cLONG_FLOAT
 * 
 * @author Ivan Pierre {ivan@kilroysoft.ch}
 * @author George Kilroy {george@kilroysoft.ch}
 */
@aBuiltIn(lispClass = "float", lispType = "long-float", doc = "t_short_")
public class cLONG_FLOAT extends cDOUBLE_FLOAT
{

	/**
	 * @param init
	 */
	public cLONG_FLOAT(double init)
	{
		super(init);
	}

}