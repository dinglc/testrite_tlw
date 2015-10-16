// JavaScript Document
function animate(){	
//mobileNav
$('.mobileMenu').find('a').click(function(){
		$('#mobileNav').toggle();
	})

//進入頁面移動
function pageMoving(){
var _body = (window.opera) ? (document.compatMode == "CSS1Compat" ? $('html') : $('body')) : $('html,body');
	_body.delay(200).animate({
		scrollTop: $('header').offset().top
		},500,'');
return false;
}
$('.btnTop>a').on('click',pageMoving);

}

//左側商品欄位切換
 $('.MainCategory>.leftNav>ul').hide();
 $('.MainCategory .leftNav .title-3').css('cursor','pointer');
 $('.MainCategory .leftNav .title-3').click(function(){
	 $('.MainCategory .leftNav>ul').hide(300);
	 $(this).parent().find('ul').show(300);
	 })
 $('.MainCategory .leftNav .title-3').eq(0).click();

 //商品切換
 function changePrd(){
	var _index=$(this).parent().index();
	//alert(_index);
	$('.itemRank article>div').hide();
    $('.itemRank .brandBtn>div').find('button').removeClass('active');
    $('.itemRank article>div').eq(_index).show(); 
	$('.itemRank .brandBtn>div').eq(_index).find('button').addClass('active');
	}
$('.itemRank .brandBtn>div').find('button').on('click',changePrd);
$('.itemRank .brandBtn>div').eq(0).find('button').click();

//品牌商品切換
 function changePrd2(){
	var _index=$(this).parent().index();
	//alert(_index);
	$('.brandSub article>div').hide();
    $('.brandSub .brandBtn>div').find('button').removeClass('active');
    $('.brandSub article>div').eq(_index).show(); 
	$('.brandSub .brandBtn>div').eq(_index).find('button').addClass('active');
	}
$('.brandSub .brandBtn>div').find('button').on('click',changePrd2);
$('.brandSub .brandBtn>div').eq(0).find('button').click();

//文章切換
 function changePrd3(){
	var _index=$(this).parent().index();
	//alert(_index);
	$('.itemOtherTxt article').hide();
    $('.itemOtherTxt .articleBtn>div').find('button').removeClass('active');
    $('.itemOtherTxt article').eq(_index).show(); 
	$('.itemOtherTxt .articleBtn>div').eq(_index).find('button').addClass('active');
	}
$('.itemOtherTxt .articleBtn>div').find('button').on('click',changePrd3);
$('.itemOtherTxt .articleBtn>div').eq(0).find('button').click();


//初始動畫
$(function(){
	animate();
})