package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afwv implements defpackage.fr {
    final /* synthetic */ defpackage.afwx a;

    public afwv(defpackage.afwx afwxVar) {
        j$.util.Objects.requireNonNull(afwxVar);
        this.a = afwxVar;
    }

    @Override // defpackage.fr
    public final boolean L(defpackage.ft ftVar, android.view.MenuItem menuItem) {
        defpackage.afww afwwVar = this.a.d;
        if (afwwVar != null) {
            defpackage.ahsi ahsiVar = (defpackage.ahsi) afwwVar;
            if (!defpackage.afsq.I(ahsiVar.a)) {
                return true;
            }
            defpackage.afww afwwVar2 = ahsiVar.b;
            if (defpackage.ahns.q()) {
                afwwVar2.a(menuItem);
            } else {
                defpackage.ahok ahokVarF = ((defpackage.ahpz) ahsiVar.d.a).f(1474, ahsiVar.c);
                try {
                    afwwVar2.a(menuItem);
                    ahokVarF.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahokVarF.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fr
    public final void H(defpackage.ft ftVar) {
    }
}
