package com.think.第十章内部类;

import static com.think.第十章内部类.Parcel.*;

/**
 * Created by Yipw on 2018/11/20 0020.
 */
public class DemoTest {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        System.out.println(parcel);
        Parcel.Destination to = parcel.to("1");

        Parcel.Destination destination = parcel.new Destination("1");

        Contents contents = new Contents();
        System.out.println(contents.value());


    }
}
