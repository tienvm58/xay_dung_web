var slide_img = document.querySelector('.slide-img');
var images = ['images/Ghost-of-Tsushima_1.jpg','GRIS___Unused_Blossom.0.jpg','IDOLTV-hinh-nen-may-tinh-anime-one-piece-full-HD-911401.jpg','thumb-1920-670098.jpg','wallpaperflare.com_wallpaper.jpg'];
var i = 0;

function prev(){
    if(i <= 0) i = images.length;
    i--;
    return setImg();
}

function next(){
    if(i >=  images.length -1) i = -1;
    i++;
    return setImg();
}

function setImg(){
    return slide_img.setAttribute('src','images/' + images[i]);
}