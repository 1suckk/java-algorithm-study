package 주앤.ch19;

/*
문제 : L461. 해밍거리
풀이 : [다른코드] 비트연산자를 사용
못 푼 이유 :
	- xor 연산 결과-> 서로 다른 비트는 1, 같으면 0
	- 쉬프트 연산 활용
		- 비트 조작할 때 유용
		- 2의 거듭제곱 수 연산하기 쉬움. 왼쪽 시프트는 곱셈, 오른쪽 시프트는 나눗셈
 */
public class P77_2 {
	public int hammingDistance(int x, int y) {
		int count = 0;          // 해밍 거리를 세기 위한 변수
		int r = x ^ y;          // 두 정수를 XOR 연산하여 각 비트 위치에서 다른 비트를 찾음

		// r의 각 비트를 오른쪽으로 이동하면서 확인
		while (r > 0) {
			// 현재 비트 위치에서 다른 비트가 있는지 확인
			if ((r & 1) == 1) { // 가장 오른쪽 비트가 1인지 확인
				count++;         // 다른 비트가 있다면 count 증가
			}
			r = r >> 1;          // 다음 비트 위치로 이동
		}

		return count;           // 최종적으로 계산된 해밍 거리 반환
	}
}
