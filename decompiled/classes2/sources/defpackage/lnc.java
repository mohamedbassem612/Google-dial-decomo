package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lnc extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.lnh b;
    final /* synthetic */ defpackage.lmq c;
    final /* synthetic */ android.telecom.CallScreeningService.CallResponse.Builder d;
    final /* synthetic */ defpackage.okd e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnc(aoln aolnVar, defpackage.lnh lnhVar, defpackage.okd okdVar, defpackage.lmq lmqVar, android.telecom.CallScreeningService.CallResponse.Builder builder) {
        super(2, aolnVar);
        this.b = lnhVar;
        this.e = okdVar;
        this.c = lmqVar;
        this.d = builder;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        aolu aoluVar = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.lnh lnhVar = this.b;
                defpackage.okd okdVar = this.e;
                android.telecom.Call.Details details = this.c.a;
                android.telecom.CallScreeningService.CallResponse.Builder builder = this.d;
                this.a = 1;
                java.lang.Object objO = aooh.O(new defpackage.lne(lnhVar, details, builder, okdVar, null), this);
                if (objO != aoluVar) {
                    objO = aojh.a;
                }
                if (objO == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        } catch (java.lang.Exception e) {
            if (e instanceof java.util.concurrent.CancellationException) {
                throw e;
            }
            aimz aimzVar = zih.a;
            zih.a.c().k(e).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
            throw e;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.lnc lncVar = new defpackage.lnc(aolnVar, this.b, this.e, this.c, this.d);
        lncVar.f = obj;
        return lncVar;
    }
}
