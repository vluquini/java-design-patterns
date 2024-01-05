package creational.builder.ex2;
/*
O problema desta abordagem é poluir sempre a classe 'Produto'
com o construtor do objeto.
 */
public class Client {
    public static void main(String[] args) {
        /*
        Esta abordagem pode poluir o código do Cliente, se o obeto a ser construído
        for muito grande.
         */
//        new Person("Carlos", "Junior", "carlosJ", "calos.j@gmail.com");
        Person p1 = new Person.PersonBuilder()
                .firstName("Roberto")
                .lastName("José")
                .userName("ccJose")
                .email("carlosjose@gmail.com")
                .build();

        System.out.println(p1.toString());


    }
}
