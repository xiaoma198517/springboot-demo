package com.znjf33.external.api.provider.mapper;

import com.znjf33.external.api.provider.domain.SupplyChainLmjParamDO;
import com.znjf33.external.api.provider.domain.SupplyChainLmjResultDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author maweijun
 * @description
 * @create 17/10/16
 */
@Mapper
public interface SupplyChainLmjMapper {

    SupplyChainLmjResultDO getZnjfExternalUserByUserIdAndUuid(@Param("userId") Integer userId, @Param("loanAppUuid") String loanAppUuid);
    Float getCreditAmountByUserId(@Param("userId") Integer userId);
    Float getUsedCreditAmount(@Param("userId") Integer userId);
    void saveApplyLoan(SupplyChainLmjParamDO supplyChainLmjParamDO);
    void saveApplyLoanAttachment(List item);
    Integer countUserByUserInfo(@Param("userId") Integer userId);
    SupplyChainLmjResultDO getZnjfFundByUserId(@Param("userId") Integer userId,@Param("loanDrawUuid") String loanDrawUuid);
    SupplyChainLmjResultDO getZnfFundByOrderNo(@Param("userId") Integer userId,@Param("channelFrom") Integer channelFrom,@Param("loanDrawUuid") String loanDrawUuid);
    SupplyChainLmjResultDO getUserInfo(@Param("loanAppUuid") String loanAppUuid);
    Integer countFundsToday(@Param("userId") Integer userId, @Param("channelFrom") Integer channelFrom, @Param("startTime") Date startTime,@Param("fundStatus") Integer fundStatus);
    Integer getFundExist(@Param("userId") Integer userId, @Param("loanDrawUuid") String loanDrawUuid);
    Integer getZnjfFundForSame(@Param("loanDrawUuid") String loanDrawUuid);
    void updateBorrowRepayment(@Param("userId") Integer userId, @Param("borrowId") Long borrowId);
    void updateZnjfFundRepayStatus(@Param("userId") Integer userId, @Param("loanDrawUuid") String loanDrawUuid, @Param("fundStatus") Integer fundStatus);
    void updateZnjfFundStatus(@Param("userId") Integer userId, @Param("loanDrawUuid") String loanDrawUuid, @Param("fundStatus") Integer fundStatus,@Param("channelFrom") Integer channelFrom);
}
