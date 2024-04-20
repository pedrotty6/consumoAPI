package org.example;

import org.example.dto.EnderecoDTO;
import org.example.servico.ApiServico;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApiServico apiServico = new ApiServico();

        System.out.print("Digite o CEP que deseja buscar: ");
        String cepDigitado = sc.nextLine();

        try{
            EnderecoDTO enderecoDTO = apiServico.getEndereco(cepDigitado);
            System.out.println("Seu CEP é: " + enderecoDTO.getCep());
            System.out.println("Você mora na " + enderecoDTO.getLogradouro());
            System.out.println("Você mora no bairro " + enderecoDTO.getBairro());
            System.out.println("Na localidade: " + enderecoDTO.getLocalidade());
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }}