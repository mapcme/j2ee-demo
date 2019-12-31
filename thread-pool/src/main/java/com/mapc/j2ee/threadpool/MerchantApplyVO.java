package com.mapc.j2ee.threadpool;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/25 15:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchantApplyVO implements Serializable {

    private static final long serialVersionUID = -9087773786166019388L;

    private Long id;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Long merchantId;

    private Long merchantAccountId;

    private String merchantAccountName;

    private String address;

    // 服务费比例（千分比）
    private Integer serviceFeePercent;

    // 提现手续费（分为单位）
    private Integer withdrawFee;

    // 顾问及电话
    private String adviser;

    private String merchantSn;

    private String merchantName;

    // 商家联系人姓名
    private String merchantContactName;

    // 商家联系电话
    private String merchantContactPhone;

    private String merchantLogo;

    // 主体类型(个人:personal,企业:company)
    private String subjectType;

    // 公司名
    private String companyName;

    // 营业执照照片(企业商家)
    private String businessLicense;

    // 统一社会信用代码(企业商家)
    private String unifiedSocialCreditCode;

    // 法人姓名
    private String corporationName;

    // 法人证件类型
    private String corporationIdType;

    // 法人证件号码
    private String corporationIdCardNo;

    // 法人电话号码
    private String corporationPhone;

    // 企业对公账户
    private String enterprisePublicAccount;

    // 开户银行名称
    private String openBankName;

    // 开户支行名称
    private String openBranchName;

    // 银行联行号
    private String bankLinkNo;

    private String idcardName;

    private String idcardNumber;

    private String idcardFrontImg;

    private String idcardHoldImg;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String countryCode;

    private String countryName;

    private LocalDateTime applyTime;

    private LocalDateTime auditTime;

    private String rejectReason;

    private String email;
}