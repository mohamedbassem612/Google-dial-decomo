package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tst implements defpackage.ttd {
    private static final aimz a = aimz.i("com/android/dialer/sharpie/impl/state/SharpieScamAlertStateHolder");
    private final java.util.List b = new java.util.ArrayList();

    private final defpackage.ttc c(alcf alcfVar, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.b;
        int i2 = 0;
        for (java.lang.Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ajsz.bh();
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
            numValueOf.intValue();
            alcf alcfVar2 = ((defpackage.ttf) obj).f;
            if (alcfVar2 == null) {
                alcfVar2 = alcf.a;
            }
            if (true != aooh.n(alcfVar2, alcfVar)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i2 = i3;
        }
        java.lang.Integer num = (java.lang.Integer) ajsz.bO(arrayList);
        if (num == null) {
            a.d().l("com/android/dialer/sharpie/impl/state/SharpieScamAlertStateHolder", "updateCurrentScamAlerts", 59, "SharpieScamAlertStateHolder.kt").y("no matching scam alert found for scam alert with timestamp %s", alcfVar);
            return defpackage.ttc.a;
        }
        int iIntValue = num.intValue();
        defpackage.vqu vquVarCt = wsc.ct(((defpackage.ttf) list.get(num.intValue())).p());
        vquVarCt.ac(i);
        list.set(iIntValue, vquVarCt.ab());
        return defpackage.ttc.b;
    }

    @Override // defpackage.ttd
    public final defpackage.ttc a(defpackage.ttb ttbVar) {
        aooh.f(ttbVar, "event");
        int i = ttbVar.b;
        int iCm = wsc.cm(i);
        if (iCm == 0) {
            throw null;
        }
        int i2 = iCm - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                alcf alcfVar = (i == 3 ? (defpackage.tsw) ttbVar.c : defpackage.tsw.a).c;
                if (alcfVar == null) {
                    alcfVar = alcf.a;
                }
                aooh.e(alcfVar, "getTimestamp(...)");
                return c(alcfVar, 5);
            }
            if (i2 != 3) {
                return defpackage.ttc.a;
            }
            alcf alcfVar2 = (i == 4 ? (defpackage.tsx) ttbVar.c : defpackage.tsx.a).c;
            if (alcfVar2 == null) {
                alcfVar2 = alcf.a;
            }
            aooh.e(alcfVar2, "getTimestamp(...)");
            return c(alcfVar2, 4);
        }
        aimw aimwVarL = a.b().l("com/android/dialer/sharpie/impl/state/SharpieScamAlertStateHolder", "update", 30, "SharpieScamAlertStateHolder.kt");
        defpackage.ttf ttfVar = (ttbVar.b == 2 ? (defpackage.tsy) ttbVar.c : defpackage.tsy.a).c;
        if (ttfVar == null) {
            ttfVar = defpackage.ttf.a;
        }
        alcf alcfVar3 = ttfVar.f;
        if (alcfVar3 == null) {
            alcfVar3 = alcf.a;
        }
        aimwVarL.y("adding scam alert at timestamp %s", alcfVar3);
        java.util.List list = this.b;
        defpackage.ttf ttfVar2 = (ttbVar.b == 2 ? (defpackage.tsy) ttbVar.c : defpackage.tsy.a).c;
        if (ttfVar2 == null) {
            ttfVar2 = defpackage.ttf.a;
        }
        aooh.e(ttfVar2, "getScamAlert(...)");
        list.add(ttfVar2);
        return defpackage.ttc.b;
    }

    @Override // defpackage.ttd
    public final defpackage.tti b(defpackage.tti ttiVar) {
        aooh.f(ttiVar, "model");
        defpackage.vqu vquVarCu = wsc.cu(ttiVar.p());
        akzx akzxVar = (akzx) vquVarCu.a;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.tti) akzxVar.b).d);
        aooh.e(listUnmodifiableList, "getScamAlertsList(...)");
        new alct(listUnmodifiableList);
        akzxVar.u();
        defpackage.tti ttiVar2 = (defpackage.tti) akzxVar.b;
        alat alatVar = ttiVar2.d;
        if (!alatVar.c()) {
            ttiVar2.d = alad.J(alatVar);
        }
        akyl.i(this.b, ttiVar2.d);
        return vquVarCu.ad();
    }
}
