package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{
    @Override
    public String getMenu() {
        return """
                Cabernet Sauvignon → vinhos Cabernet Sauvignon
                Merlot → vinhos Merlot
                Pinot Noir → vinhos Pinot Noir
                Chardonnay → vinhos Chardonnay
                Sauvignon Blanc → vinhos frescos e aromáticos
                Riesling → vinhos aromáticos da Alemanha
                """;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
