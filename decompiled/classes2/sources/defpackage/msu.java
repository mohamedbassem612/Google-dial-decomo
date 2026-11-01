package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msu {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallScreeningServiceConditions");
    public final aolr b;
    public final sqt c;
    public final onw d;
    private final oju e;
    private final zpm f;

    public msu(aolr aolrVar, zpm zpmVar, sqt sqtVar, oju ojuVar, onw onwVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(zpmVar, "callScopes");
        aooh.f(ojuVar, "dialerAudioManager");
        this.b = aolrVar;
        this.f = zpmVar;
        this.c = sqtVar;
        this.e = ojuVar;
        this.d = onwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.mst mstVar;
        if (aolnVar instanceof defpackage.mst) {
            mstVar = (defpackage.mst) aolnVar;
            int i = mstVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mstVar.c = i - Integer.MIN_VALUE;
            } else {
                mstVar = new defpackage.mst(this, aolnVar);
            }
        } else {
            mstVar = new defpackage.mst(this, aolnVar);
        }
        java.lang.Object objF = mstVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mstVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objF);
            aihd aihdVarB = this.f.b(zpo.f);
            aooh.e(aihdVarB, "getCallScopesWithState(...)");
            if (!aihdVarB.isEmpty()) {
                a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallScreeningServiceConditions", "hasAnotherActiveCall", 41, "DobbyCallScreeningServiceConditions.kt").v("another call is ACTIVE");
                return java.lang.Boolean.TRUE;
            }
            oju ojuVar = this.e;
            mstVar.c = 1;
            objF = ojuVar.f(mstVar);
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
        aimw aimwVarL = a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallScreeningServiceConditions", "hasAnotherActiveCall", 49, "DobbyCallScreeningServiceConditions.kt");
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        aimwVarL.y("isAnotherCallActive: %s", boolValueOf);
        return boolValueOf;
    }

    public final java.lang.Object b(android.telecom.Call.Details details, aoln aolnVar) {
        return aoov.aj(this.b, new defpackage.lwe(details, this, (aoln) null, 5), aolnVar);
    }

    public final boolean c() {
        aihd aihdVarB = this.f.b(zpo.l);
        aooh.e(aihdVarB, "getCallScopesWithState(...)");
        return !aihdVarB.isEmpty();
    }
}
