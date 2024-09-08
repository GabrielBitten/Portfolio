window.addEventListener("scroll", function(){
    let header = document.querySelector('#inicio-tela')
    header.classList.toggle('scrolling', window.scrollY > 100)
})



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

  window.addEventListener('scroll', function() {
    const check = document.querySelectorAll('input[type="radio"]');
    check.forEach(radio => {
        radio.checked = false;
    });
});

