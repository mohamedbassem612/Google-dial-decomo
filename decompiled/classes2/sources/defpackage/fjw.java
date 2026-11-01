package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fjw {
    public static final java.util.concurrent.Executor a = new defpackage.fjq(0);
    public final android.content.Context b;
    public final android.util.SparseArray c;
    public final boolean d;
    public final defpackage.fkm e;
    public final defpackage.etc f;
    public final java.util.concurrent.CopyOnWriteArraySet g;
    public final long h;
    public final defpackage.fkb i;
    public defpackage.euj j = new defpackage.euj();
    public final defpackage.eqg k;
    public defpackage.etk l;
    public android.util.Pair m;
    public int n;
    public int o;
    public long p;
    public int q;
    public final defpackage.oq r;

    public fjw(defpackage.fjs fjsVar) {
        this.b = fjsVar.a;
        defpackage.oq oqVar = fjsVar.h;
        ahvr.ci(oqVar);
        this.r = oqVar;
        this.c = new android.util.SparseArray();
        aify aifyVar = aike.a;
        this.d = fjsVar.c;
        defpackage.etc etcVar = fjsVar.d;
        this.f = etcVar;
        this.h = -fjsVar.f;
        defpackage.fkb fkbVar = fjsVar.g;
        this.i = fkbVar;
        this.e = new defpackage.fjf(fjsVar.b, fkbVar, etcVar);
        new defpackage.fjr(this);
        this.g = new java.util.concurrent.CopyOnWriteArraySet();
        this.k = new defpackage.eqg(new defpackage.eqf());
        this.p = -9223372036854775807L;
        this.q = -1;
        this.o = 0;
    }

    public static final defpackage.epy b(defpackage.epy epyVar) {
        return (epyVar == null || !epyVar.g()) ? defpackage.epy.a : epyVar;
    }

    public final void a() {
        this.e.b();
    }
}
