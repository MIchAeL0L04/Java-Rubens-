using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BANCO
{
    class Program
    {
        static void Main(string[] args)
        {
            double saldo = 1000, valor;
            string saque = "saque", deposito = "deposito", operacao;

            Console.Write("Este programa faz o saque e o deposito em uma conta.");            

            Console.Write("\n\nSaldo Atual: {0}", saldo);
            Console.Write("\nQual operação você deseja fazer? saque/deposito: ");
            operacao = Console.ReadLine();

            Console.Write("\nDe quanto sera o {0}?", operacao == "saque" ? saque : deposito);
            valor = double.Parse(Console.ReadLine());

            Console.Write("\nSaldo atual: {0}", operacao == "saque" ? saldo -= valor : saldo += valor);
            Console.Write("\n\nAperte qualquer tecla para fechar o programa...");

            Console.ReadKey();
        }
    }
}
