package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 通话记录表
    */
@Data
@Builder
public class CallRecords {
    private Integer id;

    /**
    * 对应的号池Key
    */
    private String poolKey;

    /**
    * 通话对应的三元组的绑定关系ID
    */
    private String subId;

    /**
    * 唯一标识一通通话记录的ID
    */
    private String callId;

    /**
    * AXB中的A号码
    */
    private String phoneNo;

    /**
    * AXB中的X号码
    */
    private String secretNo;

    /**
    * AXB中的B号码或者N号码
    */
    private String peerNo;

    /**
    * 呼叫类型
0:主叫(phone_no打给peer_no)；1:被叫(peer_no打给phone_no)；2:短信发送；3:短信接收
    */
    private String callType;

    /**
    * 呼叫动作开始时间
    */
    private Date callTime;

    /**
    * 对端手机振铃时间
    */
    private Date ringTime;

    /**
    * 对端接听时间
    */
    private Date startTime;

    /**
    * 对端挂断时间，release_time - start_time 代表通话时长 如果结果为0,代表呼叫未接通
    */
    private Date releaseTime;

    /**
    * 通话释放方向
    */
    private String releaseDir;

    /**
    * 释放原因
1:未分配的号码
2:无路由到指定的转接网
3:无路由到目的地
4:发送专用信息音
16:正常的呼叫拆线
17:用户忙
18:用户未响应
19:用户未应答
20:用户缺席
21:呼叫拒收
22:号码改变
27:目的地不可达
28:无效的号码格式（地址不全）
29:性能拒绝
31:正常—未指定
34: 无电路/通路可用
42: 交换设备拥塞
50:所请求的性能未预定
53:CUG中限制去呼叫
55: CUG中限制来呼叫
57:承载能力无权
58:承载能力目前不可用
65:承载能力未实现
69:所请求的性能未实现
87:被叫用户不是CUG的成员
88:不兼容的目的地
90:不存在的CUG
91:无效的转接网选择
95:无效的消息，未指定
97:消息类型不存在或未实现
99:参数不存在或未实现
102:定时器终了时恢复
103:参数不存在或未实现—传递
110:消息带有未被识别的参数—舍弃
111:协议错误，未指定
127:互通，未指定
    */
    private Integer releaseCause;

    private Date createTime;

    private Date updateTime;
}