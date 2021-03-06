package com.farmer.core.base;

import cn.hutool.core.util.StrUtil;
import com.farmer.core.GenerateBase;
import com.farmer.utils.ConstKit;
import lombok.Data;

import java.util.Date;

/**
 * @author farmer
 * @version 1.0
 * @data 2019/4/26 14:05
 **/
@Data
public class BaseClassInfo extends GenerateBase{
    
    /**
     * 包名
     */
    protected String packageName;

    /**
     * 基础父类全限名
     */
    protected String basePackageAllName;

    /**
     * 作者
     */
    protected String author;

    /**
     * 创建时间
     */
    protected Date createDate = new Date();

    /**
     * 基础父类名
     */
    protected String baseClassName;

    /**
     * 基础父类名
     */
    protected String outPath = GenerateBase.outPath;


    public BaseClassInfo(String packageName, String author) {
        this.packageName = packageName;
        this.author = StrUtil.emptyToDefault(author, ConstKit.DEFAULT_AUTHOR);
    }

    public BaseClassInfo(String packageName, String basePackageAllName, String author) {
        this.packageName = packageName;
        this.basePackageAllName = basePackageAllName;
        this.author = StrUtil.emptyToDefault(author, ConstKit.DEFAULT_AUTHOR);
        this.baseClassName = StrUtil.isNotEmpty(basePackageAllName) ? basePackageAllName.substring(basePackageAllName.lastIndexOf(".") + 1) : null;

    }
}
