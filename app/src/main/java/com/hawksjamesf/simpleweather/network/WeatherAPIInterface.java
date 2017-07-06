package com.hawksjamesf.simpleweather.network;

import com.hawksjamesf.simpleweather.bean.RealTimeBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
/**
 * Copyright ® $ 2017
 * All right reserved.
 * Code Link : https://github.com/HawksJamesf/SimpleWeather
 *  @author: hawks jamesf
 *  @since: 2017/7/4
 */
public interface WeatherAPIInterface {
//    realtime url
//        https://api.caiyunapp.com/v2/TAkhjf8d1nlSlspN/121.6544,25.1552/realtime.json
//
//        https://api.caiyunapp.com/v2/TAkhjf8d1nlSlspN/121.6544,25.1552/realtime.jsonp?callback=MYCALLBACK
//
//    fifteen forecast url
//        https://api.caiyunapp.com/v2/TAkhjf8d1nlSlspN/121.6544,25.1552/forecast.json
//
//        https://api.caiyunapp.com/v2/TAkhjf8d1nlSlspN/121.6544,25.1552/forecast.jsonp?callback=MYCALLBACK


    @GET("v2/TAkhjf8d1nlSlspN/121.6544,25.1552/{filename}.json")
    Call<RealTimeBean>  getRealTimeData(@Path("filename") String filename);

//    @GET("v2/TAkhjf8d1nlSlspN/121.6544,25.1552/{filename}.json")
//    Call<FifteenBean>  getFifteenData(@Path("filename") String filename);



}
