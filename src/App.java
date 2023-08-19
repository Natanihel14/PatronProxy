import inter.ICuenta;
import inter.impl.CuentaBancoAImpl;
import model.Cuenta;
import proxy.CuentaProxy;

public class App {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "mitocode", 100);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);

    }

}