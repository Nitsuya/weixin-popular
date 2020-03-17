package weixin.popular.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.account.GetaccountbasicinfoResult;
import weixin.popular.bean.account.Modifyheadimage;
import weixin.popular.client.LocalHttpClient;
import weixin.popular.util.JsonUtil;

import java.nio.charset.Charset;

/**
 * 账户信息
 *
 * @since 2.8.32
 * @author Nitsuya
 *
 */
public class AccountAPI extends BaseAPI {

	/**
	 * 获取基本信息
	 * @param accessToken accessToken
	 * @return result
	 */
	public static GetaccountbasicinfoResult getaccountbasicinfo(String accessToken) {
		HttpUriRequest httpUriRequest = RequestBuilder
				.get()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/account/getaccountbasicinfo")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(accessToken))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, GetaccountbasicinfoResult.class);
	}


	/**
	 * 修改头像<br>
	 * 修改小程序的头像
	 * @param access_token access_token
	 * @param modifyheadimage modifyheadimage
	 * @return result
	 */
	public static BaseResult modifyheadimage(String access_token, Modifyheadimage modifyheadimage){
		String json = JsonUtil.toJSONString(modifyheadimage);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/account/modifyheadimage")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}

	/**
	 * 修改功能介绍<br>
	 * @param access_token access_token
	 * @param signature signature
	 * @return result
	 */
	public static BaseResult modifyheadimage(String access_token, String signature){
		String json = String.format("{\"signature\":\"%s\"}", signature);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/account/modifysignature")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}
}
