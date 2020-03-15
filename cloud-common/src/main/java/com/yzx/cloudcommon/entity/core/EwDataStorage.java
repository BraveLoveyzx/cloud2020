package com.yzx.cloudcommon.entity.core;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author mastermind
 * @since 2020-03-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ecinx_ew_data_storage")
public class EwDataStorage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "data_storage_id", type = IdType.ID_WORKER)
    private Long dataStorageId;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 服务名称
     */
    private String serverName;

    /**
     * 发货单编码
     */
    private String deliveryCode;

    /**
     * 发货单ID
     */
    private Long deliveryId;

    /**
     * 申报订单号
     */
    private String declareOrderCode;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 店铺平台ID
     */
    private Long shopPlatformId;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 外仓ID
     */
    private Long externalWarehouseId;

    /**
     * 是否已确认 0未确认1已确认
     */
    private Integer isConfirm;

    /**
     * 扩展数据
     */
    private String expansionData;

    /**
     * 上回发送的消息【清关信息、错误信息】若果此字段数据相同则不在进行发送数据
     */
    private String lastSendMessage;

    /**
     * 是否再次推送0 不需要，1在次推送
     */
    private Integer isPushAgain;

    /**
     * 再次推送的仓库服务名称
     */
    private String pushAgainWarehouseName;

    /**
     * 外仓仓库代码
     */
    private String pushAgainWarehouseCode;

    /**
     * 是否再次推送成功，0未成功，1成功
     */
    private Integer isPushAgainStatus;

    /**
     * 再次推送扩展数据
     */
    private String extendedData;

    /**
     * 确认时间
     */
    private Date confirmTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
