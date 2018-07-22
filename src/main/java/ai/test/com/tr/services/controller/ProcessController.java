package ai.test.com.tr.services.controller;

import ai.test.com.tr.model.input.RequestSum;
import ai.test.com.tr.model.output.ResponseSum;
import ai.test.com.tr.services.internal.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    @ResponseBody
    public ResponseSum sum(@RequestBody RequestSum requestSum){
        ResponseSum responseSum=new ResponseSum();
        try {
            int result = processService.sum(requestSum.getFirstNumber(),requestSum.getSecondNumber());
            responseSum.setResult(result);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return responseSum;
    }
}
