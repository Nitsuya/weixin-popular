package weixin.popular.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import weixin.popular.bean.BaseResult;
import weixin.popular.bean.wxopen.*;
import weixin.popular.client.LocalHttpClient;
import weixin.popular.util.JsonUtil;

import java.nio.charset.Charset;
import java.util.List;

/**
 * 微信小程序
 * @author LiYi, Nitsuya
 * @since 2.8.18
 */
public class WxopenAPI extends BaseAPI {
	
	/**
	 * 获取公众号关联的小程序
	 * @since 2.8.18
	 * @param access_token access_token
	 * @return result
	 */
	public static WxamplinkgetResult wxamplinkget(String access_token){
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/wxamplinkget")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,WxamplinkgetResult.class);
	}
	
	/**
	 * 关联小程序
	 * @since 2.8.18
	 * @param access_token access_token
	 * @param wxamplink wxamplink
	 * @return result
	 */
	public static BaseResult wxamplink(String access_token,Wxamplink wxamplink){
		String json = JsonUtil.toJSONString(wxamplink);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/wxamplink")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}
	
	/**
	 * 解除已关联的小程序
	 * @since 2.8.18
	 * @param access_token access_token
	 * @param appid appid
	 * @return result
	 */
	public static BaseResult wxampunlink(String access_token,String appid){
		String json = String.format("{\"appid\":\"%s\"}", appid);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/wxampunlink")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}

	/**
	 * 获取小程序模板库标题列表
	 * @since 2.8.18
	 * @param access_token access_token
	 * @param offset offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。
	 * @param count offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。
	 * @return result
	 */
	public static TemplateLibraryListResult templateLibraryList(String access_token,int offset,int count){
		String json = String.format("{\"offset\":%d,\"count\":%d}", offset, count);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/template/library/list")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,TemplateLibraryListResult.class);
	}
	
	/**
	 * 获取模板库某个模板标题下关键词库
	 * @since 2.8.18
	 * @param access_token access_token
	 * @param id 模板标题id，可通过接口获取，也可登录小程序后台查看获取
	 * @return result
	 */
	public static TemplateLibraryGetResult templateLibraryGet(String access_token,String id){
		String json = String.format("{\"id\":\"%s\"}", id);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/template/library/get")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,TemplateLibraryGetResult.class);
	}
	
	/**
	 * 组合模板并添加至帐号下的个人模板库
	 * @since 2.8.18
	 * @param access_token access_token
	 * @param id 模板标题id，可通过接口获取，也可登录小程序后台查看获取
	 * @param keyword_id_list 开发者自行组合好的模板关键词列表，关键词顺序可以自由搭配（例如[3,5,4]或[4,5,3]），最多支持10个关键词组合
	 * @return result
	 */
	public static TemplateAddResult templateAdd(String access_token,String id,List<Integer> keyword_id_list){
		String json = String.format("{\"id\":\"%s\",\"keyword_id_list\":%s}", id,JsonUtil.toJSONString(keyword_id_list));
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/template/add")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,TemplateAddResult.class);
	}
	
	/**
	 * 获取帐号下已存在的模板列表
	 * @since 2.8.18
	 * @param access_token access_token
	 * @param offset offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。最后一页的list长度可能小于请求的count
	 * @param count offset和count用于分页，表示从offset开始，拉取count条记录，offset从0开始，count最大为20。最后一页的list长度可能小于请求的count
	 * @return result
	 */
	public static TemplateListResult templateList(String access_token,int offset,int count){
		String json = String.format("{\"offset\":%d,\"count\":%d}", offset, count);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/template/list")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,TemplateListResult.class);
	}
	
	/**
	 * 删除帐号下的某个模板
	 * @since 2.8.18
	 * @param access_token access_token
	 * @param template_id 要删除的模板id
	 * @return result
	 */
	public static BaseResult templateDel(String access_token,String template_id){
		String json = String.format("{\"template_id\":\"%s\"}", template_id);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/template/del")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}

	/**
	 * 查询当前设置的最低基础库版本及各版本用户占比<br>
	 * @since 2.8.32
	 * @param access_token access_token
	 * @return result
	 */
	public static GetweappsupportversionResult getweappsupportversion(String access_token){
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/getweappsupportversion")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity("{}",Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,GetweappsupportversionResult.class);
	}

	/**
	 * 设置最低基础库版本<br>
	 * @since 2.8.32
	 * @param access_token access_token
	 * @param version  	为已发布的基础库版本号
	 * @return result
	 */
	public static BaseResult setweappsupportversion(String access_token, String version){
		String json = String.format("{\"version\":\"%s\"}",version);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/setweappsupportversion")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}

	/**
	 * 普通链接二维码<br>
	 * 获取已设置的二维码规则
	 * @since 2.8.32
	 * @param access_token access_token
	 * @return result
	 */
	public static QrcodejumpgetResult qrcodejumpget(String access_token){
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/qrcodejumpget")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, QrcodejumpgetResult.class);
	}

	/**
	 * 普通链接二维码<br>
	 * 获取校验文件名称及内容
	 * @since 2.8.32
	 * @param access_token access_token
	 * @return result
	 */
	public static QrcodejumpdownloadResult qrcodejumpdownload(String access_token){
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/qrcodejumpdownload")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, QrcodejumpdownloadResult.class);
	}

	/**
	 * 普通链接二维码<br>
	 * 增加或修改二维码规则
	 * @since 2.8.32
	 * @param access_token access_token
	 * @param qrcodejumpadd qrcodejumpadd
	 * @return result
	 */
	public static BaseResult qrcodejumpadd(String access_token, Qrcodejumpadd qrcodejumpadd){
		String json = JsonUtil.toJSONString(qrcodejumpadd);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/qrcodejumpadd")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, BaseResult.class);
	}

	/**
	 * 普通链接二维码<br>
	 * 发布已设置的二维码规则
	 * @since 2.8.32
	 * @param access_token access_token
	 * @param prefix  二维码规则
	 * @return result
	 */
	public static BaseResult qrcodejumppublish(String access_token, String prefix){
		String json = String.format("{\"prefix\":\"%s\"}",prefix);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/qrcodejumppublish")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}

	/**
	 * 普通链接二维码<br>
	 * 删除已设置的二维码规则
	 * @since 2.8.32
	 * @param access_token access_token
	 * @param prefix  二维码规则
	 * @return result
	 */
	public static BaseResult qrcodejumpdelete(String access_token, String prefix){
		String json = String.format("{\"prefix\":\"%s\"}",prefix);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/qrcodejumpdelete")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest,BaseResult.class);
	}

	/**
	 * <strong>类目管理</strong><br>
	 * 获取可以设置的所有类目
	 * @since 2.8.32
	 * @param access_token access_token
	 * @return result
	 */
	public static GetallcategoriesResult getallcategories(String access_token){
		HttpUriRequest httpUriRequest = RequestBuilder.get()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/getallcategories")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, GetallcategoriesResult.class);
	}
	/**
	 * <strong>类目管理</strong><br>
	 * 获取已设置的所有类目
	 * @since 2.8.32
	 * @param access_token access_token
	 * @return result
	 */
	public static GetcategoryResult getcategory(String access_token){
		HttpUriRequest httpUriRequest = RequestBuilder.get()
				.setHeader(jsonHeader)
				.setUri(BASE_URI + "/cgi-bin/wxopen/getcategory")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, GetcategoryResult.class);
	}

	/**
	 * <strong>类目管理</strong><br>
	 * 添加类目
	 * @since 2.8.32
	 * @param access_token access_token
	 * @param addcategory addcategory
	 * @return result
	 */
	public static BaseResult addcategory(String access_token, Addcategory addcategory){
		String json = JsonUtil.toJSONString(addcategory);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/addcategory")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, BaseResult.class);
	}

	/**
	 * <strong>类目管理</strong><br>
	 * 修改类目资质信息
	 * @since 2.8.32
	 * @param access_token access_token
	 * @param modifycategory modifycategory
	 * @return result
	 */
	public static BaseResult deletecategory(String access_token, Modifycategory modifycategory){
		String json = JsonUtil.toJSONString(modifycategory);
		HttpUriRequest httpUriRequest = RequestBuilder.post()
				.setHeader(jsonHeader)
				.setUri(BASE_URI+"/cgi-bin/wxopen/modifycategory")
				.addParameter(PARAM_ACCESS_TOKEN, API.accessToken(access_token))
				.setEntity(new StringEntity(json,Charset.forName("utf-8")))
				.build();
		return LocalHttpClient.executeJsonResult(httpUriRequest, BaseResult.class);
	}
}
