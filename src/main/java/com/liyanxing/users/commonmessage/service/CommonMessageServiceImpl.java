package com.liyanxing.users.commonmessage.service;

import com.liyanxing.users.commonmessage.mapper.CommonMessageMapper;
import com.liyanxing.users.commonmessage.pojo.CommonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commonMessageServiceImpl")
public class CommonMessageServiceImpl implements CommonMessageService
{
    @Autowired
    @Qualifier("commonMessageMapper")
    private CommonMessageMapper mapper;

    /**
     * 查询所有评论的所有信息
     *
     * @return
     */
    @Override
    public List<CommonMessage> selectAllMessage()
    {
        return mapper.selectAllMessage();
    }
}