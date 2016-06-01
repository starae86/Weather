package com.ae86.myWeather.util;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
