<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<meta charset="EUC-KR">
<script type="text/javascript"
	src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=pg43l9dp5c"></script>
<link href="./description.css" rel="stylesheet">

<title>사용자 위치 등록</title>
</head>
<script type="text/javascript">  
    var Request = function() {  
        this.getParameter = function(name) {  
            var rtnval = '';  
            var nowAddress = unescape(location.href);  
            var parameters = (nowAddress.slice(nowAddress.indexOf('?') + 1,  
                    nowAddress.length)).split('&');  
            for (var i = 0; i < parameters.length; i++) {  
                var varName = parameters[i].split('=')[0];  
                if (varName.toUpperCase() == name.toUpperCase()) {  
                    rtnval = parameters[i].split('=')[1];  
                    break;  
                }  
            }  
            return rtnval;  
        }  
    }  
    var request = new Request();  
</script>  
<body>
	<div id="map" style="width: 100%; height: 100vh"></div>
	<jsp:include page="firebase.jsp"></jsp:include>
		<script>
			var Name = request.getParameter("Name");
			// create naver map object
			var map = new naver.maps.Map('map', {
				center : new naver.maps.LatLng(35.889845, 128.6105),
				zoom : 17,
				minZoom : 17,
			});

			// add click listener
			naver.maps.Event.addListener(map, 'click', function(e) {
				xy_setting(e.coord.lat(), e.coord.lng(),Name);
				//alert(e.coord.lat() + ', ' + e.coord.lng());
				alert('현재 위치 등록이 완료되었습니다!');
			})
		</script>
		
	<div class="iw_inner">
		<h1>현재 있는 위치를 지도상에서 <br/> 클릭하여 등록해 주세요.</h1>
	</div>
</body>
</html>