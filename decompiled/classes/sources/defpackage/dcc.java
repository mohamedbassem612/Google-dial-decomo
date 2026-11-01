package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dcc {
    public defpackage.cmv a;
    public int b;
    public boolean c;
    final /* synthetic */ defpackage.dce d;
    public defpackage.adq e;
    public defpackage.adq f;

    public dcc(defpackage.dce dceVar, defpackage.cmv cmvVar, int i, defpackage.adq adqVar, defpackage.adq adqVar2, boolean z) {
        this.d = dceVar;
        this.a = cmvVar;
        this.b = i;
        this.e = adqVar;
        this.f = adqVar2;
        this.c = z;
    }

    public final boolean a(int i, int i2) {
        return defpackage.cfo.r((defpackage.cmu) this.e.c(this.b + i), (defpackage.cmu) this.f.c(this.b + i2)) != 0;
    }
}
