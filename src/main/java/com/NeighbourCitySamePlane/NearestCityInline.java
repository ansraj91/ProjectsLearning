package com.NeighbourCitySamePlane;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class NearestCityInline {


    public List<String> closestStraightCity(List <String> c, List <Integer> x, List <Integer> y, List <String> q) {

        HashMap<String,Point> cityLocationMap = new HashMap <>();
        HashMap<String, CityDistance> queryResult = new HashMap <>();
        List<String> result = new ArrayList<>();


        for(int i=0;i<c.size();i++){
           cityLocationMap.put(c.get(i), new Point(x.get(i),y.get(i)));
        }
        for(String queryCity: q){
                for(String cityName: cityLocationMap.keySet()){
                    int distance = getDistance(cityLocationMap.get(cityName), cityLocationMap.get(queryCity));
                    if(distance!=-1 && distance!=0){
                        if(!queryResult.containsKey(queryCity)){
                            queryResult.put(queryCity, new CityDistance(cityName,distance));
                        }else {
                            queryResult.put(queryCity,compareAndgetnearest(queryResult.get(queryCity), new CityDistance(cityName,distance)));
                        }

                    }
                }
                if(!queryResult.containsKey(queryCity)) queryResult.put(queryCity,new CityDistance("NONE",0));

                result.add(queryResult.get(queryCity).cityName);
        }

        return result;


    }

    static CityDistance compareAndgetnearest(CityDistance c1, CityDistance c2){

        if(c1.distance < c2.distance) return c1;
        else if(c1.distance > c2.distance) return c2;
        else if(c1.distance == c2.distance){
            if(c1.cityName.compareTo(c2.cityName) == -1) return c1;
            else return c2;
        }

        return c1;

    }

    static int getDistance(Point a, Point b){

        if((a.x-b.x) == 0||(a.y-b.y) ==0){

            return (Math.abs(a.x-b.x) + Math.abs(a.y-b.y));
        }else{
            return -1;
        }


    }

    class CityDistance{
        public String cityName;
        public int distance;

        CityDistance(String cityName, int distance){
            this.cityName = cityName;
            this.distance = distance;
        }
    }




    class Point{

        public int x,y;

        Point(int x,int y){
            this.x = x;
            this.y = y;

        }
    }

    public static void main(String str[]){
        List<String> cityName  = new ArrayList<> ();
       /* cityName.add("fastcity");
        cityName.add("bigbanana");
        cityName.add("xyz");
*/
        cityName.add("london");
        cityName.add("warsaw");
        cityName.add("hackerland");
        List<Integer> x = new ArrayList <>();
        /*x.add(23);
        x.add(23);
        x.add(23);
*/
        x.add(1);
        x.add(10);
        x.add(20);

        List<Integer> y = new ArrayList <>();
        /*y.add(1);
        y.add(10);
        y.add(20);*/
        y.add(1);
        y.add(10);
        y.add(20);

        List<String> query  = new ArrayList<> ();
        query.add("london");
        query.add("warsaw");
        query.add("hackerland");

        System.out.print(new NearestCityInline().closestStraightCity(cityName,x,y,query));
    }

}
