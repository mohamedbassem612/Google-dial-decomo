package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class isv {
    private static final aimz b = aimz.i("com/android/dialer/beesly/impl/callscreeningservice/BeeslyCallScreeningServiceConditions");
    public final zpm a;
    private final oju c;

    public isv(aolr aolrVar, zpm zpmVar, oju ojuVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(zpmVar, "callScopes");
        aooh.f(ojuVar, "dialerAudioManager");
        this.a = zpmVar;
        this.c = ojuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.isu isuVar;
        if (aolnVar instanceof defpackage.isu) {
            isuVar = (defpackage.isu) aolnVar;
            int i = isuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                isuVar.c = i - Integer.MIN_VALUE;
            } else {
                isuVar = new defpackage.isu(this, aolnVar);
            }
        } else {
            isuVar = new defpackage.isu(this, aolnVar);
        }
        java.lang.Object objF = isuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = isuVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objF);
            aihd aihdVarB = this.a.b(zpo.f);
            aooh.e(aihdVarB, "getCallScopesWithState(...)");
            if (!aihdVarB.isEmpty()) {
                b.b().l("com/android/dialer/beesly/impl/callscreeningservice/BeeslyCallScreeningServiceConditions", "hasAnotherActiveCall", 28, "BeeslyCallScreeningServiceConditions.kt").v("another call is ACTIVE");
                return java.lang.Boolean.TRUE;
            }
            oju ojuVar = this.c;
            isuVar.c = 1;
            objF = ojuVar.f(isuVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        int iIntValue = ((java.lang.Number) objF).intValue();
        if (iIntValue != 2 && iIntValue != 3) {
            z = false;
        }
        aimw aimwVarL = b.b().l("com/android/dialer/beesly/impl/callscreeningservice/BeeslyCallScreeningServiceConditions", "hasAnotherActiveCall", 36, "BeeslyCallScreeningServiceConditions.kt");
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        aimwVarL.y("isAnotherCallActive: %s", boolValueOf);
        return boolValueOf;
    }
}
