package com.think.第十章内部类;

/**
 * Created by Yipw on 2018/11/20 0020.
 */
public class Parcel {

    private int iiii = 10;

    private String aaa = "abcdefg";

    static class Contents {
        private int i = 1;

        public int value() {
            return i;
        }

    }

    class Destination {
        private String a;

        Destination(String ab) {
            a = ab;
        }

        String readA() {
            return aaa;
        }

        void change() {
            aaa = "s;ladjf;aljfl";
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String test) {
        Contents contents = contents();
        Destination d = to("ss");
        System.out.println(d.readA());
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        Contents contents = p.contents();
        Destination s = p.to("S");
        System.out.println(s.readA());
        System.out.println(contents.value());
        s.change();
        System.out.println("================");
        System.out.println(p.iiii);
        System.out.println(p.aaa);
    }

}
