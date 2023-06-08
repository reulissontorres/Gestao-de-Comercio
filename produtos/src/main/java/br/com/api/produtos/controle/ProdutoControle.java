package br.com.api.produtos.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.servico.ProdutoServico;

@RestController
// @CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "*")
public class ProdutoControle {

    @Autowired
    private ProdutoServico ps;

    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<RespostaModelo> remover(@PathVariable long codigo) {
        return ps.remover(codigo);
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModelo pm) {
        return ps.cadastrarAlterar(pm, "alterar");
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm) {
        return ps.cadastrarAlterar(pm, "cadastrar");
    }

    @PostMapping("/vendas")
    public ResponseEntity<?> cadastrarVenda(@RequestBody Map<String, List<Long>> venda) {
        List<Long> codigosProdutos = venda.get("codigosProdutos");
        List<Integer> quantidades = new ArrayList<>();

        List<Long> vendaQuantidades = venda.get("quantidades");
        for (Long quantidade : vendaQuantidades) {
            quantidades.add(quantidade.intValue());
        }

        return ps.cadastrarVenda(codigosProdutos, quantidades);
    }

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar() {
        return ps.listar();
    }

    @GetMapping("/")
    public String rota() {
        return "API de produtos funcionando!";
    }

}
