package com.yuanxin.app.app.appobject;

import java.io.Serializable;
import com.yuanxin.app.app.entity.gen.Skin;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * 应用对象 - Skin.
 *

 */
@JsonSerialize(include = Inclusion.NON_EMPTY)
public final class SkinAO extends Skin implements Serializable {

	/**
	 * 默认的序列化 id.
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
