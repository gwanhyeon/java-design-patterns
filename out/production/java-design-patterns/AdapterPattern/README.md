# Adapter Pattern

연관성 없는 두 객체를 묶어서 사용한다.

# 학습 목표

알고리즘을 요구사항에 맞춰 사용할 수 있다.

### 의미

Adapter는 사전적의미로는 기계 기구등을 다목적으로 사용하기 위한 부가 기구라고 할 수 있습니다.

### 기본 설계

![Adapter](https://online.visual-paradigm.com/repository/images/2e728499-b25b-4b5b-9cb8-1b3b3e059966.png)

### 요구사항

두 수에 대한 다음 연산을 수행하는 객체를 만들기

1. 수의 두 배의 수를 반환: twiceOf(Float):Float
2. 수의 half의 수를 반환: halfOf(Float):Float

구현 객체의 이름은 Adapter

Math클래스에서 두배와 절반을 구하는 함수는 이미 구현되어 있습니다.
