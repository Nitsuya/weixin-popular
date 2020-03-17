package weixin.popular.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class StringResponseHandler {

	private static Logger logger = LoggerFactory.getLogger(StringResponseHandler.class);

	public static ResponseHandler<String> createResponseHandler(){
		return new StringResponseHandlerImpl(null);
	}

	public static class StringResponseHandlerImpl extends LocalResponseHandler implements ResponseHandler<String> {
		public StringResponseHandlerImpl(String uriId) {
			this.uriId = uriId;
		}

		@Override
		public String handleResponse(HttpResponse response)
				throws ClientProtocolException, IOException {
			int status = response.getStatusLine().getStatusCode();
            if (status >= 200 && status < 300) {
                HttpEntity entity = response.getEntity();
                String str = EntityUtils.toString(entity,"utf-8");
                logger.info("URI[{}] elapsed time:{} ms RESPONSE DATA:{}",super.uriId,System.currentTimeMillis()-super.startTime,str);
                return str;
            } else {
                throw new ClientProtocolException("Unexpected response status: " + status);
            }
		}
		
	}
}
