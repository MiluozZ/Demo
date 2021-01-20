package miluo.stream.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Practice2
 * @description:
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Practice2 {
    public static void main(String[] args) {
        //2
        LinkedList<Artist> artists = new LinkedList<>();
        artists.add(new Artist("张三","中国",18,"男"));
        artists.add(new Artist("阿三","印度",19,"男"));
        artists.add(new Artist("朴信惠","韩国",20,"女"));
        artists.add(new Artist("新垣结衣","日本",20,"女"));

        List<String> list = getNameAndCountry(artists);
        list.forEach(System.out::println);
    }
    //2.编写一个函数，接受艺术家列表作为参数，返回一个字符串列表，其中包含艺术家的姓名和国籍
    private static List<String> getNameAndCountry(List<Artist> artists){
        return artists.stream().flatMap(artist -> Stream.of(artist.getName(),artist.getCountry())).collect(Collectors.toList());
    }

    private static class Artist{
        private String name;
        private String country;
        private int age;
        private String sex;

        private Artist(String name,String country,int age,String sex){
            this.name = name;
            this.country = country;
            this.age = age;
            this.sex = sex;
        }


        String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }


}
