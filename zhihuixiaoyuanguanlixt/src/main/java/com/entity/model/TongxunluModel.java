package com.entity.model;

import com.entity.TongxunluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 通讯录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TongxunluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 联系人名称
     */
    private String tongxunluName;


    /**
     * 联系人方式
     */
    private String tongxunluPhone;


    /**
     * 联系人身份
     */
    private String tongxunluShenfen;


    /**
     * 备注
     */
    private String tongxunluContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：联系人名称
	 */
    public String getTongxunluName() {
        return tongxunluName;
    }


    /**
	 * 设置：联系人名称
	 */
    public void setTongxunluName(String tongxunluName) {
        this.tongxunluName = tongxunluName;
    }
    /**
	 * 获取：联系人方式
	 */
    public String getTongxunluPhone() {
        return tongxunluPhone;
    }


    /**
	 * 设置：联系人方式
	 */
    public void setTongxunluPhone(String tongxunluPhone) {
        this.tongxunluPhone = tongxunluPhone;
    }
    /**
	 * 获取：联系人身份
	 */
    public String getTongxunluShenfen() {
        return tongxunluShenfen;
    }


    /**
	 * 设置：联系人身份
	 */
    public void setTongxunluShenfen(String tongxunluShenfen) {
        this.tongxunluShenfen = tongxunluShenfen;
    }
    /**
	 * 获取：备注
	 */
    public String getTongxunluContent() {
        return tongxunluContent;
    }


    /**
	 * 设置：备注
	 */
    public void setTongxunluContent(String tongxunluContent) {
        this.tongxunluContent = tongxunluContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
