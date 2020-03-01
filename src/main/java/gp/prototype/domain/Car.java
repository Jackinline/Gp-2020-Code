package gp.prototype.domain;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Car implements Serializable {
    private String chair;
    private String steeringWheel;
    private List<String> tyres;


    public Car deepClone() {
        String str = JSON.toJSONString(this);
//        System.out.println("JSON:"+str);
        return JSON.parseObject(str, Car.class);
    }

}
