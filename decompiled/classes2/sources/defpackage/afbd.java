package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afbd {
    public java.lang.Object a = new java.util.ArrayList();
    private boolean b = false;

    public afbd(byte[] bArr) {
    }

    public final void a() {
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final defpackage.qz b() {
        this.b = true;
        return new defpackage.qz(this.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public final void c() {
        if (this.b) {
            this.a = new java.util.ArrayList((java.util.Collection) this.a);
            this.b = false;
        }
    }

    public final akwb d() {
        return new akwb(this.b, (defpackage.afbc) this.a);
    }
}
