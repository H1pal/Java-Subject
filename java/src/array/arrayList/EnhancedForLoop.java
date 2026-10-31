package array.arrayList;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        // 기존 for 반복문: 배열 순회를 인덱스로 직접 접근하도록 설계해야 함
        for (int i = 0;i < strArray.length;i++) System.out.println(strArray[i]);
        // 향상된 for 반복문: 배열 순회에서 각 element를 바로 변수에 저장
        for (String str: strArray) System.out.println(str);
    }
}
