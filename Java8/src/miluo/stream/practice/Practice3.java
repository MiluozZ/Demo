package miluo.stream.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @className: Practice3
 * @description: Java8函数式编程习题
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Practice3 {
    public static void main(String[] args) {
        LinkedList<Album> albums = new LinkedList<>();
        Album a = new Album("张三", new LinkedList<>(Arrays.asList("法外狂徒", "厚大法学", "罗翔老师")));
        Album b = new Album("李四", new LinkedList<>(Arrays.asList("嘻嘻", "哈哈", "哼哼", "叽叽")));
        Album c = new Album("王五", new LinkedList<>(Arrays.asList("哦", "呦", "呵", "啧", "切")));
        Album d = new Album("赵六", new LinkedList<>(Arrays.asList("喜羊羊", "美羊羊")));
        albums.add(a);
        albums.add(b);
        albums.add(c);
        albums.add(d);

        List<Album> albums1 = moreThreeSongs(albums);
        albums1.forEach(album -> System.out.println(album.getName()));

    }

    //3.编写一个函数，接受专辑列表作为参数，返回一个由最多包含三首歌曲的专辑组成的列表
    private static List<Album> moreThreeSongs(List<Album> albums){
        return albums.stream().filter(album -> album.getSongs().size() <= 3).collect(Collectors.toList());
    }

    private static class Album{
        private String name;
        private List<String> songs;

        public Album(String name, List<String> songs) {
            this.name = name;
            this.songs = songs;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getSongs() {
            return songs;
        }

        public void setSongs(List<String> songs) {
            this.songs = songs;
        }
    }
}
