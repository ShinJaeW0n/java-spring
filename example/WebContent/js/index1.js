$(function() {
	let bannerAction = setInterval(ba, 3000); //(펑션, 시작될 시간) - 세팅하는것.
	$(".container").hover(function() { //컨테이너에 마우스가 올라갔을 때, hover는 마우스 올리,내리는 2개 펑션 필요함.
		clearInterval(bannerAction); //()안의 변수를 클리어 해달라.
	}, function() { //마우스 빠져나갈때
		bannerAction = setInterval(ba, 3000);
	});

	for(let i=0; i<3; i++){
	$("#c2Below > div").eq(i).css("background-image", "url('imgs/img" + (i+1) + ".jpg')");}

//	$("#c2Below > div").css("background-image" , "url('imgs/duckk.jpg, imgs/sun.jpg, imgs/wo.jpg')");
	
	$("div#c1Above > div").click(function() {
		$("div#c1Above > div").removeClass("active");
		$(this).addClass("active");
							//첫번째꺼 빼고
		$("div#contents1 > div:not(:first)").hide();
		$("div#contents1 > div").eq($(this).index()+1).show(); //div 인덱스 번호를 가져올 수 있다.
	});
	
	$("#pFoot > button").click(function() {
		$("#popup").fadeOut();
	});
});

//메소드 ba
function ba() {
	$(".container").animate({"left" : "-1200px"}, 1000, function() { // 1초 애니메이션 끝나고 난 후 다음 펑션 실행
			$(".container").css("left" , 0); //왼쪽이 0으로 바뀌는 순간 밑에
			$(".container > div:first").appendTo(".container"); //첫번째를 맨 마지막 컨테이너 뒤에 넣을거다.
		});
	}