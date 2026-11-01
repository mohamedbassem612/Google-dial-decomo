package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tcv {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl");
    public final defpackage.tcu b;
    public final defpackage.ajct c;
    public final defpackage.aoin d;
    public final defpackage.tcx e;
    public final defpackage.ruc f;
    private final defpackage.zrw g;

    public tcv(defpackage.tcu tcuVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.tcx tcxVar, defpackage.ruc rucVar, defpackage.zrw zrwVar) {
        this.b = tcuVar;
        this.c = ajctVar;
        this.d = aoinVar;
        this.e = tcxVar;
        this.f = rucVar;
        this.g = zrwVar;
    }

    public final defpackage.ajcq a() {
        j$.util.Optional optionalA = this.f.a();
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(877, "RttConfigurationLoaderImpl_load", defpackage.ahot.a, true);
        try {
            defpackage.zrw zrwVar = this.g;
            defpackage.ahrv ahrvVarG = defpackage.ahrv.g(defpackage.aosv.F(zrwVar.d, 0, new defpackage.unj(zrwVar, (defpackage.aoln) null, 16, (short[]) null), 3));
            defpackage.jwf jwfVar = new defpackage.jwf(this, 16);
            defpackage.ajct ajctVar = this.c;
            defpackage.ahrv ahrvVarH = ahrvVarG.i(jwfVar, ajctVar).h(new defpackage.jtv(this, optionalA, 12), ajctVar);
            ahoqVarX.a(ahrvVarH);
            ahoqVarX.close();
            return ahrvVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
