/*
Data Type 
- 실수, 정수 자료형과 같은 여러종류의 데이터를 식별하는 형태
- 메모리 공간을 효율적으로 사용하고 2진수 데이터를 다양한 형태로
사용하기 위해 존재한다
- 문자형 [char]: 문자 하나를 저장하고자 할때 사용하는 자료형
메모리에 저장은 숫자로 저장됨
- 문자열형 [String]:문자 여러개를 저장하고자 할때 사용하는 자료형
- 정수형 [Integer]:정수값을 저장하고자 할때 사용하는 자료형
- 부동 소수점형[부동소수점형]:소수점을 포함하는 실수값을 저장하고자 할때 사용하는 자료형
- 논리형 [loical:Boolean]:변수의 참 거짓을 나타낼때 사용하는 자료형
true(참), false(거짓) 두가지 값을 지정
*/

public class Data_2 {

    public static void main(String[] hyi){
        char C = '단';
        String uu = "문자열";
        int one = 1234;
        float three = 10.00f;
        float f2 = 5.67e-3f;
        //16진수
        float f = 0x1.2p3f; //p뒤의 숫자는 2의 제곱지수
        double d = 3.14; //기본이 실수 타입이므로 접미사가 필요없음
        //float f = 3.14 오류 (double -> float 로 자동변환 불가)
        /*
        int 정수 double(기본)이기 때문에
        형변환 

        그래도 궁금함
        왜 더블이 기본일까

double(64비트)이 float(32비트)보다 정확도 높고 범위 넓음
CPU가 double 연산을 빠르게 처리할 수 있음
실수 계산에서 double을 더 자주 쓰기 때문에 기본으로 설정됨
        */
    }
    
}
