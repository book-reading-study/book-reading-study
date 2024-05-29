package ch21.hjk.practice;

import java.lang.reflect.InvocationTargetException;

public class PrinterProxy implements Printable {
    private String name;
    private String className;
    private Printer real;

    public PrinterProxy() {
        this.name = "No Name";
        this.className = "ch21.hjk.practice.Printer";
        this.real = null;
    }

    public PrinterProxy(String name) {
        this.name = name;
        this.className = "ch21.hjk.practice.Printer";
        this.real = null;
    }

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
        this.real = null;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null){
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if(real == null) {
            try {
                real = (Printer) Class.forName(className).getDeclaredConstructor().newInstance();
                real.setPrinterName(name);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }


}
