package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhe extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ zhf c;
    final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhe(zhf zhfVar, java.lang.String str, aoln aolnVar) {
        super(2, aolnVar);
        this.c = zhfVar;
        this.d = str;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        aoiu aoiuVar;
        defpackage.zhj zhjVar;
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        int i = this.b;
        try {
            if (i != 0) {
                if (i == 1) {
                    obj2 = this.a;
                    aooc.af(obj);
                } else if (i != 2) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    zhf zhfVar = this.c;
                    zhfVar.e.l(new zbq(defpackage.zbr.aH));
                    java.lang.String str = this.d;
                    this.b = 3;
                    obj = zhfVar.b((defpackage.akmz) obj, str, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                }
                return (defpackage.zhj) obj;
            }
            aooc.af(obj);
            zhf zhfVar2 = this.c;
            obj2 = (akmt) zhfVar2.c.j(new anme[]{zhfVar2.d}).k(defpackage.zcv.a, defpackage.zcv.a()).i(7L, java.util.concurrent.TimeUnit.SECONDS);
            java.lang.String str2 = this.d;
            this.a = obj2;
            this.b = 1;
            obj = zhfVar2.a(str2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            this.c.e.l(new zbq(defpackage.zbr.aG));
            aooh.c(obj2);
            this.a = null;
            this.b = 2;
            obj = ((akmt) obj2).b((defpackage.akmy) obj, new anph(), this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            zhf zhfVar3 = this.c;
            zhfVar3.e.l(new zbq(defpackage.zbr.aH));
            java.lang.String str3 = this.d;
            this.b = 3;
            obj = zhfVar3.b((defpackage.akmz) obj, str3, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            return (defpackage.zhj) obj;
        } catch (java.util.concurrent.CancellationException e) {
            zhf.a.b().k(e).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "queryCallInfoLookupApi$<anonymous>", 98, "CallInfoLookup.kt").v("CancellationException");
            throw e;
        } catch (java.lang.Exception e2) {
            anqw anqwVarD = anqw.d(e2);
            anqt anqtVar = anqwVarD.o;
            anqt anqtVar2 = anqw.d.o;
            zhf zhfVar4 = this.c;
            if (anqtVar != anqtVar2) {
                aooh.c(anqwVarD);
                int iOrdinal = anqtVar.ordinal();
                if (iOrdinal == 1) {
                    zhf.a.b().k(e2).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "handleGrpcFailedWithStatus", 139, "CallInfoLookup.kt").v("Canceled");
                } else if (iOrdinal == 4) {
                    zhf.a.b().k(e2).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "handleGrpcFailedWithStatus", 142, "CallInfoLookup.kt").v("Timeout");
                    zhfVar4.e.l(new zbq(defpackage.zbr.aJ));
                } else if (iOrdinal == 8) {
                    zhf.a.b().k(e2).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "handleGrpcFailedWithStatus", 146, "CallInfoLookup.kt").v("Resource exhausted");
                    zhfVar4.e.l(new zbq(defpackage.zbr.aM));
                } else if (iOrdinal == 14) {
                    zhf.a.b().k(e2).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "handleGrpcFailedWithStatus", 150, "CallInfoLookup.kt").v("Unavailable");
                    zhfVar4.e.l(new zbq(defpackage.zbr.aL));
                } else if (iOrdinal != 16) {
                    zhf.a.d().k(e2).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "handleGrpcFailedWithStatus", 157, "CallInfoLookup.kt").y("gRPC failed with status %s", new aepg(anqtVar));
                    zhfVar4.e.l(new zbq(defpackage.zbr.aO));
                } else {
                    zhf.a.d().k(e2).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "handleGrpcFailedWithStatus", 135, "CallInfoLookup.kt").v("Unauthenticated");
                    zhfVar4.e.l(new zbq(defpackage.zbr.aI));
                }
                zhjVar = defpackage.zhj.a;
                aooh.e(zhjVar, "getDefaultInstance(...)");
            } else {
                j$.util.Objects.checkIndex(0, 4);
                if (e2 instanceof java.util.concurrent.TimeoutException) {
                    aoiuVar = new aoiu("TimeoutException", defpackage.zbr.aK);
                } else if (e2 instanceof defpackage.abzh) {
                    aoiuVar = new aoiu("SpatulaAuthException", defpackage.zbr.aN);
                } else {
                    aoiuVar = e2 instanceof java.lang.NullPointerException ? new aoiu("NullPointerException", defpackage.zbr.aN) : new aoiu("RuntimeException", defpackage.zbr.aN);
                }
                java.lang.Object obj3 = aoiuVar.b;
                zhf.a.d().k(e2).l("com/google/android/callingshared/phonelookup/dialergatewayserver/CallInfoLookup", "handleRuntimeException", 174, "CallInfoLookup.kt").y("%s", (java.lang.String) aoiuVar.a);
                zhfVar4.e.l(new zbq((defpackage.zbr) obj3));
                zhjVar = defpackage.zhj.a;
                aooh.e(zhjVar, "getDefaultInstance(...)");
            }
            return zhjVar;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.zhe(this.c, this.d, aolnVar);
    }
}
