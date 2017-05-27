package com.mosaic.highlight_springmvc4.web.ch4_5;

import com.mosaic.highlight_springmvc4.demain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 刘亚飞 on 2017/5/27.
 */
@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public @ResponseBody DemoObj converter(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
