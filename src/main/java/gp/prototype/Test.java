package gp.prototype;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import gp.prototype.domain.Car;
import gp.prototype.domain.CarBuilder;

public class Test {
    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();
        builder.addChair("椅子");
        builder.addSteeringWheel("方向盘");
        builder.addTyres("前左轮", "前右轮", "后左轮", "后右轮", "备胎");
        Car car = builder.build();

        Car carCopy = car.deepClone();
        carCopy.setChair(null);
        carCopy.setSteeringWheel(null);
        System.out.println(car.toString());
        System.out.println(carCopy.toString());

        System.out.println(car.getTyres() == carCopy.getTyres());


    }
}
