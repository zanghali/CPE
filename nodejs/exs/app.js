console.log("Hello World!");

// Pour récupérer les arguments
process.argv.forEach((val, index) => {
    //( /!\ ne pas oublier d'utiliser la fct Number() pour caster les arg string en int si besoin )
    console.log(`${index}: ${val}`);
  });