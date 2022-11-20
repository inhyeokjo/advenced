package hello.advanced.add.v0;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

	public void save(String itemId) {
		//저장 로직
		if (itemId.equals("ex")) {
			throw new IllegalStateException("삐용 삐용");
		}
		sleep(1000);
	}

	private void sleep(int millis) {
		try{
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
