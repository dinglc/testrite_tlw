// JavaScript Document
function animate(){	
//mobileNav
$('.mobileMenu').find('a').click(function(){
		$('#mobileNav').toggle();
	});
	
//進入頁面移動
function pageMoving(){
var _body = (window.opera) ? (document.compatMode === "CSS1Compat" ? $('html') : $('body')) : $('html,body');
	_body.delay(200).animate({
		scrollTop: $('header').offset().top
		},500,'');
return false;
}
$('.btnTop>a').on('click',pageMoving);

//左側中分類欄位切換
 $('.MainCategory>.leftNav>ul').hide();
 $('.MainCategory .leftNav .title-3').css('cursor','pointer');
 $('.MainCategory .leftNav .title-3').click(function(){
	 $('.MainCategory .leftNav>ul').hide(300);
	 $(this).parent().find('ul').show(300);
	 });

 
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


//品牌切換
 function brandTab(){
	var _index=$(this).parent().index();
	//alert(_index);
	$('.brandTab>div').find('a').removeClass('active');
	$('.brandTab>div').eq(_index).find('a').addClass('active');
	$('.brandPrd article').hide();
    $('.brandPrd article').eq(_index).show(); 

	return false;
}

$('.brandPrd .brandTab>div').find('a').on('click',brandTab);
$('.brandPrd .brandTab>div').eq(0).find('a').click();

$('.m_brandTab li').find('a').on('click',brandTab);
$('.m_brandTab li').eq(0).find('a').click();


//商品切換
$('.mainItem .itemIcon img').on('click',changeBimg);
$('.mainItem .itemIcon li').eq(0).find('img').click();

function changeBimg(){
	var _img=$(this).attr('src');
	$('.mainItem .active').removeClass('active');
	$(this).addClass('active');
	$('.mainItem .itemImg img').attr('src',_img);
 }

//文章切換
 
$('.itemOtherTxt .articleBtn>div').find('button').on('click',changePrd3);
$('.itemOtherTxt .articleBtn>div').eq(0).find('button').click();

 function changePrd3(){
	var _index=$(this).parent().index();
	//alert(_index);
	$('.itemOtherTxt article').hide();
   	$('.itemOtherTxt .active').removeClass('active');
	$('.itemOtherTxt .articleBtn>div').eq(_index).find('.btn').addClass('active');
    $('.itemOtherTxt article').eq(_index).show(); 
	
  }


}//animateEnd

//幾層分類
 function categoryOpen(E){
	 $('.MainCategory .leftNav .title-3').eq(E).click(); 
	  //categoryOpen(0);
 }

//初始動畫
$(function(){animate();});