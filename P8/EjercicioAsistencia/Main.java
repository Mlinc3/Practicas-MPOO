void main() {
    RecursoCloud bucket = new RecursoCloud("bucket-fotos");
    MaquinaVirtual vm1 = new MaquinaVirtual();
    MaquinaVirtual vm2 = new MaquinaVirtual("api-gateway", "mx-central-1", 0.12, 8, 32);
    ModeloIA chatbot = new ModeloIA("chatbot-soporte",70);
    System.out.println(bucket);
    System.out.println(vm1);
    System.out.println(vm2);
    System.out.println(chatbot);
}
