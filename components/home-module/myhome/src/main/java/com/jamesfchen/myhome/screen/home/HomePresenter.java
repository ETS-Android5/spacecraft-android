package com.jamesfchen.myhome.screen.home;

import com.jamesfchen.mvp.RxPresenter;

import java.util.HashMap;

/**
 * Copyright ® $ 2017
 * All right reserved.
 * Code Link : https://github.com/HawksJamesf/Spacecraft
 *
 * @author: jamesfchen
 * @since: 1/24/18
 */

public class HomePresenter extends RxPresenter<HomeActivity> implements HomeContract.Presenter {

    public HomePresenter() {
    }

    @Override
    public void load() {


        HashMap<String, String> map = new HashMap<>();
//        DataRequestFactory.create()
//                .all(map)
//                .subscribeOn(Schedulers.io())
//                .observeOn()
    }
}
