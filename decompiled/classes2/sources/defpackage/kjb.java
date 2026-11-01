package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjb extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjb(aoln aolnVar, defpackage.kjd kjdVar, long j, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = kjdVar;
        this.b = j;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    aogc aogcVar = ((mnp) ((defpackage.kjd) this.c).h.g().orElseThrow(defpackage.kjc.a)).f;
                    aify aifyVarP = aify.p(new java.lang.Long(this.b));
                    this.a = 1;
                    obj = aogcVar.aO(aifyVarP, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.kjd.a.b().l("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder", "clearCallDataInDobbyStorage$<anonymous>", 524, "CallScreenTranscriptViewBinder.kt").w("Transcript deleted on %d records", ((java.lang.Number) obj).intValue());
                return aojh.a;
            } catch (java.lang.Exception e) {
                if (!(e instanceof java.util.concurrent.CancellationException)) {
                    aimz aimzVar = zih.a;
                    zih.a.c().k(e).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
                }
                throw e;
            }
        }
        if (i == 1) {
            aoss aossVar = (aoss) this.d;
            aolu aoluVar2 = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                java.lang.Object obj2 = this.c;
                long j = this.b;
                aono aonoVar = ((defpackage.arq) obj2).c;
                cpm cpmVar = new cpm(j);
                this.d = null;
                this.a = 1;
                if (aonoVar.a(aossVar, cpmVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        if (i != 2) {
            aolu aoluVar3 = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    swi.a.b().l("com/android/dialer/prefetchedcall/impl/PrefetchedCallImpl", "onCallScopeRemoved$<anonymous>", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "PrefetchedCallImpl.kt").v("enter onCallScopeRemoved");
                    java.lang.Object obj3 = this.c;
                    long j2 = this.b;
                    svr svrVar = svr.c;
                    this.a = 1;
                    if (((swi) obj3).e(j2, svrVar) == aoluVar3) {
                        return aoluVar3;
                    }
                }
                return aojh.a;
            } catch (java.lang.Exception e2) {
                if (!(e2 instanceof java.util.concurrent.CancellationException)) {
                    aimz aimzVar2 = zih.a;
                    zih.a.c().k(e2).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
                }
                throw e2;
            }
        }
        aolu aoluVar4 = aolu.a;
        int i3 = this.a;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            java.lang.Object objA = ((swi) this.c).d.a();
            aooh.e(objA, "get(...)");
            long jLongValue = ((java.lang.Number) objA).longValue();
            this.a = 1;
            if (aosv.j(jLongValue, this) == aoluVar4) {
                return aoluVar4;
            }
            java.lang.Object obj4 = this.c;
            long j3 = this.b;
            svr svrVar2 = svr.b;
            this.a = 2;
            if (((swi) obj4).e(j3, svrVar2) == aoluVar4) {
                return aoluVar4;
            }
            return aojh.a;
        } catch (java.lang.Exception e3) {
            if (!(e3 instanceof java.util.concurrent.CancellationException)) {
                aimz aimzVar3 = zih.a;
                zih.a.c().k(e3).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
            }
            throw e3;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.kjb kjbVar = new defpackage.kjb(aolnVar, (defpackage.kjd) this.c, this.b, 0);
            kjbVar.d = obj;
            return kjbVar;
        }
        if (i == 1) {
            defpackage.kjb kjbVar2 = new defpackage.kjb((defpackage.arq) this.c, this.b, aolnVar, 1);
            kjbVar2.d = obj;
            return kjbVar2;
        }
        java.lang.Object obj2 = this.c;
        if (i != 2) {
            defpackage.kjb kjbVar3 = new defpackage.kjb(aolnVar, (swi) obj2, this.b, 3, null);
            kjbVar3.d = obj;
            return kjbVar3;
        }
        defpackage.kjb kjbVar4 = new defpackage.kjb(aolnVar, (swi) obj2, this.b, 2);
        kjbVar4.d = obj;
        return kjbVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjb(aoln aolnVar, swi swiVar, long j, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = swiVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjb(aoln aolnVar, swi swiVar, long j, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = swiVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjb(defpackage.arq arqVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = arqVar;
        this.b = j;
    }
}
