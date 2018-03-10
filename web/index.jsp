<%--
  Created by IntelliJ IDEA.
  com.zhihu.domain.User: 小胖狗wy
  Date: 2018/3/6
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="zhihu.css" >
    <title>zhihu</title>
  </head>

  <style>

  </style>
  <div id="root" style="text-align: center; margin-top: 100px">
    <div data-zop-usertoken="{}" data-reactroot="" data-reactid="1"><!-- react-empty: 2 -->
      <main role="main" class="App-main" data-reactid="39">
        <div class="SignFlowHomepage"  data-reactid="40"><!-- react-empty: 41 -->
          <div id="main" class="SignFlowHomepage-content" data-reactid="42">
        <div class="Card SignContainer-content" data-reactid="43">
              <div class="SignFlowHeader" style="padding-bottom:5px;" data-reactid="44">
                <svg viewBox="0 0 200 91" class="Icon ZhihuLogo Icon--logo" style="height:65.625px;width:140px;" width="140" height="65.625" aria-hidden="true" data-reactid="45">
                  <title data-reactid="46"></title>
                  <g data-reactid="47">
                    <path d="M53.29 80.035l7.32.002 2.41 8.24 13.128-8.24h15.477v-67.98H53.29v67.978zm7.79-60.598h22.756v53.22h-8.73l-8.718 5.473-1.587-5.46-3.72-.012v-53.22zM46.818 43.162h-16.35c.545-8.467.687-16.12.687-22.955h15.987s.615-7.05-2.68-6.97H16.807c1.09-4.1 2.46-8.332 4.1-12.708 0 0-7.523 0-10.085 6.74-1.06 2.78-4.128 13.48-9.592 24.41 1.84-.2 7.927-.37 11.512-6.94.66-1.84.785-2.08 1.605-4.54h9.02c0 3.28-.374 20.9-.526 22.95H6.51c-3.67 0-4.863 7.38-4.863 7.38H22.14C20.765 66.11 13.385 79.24 0 89.62c6.403 1.828 12.784-.29 15.937-3.094 0 0 7.182-6.53 11.12-21.64L43.92 85.18s2.473-8.402-.388-12.496c-2.37-2.788-8.768-10.33-11.496-13.064l-4.57 3.627c1.363-4.368 2.183-8.61 2.46-12.71H49.19s-.027-7.38-2.372-7.38zm128.752-.502c6.51-8.013 14.054-18.302 14.054-18.302s-5.827-4.625-8.556-1.27c-1.874 2.548-11.51 15.063-11.51 15.063l6.012 4.51zm-46.903-18.462c-2.814-2.577-8.096.667-8.096.667s12.35 17.2 12.85 17.953l6.08-4.29s-8.02-11.752-10.83-14.33zM199.99 46.5c-6.18 0-40.908.292-40.953.292v-31.56c1.503 0 3.882-.124 7.14-.376 12.773-.753 21.914-1.25 27.427-1.504 0 0 3.817-8.496-.185-10.45-.96-.37-7.24 1.43-7.24 1.43s-51.63 5.153-72.61 5.64c.5 2.756 2.38 5.336 4.93 6.11 4.16 1.087 7.09.53 15.36.277 7.76-.5 13.65-.76 17.66-.76v31.19h-41.71s.88 6.97 7.97 7.14h33.73v22.16c0 4.364-3.498 6.87-7.65 6.6-4.4.034-8.15-.36-13.027-.566.623 1.24 1.977 4.496 6.035 6.824 3.087 1.502 5.054 2.053 8.13 2.053 9.237 0 14.27-5.4 14.027-14.16V53.93h38.235c3.026 0 2.72-7.432 2.72-7.432z" fill-rule="evenodd">

                    </path>
                  </g>
                </svg>
                <div class="SignFlowHeader-slogen" data-reactid="48"><!-- react-text: 49 -->注册<!-- /react-text --><!-- react-text: 50 -->知乎，发现更大的世界<!-- /react-text -->
                </div>
              </div>
              <div class="SignContainer-inner" data-reactid="51">
                <div class="Register" data-reactid="52" data-za-detail-view-path-module="SignUpForm" data-za-extra-module="{&quot;card&quot;:{&quot;content&quot;:null}}">
                  <div data-reactid="53">
                    <div class="Register-content" data-reactid="54">
                      <form action="RegServlet" method="post" data-reactid="55">
                        <div class="SignFlow-account" data-reactid="56">

                          <span class="SignFlow-accountSeperator">&nbsp;</span>
                          <div class="SignFlowInput SignFlow-accountInputContainer" data-reactid="58">
                            <div class="SignFlow-accountInput Input-wrapper" data-reactid="59">
                              <input type="text"  name="id" class="Input" placeholder="输入8位以下用户名" data-reactid="60">
                            </div>

                          </div>
                        </div>
                        <div class="Captcha SignFlow-captchaContainer Register-captcha" style="width:0px;height:0px;opacity:0;overflow:hidden;margin:0px;padding:0px;border:0px;" data-reactid="62"><div data-reactid="63"><div class="SignFlowInput" data-reactid="64"><div class="Input-wrapper" data-reactid="65"><input type="text" value="" name="captcha" tabindex="-1" class="Input" placeholder="验证码" data-reactid="66"></div><div class="SignFlowInput-errorMask SignFlowInput-requiredErrorMask SignFlowInput-errorMask--hidden" data-reactid="67"></div></div><span class="Captcha-englishImage" data-reactid="68"><div class="Captcha-englishContainer" data-reactid="69"><img data-tooltip="看不清楚？换一张" class="Captcha-englishImg" src="data:image/jpg;base64,null" alt="图形验证码" data-reactid="70">
                                        </div>
                                        </span>
                        </div>
                        </div>
                        <div class="Register-SMSInput" data-reactid="71">
                          <div class="SignFlow SignFlow-smsInputContainer" data-reactid="72">
                            <div class="SignFlowInput SignFlow-smsInput" data-reactid="73">
                              <div class="Input-wrapper" data-reactid="74">
                                <input type="password"  name="password" class="Input" placeholder="输入8位以下密码" data-reactid="75">
                              </div>
                            </div>
                          </div>

                        </div>
                        <button  type="submit" data-reactid="84" name="注册"><!-- react-text: 85 -->注册<!-- /react-text --></button>
                      </form>
                    </div>
                  </div>
                </div>
                <div class="SignContainer-switch" data-reactid="91"><!-- react-text: 92 -->已有帐号？<!-- /react-text -->
                  <a href="login.jsp">
                                登录
                  </a>
                </div>
                <div class="SignFlowHomepage-qrImage SignFlowHomepage-qrImageHidden" data-reactid="94">
                  <div data-reactid="95">

                  </div>
                </div>
              </div>
        </div>

          </div>
          <footer style="position:relative;top:300px" class="SignFlowHomepage-footer" data-reactid="98">
            <div class="ZhihuLinks" data-reactid="99">
              <a target="_blank" rel="noopener noreferrer" href="https://zhuanlan.zhihu.com/" data-reactid="100">
                知乎专栏
              </a>
              <a target="_blank" rel="noopener noreferrer" href="https://www.zhihu.com/roundtable" data-reactid="101">
                圆桌
              </a>
              <a target="_blank" rel="noopener noreferrer" href="https://www.zhihu.com/explore" data-reactid="102">
                发现
              </a>
              <a target="_blank" rel="noopener noreferrer" href="https://www.zhihu.com/app" data-reactid="103">
                移动应用
              </a>
              <a target="_blank" rel="noopener noreferrer" href="https://www.zhihu.com/contact" data-reactid="104">
                联系我们
              </a>
              <a target="_blank" rel="noopener noreferrer" href="https://www.zhihu.com/careers" data-reactid="105">
                来知乎工作
              </a>
              <a target="_blank" rel="noopener noreferrer" href="https://www.zhihu.com/org/signup" data-reactid="106">
                注册机构号
              </a>
            </div>
            <div class="ZhihuRights" data-reactid="107">
                    <span data-reactid="108">
                        © 2018 知乎
                    </span>
              <a target="_blank" rel="noopener noreferrer" href="http://www.miibeian.gov.cn/" data-reactid="109">
                京 ICP 证 110745 号
              </a>
              <span data-reactid="110"><!-- react-text: 111 -->京公网安备 11010802010035 号<!-- /react-text -->
                        <a href="http://zhstatic.zhihu.com/assets/zhihu/publish-license.jpg" target="_blank" rel="noopener noreferrer" data-reactid="112">
                            出版物经营许可证
                        </a>
                    </span>
            </div>
            <div class="ZhihuReports" data-reactid="113">
              <a target="_blank" rel="noopener noreferrer" href="https://zhuanlan.zhihu.com/p/28852607" data-reactid="114">
                侵权举报
              </a>
              <a target="_blank" rel="noopener noreferrer" href="http://www.12377.cn/" data-reactid="115">
                网上有害信息举报专区
              </a>
              <a target="_blank" rel="noopener noreferrer" href="https://www.zhihu.com/jubao" data-reactid="116">
                儿童色情信息举报专区
              </a>
              <span data-reactid="117">
                        违法和不良信息举报：010-82716601
                    </span>
            </div>
            <div class="ZhihuIntegrity" data-reactid="118">
              <div data-reactid="119">
                <img src="./知乎 - 发现更大的世界_files/chengxing_logo@2x.65dc76e8.png" alt="诚信网站示范企业" data-reactid="120">
                <a href="https://credit.szfw.org/CX20170607038331320388.html" data-reactid="121">
                  诚信网站示范企业
                </a>
              </div>
            </div>
          </footer>
        </div>
      </main><!-- react-empty: 122 --><!-- react-empty: 123 --><!-- react-empty: 124 -->
      <div style="float: right;" class="CornerButtons">
        <div class="CornerAnimayedFlex">
          <button class="Button CornerButton Button--plain" data-tooltip="建议反馈" data-tooltip-position="left" aria-label="建议反馈" type="button">
            <svg class="Zi Zi--Feedback" title="建议反馈" fill="currentColor" viewBox="0 0 24 24" width="24" height="24">
              <path d="M19.99 6.99L18 5s-1-1-2-1H8C7 4 6 5 6 5L4 7S3 8 3 9v9s0 2 2.002 2H19c2 0 2-2 2-2V9c0-1-1.01-2.01-1.01-2.01zM16.5 5.5L19 8H5l2.5-2.5h9zm-2 5.5s.5 0 .5.5-.5.5-.5.5h-5s-.5 0-.5-.5.5-.5.5-.5h5z">

              </path>
            </svg>
          </button>
        </div>
        <div class="CornerAnimayedFlex CornerAnimayedFlex--hidden">
          <button class="Button CornerButton Button--plain" data-tooltip="回到顶部" data-tooltip-position="left" aria-label="回到顶部" type="button">
            <svg class="Zi Zi--BackToTop" title="回到顶部" fill="currentColor" viewBox="0 0 24 24" width="24" height="24">
              <path d="M16.036 19.59a1 1 0 0 1-.997.995H9.032a.996.996 0 0 1-.997-.996v-7.005H5.03c-1.1 0-1.36-.633-.578-1.416L11.33 4.29a1.003 1.003 0 0 1 1.412 0l6.878 6.88c.782.78.523 1.415-.58 1.415h-3.004v7.005z">

              </path>
            </svg>
          </button>
        </div>
      </div>
    </div>
  </div>
  </body>
</html>
