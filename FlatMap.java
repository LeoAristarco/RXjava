    public static void main (String [ ] args) {

        ArrayList<Integer> numeros= new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        System.out.println("HOLAAAA");
        System.out.println(numeros);


        Observable.fromArray(numeros)
                .flatMap(algo->Observable.fromIterable(algo))
                .map(a->String.valueOf("{"+a))
                .subscribe(b-> System.out.print(b));

        System.out.println("");
        System.out.println("sss");
    }

    }
