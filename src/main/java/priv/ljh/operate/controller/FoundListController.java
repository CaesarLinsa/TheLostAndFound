package priv.ljh.operate.controller;

import cn.hutool.core.util.RandomUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import priv.ljh.operate.entity.FoundList;
import priv.ljh.operate.mapper.FoundListMapper;
import priv.ljh.utils.Constants;
import priv.ljh.utils.MyPage;
import priv.ljh.utils.ResultResponse;
import java.util.List;

@Api(tags = {"信息控类"})
@RestController
@RequestMapping("/FoundList")
@Slf4j
public class FoundListController {
    @Autowired
    private FoundListMapper foundMapper;


    @ApiOperation("打印用户信息")
    @GetMapping
    public ResultResponse create() {
        ResultResponse res = null;
        List<FoundList> foundLists = foundMapper.selectlist(null);
        log.info("foundlist====>"+foundLists);
        res = new ResultResponse(Constants.STATUS_OK, Constants.MESSAGE_OK, foundLists);
        return res;
    }
}