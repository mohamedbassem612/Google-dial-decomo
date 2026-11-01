package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sty implements defpackage.zta {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/precall/integrations/MalformedNumberRectifierPrecallIntegration");
    private final defpackage.aoss b;

    public sty(defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = aossVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return defpackage.aiql.z(zsz.d);
    }

    @Override // defpackage.zta
    public final defpackage.ajcq c(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return defpackage.aosv.F(this.b, 0, new sfo(zrxVar, (defpackage.aoln) null, 9), 3);
    }
}
