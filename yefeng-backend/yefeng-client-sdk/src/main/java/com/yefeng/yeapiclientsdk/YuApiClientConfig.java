package com.yefeng.yeapiclientsdk;


import com.yefeng.yeapiclientsdk.client.YuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("yefeng.client")
@Data
@ComponentScan
public class YuApiClientConfig {

	private String accessKey;

	private String secretKey;

	@Bean
	public YuApiClient yuApiClient() {
		return new YuApiClient(accessKey, secretKey);
	}

}
