package com.zhangyingwei.treehole.common.function;

import org.beetl.core.Context;
import org.beetl.core.Function;

import java.net.URLEncoder;

/**
 * @author: zhangyw
 * @date: 2017/7/9
 * @time: 下午4:45
 * @desc:
 */
public class StrToInteger implements Function {
    @Override
    public Object call(Object[] paras, Context context) {
        String input = paras[0]+"";
        return Integer.parseInt(input);
    }
}