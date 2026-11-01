package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynd implements ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public ynd(defpackage.ydy ydyVar, dsd dsdVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = dsdVar;
        this.b = runnable;
        j$.util.Objects.requireNonNull(ydyVar);
        this.c = ydyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, rlv] */
    public final void a(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            if (th instanceof defpackage.ymi) {
                ((dsd) this.a).d(th);
            } else {
                boolean z = th instanceof java.util.concurrent.CancellationException;
                java.lang.Object obj = this.a;
                if (z) {
                    ((dsd) obj).d(new defpackage.ymi(4, 7, "Operation was cancelled.", th));
                } else {
                    ((dsd) obj).d(new defpackage.ymi(4, 0, "AiCore request could not be completed.", th));
                }
            }
            ((defpackage.ydy) this.c).e(this.b);
            return;
        }
        if (i == 1) {
            aooh.f(th, "t");
            boolean z2 = th instanceof java.util.concurrent.CancellationException;
            java.lang.Object obj2 = this.a;
            if (z2) {
                ((adak) obj2).k.o((rmx) this.c);
                return;
            } else {
                ((adak) obj2).k.o((rmx) this.b);
                return;
            }
        }
        if (i == 2) {
            aooh.f(th, "t");
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            defpackage.zcf zcfVar = defpackage.zcf.c;
            ((zzx) ((zjm) this.c).b).l(zcd.a((zcd) this.a, (wsc) null, java.lang.Long.valueOf(epochMilli), zcfVar));
            return;
        }
        if (this.b.isCancelled()) {
            ((zzx) ((defpackage.uzx) this.a).a).j();
            return;
        }
        boolean z3 = th instanceof java.lang.Exception;
        java.lang.Object obj3 = this.c;
        if (z3) {
            ((zzx) obj3).f((java.lang.Exception) th);
        } else {
            ((zzx) obj3).f(new java.util.concurrent.ExecutionException(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((dsd) this.a).b(obj);
            ((defpackage.ydy) this.c).e(this.b);
        } else if (i != 1) {
            if (i != 2) {
                ((zzx) this.c).g(obj);
                return;
            }
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            ?? r2 = this.b;
            defpackage.zcf zcfVar = defpackage.zcf.c;
            ((zzx) ((zjm) this.c).b).l(zcd.a((zcd) this.a, (wsc) r2.a(obj), java.lang.Long.valueOf(epochMilli), zcfVar));
        }
    }

    public ynd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public ynd(adak adakVar, rmx rmxVar, rmx rmxVar2, int i) {
        this.$cid = i;
        this.a = adakVar;
        this.c = rmxVar;
        this.b = rmxVar2;
    }
}
