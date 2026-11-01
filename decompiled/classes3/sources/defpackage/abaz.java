package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abaz {
    static final /* synthetic */ defpackage.abaz a = new defpackage.abaz();
    private static final defpackage.ajyr b = new defpackage.ajys();

    public static final int c(java.lang.String str) {
        aooh.f(str, "inputString");
        return str.length() + 2;
    }

    public final defpackage.abba a(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "rawContent");
        aooh.f(str2, "languageCode");
        return b(ajsz.aY(aaoo.H(str, str2)));
    }

    public final defpackage.abba b(java.util.List list) {
        aooh.f(list, "builders");
        return new defpackage.abbc(list, b);
    }
}
