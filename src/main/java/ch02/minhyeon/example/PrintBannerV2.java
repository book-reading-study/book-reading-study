package ch02.minhyeon.example;

public class PrintBannerV2 extends PrintV2 {
    private Banner banner;

    public PrintBannerV2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
