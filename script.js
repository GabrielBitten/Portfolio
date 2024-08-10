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
    progressendValue =80,
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
    progressendValue2 =65,
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
    progressendValue3 =55,
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
    let circularprogress4 = document.querySelector(".circular-progress4"),
    progressvalue4 = document.querySelector(".progress-value4");

let progressStartValue4 = 0,
    progressendValue4 = 25,
    speed4 = 100;

let progress4 = setInterval(() => {
    progressStartValue4++;

    progressvalue4.textContent = `${progressStartValue4}%`;
    circularprogress4.style.background = `conic-gradient(#4831D4 ${progressStartValue4 * 3.6}deg, #ededed 0deg)`;

    if (progressStartValue4 == progressendValue4) {
        clearInterval(progress4);
    }
}, speed4);

    /*------------------------------------------------------------------------------------*/
    let circularprogress5 = document.querySelector(".circular-progress5"),
    progressvalue5 = document.querySelector(".progress-value5");

let progressStartValue5 = 0,
    progressendValue5 = 12,
    speed5 = 100;

let progress5 = setInterval(() => {
    progressStartValue5++;

    progressvalue5.textContent = `${progressStartValue5}%`;
    circularprogress5.style.background = `conic-gradient(#4831D4 ${progressStartValue5 * 3.6}deg, #ededed 0deg)`;

    if (progressStartValue5 == progressendValue5) {
        clearInterval(progress5);
    }
}, speed5);

    /*------------------------------------------------------------------------------------*/
    let circularprogress6 = document.querySelector(".circular-progress6"),
    progressvalue6 = document.querySelector(".progress-value6");

let progressStartValue6 = 0,
    progressendValue6 = 20,
    speed6 = 100;

let progress6 = setInterval(() => {
    progressStartValue6++;

    progressvalue6.textContent = `${progressStartValue6}%`;
    circularprogress6.style.background = `conic-gradient(#4831D4 ${progressStartValue6 * 3.6}deg, #ededed 0deg)`;

    if (progressStartValue6 == progressendValue6) {
        clearInterval(progress6);
    }
}, speed6);

    /*------------------------------------------------------------------------------------*/
    let circularprogress7 = document.querySelector(".circular-progress7"),
    progressvalue7 = document.querySelector(".progress-value7");

let progressStartValue7 = 0,
    progressendValue7 = 50,
    speed7 = 100;

let progress7 = setInterval(() => {
    progressStartValue7++;

    progressvalue7.textContent = `${progressStartValue7}%`;
    circularprogress7.style.background = `conic-gradient(#4831D4 ${progressStartValue7 * 3.6}deg, #ededed 0deg)`;

    if (progressStartValue7 == progressendValue7) {
        clearInterval(progress7);
    }
}, speed7);

    /*------------------------------------------------------------------------------------*/
    let circularprogress8 = document.querySelector(".circular-progress8"),
    progressvalue8 = document.querySelector(".progress-value8");

let progressStartValue8 = 0,
    progressendValue8 = 35,
    speed8 = 100;

let progress8 = setInterval(() => {
    progressStartValue8++;

    progressvalue8.textContent = `${progressStartValue8}%`;
    circularprogress8.style.background = `conic-gradient(#4831D4 ${progressStartValue8 * 3.6}deg, #ededed 0deg)`;

    if (progressStartValue8 == progressendValue8) {
        clearInterval(progress8);
    }
}, speed8);

/*------------------------------------------------------------------------------------*/

let circularprogress9 = document.querySelector(".circular-progress9"),
    progressvalue9 = document.querySelector(".progress-value9");

let progressStartValue9 = 0,
    progressendValue9 = 60,
    speed9 = 100;

let progress9 = setInterval(() => {
    progressStartValue9++;

    progressvalue9.textContent = `${progressStartValue9}%`;
    circularprogress9.style.background = `conic-gradient(#4831D4 ${progressStartValue9 * 3.6}deg, #ededed 0deg)`;

    if (progressStartValue9 == progressendValue9) {
        clearInterval(progress9);
    }
}, speed9);

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
