package com.forest.provider.entity;

import lombok.Data;

import java.util.Date;

@Data
public class HospitalInfo {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 医院Id
     */
    private String hospitalId;

    /**
     * 医院所属区域编号
     */
    private Integer areaId;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 医院地址
     */
    private String address;

    /**
     * 邮政编码
     */
    private String zipCode;

    /**
     * 医院经度
     */
    private Double longitude;

    /**
     * 医院纬度
     */
    private Double latitude;

    /**
     * 医院类型
     */
    private String hospitalType;

    /**
     * 医院等级
     */
    private String hospitalLevel;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 医院状态 未上线：0 正式上线：1 试上线：2
     */
    private String goliveStatus;

    /**
     * logo地址
     */
    private String logoAddr;

    /**
     * 所属平台
     */
    private String platform;

    /**
     * 排序编码
     */
    private Integer sortCode;

    /**
     * 开启标识
     */
    private String openFlag;

    /**
     * 区域标识
     */
    private Boolean regionFlag;

    /**
     * 关闭原因
     */
    private String closeReason;

    /**
     * 关闭提示
     */
    private String closeAlertInfo;

    /**
     * 网络标识
     */
    private Integer onlineFlag;

    /**
     * 医院简介标题
     */
    private String descTitle;

    /**
     * 医院简介
     */
    private String hospitalDesc;

    /**
     * 医院所在省份
     */
    private String provinceName;

    /**
     * 医院所在城市
     */
    private String cityName;

    /**
     * 医院所在地区省份编码
     */
    private String provinceCode;

    /**
     * 医院所在地区城市编码
     */
    private String cityCode;

    /**
     * 医院端地址
     */
    private String terminalAddress;

    /**
     * 门诊量
     */
    private Integer outpatient;

    /**
     * 数据是否有效 0: 无效， 1：有效，逻辑删除位
     */
    private Boolean enable;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 备注 fixbywwm
     */
    private String remarks;

    /**
     * 是否新疆v3版本
     */
    private Boolean xinjiangV3;

    /**
     * 支持的并发数
     */
    private Integer concurrentAmount;

    /**
     * 是否故障
     */
    private Boolean faultFlag;

    /**
     * 故障原因
     */
    private String faultReason;

    /**
     * 源id
     */
    private String sourceId;

    /**
     * 数据中心子医院标识
     */
    private Boolean dataCenterSubFlag;

    /**
     * 法国再保险公司对给医院设置的评分
     */
    private String fazaiScore;

    /**
     * 来源类型
     */
    public String sourceType;

}
