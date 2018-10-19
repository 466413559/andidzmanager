$(function(){
			// 预计开工时间和预计完工时间 datetimepicker插件
			$("#exampleInputStartProduce1,#exampleInputEndProduce1").datetimepicker({//选择年月日
				　　　　　　format: 'yyyy年mm月dd日 HH点mm分',
				　　　　　　language: 'zh-CN',
				　　　　　　weekStart: 1,
　　　　　　todayBtn: 1,//显示‘今日’按钮
　　　　　　autoclose: 1,
　　　　　　todayHighlight: 1,
　　　　　　startView: 2,
　　　　　　minView: 0,  
　　　　　　clearBtn:true,//清除按钮
　　　　　　forceParse: 0
　　　　   });　
			// 工艺复选框全选
			$("#SelectProcess input[type='checkbox']").prop("checked",true);
			  // 侧边导航栏动画移入移出
			  $("#nav-sidebar-switch").click(function () {

			  	// $("#nav-sidebar").animate({display:'none';});
            var navsidebar = $("#nav-sidebar");
            if (navsidebar.hasClass("show-nav")) {
                    navsidebar.addClass("hide-nav").removeClass("show-nav");

            }
            else {
                    navsidebar.addClass("show-nav").removeClass("hide-nav");
            }
        });
//      $(function () {
//   $(".faq-tabbable").find("li").each(function () {
//     var a = $(this).find("a:first")[0];
//     if ($(a).attr("href") === location.pathname) {
//       $(this).addClass("active");
//     } else {
//       $(this).removeClass("active");
//     }
//   });
// })


	
})

