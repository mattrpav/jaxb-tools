package org.jvnet.jaxb.strategy;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.ClassOutline;

public interface ClassOutlineProcessor<T, C> {
	public T process(C context, ClassOutline classOutline, Options options) throws Exception;

}
