<script>
// The debounce function receives our function as a parameter
    const debounce = (fn) => {
        // This holds the requestAnimationFrame reference, so we can cancel it if we wish
        let frame;

        // The debounce function returns a new function that can receive a variable number of arguments
        return (...params) => {
            // If the frame variable has been defined, clear it now, and queue for next frame
            if (frame) {
                cancelAnimationFrame(frame);
            }

            // Queue our function call for the next frame
            frame = requestAnimationFrame(() => {
                // Call our function and pass any params we received
                fn(...params);
            });
        };
    };

    // Reads out the scroll position and stores it in the data attribute
    // so we can use it in our stylesheets
    const storeScroll = () => {
        document.documentElement.dataset.scroll = window.scrollY;
    };

    // Listen for new scroll events, here we debounce our `storeScroll` function
    document.addEventListener('scroll', debounce(storeScroll));

    // Update scroll position for first time
    storeScroll();
</script>

<template>
        <section class="header" id="header">
            <nav>
                <div class="navbar">
                    <a href="index.html" id="logo"> <img src="./assets/img/logo.png"></a>
                    <ul>
                        <li><a href="#header">Home</a></li>
                        <li><a href="#about-us">Chi Siamo</a></li>
                        <li><a href="./assets/customer.html">La nostra storia</a></li>

                    </ul>
                    <ul class="right-nav">
                        <li><a href="" id="login">Accedi</a></li>
                        <li><a href="" id="contact-link">Contattaci</a></li>
                    </ul>
                </div>
            </nav>
            <div class="front-text">
                <h1>Specialisti nella vendita all'ingrosso</h1>
                <p>bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla <br>bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla
                    bla bla bla bla bla bla.
                </p>
                <a class="contact-btn" href="">Contattaci per un consulto gratuito</a>
            </div>
        </section>

        <section class="about-us" id="about-us">
            <div class="about-img">
                <img src="./assets/img/about-us.jpg" alt="">
            </div>
            <div class="about-text">
                <h3>Chi siamo</h3>
                <h2>Exceptional Quality, Fast Delivery Time, Unbeatable Price</h2>
                <p>Through our 50 plus years of manufacturing, we have improved our operations with automation, computerization, quality control, training, and design & improved raw materials purchasing.</p>
            </div>
        </section>
</template>

<style>
@import './assets/index_style.css';
</style>
