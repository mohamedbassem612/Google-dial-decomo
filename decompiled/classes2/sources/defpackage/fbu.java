package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fbu {
    public final defpackage.eqg a;
    public final defpackage.eqg b;
    public final int c;
    public final int d;
    public final defpackage.faw e;
    public final defpackage.ese f;
    public final defpackage.erm g;
    public final java.lang.Object h;
    public int i;
    public int j;

    public fbu(defpackage.eqg eqgVar, defpackage.eqg eqgVar2, int i, int i2, defpackage.faw fawVar, defpackage.ese eseVar, defpackage.erm ermVar, java.lang.Object obj) {
        this.a = eqgVar;
        this.b = eqgVar2;
        this.c = i;
        this.d = i2;
        this.e = fawVar;
        this.f = eseVar;
        this.g = ermVar;
        this.h = obj;
        this.i = eqgVar.L;
        this.j = eqgVar.M;
    }

    public final long a(long j) {
        return eum.y(j, this.e.b);
    }

    public final defpackage.fbu b(defpackage.faw fawVar) {
        defpackage.fbu fbuVar = new defpackage.fbu(this.a, this.b, this.c, this.d, fawVar, this.f, this.g, this.h);
        fbuVar.i = this.i;
        fbuVar.j = this.j;
        return fbuVar;
    }

    public final boolean c() {
        return j$.util.Objects.equals(this.a.p, "audio/raw");
    }
}
