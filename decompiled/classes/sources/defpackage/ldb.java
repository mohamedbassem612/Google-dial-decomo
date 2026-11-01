package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ldb {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/history/CallScreenDataLoaderImpl");
    public final defpackage.ajct b;
    public final defpackage.ajct c;
    public final defpackage.lkk d;
    public final defpackage.kjr e;
    public final defpackage.zjm f;

    public ldb(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.lkk lkkVar, defpackage.kjr kjrVar, defpackage.zjm zjmVar) {
        this.b = ajctVar;
        this.c = ajctVar2;
        this.d = lkkVar;
        this.e = kjrVar;
        this.f = zjmVar;
    }

    public final defpackage.ajcq a(defpackage.aify aifyVar) {
        return defpackage.ahvr.I(this.d.b(aifyVar), new kxm(this, 20), this.b);
    }

    public final defpackage.ajcq b(java.util.concurrent.Callable callable, int i) {
        defpackage.ajcq ajcqVarSubmit = this.c.submit(defpackage.ahqx.i(new jyr(callable, 19)));
        lhb lhbVar = new lhb(this, i, 1);
        defpackage.ajct ajctVar = this.b;
        return defpackage.ahvr.H(defpackage.ahvr.I(ajcqVarSubmit, lhbVar, ajctVar), new kxn(this, 12), ajctVar);
    }
}
