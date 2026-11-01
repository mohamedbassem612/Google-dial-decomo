package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgz {
    private static final aimz a = aimz.i("com/google/android/callingshared/peertopeer/transport/rcs/preconditions/LocalNetworkIdentityRcsChecker");
    private final defpackage.yqt b;
    private final aolr c;

    public zgz(defpackage.yqt yqtVar, aolr aolrVar) {
        aooh.f(aolrVar, "blockingContext");
        this.b = yqtVar;
        this.c = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.zfd zfdVar, aoln aolnVar) {
        defpackage.zgy zgyVar;
        java.lang.Object objN;
        if (aolnVar instanceof defpackage.zgy) {
            zgyVar = (defpackage.zgy) aolnVar;
            int i = zgyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgyVar.c = i - Integer.MIN_VALUE;
            } else {
                zgyVar = new defpackage.zgy(this, aolnVar);
            }
        } else {
            zgyVar = new defpackage.zgy(this, aolnVar);
        }
        java.lang.Object obj = zgyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zgyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.yqt yqtVar = this.b;
            aolr aolrVar = this.c;
            defpackage.uke ukeVar = new defpackage.uke(zfdVar, (aoln) null, 14, (byte[]) null);
            zgyVar.c = 1;
            objN = wsc.n(yqtVar, aolrVar, ukeVar, zgyVar);
            if (objN == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            objN = ((aoiw) obj).a;
        }
        if ((objN instanceof aoiv) && wsc.o(objN)) {
            a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/preconditions/LocalNetworkIdentityRcsChecker", "identitySupportsRcsInOnDeviceServer", 35, "LocalNetworkIdentityRcsChecker.kt").v("failed due to service not implemented");
            return java.lang.Boolean.FALSE;
        }
        aooc.af(objN);
        defpackage.yqk yqkVar = (defpackage.yqk) objN;
        defpackage.amhh amhhVar = yqkVar.b;
        if (amhhVar == null) {
            amhhVar = defpackage.amhh.a;
        }
        if (defpackage.amhf.b(amhhVar.b) == defpackage.amhf.OK) {
            return java.lang.Boolean.valueOf(yqkVar.c);
        }
        a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/preconditions/LocalNetworkIdentityRcsChecker", "identitySupportsRcsInOnDeviceServer", 42, "LocalNetworkIdentityRcsChecker.kt").v("failed due to the invalid status code");
        return java.lang.Boolean.FALSE;
    }
}
