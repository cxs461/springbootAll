package com.sml.xcx.service.cluster.impl;

import com.sml.xcx.entity.cluster.Test;
import com.sml.xcx.mapper.cluster.TestMapper;
import com.sml.xcx.service.cluster.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-01
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
