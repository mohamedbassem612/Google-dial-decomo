package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alm implements defpackage.ajg {
    public final int a;
    public final int b;
    private final defpackage.ajh c;

    public /* synthetic */ alm(int i, defpackage.ajh ajhVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? defpackage.ajk.a : ajhVar);
    }

    @Override // defpackage.aiq
    public final /* bridge */ /* synthetic */ alp a(defpackage.nf nfVar) {
        return c();
    }

    @Override // defpackage.ajg
    public final /* bridge */ /* synthetic */ als b(defpackage.nf nfVar) {
        return c();
    }

    public final amc c() {
        return new amc(this.a, this.b, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.alm) {
            defpackage.alm almVar = (defpackage.alm) obj;
            if (almVar.a == this.a && almVar.b == this.b && defpackage.aooh.n(almVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public alm(int i, int i2, defpackage.ajh ajhVar) {
        this.a = i;
        this.b = i2;
        this.c = ajhVar;
    }

    public alm() {
        this(0, (defpackage.ajh) null, 7);
    }
}
