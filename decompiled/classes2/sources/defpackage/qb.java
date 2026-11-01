package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qb {
    public final java.lang.String a;
    public boolean b;
    public boolean f;
    public java.util.List d = new java.util.ArrayList();
    public final int e = -1;
    public final defpackage.qj c = new defpackage.qj();

    public qb(java.lang.String str) {
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
    }

    public final void a() {
        if (this.f) {
            this.d = new java.util.ArrayList(this.d);
            this.f = false;
        }
    }
}
