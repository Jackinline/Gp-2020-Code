package gp.prototype;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import gp.prototype.domain.Car;
import gp.prototype.domain.CarBuilder;

public class Test {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.addChair("中文");
        builder.addSteeringWheel("������");
        builder.addTyres("ǰ����", "ǰ����", "������", "������", "��̥");
        Car car = builder.build();

        Car carCopy = car.deepClone();
        carCopy.setChair(null);
        carCopy.setSteeringWheel(null);
        //Car(chair=����, steeringWheel=������, tyres=[ǰ����, ǰ����, ������, ������, ��̥])
        System.out.println(car.toString());
        //Car(chair=null, steeringWheel=null, tyres=[ǰ����, ǰ����, ������, ������, ��̥])
        System.out.println(carCopy.toString());
        //false
        System.out.println(car.getTyres() == carCopy.getTyres());
    }
}
