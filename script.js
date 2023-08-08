window.addEventListener("scroll", function(){
    let header = document.querySelector('#inicio-tela')
    header.classList.toggle('scrolling', window.scrollY > 100)
})



function typeWriter(elemento){
    const textoArray = elemento.innerHTML.split('');
    elemento.innerHTML= '';
    textoArray.forEach((letra,i) => {
        setTimeout(()=> elemento.innerHTML += letra, 40 * i);
        
    });

}
const titulo = document.querySelector('#apresentacao');
typeWriter(titulo);

window.sr = ScrollReveal({ reset: true});
sr.reveal('.info-box',{duration:1700});
sr.reveal('#sobre h1',{duration:1700});
sr.reveal('.tec-conteiner-1',{duration:1700});
sr.reveal('.tec-conteiner-2',{duration:1700});
sr.reveal('#tecnologias h1',{duration:1700});
sr.reveal('#tecnologias p',{duration:1700});
sr.reveal('.project-conteiner',{duration:1700});
sr.reveal('#projetos h1',{duration:1700});
sr.reveal('#projetos p',{duration:1700});

/*------------------------------------------------------------------------------------*/
let circularprogress= document.querySelector(".circular-progress"),
    progressvalue = document.querySelector(".progress-value");

let progressStartValue =0,
    progressendValue =38,
    speed = 100;

    let progress = setInterval(( )=>{
        progressStartValue++;

        progressvalue.textContent = `${progressStartValue}%`
        circularprogress.style.background = `conic-gradient(#4831D4 ${progressStartValue * 3.6}deg,#ededed 0deg)`
        if(progressStartValue == progressendValue){
            clearInterval(progress)
        }
    }, speed);
    
/*------------------------------------------------------------------------------------*/
let circularprogress2= document.querySelector(".circular-progress2"),
    progressvalue2 = document.querySelector(".progress-value2");

let progressStartValue2 =0,
    progressendValue2 =32,
    speed2 = 100;

    let progress2 = setInterval(( )=>{
        progressStartValue2++;

        progressvalue2.textContent = `${progressStartValue2}%`
        circularprogress2.style.background = `conic-gradient(#4831D4 ${progressStartValue2 * 3.6}deg,#ededed 0deg)`
        if(progressStartValue2 == progressendValue2){
            clearInterval(progress2)
        }
    }, speed2);
/*------------------------------------------------------------------------------------*/
let circularprogress3= document.querySelector(".circular-progress3"),
    progressvalue3 = document.querySelector(".progress-value3");

let progressStartValue3 =0,
    progressendValue3 =18,
    speed3 = 100;

    let progress3 = setInterval(( )=>{
        progressStartValue3++;

        progressvalue3.textContent = `${progressStartValue3}%`
        circularprogress3.style.background = `conic-gradient(#4831D4 ${progressStartValue3 * 3.6}deg,#ededed 0deg)`
        if(progressStartValue3 == progressendValue3){
            clearInterval(progress3)
        }
    }, speed3);
/*------------------------------------------------------------------------------------*/
const barras = document.querySelector(".barras");
const header = document.querySelector(".navbar");


barras.addEventListener("click", ()=>
    header.classList.toggle("ativar")
);
const item = document.querySelectorAll(".item");

item.forEach(item => {
    item.addEventListener("click", () => {
      header.classList.remove("ativar");
      
    });
  });