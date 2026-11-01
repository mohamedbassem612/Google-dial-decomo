package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class myt implements defpackage.zta {
    public final defpackage.kaw a;
    public final defpackage.rsr b;
    private final defpackage.aoss c;

    public myt(defpackage.kaw kawVar, defpackage.rsr rsrVar, defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = kawVar;
        this.b = rsrVar;
        this.c = aossVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        throw new java.lang.AssertionError();
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).s ? defpackage.aiql.z(zsz.d) : defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final defpackage.ajcq c(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return defpackage.aosv.F(this.c, 0, new msi(this, zrxVar, (defpackage.aoln) null, 12), 3);
    }
}
