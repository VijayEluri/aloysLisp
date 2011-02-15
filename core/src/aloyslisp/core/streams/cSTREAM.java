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
// IP 16 sept. 2010 Creation
// --------------------------------------------------------------------------

package aloyslisp.core.streams;

import aloyslisp.annotations.*;
import aloyslisp.core.cCELL;
import aloyslisp.core.tT;
import aloyslisp.core.packages.tSYMBOL;
import aloyslisp.core.sequences.tLIST;

/**
 * cSTREAM
 * 
 * @author Ivan Pierre {ivan@kilroysoft.ch}
 * @author George Kilroy {george@kilroysoft.ch}
 * @see http://hyper.aloys.li/Body/t_stream.htm
 */
public abstract class cSTREAM extends cCELL implements tSTREAM
{
	/**
	 * @param stream
	 * @param form
	 * @return
	 */
	@SpecialOp
	@Static(name = "with-open-stream", doc = "m_w_op_1")
	public static tT WITH_OPEN_STREAM( //
			@Arg(name = "stream") tLIST stream, //
			@Rest(name = "form") tT... form)
	{
		return null;
	}

	/**
	 * @param fileSpec
	 * @param direction
	 * @param ifExists
	 * @param ifDoesNotExists
	 * @param externalFormat
	 * @return
	 */
	@SpecialOp
	@Static(name = "open", doc = "f_open")
	public static tT OPEN( //
			@Arg(name = "filespec") tPATHNAME_DESIGNATOR fileSpec, //
			@Arg(name = "direction") tSYMBOL direction, //
			@Opt(name = "if-exists") tSYMBOL ifExists, //
			@Opt(name = "is-does-not-exists") tSYMBOL ifDoesNotExists, //
			@Opt(name = "external-format") tT externalFormat)
	{
		// TODO Auto-generated method stub
		return null;
	}

}