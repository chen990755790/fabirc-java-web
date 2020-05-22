package com.ideal.blockchain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync  // �����첽����
public class AsyncConfiguration {

    // ����һ���̳߳�(��ָ���̳߳ص�����)
    @Bean("taskExecutor")
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //�����߳���5���̳߳ش���ʱ���ʼ�����߳���
        executor.setCorePoolSize(10);
        //����߳���5���̳߳������߳�����ֻ���ڻ����������֮��Ż����볬�������߳������߳�
        executor.setMaxPoolSize(20);
        //�������500����������ִ������Ķ���
        executor.setQueueCapacity(50);
        //�����̵߳Ŀ���ʱ��60�룺�������˺����̳߳�֮����߳��ڿ���ʱ�䵽��֮��ᱻ����
        executor.setKeepAliveSeconds(60);
        //�̳߳�����ǰ׺�����ú���֮����Է������Ƕ�λ�����������ڵ��̳߳�
        executor.setThreadNamePrefix("DailyAsync-");
        executor.initialize();
        return executor;
    }
}
