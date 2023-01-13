<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name='viewport' content='width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no'>
  <title>Power mall - Sign up</title>
  <link rel="profile" href="http://gmpg.org/xfn/11" />
  <link rel="pingback" href="https://themes.getbootstrap.com/xmlrpc.php" />

  <link rel='apple-touch-icon' sizes='180x180' href='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/images/fav/apple-touch-icon.png'>
  <link rel='icon' type='image/png' sizes='32x32' href='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/images/fav/favicon-32x32.png'>
  <link rel='icon' type='image/png' sizes='16x16' href='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/images/fav/favicon-16x16.png'>
  <link rel='manifest' href='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/images/fav/manifest.json'>
  <link rel='shortcut icon' href='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/images/fav/favicon.ico'>
  <meta name='msapplication-config' content='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/images/fav/browserconfig.xml'>

  
<!-- This site is optimized with the Yoast SEO plugin v12.7.1 - https://yoast.com/wordpress/plugins/seo/ -->
<meta name="robots" content="max-snippet:-1, max-image-preview:large, max-video-preview:-1"/>
<link rel="canonical" href="https://themes.getbootstrap.com/product/themebau/" />
<meta property="og:locale" content="en_US" />
<meta property="og:type" content="article" />
<meta property="og:title" content="Themebau – Minimal Portfolio &amp; Agency Template - Bootstrap Themes" />
<meta property="og:description" content="Themebau is a stylish universal template for all your projects &amp; creative output. Minimalistic and easy to use, it has everything you need to launch your website. Themebau Features: 11 Homepage Variations Figma files included Developers Ready: Webpack, Gulp, SCSS, Nunjucks, NPM 19 Portfolio styles &amp; 6 Single Projects pages 100% Responsive &amp; Retina ready &hellip;" />
<meta property="og:url" content="https://themes.getbootstrap.com/product/themebau/" />
<meta property="og:site_name" content="Bootstrap Themes" />
<meta property="og:image" content="https://themes.getbootstrap.com/wp-content/uploads/2020/10/themebau_bootstrap5.jpg" />
<meta property="og:image:secure_url" content="https://themes.getbootstrap.com/wp-content/uploads/2020/10/themebau_bootstrap5.jpg" />
<meta property="og:image:width" content="1200" />
<meta property="og:image:height" content="900" />
<meta name="twitter:card" content="summary_large_image" />
<meta name="twitter:description" content="Themebau is a stylish universal template for all your projects &amp; creative output. Minimalistic and easy to use, it has everything you need to launch your website. Themebau Features: 11 Homepage Variations Figma files included Developers Ready: Webpack, Gulp, SCSS, Nunjucks, NPM 19 Portfolio styles &amp; 6 Single Projects pages 100% Responsive &amp; Retina ready [&hellip;]" />
<meta name="twitter:title" content="Themebau – Minimal Portfolio &amp; Agency Template - Bootstrap Themes" />
<meta name="twitter:image" content="https://themes.getbootstrap.com/wp-content/uploads/2020/10/themebau_bootstrap5.jpg" />
<script type='application/ld+json' class='yoast-schema-graph yoast-schema-graph--main'>{"@context":"https://schema.org","@graph":[{"@type":"WebSite","@id":"https://themes.getbootstrap.com/#website","url":"https://themes.getbootstrap.com/","name":"Bootstrap Themes","description":"Built and Curated by the Bootstrap Team","potentialAction":{"@type":"SearchAction","target":"https://themes.getbootstrap.com/?s={search_term_string}","query-input":"required name=search_term_string"}},{"@type":"ImageObject","@id":"https://themes.getbootstrap.com/product/themebau/#primaryimage","url":"https://themes.getbootstrap.com/wp-content/uploads/2020/10/themebau_bootstrap5.jpg","width":1200,"height":900},{"@type":"WebPage","@id":"https://themes.getbootstrap.com/product/themebau/#webpage","url":"https://themes.getbootstrap.com/product/themebau/","inLanguage":"en-US","name":"Themebau \u2013 Minimal Portfolio &amp; Agency Template - Bootstrap Themes","isPartOf":{"@id":"https://themes.getbootstrap.com/#website"},"primaryImageOfPage":{"@id":"https://themes.getbootstrap.com/product/themebau/#primaryimage"},"datePublished":"2020-10-27T08:46:32+00:00","dateModified":"2022-12-23T12:11:58+00:00"}]}</script>
<script src="/static/js/bootstrap.bundle.js"></script>
<!-- / Yoast SEO plugin. -->

<link rel='dns-prefetch' href='//s.w.org' />
<link rel="alternate" type="application/rss+xml" title="Bootstrap Themes &raquo; Feed" href="https://themes.getbootstrap.com/feed/" />
<link rel="alternate" type="application/rss+xml" title="Bootstrap Themes &raquo; Comments Feed" href="https://themes.getbootstrap.com/comments/feed/" />
      <script type="text/javascript">
         window._wpemojiSettings = {"baseUrl":"https:\/\/s.w.org\/images\/core\/emoji\/12.0.0-1\/72x72\/","ext":".png","svgUrl":"https:\/\/s.w.org\/images\/core\/emoji\/12.0.0-1\/svg\/","svgExt":".svg","source":{"concatemoji":"https:\/\/themes.getbootstrap.com\/wp-includes\/js\/wp-emoji-release.min.js?ver=5.3"}};
         !function(e,a,t){var r,n,o,i,p=a.createElement("canvas"),s=p.getContext&&p.getContext("2d");function c(e,t){var a=String.fromCharCode;s.clearRect(0,0,p.width,p.height),s.fillText(a.apply(this,e),0,0);var r=p.toDataURL();return s.clearRect(0,0,p.width,p.height),s.fillText(a.apply(this,t),0,0),r===p.toDataURL()}function l(e){if(!s||!s.fillText)return!1;switch(s.textBaseline="top",s.font="600 32px Arial",e){case"flag":return!c([127987,65039,8205,9895,65039],[127987,65039,8203,9895,65039])&&(!c([55356,56826,55356,56819],[55356,56826,8203,55356,56819])&&!c([55356,57332,56128,56423,56128,56418,56128,56421,56128,56430,56128,56423,56128,56447],[55356,57332,8203,56128,56423,8203,56128,56418,8203,56128,56421,8203,56128,56430,8203,56128,56423,8203,56128,56447]));case"emoji":return!c([55357,56424,55356,57342,8205,55358,56605,8205,55357,56424,55356,57340],[55357,56424,55356,57342,8203,55358,56605,8203,55357,56424,55356,57340])}return!1}function d(e){var t=a.createElement("script");t.src=e,t.defer=t.type="text/javascript",a.getElementsByTagName("head")[0].appendChild(t)}for(i=Array("flag","emoji"),t.supports={everything:!0,everythingExceptFlag:!0},o=0;o<i.length;o++)t.supports[i[o]]=l(i[o]),t.supports.everything=t.supports.everything&&t.supports[i[o]],"flag"!==i[o]&&(t.supports.everythingExceptFlag=t.supports.everythingExceptFlag&&t.supports[i[o]]);t.supports.everythingExceptFlag=t.supports.everythingExceptFlag&&!t.supports.flag,t.DOMReady=!1,t.readyCallback=function(){t.DOMReady=!0},t.supports.everything||(n=function(){t.readyCallback()},a.addEventListener?(a.addEventListener("DOMContentLoaded",n,!1),e.addEventListener("load",n,!1)):(e.attachEvent("onload",n),a.attachEvent("onreadystatechange",function(){"complete"===a.readyState&&t.readyCallback()})),(r=t.source||{}).concatemoji?d(r.concatemoji):r.wpemoji&&r.twemoji&&(d(r.twemoji),d(r.wpemoji)))}(window,document,window._wpemojiSettings);
      </script>
      <style type="text/css">
img.wp-smiley,
img.emoji {
   display: inline !important;
   border: none !important;
   box-shadow: none !important;
   height: 1em !important;
   width: 1em !important;
   margin: 0 .07em !important;
   vertical-align: -0.1em !important;
   background: none !important;
   padding: 0 !important;
}
</style>
   <link rel='stylesheet' id='wp-block-library-css'  href='https://themes.getbootstrap.com/wp-includes/css/dist/block-library/style.min.css?ver=5.3' type='text/css' media='all' />
<link rel='stylesheet' id='wc-block-style-css'  href='https://themes.getbootstrap.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/style.css?ver=2.4.5' type='text/css' media='all' />
<link rel='stylesheet' id='photoswipe-css'  href='https://themes.getbootstrap.com/wp-content/plugins/woocommerce/assets/css/photoswipe/photoswipe.css?ver=3.8.1' type='text/css' media='all' />
<link rel='stylesheet' id='photoswipe-default-skin-css'  href='https://themes.getbootstrap.com/wp-content/plugins/woocommerce/assets/css/photoswipe/default-skin/default-skin.css?ver=3.8.1' type='text/css' media='all' />
<link rel='stylesheet' id='woocommerce-layout-css'  href='https://themes.getbootstrap.com/wp-content/plugins/woocommerce/assets/css/woocommerce-layout.css?ver=3.8.1' type='text/css' media='all' />
<link rel='stylesheet' id='woocommerce-smallscreen-css'  href='https://themes.getbootstrap.com/wp-content/plugins/woocommerce/assets/css/woocommerce-smallscreen.css?ver=3.8.1' type='text/css' media='only screen and (max-width: 768px)' />
<link rel='stylesheet' id='woocommerce-general-css'  href='https://themes.getbootstrap.com/wp-content/plugins/woocommerce/assets/css/woocommerce.css?ver=3.8.1' type='text/css' media='all' />
<style id='woocommerce-inline-inline-css' type='text/css'>
.woocommerce form .form-row .required { visibility: visible; }
</style>
<link rel='stylesheet' id='dokan-fontawesome-css'  href='https://themes.getbootstrap.com/wp-content/plugins/dokan-lite/assets/vendors/font-awesome/font-awesome.min.css?ver=2.9.27' type='text/css' media='all' />
<link rel='stylesheet' id='dokan-theme-skin-css'  href='https://themes.getbootstrap.com/wp-content/themes/dokan/assets/css/skins/purple.css' type='text/css' media='all' />
<link rel='stylesheet' id='dokan-select2-css-css'  href='https://themes.getbootstrap.com/wp-content/plugins/dokan-lite/assets/vendors/select2/select2.css?ver=2.9.27' type='text/css' media='all' />
<script type='text/javascript'>
/* <![CDATA[ */
var dokan = {"ajaxurl":"https:\/\/themes.getbootstrap.com\/wp-admin\/admin-ajax.php","nonce":"e2311d9dd7","ajax_loader":"https:\/\/themes.getbootstrap.com\/wp-content\/plugins\/dokan-lite\/assets\/images\/ajax-loader.gif","seller":{"available":"Available","notAvailable":"Not Available"},"delete_confirm":"Are you sure?","wrong_message":"Something went wrong. Please try again.","vendor_percentage":"70","commission_type":"percentage","rounding_precision":"6","mon_decimal_point":".","product_types":["simple"],"i18n_choose_featured_img":"Upload featured image","i18n_choose_file":"Choose a file","i18n_choose_gallery":"Add Images to Product Gallery","i18n_choose_featured_img_btn_text":"Set featured image","i18n_choose_file_btn_text":"Insert file URL","i18n_choose_gallery_btn_text":"Add to gallery","duplicates_attribute_messg":"Sorry, this attribute option already exists, Try a different one.","variation_unset_warning":"Warning! This product will not have any variations if this option is not checked.","new_attribute_prompt":"Enter a name for the new attribute term:","remove_attribute":"Remove this attribute?","dokan_placeholder_img_src":"https:\/\/themes.getbootstrap.com\/wp-content\/uploads\/woocommerce-placeholder-300x300.png","add_variation_nonce":"e956a6c381","link_variation_nonce":"d55330ccea","delete_variations_nonce":"c61f963567","load_variations_nonce":"81dc0c220e","save_variations_nonce":"feecf6a5fc","bulk_edit_variations_nonce":"90e2ef7fc2","i18n_link_all_variations":"Are you sure you want to link all variations? This will create a new variation for each and every possible combination of variation attributes (max 50 per run).","i18n_enter_a_value":"Enter a value","i18n_enter_menu_order":"Variation menu order (determines position in the list of variations)","i18n_enter_a_value_fixed_or_percent":"Enter a value (fixed or %)","i18n_delete_all_variations":"Are you sure you want to delete all variations? This cannot be undone.","i18n_last_warning":"Last warning, are you sure?","i18n_choose_image":"Choose an image","i18n_set_image":"Set variation image","i18n_variation_added":"variation added","i18n_variations_added":"variations added","i18n_no_variations_added":"No variations added","i18n_remove_variation":"Are you sure you want to remove this variation?","i18n_scheduled_sale_start":"Sale start date (YYYY-MM-DD format or leave blank)","i18n_scheduled_sale_end":"Sale end date (YYYY-MM-DD format or leave blank)","i18n_edited_variations":"Save changes before changing page?","i18n_variation_count_single":"%qty% variation","i18n_variation_count_plural":"%qty% variations","i18n_no_result_found":"No Result Found","variations_per_page":"10","store_banner_dimension":{"width":625,"height":300,"flex-width":true,"flex-height":true},"selectAndCrop":"Select and Crop","chooseImage":"Choose Image","product_title_required":"Product title is required","product_category_required":"Product category is required","search_products_nonce":"48690deaa0","search_customer_nonce":"044af883a7","i18n_matches_1":"One result is available, press enter to select it.","i18n_matches_n":"%qty% results are available, use up and down arrow keys to navigate.","i18n_no_matches":"No matches found","i18n_ajax_error":"Loading failed","i18n_input_too_short_1":"Please enter 1 or more characters","i18n_input_too_short_n":"Please enter %qty% or more characters","i18n_input_too_long_1":"Please delete 1 character","i18n_input_too_long_n":"Please delete %qty% characters","i18n_selection_too_long_1":"You can only select 1 item","i18n_selection_too_long_n":"You can only select %qty% items","i18n_load_more":"Loading more results\u2026","i18n_searching":"Searching\u2026","i18n_date_format":"F j, Y","rest":{"root":"https:\/\/themes.getbootstrap.com\/wp-json\/","nonce":"60f97bd866","version":"dokan\/v1"},"api":null,"libs":[],"routeComponents":{"default":null},"routes":[],"urls":{"assetsUrl":"https:\/\/themes.getbootstrap.com\/wp-content\/plugins\/dokan-lite\/assets"}};
/* ]]> */
</script>
<script type='text/javascript' src='https://themes.getbootstrap.com/wp-includes/js/jquery/jquery.js?ver=1.12.4-wp'></script>
<script type='text/javascript' src='https://themes.getbootstrap.com/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.4.1'></script>
<!--[if lt IE 8]>
<script type='text/javascript' src='https://themes.getbootstrap.com/wp-includes/js/json2.min.js?ver=2015-05-03'></script>
<![endif]-->
<link rel='https://api.w.org/' href='https://themes.getbootstrap.com/wp-json/' />
<link rel="EditURI" type="application/rsd+xml" title="RSD" href="https://themes.getbootstrap.com/xmlrpc.php?rsd" />
<link rel="wlwmanifest" type="application/wlwmanifest+xml" href="https://themes.getbootstrap.com/wp-includes/wlwmanifest.xml" /> 
<link rel='shortlink' href='https://themes.getbootstrap.com/?p=60718' />
<link rel="alternate" type="application/json+oembed" href="https://themes.getbootstrap.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fthemes.getbootstrap.com%2Fproduct%2Fthemebau%2F" />
<link rel="alternate" type="text/xml+oembed" href="https://themes.getbootstrap.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fthemes.getbootstrap.com%2Fproduct%2Fthemebau%2F&#038;format=xml" />
<style>.woocommerce-password-strength.short {color: #e2401c}.woocommerce-password-strength.bad {color: #e2401c}.woocommerce-password-strength.good {color: #3d9cd2}.woocommerce-password-strength.strong {color: #0f834d}</style>   <noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>
   <style type="text/css">.recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}</style>        <style>
            input[type="submit"].dokan-btn-theme, a.dokan-btn-theme, .dokan-btn-theme {
                color: #ffffff !important;
                background-color: #f05025 !important;
                border-color: #f05025 !important;
            }
            input[type="submit"].dokan-btn-theme:hover,
            a.dokan-btn-theme:hover, .dokan-btn-theme:hover,
            input[type="submit"].dokan-btn-theme:focus,
            a.dokan-btn-theme:focus, .dokan-btn-theme:focus,
            input[type="submit"].dokan-btn-theme:active,
            a.dokan-btn-theme:active, .dokan-btn-theme:active,
            input[type="submit"].dokan-btn-theme.active, a.dokan-btn-theme.active,
            .dokan-btn-theme.active,
            .open .dropdown-toggleinput[type="submit"].dokan-btn-theme,
            .open .dropdown-togglea.dokan-btn-theme,
            .open .dropdown-toggle.dokan-btn-theme{
                color: #ffffff !important;
                background-color: #dd3b0f !important;
                border-color: #ca360e !important;
            }

            .dokan-dashboard .dokan-dash-sidebar,
            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu{
                background-color : #242424 !important;
            }

            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li a{
                color : #ffffff !important;
            }

            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li.active,
            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li:hover,
            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li.active,
            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li.dokan-common-links a:hover{
                background-color : #f05025 !important;
            }

            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li,
            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li a,
            .dokan-dashboard .dokan-dash-sidebar ul.dokan-dashboard-menu li.dokan-common-links a{
                border-color : #454545 !important;
            }
        </style>

                <style type="text/css">
                                                                                                                                                                                </style>
          <!-- The filemtime is to append a timestamp for the last time the stylesheet was updated to automate cache busting from CloudFlare -->
  <link rel='stylesheet' href='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/style.css?ver=1590611604' />

  <!-- Global site tag (gtag.js) - Google Analytics -->
  <script async src="https://www.googletagmanager.com/gtag/js?id=UA-67613229-3"></script>
  <script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());
  gtag('config', 'UA-67613229-3');
  </script>

</head>


<body class="page-template-default page page-id-7 page-parent woocommerce theme-dokan woocommerce-account woocommerce-page woocommerce-no-js dokan-theme-dokan">

   
       <!-- <div id="page" class="hfeed site"> -->
       
       
   <nav class="navbar navbar-expand-lg navbar-light">
      <div class="container">
         <a href="/" class="navbar-brand">power mall</a>
         <div class="d-flex ml-auto">
            <button class="navbar-toggler" type="button" data-toggle="collapse"
               data-target="#globalNavbar" aria-controls="globalNavbar"
               aria-expanded="false" aria-label="Toggle navigation">
               <span class="navbar-toggler-icon"></span>
            </button>
         </div>
         <div class="collapse navbar-collapse" id="globalNavbar">
            <form class="form-inline form-navbar my-2 my-lg-0 order-2"
               action="https://themes.getbootstrap.com/shop/">
               <input class="form-control" name="s" type="text"
                  placeholder="Search" />
            </form>
            <ul class="navbar-nav mr-auto order-1">
               <li class="nav-item dropdown"><a
                  class="nav-link dropdown-toggle" id="navbarDropdownMenuLink"
                  href="#" data-toggle="dropdown" aria-haspopup="true"
                  aria-expanded="false">Categories</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                     <div class="navbar-collapse navbar-top-collapse">
                        <ul id="menu-top-menu" class="nav navbar-nav">
                           <li id="menu-item-601"
                              class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-601"><a
                              href="#">woman</a></li>
                           <li id="menu-item-603"
                              class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-603"><a
                              href="#">man</a></li>
                           <li id="menu-item-1537"
                              class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1537"><a
                              href="#">shoes</a></li>
                           <li id="menu-item-602"
                              class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-602"><a
                              href="#">shirts</a></li>
                           <li id="menu-item-1538"
                              class="menu-item menu-item-type-taxonomy menu-item-object-product_cat current-product-ancestor current-menu-parent current-product-parent menu-item-1538"><a
                              href="#">pants</a></li>
                        </ul>
                     </div>
                  </div></li>
            </ul>
            <div class="container">
				<header style="height: 30px;">
					<div class="float-right">
						<c:choose>
							<c:when test="${empty login}">
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/login">로그인</a>
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/insert">회원가입</a>
							</c:when>
							<c:otherwise>
							${login.id}님
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/read/${login.id}">회원정보</a>
								<a class="btn btn-sm btn-outline-secondary"
									href="/customer/logout">로그아웃</a>
							</c:otherwise>
						</c:choose>
					</div>
				</header>
			</div>
         </div>
      </div>
   </nav>
   
   
   
   
   
   <div id="yith-wcwl-popup-message" style="display:none;"><div id="yith-wcwl-message"></div></div>


<script src='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/javascript/Chart.min.js'></script>
<script src='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/javascript/Chart.bundle.min.js'></script>
<script src='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/javascript/tether.min.js'></script>
<script src='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/javascript/popper.min.js'></script>
<script src='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/javascript/bootstrap.min.js'></script>
<script src='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/javascript/lazysizes.min.js'></script>

<!-- The filemtime is to append a timestamp for the last time the stylesheet was updated to automate cache busting from CloudFlare -->
<script src='https://themes.getbootstrap.com/wp-content/themes/bootstrap-marketplace/assets/javascript/scripts.js?ver=1670173476'></script>
</body>
</html>



