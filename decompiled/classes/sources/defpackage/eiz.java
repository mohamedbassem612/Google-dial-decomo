package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eiz {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.eiv b;

    static {
        defpackage.eiu eixVar;
        if (defpackage.egd.a()) {
            eixVar = new defpackage.eiu();
        } else {
            eixVar = eix.a != null ? new eix() : new eiw();
        }
        b = eixVar;
    }

    static int a(java.lang.String str, byte[] bArr, int i, int i2) {
        return b.a(str, bArr, i, i2);
    }

    static int b(java.lang.String str) {
        return b.c(str);
    }

    static java.lang.String c(byte[] bArr, int i, int i2) {
        return i2 == 0 ? "" : b.b(bArr, i, i2);
    }
}
