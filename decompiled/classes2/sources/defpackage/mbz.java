package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mbz extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbz(aoln aolnVar, svq svqVar, long j, svp svpVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = svqVar;
        this.b = j;
        this.c = svpVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c(aa$.ExternalSyntheticApiModelOutline0.m(obj), (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, svq] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        aoss aossVar;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            if (i2 != 0) {
                if (i2 != 1) {
                    aooc.af(obj);
                } else {
                    aossVar = (aoss) this.e;
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            aossVar = (aoss) this.e;
            j$.time.Duration duration = ((defpackage.mbb) this.c).a.f;
            java.lang.Long l = duration != null ? new java.lang.Long(duration.toMillis()) : (java.lang.Long) ((mca) this.d).e.a();
            aooh.c(l);
            long jLongValue = l.longValue();
            this.e = aossVar;
            this.a = 1;
            if (aosv.j(jLongValue, this) == aoluVar) {
                return aoluVar;
            }
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.c;
            long j = this.b;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean zR = aosv.r(aossVar);
            this.e = null;
            this.a = 2;
            if (((mca) obj2).b((defpackage.mbb) obj3, j, jElapsedRealtime, zR, this) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        if (i == 1) {
            android.view.textclassifier.TextClassifier textClassifierM = aa$.ExternalSyntheticApiModelOutline0.m(this.e);
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 == 0) {
                java.lang.Object obj4 = this.c;
                ?? r4 = this.d;
                long j2 = this.b;
                this.e = null;
                this.a = 1;
                if (((defpackage.bkj) obj4).d(r4, j2, textClassifierM, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        aolu aoluVar3 = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                ?? r12 = this.d;
                long j3 = this.b;
                java.lang.Object obj5 = this.c;
                this.a = 1;
                if (r12.a(j3, (svp) obj5, this) == aoluVar3) {
                    return aoluVar3;
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

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, svq] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.c;
            defpackage.mbb mbbVar = (defpackage.mbb) obj2;
            defpackage.mbz mbzVar = new defpackage.mbz(mbbVar, (mca) this.d, this.b, aolnVar, 0);
            mbzVar.e = obj;
            return mbzVar;
        }
        if (i != 1) {
            defpackage.mbz mbzVar2 = new defpackage.mbz(aolnVar, (svq) this.d, this.b, (svp) this.c, 2);
            mbzVar2.e = obj;
            return mbzVar2;
        }
        defpackage.mbz mbzVar3 = new defpackage.mbz((defpackage.bkj) this.c, (java.lang.CharSequence) this.d, this.b, aolnVar, 1);
        mbzVar3.e = obj;
        return mbzVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbz(defpackage.bkj bkjVar, java.lang.CharSequence charSequence, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = bkjVar;
        this.d = charSequence;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbz(defpackage.mbb mbbVar, mca mcaVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = mbbVar;
        this.d = mcaVar;
        this.b = j;
    }
}
