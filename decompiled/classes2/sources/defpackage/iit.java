package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iit {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/callpreconditions/impl/AudioPrismCallPreconditionsCheckerImpl");
    public final aolr b;
    private final pqo c;

    public iit(pqo pqoVar, aolr aolrVar) {
        aooh.f(pqoVar, "callDirection");
        aooh.f(aolrVar, "lightweightContext");
        this.c = pqoVar;
        this.b = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(int i, aoln aolnVar) {
        defpackage.iis iisVar;
        if (aolnVar instanceof defpackage.iis) {
            iisVar = (defpackage.iis) aolnVar;
            int i2 = iisVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iisVar.c = i2 - Integer.MIN_VALUE;
            } else {
                iisVar = new defpackage.iis(this, aolnVar);
            }
        } else {
            iisVar = new defpackage.iis(this, aolnVar);
        }
        java.lang.Object objD = iisVar.a;
        aolu aoluVar = aolu.a;
        int i3 = iisVar.c;
        if (i3 == 0) {
            aooc.af(objD);
            if (i == 2) {
                return java.lang.Boolean.TRUE;
            }
            ajcq ajcqVar = this.c.b;
            aooh.e(ajcqVar, "getDirection(...)");
            iisVar.d = i;
            iisVar.c = 1;
            objD = aosv.D(ajcqVar, iisVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = iisVar.d;
            aooc.af(objD);
        }
        zmy zmyVar = (zmy) objD;
        return ((zmyVar == zmy.a && i == 3) || (zmyVar == zmy.b && i == 4)) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
    }
}
