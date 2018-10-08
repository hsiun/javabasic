package com.gaospot;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
/**
 * Created by gao on 2018/9/28.
 */



@RestController
public class ReturnController {

    @RequestMapping(method = RequestMethod.GET)
    public String returning() {

        Returning returning = new Returning();
        returning.setSuccess("true");
        returning.setMessage("file upload success.");
        String jsonStr = JSONObject.toJSONString(returning);

        return jsonStr;
    }

}
