fetch('https://cat-fact.herokuapp.com/facts/random?animal_type=dog&amount=2')
  .then((res) => res.json())
  .then((data) => console.log(data))
