package weixin.popular.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import weixin.popular.bean.wxverify.CheckwxverifynicknameResult;
import weixin.popular.client.LocalHttpClient;

import java.nio.charset.Charset;

/**
 * 认证接口
 *
 * @since 2.8.32
 * @author Nitsuya
 *
 */
public class WxverifyAPI extends BaseAPI {

	/**
	 * 微信认证名称检测 <br>
	 * 微信认证的名称是否符合规则
	 * @since 2.8.32
	 * @param access_token access_token
	 * @param nickName 名称（昵称）
	 * @return result
	 */
	public static CheckwxverifynicknameResult checkwxverifynickname(String access_token, String nickName){
		String json = String.format("{\"nick_name\":\"%s\"}", nickName);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxverify/checkwxverifynickname")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json, Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, CheckwxverifynicknameResult.class);
	}

}
