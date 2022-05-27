var slide_img = document.querySelector('.slide-imgy');
var slide_imga = document.querySelector('.slide-imgx');
var slide_so_cua_toi = document.querySelector('.so_cua_toi');

var images = ['Ghost-of-Tsushima_1.jpg','GRIS___Unused_Blossom.0.jpg','IDOLTV-hinh-nen-may-tinh-anime-one-piece-full-HD-911401.jpg','thumb-1920-670098.jpg','wallpaperflare.com_wallpaper.jpg'];
var i = 0;
var j=1;

function prev(){
    i--;
    if(i < 0){ 
        i = images.length-1;
        
    }
    j--;
    if(j < 0){ 
        j = images.length-1;
        
    }
    
    

     setImg();

     setImga();

     set_number_socuatoi();
}

function next(){
    i++;

    if(i >=  images.length){

    i = 0;
    
    }

    j++;

    if(j >=  images.length){

    j = 0;
    
    }
    

     setImg();
     setImga();
     set_number_socuatoi();
    
}

function setImg(){
    
 slide_img.setAttribute('src','images/' + images[i]);
 
    
}
function setImga(){
 slide_imga.setAttribute('src','images/' + images[j]);
}
function set_number_socuatoi(){
    // slide_so_cua_toi.setAttribute();
    slide_so_cua_toi.innerHTML = i +" / 4";
}
 
function auto(){
    alert("chúc mừng");
    setInterval(() => {
        next();
    }, 1000);
}