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
// IP 15 sept. 2010 Creation
// --------------------------------------------------------------------------

package aloyslisp;

import static aloyslisp.commonlisp.L.*;

/**
 * Lisp
 * 
 * @author Ivan Pierre {ivan@kilroysoft.ch}
 * @author George Kilroy {george@kilroysoft.ch}
 * 
 */
public class Lisp
{

	/**
	 * REPL
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// tLIST repl = list(fWRITE, (list(fEVAL, list(fREAD))));
		// System.out.println(Psystem.pPUTD.describe());
		loadClasses("aloyslisp.core.plugs");
		loadClasses("aloyslisp.core.types");
		loadClasses("aloyslisp.commonlisp.common_lisp");
		loadClasses("aloyslisp.commonlisp.system");
		sym("*trace*").SET_SYMBOL_VALUE(T);
		// INSTANTIATE("aloyslisp.core.plugs.Primitives");
		sym("lisp::load").e(str("class.lisp"));

		// loop recovering errors
		for (;;)
		{
			try
			{
				sym("lisp::repl").e();
			}
			catch (Exception ex)
			{
				debug(ex);

				e.init();
			}
		}
	}

	/**
	 * @param ex
	 */
	public static void debug(Exception ex)
	{
		System.err.println(ex.getLocalizedMessage());
		System.err.println("*trace = " + sym("*trace*").SYMBOL_VALUE());
		if (sym("*trace*").SYMBOL_VALUE() != NIL)
		{
			ex.printStackTrace();
		}
	}
}
