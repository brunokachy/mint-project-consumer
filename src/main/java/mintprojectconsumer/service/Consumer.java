package mintprojectconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

/**
 * @author Bruno Okafor 2020-06-27
 */
@Service
@Log4j2
public class Consumer {

	@KafkaListener(topics = "com.mintfintech.card_verified", groupId = "group_id")
	public void consume(String message) {
		log.info(String.format("#### -> Consumed message -> %s", message));
	}
}

