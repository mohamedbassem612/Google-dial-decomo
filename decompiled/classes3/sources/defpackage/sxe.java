package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxe extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.sxg b;
    final /* synthetic */ long c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ lmq e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxe(aoln aolnVar, defpackage.sxg sxgVar, long j, java.lang.String str, lmq lmqVar) {
        super(2, aolnVar);
        this.b = sxgVar;
        this.c = j;
        this.d = str;
        this.e = lmqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        aolu aoluVar = aolu.a;
        int i = this.a;
        try {
            if (i != 0) {
                if (i != 1) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            ajcq ajcqVarD = this.b.f.d(this.c, this.d, this.e.a.getCallerDisplayNamePresentation(), j$.util.Optional.empty());
            this.a = 1;
            if (aosv.D(ajcqVarD, this) == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarA = this.b.g.a(this.c, 3);
            this.a = 2;
            if (aosv.D(ajcqVarA, this) == aoluVar) {
                return aoluVar;
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
        defpackage.sxe sxeVar = new defpackage.sxe(aolnVar, this.b, this.c, this.d, this.e);
        sxeVar.f = obj;
        return sxeVar;
    }
}
