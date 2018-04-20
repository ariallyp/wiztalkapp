<html>
<head>
    <meta charset="UTF-8">
    <title>EASC用户同步</title>
</head>
<body>
 <div style="height: 800px; width: 80%; border: 1px solid; border-color: darkgrey">
    <form action="/app/pc/sycn/hb" method="post">
        
            <div class="" style="padding-top: 17px; height: 33px; width: 99%; background-color: #dcdcdc; margin-left: 8px; margin-top: 15px">
                <span style="font-size: 16px; color: #3f71d4; font-weight: bold; font-family: MicrosoftYaHei;margin-left: 12px;">同步设置</span>
            </div>
            <div style="width: 99%; font-size: 14px; color: #3f71d4; font-weight: bold; font-family: MicrosoftYaHei; margin-top: 15px; margin-left: 8px">
                <div style="padding-left: 68px; margin-top: 15px">
                  <span>同步模式:</span>
                  <input id="sync" type="radio" name="synp" value="1" />周期同步&nbsp;&nbsp;&nbsp;&nbsp;
                  <input id="insyn" type="radio" name="synp" value="2" />间隔性同步
                </div>
                <div class="synt" style="padding-left: 68px; margin-top: 15px">
                  <span>同步时间:</span>
                  <input id="radio1" type="radio" name="synt" value="d" />每天&nbsp;
           
                  <span style="position: absolute;margin-left: 6px;" id="timer1" ></span>
                </div>
                <div class="synt" style="padding-left: 138px; margin-top: 15px">
                    <input id="radio2" type="radio" name="synt" value="w" />每周&nbsp;
			        <select id="select1" name="week" style="height: 16px; width: 80px">
                        <option value="MON">周一</option>
                        <option value="TUE">周二</option>
                        <option value="WED">周三</option>
                        <option value="THU">周四</option>
                        <option value="FRI">周五</option>
                        <option value="SAT">周六</option>
                        <option value="SUN">周日</option>
                    </select>&nbsp;
	           
	                <span style="position: absolute;margin-left: 6px;" id="timer2" name="t2"></span>
                </div>
                <div class="synt" style="padding-left: 138px; margin-top: 15px">
                    <input id="radio3" type="radio" name="synt" value="m" />每月&nbsp;
			        <select id="select2" name="month" style="height: 16px; width: 80px">
                       <option value="01">01</option>
                       <option value="02">02</option>
                       <option value="03">03</option>
                       <option value="04">04</option>
                       <option value="05">05</option>
                       <option value="06">06</option>
                       <option value="07">07</option>
                       <option value="08">08</option>
                       <option value="09">09</option>
                       <option value="10">10</option>
                       <option value="11">11</option>
                       <option value="12">12</option>
                       <option value="13">13</option>
                       <option value="14">14</option>
                       <option value="15">15</option>
                       <option value="16">16</option>
                       <option value="17">17</option>
                       <option value="18">18</option>
                       <option value="19">19</option>
                       <option value="20">20</option>
                       <option value="21">21</option>
                       <option value="22">22</option>
                       <option value="23">23</option>
                       <option value="27">27</option>
                       <option value="25">25</option>
                       <option value="26">26</option>
                       <option value="27">27</option>
                       <option value="28">28</option>
                 </select>&nbsp;
	            
	             <span style="position: absolute;margin-left: 6px;" id="timer3" name="t3"></span>
              </div>

                <div id="time1" style="padding-left: 68px; margin-top: 15px">
                      <span>首次同步:</span>
                     
                      <span style="position: absolute;margin-left: 16px;" id="timer4" name="t4"></span>
                </div>
                <div id="time2" style="padding-left: 12px; margin-top: 15px">
                     <span>间隔时间（小时）：</span>
                     <input id="text2" name="jg" style="height: 16px; width: 140px" type="text" />
                </div>

                <div style="padding-left: 140px; margin-top: 15px">
                    <input type="submit" id="sub1" style="background-color: #3f71d4; color: #ffffff; height: 22px; width: 80px; border-radius: 5px; border: none; cursor:pointer"  value="设置" />
                </div>
            </div>

       
    </form>
    
    <form action="/app/pc/sycn/db" method="get">
        <div style="margin-top: 30px; height: 152px; width: 99%; border: 1px solid; border-color: darkgrey; margin-left: 8px">
            <div class="" style="padding-top: 17px; height: 33px; width: 100%; background-color: #dcdcdc">
                <span style="font-size: 16px; color: #3f71d4; font-weight: bold; font-family: MicrosoftYaHei; margin-left: 12px;">同步操作</span>
            </div>
            <div class="" style="padding-left: 531px">
                <input style="font-size: 16px; background-color: #3f71d4; color: #ffffff; font-family: MicrosoftYaHei; margin-top: 34px; height: 40px; width: 320px; border-radius: 5px; border: none; cursor:pointer" type="submit"  value="即时同步用户数据"/>
            </div>
        </div>

    </form>
</div>
</body>
<script type="text/javascript" src="${jsRoot}/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${jsRoot}/jquery/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${jsRoot}/timer/timer.js"></script>
<script type="text/javascript">
        $(function () {
            $("#sync").click(function () {  
            	
                $(".synt").css({ "color": "#3f71d4" });
                $("#time1").css({ "color": "#dcdcdc" });
                $("#time2").css({ "color": "#dcdcdc" });
                $("#select1").attr("disabled", false);
                $("#select2").attr("disabled", false);
                $("#text2").attr("disabled", true);
                $("#radio1").attr("disabled", false);
                $("#radio2").attr("disabled", false);
                $("#radio3").attr("disabled", false);
                $("#time1").attr("disabled", true);
                $("#time2").attr("disabled", true);
                
            });
            $("#insyn").click(function () {
            	
                $("#time1").css({ "color": "#3f71d4" });
                $("#time2").css({ "color": "#3f71d4" });
                $(".synt").css({ "color": "#dcdcdc" });
                $("#select1").attr("disabled", true);
                $("#select2").attr("disabled", true);
                $("#text2").attr("disabled", false);
                $("#radio1").attr("disabled", true);
                $("#radio2").attr("disabled", true);
                $("#radio3").attr("disabled", true);
                $("#time1").attr("disabled", false);
                $("#time2").attr("disabled", false);
                
            });
            
           
            $("#radio1").click(function(){
            	$("#select1").attr("disabled", true);
                $("#select2").attr("disabled", true);
            });
            $("#radio2").click(function(){
            	$("#select1").attr("disabled", false);
                $("#select2").attr("disabled", true);
            });
            $("#radio3").click(function(){
            	$("#select2").attr("disabled", false);
                $("#select1").attr("disabled", true);
            });
            $("#text1").click(function () {
                $("#text1").hide();
               
            });    
            $("#text4").click(function () {
                $("#text4").hide();
            });
            $("#text5").click(function () {
                $("#text5").hide();
            });
            $("#text6").click(function () {
                $("#text6").hide();
            });

           showTimer('timer1');
               showTimer('timer2');
                   showTimer('timer3');
                   showTimer('timer4');
        });

    </script>
</html>
