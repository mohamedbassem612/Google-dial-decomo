package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class cpj implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ cpj(ahex ahexVar, ajcq ajcqVar, java.lang.String str, int i, j$.time.Duration duration, int i2) {
        this.$cid = i2;
        this.b = ahexVar;
        this.c = ajcqVar;
        this.e = str;
        this.a = i;
        this.d = duration;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [dao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v10, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aoin, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Boolean boolValueOf;
        int i = this.$cid;
        if (i == 0) {
            ?? r0 = this.c;
            cwt cwtVar = (cwt) obj;
            if (this.b != cfo.C((dao) r0).F.b()) {
                return java.lang.Boolean.TRUE;
            }
            cpg cpgVar = (cpg) r0;
            boolean zN = rz.n(cpgVar, (cpn) this.d, this.a, (aonj) this.e);
            boolValueOf = java.lang.Boolean.valueOf(zN);
            boolValueOf.getClass();
            if (!zN && cwtVar.a()) {
                return null;
            }
        } else if (i != 1) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.e;
            ?? r1 = this.c;
            if (!zBooleanValue) {
                return null;
            }
            int i2 = this.a;
            java.lang.Object obj4 = this.b;
            ahex ahexVar = (ahex) obj4;
            java.lang.Object objA = ahexVar.b.a();
            aooh.e(objA, "get(...)");
            abtr abtrVar = (abtr) objA;
            java.lang.String strD = ahex.d(i2);
            try {
                aiql.H((java.util.concurrent.Future) r1);
                java.lang.Object obj5 = ((ahex) obj4).d;
                java.lang.Object obj6 = ((aogc) obj5).b;
                abtrVar.c((java.lang.String) obj6, ((aogc) obj5).p(), (java.lang.String) obj3, strD, "success");
                try {
                    abtrVar.d(((j$.time.Duration) obj2).toMillis(), (java.lang.String) obj6, ((aogc) obj5).p(), (java.lang.String) obj3, strD, "success");
                    return null;
                } catch (java.lang.Exception e) {
                    e = e;
                    strD = strD;
                    java.lang.Exception exc = e;
                    if ((exc instanceof java.util.concurrent.TimeoutException) || (exc.getCause() instanceof java.util.concurrent.TimeoutException)) {
                        aogc aogcVar = (aogc) ahexVar.d;
                        java.lang.String strP = aogcVar.p();
                        java.lang.String str = (java.lang.String) aogcVar.b;
                        java.lang.String str2 = (java.lang.String) obj3;
                        abtrVar.c(str, strP, str2, strD, "timeout");
                        abtrVar.d(((j$.time.Duration) obj2).toMillis(), str, aogcVar.p(), str2, strD, "timeout");
                        return null;
                    }
                    aogc aogcVar2 = (aogc) ahexVar.d;
                    java.lang.String strP2 = aogcVar2.p();
                    java.lang.String str3 = (java.lang.String) aogcVar2.b;
                    java.lang.String str4 = (java.lang.String) obj3;
                    abtrVar.c(str3, strP2, str4, strD, "failure");
                    abtrVar.d(((j$.time.Duration) obj2).toMillis(), str3, aogcVar2.p(), str4, strD, "failure");
                    return null;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } else {
            ?? r2 = this.c;
            cwt cwtVar2 = (cwt) obj;
            if (this.b != cfo.C((dao) r2).F.b()) {
                return java.lang.Boolean.TRUE;
            }
            cpg cpgVar2 = (cpg) r2;
            boolean zR = defpackage.rx.r(cpgVar2, (cpg) this.d, this.a, this.e);
            boolValueOf = java.lang.Boolean.valueOf(zR);
            boolValueOf.getClass();
            if (!zR && cwtVar2.a()) {
                return null;
            }
        }
        return boolValueOf;
    }

    public /* synthetic */ cpj(cpg cpgVar, cpg cpgVar2, java.lang.Object obj, int i, aonj aonjVar, int i2) {
        this.$cid = i2;
        this.b = cpgVar;
        this.c = cpgVar2;
        this.d = obj;
        this.a = i;
        this.e = aonjVar;
    }
}
