<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>注册</title>
		<!-- bootstrap样式，地图插件使用 -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<body style="background: #EEEEEE; ">


		<div id="app">

			<!-- 轮播图 -->
			<div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div>
			<!-- 轮播图 -->

			<div class="data-add-container">

				<form class="layui-form layui-form-pane" lay-filter="myForm">
					
                                                            <div class="layui-form-item" pane>
						<label class="layui-form-label">视频编号：</label>
						<div class="layui-input-block">
							<input v-model="detail.shipinbianhao" type="text" name="shipinbianhao" id="shipinbianhao" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
                        <label class="layui-form-label">视频分类</label>
                        <div class="layui-input-block">
                            <select name="shipinfenlei" id="shipinfenlei" lay-filter="shipinfenlei">
                                <option value="">请选择</option>
                                <option v-for="(item,index) in shipinfenlei" v-bind:key="index" :value="item">{{item}}</option>
                            </select>
                        </div>
                    </div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">视频名称：</label>
						<div class="layui-input-block">
							<input v-model="detail.shipinmingcheng" type="text" name="shipinmingcheng" id="shipinmingcheng" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">视频封面：</label>
						<div v-if="detail.shipinfengmian" class="layui-input-block">
							<img id="shipinfengmianImg" style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;" :src="detail.shipinfengmian">
							<input type="hidden" :value="detail.shipinfengmian" id="shipinfengmian" name="shipinfengmian" />
						</div>
						<div class="layui-input-block">
							<button type="button" class="layui-btn btn-theme" id="shipinfengmianUpload">
								<i class="layui-icon">&#xe67c;</i>上传视频封面
							</button>
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">视频：</label>
						<div v-if="detail.shipin" class="layui-input-block">
							<video style="width: 100%;" :src="detail.shipin" controls="controls">
								您的浏览器不支持视频播放
							</video>
                            <input type="hidden" :value="detail.shipin" id="shipin" name="shipin" />
						</div>
						<div class="layui-input-block">
							<button type="button" class="layui-btn btn-theme" id="shipinUpload">
								<i class="layui-icon">&#xe67c;</i>上传视频
							</button>
						</div>
					</div>
                                                                                                                                            <div class="layui-form-item" pane>
						<label class="layui-form-label">发布日期：</label>
						<div class="layui-input-block">
							<input type="text" name="faburiqi" id="faburiqi" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">用户账号：</label>
						<div class="layui-input-block">
							<input v-model="detail.yonghuzhanghao" type="text" name="yonghuzhanghao" id="yonghuzhanghao" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">用户姓名：</label>
						<div class="layui-input-block">
							<input v-model="detail.yonghuxingming" type="text" name="yonghuxingming" id="yonghuxingming" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">最近点击时间：</label>
						<div class="layui-input-block">
							<input type="text" name="clicktime" id="clicktime" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                                                <div class="layui-form-item" pane>
						<label class="layui-form-label">点击次数：</label>
						<div class="layui-input-block">
							<input v-model="detail.clicknum" type="text" name="clicknum" id="clicknum" autocomplete="off" class="layui-input">
						</div>
					</div>
                                                            
                                                                                                                                                                                                                                                                    <div class="layui-form-item" pane>
						<label class="layui-form-label">视频介绍：</label>
						<div class="layui-input-block">
							<textarea name="shipinjieshao" id="shipinjieshao">请输入视频介绍</textarea>
						</div>
					</div>
                                                                                                                                                                                                                                                
					<div class="layui-form-item">
						<div class="layui-input-block" style="text-align: right;margin-right: 30px;">
							<button class="layui-btn btn-submit" lay-submit lay-filter="*">提交</button>
							<button type="reset" class="layui-btn layui-btn-primary">重置</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<!-- 校验格式工具类 -->
		<script src="../../js/validate.js"></script>
		<!-- 地图 -->
		<script type="text/javascript" src="../../js/jquery.js"></script>
		<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
		<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

		<script>
			var jquery = $;
			
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					dataList: [],
                    detail: {
                                                                        shipinbianhao: genTradeNo(),
                                                                                                shipinfenlei: '',
                                                                                                shipinmingcheng: '',
                                                                                                shipinfengmian: '',
                                                                                                shipin: '',
                                                                                                shipinjieshao: '',
                                                                                                faburiqi: '',
                                                                                                yonghuzhanghao: '',
                                                                                                yonghuxingming: '',
                                                                                                clicktime: '',
                                                                                                clicknum: '',
                                                                    },
                    																				shipinfenlei: [],
																																																																																																									centerMenu: centerMenu
				},
				updated: function() {
					layui.form.render('select', 'myForm');
				},
                computed: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        },
				methods: {
					jump(url) {
						jump(url)
					}
				}
			})

			
			layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate','tinymce'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var form = layui.form;
				var upload = layui.upload;
				var laydate = layui.laydate;
                var tinymce = layui.tinymce

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img class="swiper-item" src="' + item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						carousel.render({
							elem: '#swiper',
							width: swiper.width,height:swiper.height,
							arrow: swiper.arrow,
							anim: swiper.anim,
							interval: swiper.interval,
							indicator: "none"
						});
					}
				});

                																http.request(`option/shipinfenlei/shipinfenlei`,'get',{},(res)=>{
					vue.shipinfenlei = res.data
				});
																								// 上传图片
				var shipinfengmianUpload = upload.render({
					//绑定元素
					elem: '#shipinfengmianUpload',
					//上传接口
					url: http.baseurl + 'file/upload',
					// 请求头
					headers: {
						Token: localStorage.getItem('Token')
					},
					// 允许上传时校验的文件类型
					accept: 'images',
					before: function() {
						//loading层
						var index = layer.load(1, {
							shade: [0.1, '#fff'] //0.1透明度的白色背景
						});
					},
					// 上传成功
					done: function(res) {
						console.log(res);
						layer.closeAll();
						if (res.code == 0) {
							layer.msg("上传成功", {
								time: 2000,
								icon: 6
							})
							var url = http.baseurl + 'upload/' + res.file;
							jquery('#shipinfengmian').val(url);
							jquery('#shipinfengmianImg').attr('src', url)
                            vue.detail.shipinfengmian = url;
						} else {
							layer.msg(res.msg, {
								time: 2000,
								icon: 5
							})
						}
					},
					//请求异常回调
					error: function() {
						layer.closeAll();
						layer.msg("请求接口异常", {
							time: 2000,
							icon: 5
						})
					}
				});
												                var shipinUpload = upload.render({
					//绑定元素
					elem: '#shipinUpload',
					//上传接口
					url: http.baseurl + 'file/upload',
					// 请求头
					headers: {
						Token: localStorage.getItem('Token')
					},
					// 允许上传时校验的文件类型
					accept: 'video',
					before: function() {
						//loading层
						var index = layer.load(1, {
							shade: [0.1, '#fff'] //0.1透明度的白色背景
						});
					},
					// 上传成功
					done: function(res) {
						console.log(res);
						layer.closeAll();
						if (res.code == 0) {
							layer.msg("上传成功", {
								time: 2000,
								icon: 6
							})
							var url = http.baseurl + 'upload/' + res.file;
							jquery('#shipin').val(url);
                            vue.detail.shipin = url;
						} else {
							layer.msg(res.msg, {
								time: 2000,
								icon: 5
							})
						}
					},
					//请求异常回调
					error: function() {
						layer.closeAll();
						layer.msg("请求接口异常", {
							time: 2000,
							icon: 5
						})
					}
				});
                								                var edit = tinymce.render({
                    elem: "#shipinjieshao",
                    height: 600,
                    images_upload_handler: function(blobInfo, succFun, failFun) {
                        var xhr, formData;
                        var file = blobInfo.blob(); //转化为易于理解的file对象
                        xhr = new XMLHttpRequest();
                        xhr.withCredentials = false;
                        xhr.open('POST', http.baseurl + 'file/upload');
                        xhr.setRequestHeader("Token", localStorage.getItem('Token')); //设置请求头
                        xhr.onload = function() {
                            var json;
                            if (xhr.status != 200) {
                                failFun('HTTP Error: ' + xhr.status);
                                return;
                            }
                            json = JSON.parse(xhr.responseText);
                            if (!json || typeof json.file != 'string') {
                                failFun('Invalid JSON: ' + xhr.responseText);
                                return;
                            }
                            succFun(http.baseurl + '/upload/' + json.file);
                        };
                        formData = new FormData();
                        formData.append('file', file, file.name); //此处与源文档不一样
                        xhr.send(formData);
                    }
                }, (opt) => {

                });
																laydate.render({
					elem: '#faburiqi'
				});
																																laydate.render({
					elem: '#clicktime',
					type: 'datetime'
				});
                																
                                // session独取
				let table = localStorage.getItem("userTable");
				http.request(`${table}/session`, 'get', {}, function(data) {
					// 表单赋值
					//form.val("myForm", data.data);
					data = data.data
					for(var key in data){
						vue.detail[`${key}`] = data[`${key}`]
					}
				});
                
                // 跨表计算
                if(http.getParam('corss')){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					//form.val("myForm", obj);
					for(var key in obj){
						vue.detail[`${key}`] = obj[`${key}`]
					}
				}
				
                																																																																																								
				// 提交
				form.on('submit(*)', function(data) {
					data = data.field;
					
                    // 数据校验
					                    					                                                                                                                                                                					                    if(!data.shipinfenlei){
                        layer.msg('视频分类不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                                    					                    if(!data.shipinmingcheng){
                        layer.msg('视频名称不能为空', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                                                                    					                                                                                                                                                                					                                                                                                                                                                					var shipinjieshao = tinymce.get('#shipinjieshao').getContent()
					data.shipinjieshao = shipinjieshao;
										                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                                                                                                                                                					                                        if(!isIntNumer(data.clicknum)){
                        layer.msg('点击次数应输入整数', {
							time: 2000,
							icon: 5
						});
                        return false
                    }
                                                                                                                                            
					// 跨表计算
					                                                                                                                                                                                                                                                                                                                                                                                                                                                        					
                    // 比较大小
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        					
					// 提交数据
					http.requestJson('nongyeshipin' + '/add', 'post', data, function(res) {
					 	layer.msg('提交成功', {
					 		time: 2000,
					 		icon: 6
					 	}, function() {
					 		back();
						});
					 });

					return false
				});

			});
		</script>
	</body>
</html>
