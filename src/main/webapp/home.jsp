<%--
 
  User: gjy
  Date: 2016/1/18
  Time: 16:18
  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include  page="/common/head.jsp"/>
<!--start-slider---->
<div class="slider" id="home">
    <div class="wrap">
        <!---start-da-slider----->
        <div id="da-slider" class="da-slider">
            <div class="da-slide">
                <h2>This is a main heading</h2>
                <p>Lorem ipsum is simply dummy text of the printing</p>
                <a href="#" class="da-link">Learn more</a>
            </div>
            <div class="da-slide">
                <h2>This is a main heading</h2>
                <p>Lorem ipsum is simply dummy text of the printing</p>
                <a href="#" class="da-link">Learn more</a>
            </div>
            <div class="da-slide">
                <h2>This is a main heading</h2>
                <p>Lorem ipsum is simply dummy text of the printing</p>
                <a href="#" class="da-link">Learn more</a>
            </div>
            <nav class="da-arrows">
                <span class="da-arrows-prev"></span>
                <span class="da-arrows-next"></span>
            </nav>
        </div>
        <link rel="stylesheet" type="text/css" href="css/slider.css" />
        <script type="text/javascript" src="js/modernizr.custom.28468.js"></script>
        <script type="text/javascript" src="js/jquery.cslider.js"></script>
        <script type="text/javascript">
            $(function() {

                $('#da-slider').cslider({
                    autoplay	: true,
                    bgincrement	: 450
                });

            });
        </script>
        <!---//End-da-slider----->
    </div>
</div>
<!-----------service------------>
<div  class="sevice" id="service">
    <div class="wrap">
        <div class="service-grids">
            <div class="images_1_of_4">
                <img src="images/round1.png">
                <h3>Custom Design</h3>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been </p>
                <div class="button"><span><a href="#">Read More</a></span></div>
            </div>
            <div class="images_1_of_4">
                <img src="images/round2.png">
                <h3>Web Design</h3>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been</p>
                <div class="button"><span><a href="#">Read More</a></span></div>
            </div>
            <div class="images_1_of_4">
                <img src="images/round3.png">
                <h3>Blog pages</h3>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been </p>
                <div class="button"><span><a href="#">Read More</a></span></div>
            </div>
            <div class="images_1_of_4">
                <img src="images/round4.png">
                <h3>Mobile friendly</h3>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been</p>
                <div class="button"><span><a href="#">Read More</a></span></div>
            </div>
            <div class="clear"> </div>
        </div>
    </div>
    <!-----------//service//------------>
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >免费模板</a></div>
    <!-----------portfolio-------------->
    <div class="portfolio_main"id ="portfolio">
        <div class="wrap">
            <div class="heading_h">
                <h3><a href="#">Portfolio</a></h3>
            </div>
            <!--start-mfp -->
            <div id="small-dialog1" class="mfp-hide">
                <div class="pop_up">
                    <img src="images/pop1.jpg">
                    <h2>Lorem ipsum </h2>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                    <p class="pop_p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                </div>

            </div>
            <div id="small-dialog2" class="mfp-hide">
                <div class="pop_up2">
                    <img src="images/pop2.jpg">
                    <h2>Lorem ipsum </h2>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                    <p class="pop_p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                </div>
            </div>
            <div id="small-dialog3" class="mfp-hide">
                <div class="pop_up3">
                    <img src="images/pop3.jpg">
                    <h2>Lorem ipsum </h2>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                    <p class="pop_p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                </div>
            </div>
            <div id="small-dialog4" class="mfp-hide">
                <div class="pop_up4">
                    <img src="images/pop4.jpg">
                    <h2>Lorem ipsum </h2>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                    <p class="pop_p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                </div>
            </div>
            <div id="small-dialog5" class="mfp-hide">
                <div class="pop_up5">
                    <img src="images/pop5.jpg">
                    <h2>Lorem ipsum </h2>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                    <p class="pop_p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                </div>
            </div>
            <div id="small-dialog6" class="mfp-hide">
                <div class="pop_up6">
                    <img src="images/pop6.jpg">
                    <h2>Lorem ipsum </h2>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                    <p class="pop_p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                </div>
            </div>
            <div id="small-dialog7" class="mfp-hide">
                <div class="pop_up7">
                    <h2>Lorem ipsum </h2>
                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                    <p class="pop_p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie.</p>
                </div>
            </div>
            <!--end-mfp -->
            <!--start-content-->
            <div class="gallery">
                <div class="container">
                    <div id="gallerylist">
                        <div class="gallerylist-wrapper">
                            <a class="popup-with-zoom-anim" href="#small-dialog1">
                                <img src="images/gd1.jpg" alt="Image 1"/
                            </a>
                        </div>
                        <div class="gallerylist-wrapper">
                            <a class="popup-with-zoom-anim" href="#small-dialog2">
                                <img src="images/gd2.jpg"  alt="Image 1"/
                            </a>
                        </div>
                        <div class="gallerylist-wrapper">
                            <a class="popup-with-zoom-anim" href="#small-dialog3">
                                <img src="images/gd3.jpg"  alt="Image 1"/>

                            </a>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div id="gallerylist1">
                        <div class="gallerylist-wrapper">
                            <a class="popup-with-zoom-anim" href="#small-dialog4">
                                <img src="images/gd4.jpg" alt="Image 1"/
                            </a>
                        </div>
                        <div class="gallerylist-wrapper">
                            <a class="popup-with-zoom-anim" href="#small-dialog5">
                                <img src="images/gd5.jpg"  alt="Image 1"/>

                            </a>
                        </div>
                        <div class="gallerylist-wrapper">
                            <a class="popup-with-zoom-anim" href="#small-dialog6">
                                <img src="images/gd6.jpg"  alt="Image 1"/>
                            </a>
                        </div>
                        <div class="clear"> </div>
                        <div class="button_1"><span><a href="#">See all works</a></span></div>
                    </div>
                </div>
            </div>
            <!--end container -->
            <script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
            <script>
                $(document).ready(function() {
                    $('.popup-with-zoom-anim').magnificPopup({
                        type: 'inline',
                        fixedContentPos: false,
                        fixedBgPos: true,
                        overflowY: 'auto',
                        closeBtnInside: true,
                        preloader: false,
                        midClick: true,
                        removalDelay: 300,
                        mainClass: 'my-mfp-zoom-in'
                    });
                });
            </script>

        </div>
    </div>
</div>
<!-----------//portfolio//----------->
<!-----------start-team-------------->
<div class="team" id="team">
    <div class="wrap">
        <div class="heading_h">
            <h3><a href="#">The Team</a></h3>
        </div>
        <div class="middle-grids">
            <div class="grid_1_of_4 images_1_of_4">
                <a class="popup-with-zoom-anim" href="#small-dialog7">
                    <span class="rollover"> </span>
                </a>
                <img src="images/pic4.jpg"  alt="Image 1"/>
                <h3>Adrian Thomas </h3>
                <h4>CEO&Founder</h4>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been </p>
            </div>
            <div class="grid_1_of_4 images_1_of_4">
                <a class="popup-with-zoom-anim" href="#small-dialog7">
                    <span class="rollover"> </span>
                </a>
                <img src="images/pic2.jpg">
                <h3>Narate Ketram</h3>
                <h4>Creative Diector</h4>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been</p>
            </div>
            <div class="grid_1_of_4 images_1_of_4">
                <a class="popup-with-zoom-anim" href="#small-dialog7">
                    <span class="rollover"> </span>
                </a>
                <img src="images/pic3.jpg">
                <h3>Fernando Comet</h3>
                <h4>CEO&Founder</h4>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been </p>

            </div>
            <div class="grid_1_of_4 images_1_of_4">
                <a class="popup-with-zoom-anim" href="#small-dialog7">
                    <span class="rollover"> </span>
                </a>
                <img src="images/pic1.jpg">
                <h3>Adedayo Saheed</h3>
                <h4>Creative Diector</h4>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been</p>
            </div>
            <div class="clear"> </div>
        </div>
    </div>
</div>
<!----------end-team----------------->
<!-----------start-pricing----------->
<div class="pricing-plans">
    <div class="wrap">
        <div class="pricing-grids">
            <div class="pricing-grid">
                <h3><a href="#">Basic</a></h3>
                <div class="price-value">
                    <a href="#">$5.01/month</a>
                </div>
                <ul>
                    <li><a href="#">Lorem ipsum</a></li>
                    <li><a href="#">Dolor sitamet, Consect</a></li>
                    <li><a href="#">Adipiscing elit</a></li>
                    <li><a href="#">Proin commodo turips</a></li>
                    <li><a href="#">Laws pulvinarvel</a></li>
                    <li><a href="#">Prnare nisi pretium</a></li>
                </ul>
                <div class="cart">
                    <a class="popup-with-zoom-anim" href="#small-dialog">Buy now</a>
                </div>
            </div>
            <div class="pricing-grid">
                <h3><a href="#">Pro</a></h3>
                <div class="price-value">
                    <a href="#">$10.01/month</a>
                </div>
                <ul>
                    <li><a href="#">Lorem ipsum</a></li>
                    <li><a href="#">Dolor sitamet, Consect</a></li>
                    <li><a href="#">Adipiscing elit</a></li>
                    <li><a href="#">Proin commodo turips</a></li>
                    <li><a href="#">Laws pulvinarvel</a></li>
                    <li><a href="#">Prnare nisi pretium</a></li>
                </ul>
                <div class="cart">
                    <a class="popup-with-zoom-anim" href="#small-dialog">Buy now</a>
                </div>
            </div>
            <div class="pricing-grid">
                <h3><a href="#">Premium</a></h3>
                <div class="price-value">
                    <a href="#">$20.01/month</a>
                </div>
                <ul>
                    <li><a href="#">Lorem ipsum</a></li>
                    <li><a href="#">Dolor sitamet, Consect</a></li>
                    <li><a href="#">Adipiscing elit</a></li>
                    <li><a href="#">Proin commodo turips</a></li>
                    <li><a href="#">Laws pulvinarvel</a></li>
                    <li><a href="#">Prnare nisi pretium</a></li>
                </ul>
                <div class="cart">
                    <a class="popup-with-zoom-anim" href="#small-dialog">Buy now</a>
                </div>
            </div>
            <div class="clear"> </div>
            <!-----pop-up-grid---->
            <div id="small-dialog" class="mfp-hide">
                <div class="pop_up">
                    <div class="payment-online-form-left">
                        <form>
                            <h4><span class="shipping"> </span>Shipping</h4>
                            <ul>
                                <li><input class="text-box-dark" type="text" value="Frist Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Frist Name';}"></li>
                                <li><input class="text-box-dark" type="text" value="Last Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Last Name';}"></li>
                            </ul>
                            <ul>
                                <li><input class="text-box-dark" type="text" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}"></li>
                                <li><input class="text-box-dark" type="text" value="Company Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Company Name';}"></li>
                            </ul>
                            <ul>
                                <li><input class="text-box-dark" type="text" value="Phone" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Phone';}"></li>
                                <li><input class="text-box-dark" type="text" value="Address" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Address';}"></li>
                                <div class="clear"> </div>
                            </ul>
                            <div class="clear"> </div>
                            <ul class="payment-type">
                                <h4><span class="payment"> </span> Payments</h4>
                                <li><span class="col_checkbox">
													<input id="3" class="css-checkbox1" type="checkbox">
													<label for="3" name="demo_lbl_1" class="css-label1"> </label>
													<a class="visa" href="#"> </a>
													</span>

                                </li>
                                <li>
													<span class="col_checkbox">
														<input id="4" class="css-checkbox2" type="checkbox">
														<label for="4" name="demo_lbl_2" class="css-label2"> </label>
														<a class="paypal" href="#"> </a>
													</span>
                                </li>
                                <div class="clear"> </div>
                            </ul>
                            <ul>
                                <li><input class="text-box-dark" type="text" value="Card Number" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Card Number';}"></li>
                                <li><input class="text-box-dark" type="text" value="Name on card" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name on card';}"></li>
                                <div class="clear"> </div>
                            </ul>
                            <ul>
                                <li><input class="text-box-light hasDatepicker" type="text" id="datepicker" value="Expiration Date" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Expiration Date';}"><em class="pay-date"> </em></li>
                                <li><input class="text-box-dark" type="text" value="Security Code" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Security Code';}"></li>
                                <div class="clear"> </div>
                            </ul>
                            <ul class="payment-sendbtns">
                                <li><input type="reset" value="Cancel"></li>
                                <li><input type="submit" value="Process order"></li>
                            </ul>
                            <div class="clear"> </div>
                        </form>
                    </div>
                </div>
            </div>
            <!-----pop-up-grid---->
        </div>
        <div class="clear"> </div>
    </div>
</div>
</div>
<!-- Add fancyBox light-box -->
<script>
    $(document).ready(function() {
        $('.popup-with-zoom-anim').magnificPopup({
            type: 'inline',
            fixedContentPos: false,
            fixedBgPos: true,
            overflowY: 'auto',
            closeBtnInside: true,
            preloader: false,
            midClick: true,
            removalDelay: 300,
            mainClass: 'my-mfp-zoom-in'
        });
    });
</script>
<!----End-pricingplans---->
<!-----------end-pricing------------->
<!---------text-slider------------->

<div class="wmuSlider example1">
    <div class="wrap">
        <article style="position: absolute; width:64%; opacity: 0;">

            <div class="cont span_2_of_3">
                <h4>What Clients Say</h1>
                    <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been the printing and typesetting industry's standard dummy text ever since the 500,s when an unknown printer took a gellery of type.</p>
                    <span><a href="#">John Dove</a></span>

            </div>
        </article>
        <article style="position: absolute; width:64%; opacity: 0;">
            <div class="cont span_2_of_3">
                <h4>What Clients Say</h4>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been the printing and typesetting industry's standard dummy text ever since the 500,s when an unknown printer took a gellery of type.</p>
                <span><a href="#">John Dove</a></span>
            </div>
        </article>
        <article style="position: absolute; width:64%; opacity: 0;">
            <div class="cont span_2_of_3">
                <h4>What Clients Say</h4>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been the printing and typesetting industry's standard dummy text ever since the 500,s when an unknown printer took a gellery of type.</p>
                <span><a href="#">John Dove</a></span>
            </div>
        </article>

        <script src="/js/jquery.wmuSlider.js"></script>
        <script>
            $('.example1').wmuSlider();
        </script>
    </div>
</div>
<!----------//text-slider------------>
<!--------start-contact----------->
<div class="contact" id="contact">
    <div class="wrap">
        <h2>Contact Us</h2>
        <div class="contact-form">
            <div class="para-contact">
                <h4>Get in touch with us</h4>
                <p>Lorem ipsum is simply dummy text of the printing and typesetting industry.Lorem ipsum has been the printing and typesetting industry.</p>

                <div class="social_2 social_3">
                    <ul>
                        <li class="facebook"><a href="#"><span> </span></a></li>
                        <li class="twitter"><a href="#"><span> </span></a></li>
                        <li class="google"><a href="#"><span> </span></a></li>
                    </ul>
                </div>
                <div class="get-intouch-left-address">
                    <p>2345 Setwant natrer, 1234</p>
                    <p>Washington. United States.</p>
                    <p>(401) 1234 567</p>
                    <p>More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                </div>
                <div class="clear"> </div>
            </div>
            <div class="form">
                <form method="post" action="#">
                    <input type="text" class="textbox" value=" Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name';}">
                    <input type="text" class="textbox" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
                    <div class="clear"> </div>
                    <div>
                        <textarea value="Message:" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = ' Message';}">Message</textarea>
                    </div>
                    <div class="button send_button">
                        <input type="submit" value="Send">
                    </div>
                    <div class="clear"> </div>
                </form>
            </div>
            <a class="mov-top" href="#home1"> <span> </span></a>
            <div class="clear"> </div>
        </div>
    </div>
</div>
<!-- scroll_top_btn -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
    $(document).ready(function() {

        var defaults = {
            containerID: 'toTop', // fading element id
            containerHoverID: 'toTopHover', // fading element hover id
            scrollSpeed: 1200,
            easingType: 'linear'
        };


        $().UItoTop({ easingType: 'easeOutQuart' });

    });
</script>
<script type="text/javascript">
    jQuery(document).ready(function($) {
        $(".scroll").click(function(event){
            event.preventDefault();
            $('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
        });
    });
</script>

<a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
<!--------//end-contact----------->
</body>
</html>
<jsp:include page="common/footer.html" />