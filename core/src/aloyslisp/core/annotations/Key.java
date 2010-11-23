/**
 * 
 */
package aloyslisp.core.annotations;

import java.lang.annotation.*;

/**
 * @author ivan
 *
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Key 
{
	/**
	 * Lisp name of key
	 * 
	 * @return
	 */
	String name();

	/**
	 * Default value as a string
	 * 
	 * @return
	 */
	String def() default "";

}
