package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class moj implements defpackage.jye {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/calllogchip/DobbyDoNotScreenChipIntegration");
    private final rlv b;
    private final aeqx c;
    private final rsr d;

    public moj(aeqx aeqxVar, rlv rlvVar, rsr rsrVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.c = aeqxVar;
        this.b = rlvVar;
        this.d = rsrVar;
    }

    @Override // defpackage.jye
    public final defpackage.jyd a(kiu kiuVar) {
        aooh.f(kiuVar, "row");
        kit kitVarB = kit.b(kiuVar.v);
        if (kitVarB == null) {
            kitVarB = kit.a;
        }
        if (kitVarB != kit.d && this.d.O(kiuVar).l && afsq.cf(kiuVar)) {
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            if (!kiwVar.j) {
                defpackage.kiw kiwVar2 = kiuVar.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                if (!kiwVar2.r && !kiuVar.s) {
                    return new defpackage.jyd(2131231588, new defpackage.jyk(2132017699), null, null, defpackage.abja.eR, 1);
                }
            }
        }
        return null;
    }

    @Override // defpackage.jye
    public final void b(defpackage.jyg jygVar) {
        a.b().l("com/android/dialer/dobby/impl/calllogchip/DobbyDoNotScreenChipIntegration", "onClick", 41, "DobbyDoNotScreenChipIntegration.kt").v("do-not-screen chip clicked");
        this.b.o(rmx.kF);
        kiu kiuVar = jygVar.a;
        defpackage.hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        java.lang.String str = hkdVar.c;
        aooh.e(str, "getNormalizedNumber(...)");
        defpackage.hkd hkdVar2 = kiuVar.f;
        if (hkdVar2 == null) {
            hkdVar2 = defpackage.hkd.a;
        }
        java.lang.String str2 = hkdVar2.d;
        aooh.e(str2, "getCountryIso(...)");
        java.lang.String string = this.c.d(kiuVar, true).toString();
        akzx akzxVarM = rmy.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        rmy rmyVar = akzxVarM.b;
        rmyVar.c = 1;
        rmyVar.b |= 1;
        rmy rmyVarP = akzxVarM.p();
        aooh.e(rmyVarP, "build(...)");
        rmy rmyVar2 = rmyVarP;
        defpackage.kis kisVar = kiuVar.u;
        if (kisVar == null) {
            kisVar = defpackage.kis.a;
        }
        alan alanVar = kisVar.d;
        aooh.e(alanVar, "getCoalescedTimestampMillisList(...)");
        mni.ai(str, str2, string, rmyVar2, (java.lang.Long) ajsz.bG(alanVar)).r(jygVar.c.a(), "dobby_do_not_screen_dialog");
    }

    @Override // defpackage.jye
    public final java.lang.Object c(defpackage.jyd jydVar) {
        return aojh.a;
    }
}
