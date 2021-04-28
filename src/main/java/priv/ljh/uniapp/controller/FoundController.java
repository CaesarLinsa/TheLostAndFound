package priv.ljh.uniapp.controller;


import cn.hutool.core.util.RandomUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;
import priv.ljh.operate.entity.User;
import priv.ljh.uniapp.entity.Unbo;
import priv.ljh.uniapp.mapper.UnboMapper;
import priv.ljh.uniapp.service.UnboService;
import priv.ljh.utils.Constants;
import priv.ljh.utils.MyPage;
import priv.ljh.utils.ResultResponse;
import priv.ljh.uniapp.entity.Found;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * <p>
 * 首页轮播图 前端控制器
 * </p>
 *
 * @author lijinghai
 * @since 2021-02-19
 */
@Api(tags = {"首页展示的物品信息控制类"})
@Slf4j
@RestController
@RequestMapping("/found")
public class FoundController {

    @ApiOperation("增加信息")
    @PostMapping
    public ResultResponse create(@RequestBody Found found) {
        ResultResponse res = null;
        System.out.print(found);
        res = new ResultResponse(Constants.STATUS_OK, Constants.MESSAGE_OK, "okkk");
        return res;
    }


}

