package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aced implements defpackage.aceb {
    private static final aiof a = aiof.i("GnpSdk");
    private final adzh b;
    private final adzf c;
    private final adxm d;
    private final aoin e;
    private final gat f;

    public aced(adzh adzhVar, adzf adzfVar, adxm adxmVar, gat gatVar, aoin aoinVar) {
        aooh.f(adzhVar, "gnpJobSchedulingApi");
        aooh.f(adxmVar, "clearcutLogger");
        aooh.f(gatVar, "logEventFactory");
        aooh.f(aoinVar, "growthkitEnabled");
        this.b = adzhVar;
        this.c = adzfVar;
        this.d = adxmVar;
        this.f = gatVar;
        this.e = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aceb
    public final java.lang.Object a(aduy aduyVar, defpackage.aktl aktlVar, defpackage.akqc akqcVar, aoln aolnVar) {
        defpackage.acec acecVar;
        if (aolnVar instanceof defpackage.acec) {
            acecVar = (defpackage.acec) aolnVar;
            int i = acecVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acecVar.c = i - Integer.MIN_VALUE;
            } else {
                acecVar = new defpackage.acec(this, aolnVar);
            }
        } else {
            acecVar = new defpackage.acec(this, aolnVar);
        }
        defpackage.acec acecVar2 = acecVar;
        java.lang.Object objS = acecVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = acecVar2.c;
        if (i2 == 0) {
            aooc.af(objS);
            if (((java.lang.Boolean) this.e.a()).booleanValue()) {
                int i3 = aktlVar.b;
                defpackage.aktk aktkVarB = defpackage.aktk.b(i3);
                if (aktkVarB == null) {
                    aktkVarB = defpackage.aktk.UNKNOWN_INSTRUCTION;
                }
                if (aktkVarB != defpackage.aktk.SYNC) {
                    aiob aiobVarC = a.c();
                    defpackage.aktk aktkVarB2 = defpackage.aktk.b(i3);
                    if (aktkVarB2 == null) {
                        aktkVarB2 = defpackage.aktk.UNKNOWN_INSTRUCTION;
                    }
                    aiobVarC.y("Received unsupported in-app sync instruction type - %s.", aktkVarB2);
                    return aojh.a;
                }
                adxm adxmVar = this.d;
                defpackage.adxn adxnVarQ = this.f.q(13);
                adxnVarQ.c(aduyVar);
                adxnVarQ.a(akqcVar);
                ((defpackage.adxp) adxnVarQ).y = 4;
                adxmVar.a(adxnVarQ);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("GNP_ACCOUNT_TO_SYNC", aesg.x(aesg.r(aduyVar.b())));
                adzh adzhVar = this.b;
                adzf adzfVar = this.c;
                acecVar2.c = 1;
                objS = aesg.s(adzhVar, adzfVar, aduyVar, bundle, (java.lang.Long) null, acecVar2, 24);
                if (objS == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objS);
        return aojh.a;
    }
}
