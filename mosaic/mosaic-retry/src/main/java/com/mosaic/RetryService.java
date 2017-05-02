package com.mosaic;

import java.util.Random;

import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public class RetryService {

	@Retryable(value = {
			RemoteAccessException.class }, maxAttempts = 5, backoff = @Backoff(delay = 5000l, multiplier = 1) )
	public void retryTest() throws Exception {
		int s = randomNum(0, 100);
		if (s < 50) {
			System.out.println("调用成功,随机数：" + s);
		} else {
			System.out.println("调用失败，随机数" + s + ",5秒后重复调用");
			throw new RemoteAccessException("RemoteAccessException....");
		}
	}

	@Recover
	public void recover(RemoteAccessException e) {
		System.out.println("重试失败，抛出异常");
		System.out.println(e.getMessage());
	}

	public int randomNum(int min, int max) {
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}
}
