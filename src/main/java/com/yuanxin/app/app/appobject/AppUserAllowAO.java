package com.yuanxin.app.app.appobject;

import java.io.Serializable;
import com.yuanxin.app.app.entity.gen.AppUserAllow;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * 应用对象 - AppUserAllow.
 *
 * <p>
 * 该类于 2016-07-23 12:14:56 首次生成，后由开发手工维护。
 * </p>
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.0, Jul 23, 2016
 */
@JsonSerialize(include = Inclusion.NON_EMPTY)
public final class AppUserAllowAO extends AppUserAllow implements Serializable {

    /**
     * 默认的序列化 id.
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
