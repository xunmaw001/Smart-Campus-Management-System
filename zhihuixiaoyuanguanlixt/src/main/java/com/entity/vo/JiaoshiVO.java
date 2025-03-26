package com.entity.vo;

import com.entity.JiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教师信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoshi")
public class JiaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 教师名称
     */

    @TableField(value = "jiaoshi_name")
    private String jiaoshiName;


    /**
     * 教师类型
     */

    @TableField(value = "jiaoshi_types")
    private Integer jiaoshiTypes;


    /**
     * 教师头像
     */

    @TableField(value = "jiaoshi_photo")
    private String jiaoshiPhoto;


    /**
     * 联系方式
     */

    @TableField(value = "jiaoshi_phone")
    private String jiaoshiPhone;


    /**
     * 工作时长
     */

    @TableField(value = "jiaoshi_shichang")
    private String jiaoshiShichang;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 教师简介
     */

    @TableField(value = "jiaoshi_content")
    private String jiaoshiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "jiaoshi_delete")
    private Integer jiaoshiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：教师名称
	 */
    public String getJiaoshiName() {
        return jiaoshiName;
    }


    /**
	 * 获取：教师名称
	 */

    public void setJiaoshiName(String jiaoshiName) {
        this.jiaoshiName = jiaoshiName;
    }
    /**
	 * 设置：教师类型
	 */
    public Integer getJiaoshiTypes() {
        return jiaoshiTypes;
    }


    /**
	 * 获取：教师类型
	 */

    public void setJiaoshiTypes(Integer jiaoshiTypes) {
        this.jiaoshiTypes = jiaoshiTypes;
    }
    /**
	 * 设置：教师头像
	 */
    public String getJiaoshiPhoto() {
        return jiaoshiPhoto;
    }


    /**
	 * 获取：教师头像
	 */

    public void setJiaoshiPhoto(String jiaoshiPhoto) {
        this.jiaoshiPhoto = jiaoshiPhoto;
    }
    /**
	 * 设置：联系方式
	 */
    public String getJiaoshiPhone() {
        return jiaoshiPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setJiaoshiPhone(String jiaoshiPhone) {
        this.jiaoshiPhone = jiaoshiPhone;
    }
    /**
	 * 设置：工作时长
	 */
    public String getJiaoshiShichang() {
        return jiaoshiShichang;
    }


    /**
	 * 获取：工作时长
	 */

    public void setJiaoshiShichang(String jiaoshiShichang) {
        this.jiaoshiShichang = jiaoshiShichang;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：教师简介
	 */
    public String getJiaoshiContent() {
        return jiaoshiContent;
    }


    /**
	 * 获取：教师简介
	 */

    public void setJiaoshiContent(String jiaoshiContent) {
        this.jiaoshiContent = jiaoshiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJiaoshiDelete() {
        return jiaoshiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJiaoshiDelete(Integer jiaoshiDelete) {
        this.jiaoshiDelete = jiaoshiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
