package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.InvoiceRecord;

public interface InvoiceRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InvoiceRecord record);

    int insertSelective(InvoiceRecord record);

    InvoiceRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InvoiceRecord record);

    int updateByPrimaryKey(InvoiceRecord record);
}