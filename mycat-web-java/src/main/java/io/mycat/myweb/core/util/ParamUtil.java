package io.mycat.myweb.core.util;

import java.util.Map;

/**
 * @author Leader us
 */
public class ParamUtil {
    /**
     * 从前端传来的Map中查询参数中获取分页大小，并且从Map中移除此参数
     * 
     * @param params
     * @return
     */
    public static int getPageSize(final Map<String, Object> params) {
        final Integer val = (Integer) params.remove(Constant.WebParamPageSize);
        if (val == null) {
            return Constant.DefaultPageSize;
        } else {
            return val;
        }

    }

    /**
     * 从前端传来的Map中查询参数中获取当前查询的页面序号，并且从Map中移除此参数
     * 
     * @param params
     * @return
     */
    public static int getPageIndex(final Map<String, Object> params) {
        final Integer val = (Integer) params.remove(Constant.WebParamPageIndex);
        if (val == null) {
            return 0;
        } else {
            return val;
        }

    }
}