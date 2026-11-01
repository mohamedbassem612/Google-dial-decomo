package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aqam {
    public int a;
    final java.util.List b;
    public final java.util.List c;
    public int d;

    public aqam() {
        this.d = 1;
        this.a = -1;
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
    }

    public final java.util.List a() {
        return j$.util.DesugarCollections.unmodifiableList(this.b);
    }

    public aqam(byte[] bArr) {
        this();
    }
}
