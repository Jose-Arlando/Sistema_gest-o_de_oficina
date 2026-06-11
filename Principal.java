package PROJETO02;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        int id = 1;
        int num = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
        ArrayList<OS> listaOs = new ArrayList<>();
        System.out.println("Bem-vindo ao sistema de gerenciamento de ordens de serviço!");
        int opcao;
        do{
            System.out.println("-------------------------------");
            System.out.println("1 - Cliente");
            System.out.println("2 - Veículo");
            System.out.println("3 - Ordem de Serviço");
            System.out.println("4 - Relatório");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------");
            switch(opcao){
                case 1:
                    System.out.println("1 - Cadastrar cliente");
                    System.out.println("2 - Entrar como cliente");
                    System.out.print("Escolha uma opção: ");
                    int opcaocliente = sc.nextInt();
                    sc.nextLine();
                    
                    if(opcaocliente == 1){                      
                        System.out.println("-------------------------------");
                        id = id + 1;
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Telefone: ");
                        String telefone = sc.nextLine();
                        System.out.println("CPF: ");
                        String cpf = sc.nextLine();
                        Cliente cliente = new Cliente(id, nome, telefone, cpf);
                        listaCliente.add(cliente);
                        System.out.println("Cliente cadastrado com sucesso! Seu ID é: " + cliente.getId());
                    } else { 
                        System.out.println("-------------------------------");
                        System.out.println("Digite seu ID:");
                        int idbusca = sc.nextInt();
                        sc.nextLine();
                        for(Cliente cliente: listaCliente){
                            if(cliente.getId() == idbusca){
                                System.out.println("-------------------------------");
                                System.out.println("Bem- vindo, "+cliente.getNome()+"!");
                                System.out.println("Este cliente já foi cadastrado.");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    System.out.println("PLaca: ");
                    String placa = sc.nextLine();
                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Marca: ");
                    String marca = sc.nextLine();
                    System.out.println("Ano: ");
                    int ano = sc.nextInt();
                    System.out.println("ID do Cliente: ");
                    int idCliente = sc.nextInt();
                    boolean clienteEncontrado = false;
                    for(Cliente cliente: listaCliente){
                        if(cliente.getId() == idCliente){
                            Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, cliente);
                            listaVeiculo.add(veiculo);
                            System.out.println("Veículo do cliente, "+cliente.getNome()+" cadastrado com sucesso!");
                            clienteEncontrado = true;
                        }
                    }
                    if(!clienteEncontrado){
                        System.out.println("Cliente não encontrado. Carro não cadastrado");
                    }
                    break;
                case 3:
                    System.out.println("-------------------------------");
                    System.out.println("1 - Criar OS");
                    System.out.println("2 - Visualizar OS");
                    System.out.print("Escolha uma opção: ");
                    int opcaoOS = sc.nextInt();
                    sc.nextLine();
                    if(opcaoOS == 1){
                        System.out.println("-------------------------------");
                        System.out.println("Data de abertura da OS:");
                        System.out.println("Dia:");
                        int diaOS = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Mês:");
                        int mesOS = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ano:");
                        int anoOS = sc.nextInt();
                        sc.nextLine();
                        String data = diaOS+"/"+mesOS+"/"+anoOS;
                        System.out.println("Descrição do problema: ");
                        String descricao = sc.nextLine();
                        System.out.println("Placa do veículo: ");
                        String placaOS = sc.nextLine();
                        String Status = "aberto";
                        Servico s = new Servico();
                        for(Veiculo veiculo: listaVeiculo){
                            if(veiculo.getPlaca().equals(placaOS)){
                                OS os = new OS(num, data, descricao, veiculo, Status, 0.0, s);
                                num = num + 1;
                                listaOs.add(os);
                                System.out.println("Ordem de serviço criada com sucesso! Número da OS: " + os.getNum());
                                // System.out.println(os.getNum()+"-----"+os.getData()+"-----"+os.getVeiculo().getCliente().getNome()+"-----"+os.getStatus());
                            } else {
                                System.out.println("ERRO: OS não pode ser criada.");
                            }
                        }
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Digite o número da OS: ");
                        int numOS = sc.nextInt();
                        sc.nextLine();
                        for(OS os: listaOs){
                            if(os.getNum() == numOS){
                                System.out.println("-------------------------------");
                                System.out.println("Número da OS: " + os.getNum());
                                System.out.println("Data de abertura: " + os.getData());
                                System.out.println("Descrição do problema: " + os.getDescricao());
                                System.out.println("Veículo: " + os.getVeiculo().getPlaca());
                                System.out.println("Status: " + os.getStatus());
                                System.out.println("-------------------------------");
                                System.out.println("1 - Editar OS");  
                                System.out.println("2 - Sair");
                                int escolhaOS = sc.nextInt();
                                sc.nextLine();
                                if(escolhaOS == 1){
                                    System.out.println("-------------------------------");
                                    String status = "em andamento";
                                    os.setStatus(status);
                                    System.out.println("1 - Adicionar serviço");
                                    System.out.println("2 - Finalizar OS");
                                    int escolha02OS = sc.nextInt();
                                    sc.nextLine();
                                    if(escolha02OS == 1){
                                        int tiposervico;
                                        do{
                                            System.out.println("-------------------------------");
                                            System.out.println("Serviços disponíveis:");
                                            System.out.println("1 - Troca de pastilha.");
                                            System.out.println("2 - Troca de óleo");
                                            System.out.println("3 - Troca de Pneu");
                                            System.out.println("0 - finalizar.");
                                            tiposervico = sc.nextInt();
                                            sc.nextLine();
                                            // Servico s = new Servico();
                                            System.out.println(os.getServico().getescrever());
                                            System.out.println(os.getServico().getValor(tiposervico));
                                            
                                        }while (tiposervico != 0);
                                        System.out.println("-------------------------------");
                                        os.setStatus("Finalizado.");
                                        System.out.println("OS FINALIZADA: ");
                                        System.out.println("Número da OS: " + os.getNum());
                                        System.out.println("Data de abertura: " + os.getData());
                                        System.out.println("Descrição do problema: " + os.getDescricao());
                                        System.out.println("Veículo: " + os.getVeiculo().getPlaca());
                                        System.out.println("Status: " + os.getStatus());
                                        System.out.println("-------------------------------");
                                        System.out.println("Serviços");                           
                                        os.getServico().getServicos();
                                        System.out.println("VALOR TOTAL: ");
                                        System.out.println(os.getServico().getValor());
                                        System.out.println("-------------------------------");
                                    } else {
                                        System.out.println("-------------------------------");
                                        os.setStatus("Finalizado");
                                        System.out.println("OS FINALIZADA: ");
                                        System.out.println("Número da OS: " + os.getNum());
                                        System.out.println("Data de abertura: " + os.getData());
                                        System.out.println("Descrição do problema: " + os.getDescricao());
                                        System.out.println("Veículo: " + os.getVeiculo().getPlaca());
                                        System.out.println("Status: " + os.getStatus());
                                        System.out.println("Serviços");
                                        os.getServico().getServicos();
                                        os.getServico().getValor();
                                    }
                                }
                            }
                                
                        }
                    }
                    break;
                case 4:
                    System.out.println("RELATÓRIO: ");
                    System.out.println("------------");
                    System.out.println("CLIENTES");
                    System.out.println("------------");
                    for(Cliente c: listaCliente){
                        System.out.println("NOME: " + c.getNome());
                        System.out.println("TELEFONE: " + c.getTel());
                        System.out.println("CPF: " + c.getCpf());
                        System.out.println("ID: " + c.getId());
                        System.out.println("------------");
                    }
                    
                    System.out.println("VEÍCULOS");
                    System.out.println("------------");
                    for(Veiculo v: listaVeiculo){
                        System.out.println("PLACA: " + v.getPlaca());
                        System.out.println("MODELO: " + v.getModelo());
                        System.out.println("MARCA: " + v.getMarca());
                        System.out.println("ANO: " + v.getAno());
                        System.out.println("PROPRIETÁRIO: " + v.getCliente().getNome());
                        System.out.println("------------");
                    }
                    
                    System.out.println("OS");
                    System.out.println("------------");
                    for(OS os: listaOs){
                        System.out.println("NÚMERO DE OS: "+os.getNum());
                        System.out.println("STATUS: "+os.getStatus());
                        System.out.println("DATA: "+os.getData());
                        System.out.println("DESCRIÇÃO: "+os.getDescricao());
                        System.out.println("VEÍCULO: "+os.getVeiculo().getPlaca());
                        System.out.println("SERVIÇOs: ");
                        os.getServico().getServicos();
                        System.out.println("VALOR TOTAL: "+os.getServico().getValor());
                        System.out.println("------------");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(opcao != 5);
        sc.close();
    }
}