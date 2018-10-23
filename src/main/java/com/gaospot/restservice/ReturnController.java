package com.gaospot.restservice;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
/**
 * Created by gao on 2018/9/28.
 */



@RestController
public class ReturnController {

    @RequestMapping(value = "/oauth" , method = RequestMethod.PUT)
    public String Oauth(@RequestParam("grantType" ) String grantType, @RequestParam("userName")String userName, @RequestParam("value")String value ) {

        if ((grantType != null) && (userName != null) && (value) != null) {
            Token token = new Token();
            token.setAccessSession("x-ekvwdcqrg57vhe0b48an6o09anqog5c6fxamkafso8oatdk75e89mp5jnx7uld6rry44ur6rrvldiodhnv447v7t3zrvfu7xrt1jnxnz5ek9le6knwjvnz9hil45jz4a");
            token.setRoaRand("1eb27008a7ba82a424954e5a32f903b45c0560279ad476da");
            token.setExpires(1800);
            String authStr = JSONObject.toJSONString(token);

            return authStr;
        }
        return "error";
    }


    @RequestMapping(value = "/resources", method = RequestMethod.POST)
    public String Resources(@RequestBody PostData postData) {
        Returning returning = new Returning();
        returning.setSuccess("true");
        returning.setMessage("file upload success.");
        String jsonStr = JSONObject.toJSONString(returning);
        System.out.println(postData.toString());

        return jsonStr;
    }

}
