package com.example.commonutilities.commonutilitiesapp.helper;

public class RequestToResponse {
	//
//	public static String getResponseForTheNewGETRequest_WithBlankParams(String method_name, String url) {
//		url = url.replaceAll("%2526","&");
//
//		String response_str = "";
//		try {
//			// Creating HTTP client
//			OkHttpClient client = new OkHttpClient();
//			Request request = new Request.Builder()
//					.url(url)
//					.build();
//			com.squareup.okhttp.Response rp = client.newCall(request).execute();
//
//
//			// Making HTTP Request
//
//			Log.d("Http Request", url);
////			if(!url.contains(AppGlobalConstants.WEBSERVICE_UPDATE_USER)) {
////			}
////			}
//			// writing response to log
//			response_str =  rp.body().string();
//			Log.d("Http Response", method_name + ": " + response_str);
//		} catch (IOException e) {
//			// writing exception to log
//			e.printStackTrace();
//
//		} catch (IllegalStateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return response_str;
//	}
}