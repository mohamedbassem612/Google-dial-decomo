package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class swc implements defpackage.svq {
    public final defpackage.swa a;
    public final defpackage.tvn b;
    private final defpackage.aoin c;

    public swc(defpackage.swa swaVar, defpackage.tvn tvnVar, defpackage.aoin aoinVar) {
        if (swaVar == null) {
            defpackage.aooh.i("singletonPrefetchedCallDataCache");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("rejectedCallCacheTtlMillis");
        }
        this.a = swaVar;
        this.b = tvnVar;
        this.c = aoinVar;
    }

    @Override // defpackage.svq
    public final java.lang.Object a(long j, svp svpVar, defpackage.aoln aolnVar) {
        return defpackage.aojh.a;
    }

    @Override // defpackage.svq
    public final java.lang.Object b(long j, svr svrVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        svr svrVar2 = svr.a;
        defpackage.swa swaVar = this.a;
        if (svrVar == svrVar2) {
            java.lang.Object objA = this.c.a();
            defpackage.aooh.e(objA, "get(...)");
            j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(((java.lang.Number) objA).longValue());
            defpackage.aooh.e(durationOfMillis, "ofMillis(...)");
            java.lang.Object objE = swaVar.e(j, durationOfMillis, aolnVar);
            if (objE == defpackage.aolu.a) {
                return objE;
            }
        } else {
            java.lang.Object objF = swaVar.f(j, svrVar, aolnVar);
            if (objF == defpackage.aolu.a) {
                return objF;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r9 != r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r6, java.lang.Object r8, defpackage.aoln r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof swb
            if (r0 == 0) goto L13
            r0 = r9
            swb r0 = (swb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            swb r0 = new swb
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c
            aolu r1 = defpackage.aolu.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aooc.af(r9)
            goto L61
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            long r6 = r0.a
            java.lang.Object r8 = r0.b
            defpackage.aooc.af(r9)
            goto L51
        L3a:
            defpackage.aooc.af(r9)
            tvn r9 = r5.b
            ajml r9 = r9.k(r6)
            if (r9 == 0) goto L53
            r0.b = r8
            r0.a = r6
            r0.e = r4
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 == r1) goto L60
        L51:
            if (r9 != 0) goto L61
        L53:
            swa r5 = r5.a
            r9 = 0
            r0.b = r9
            r0.e = r3
            java.lang.Object r9 = r5.c(r6, r8, r0)
            if (r9 != r1) goto L61
        L60:
            r9 = r1
        L61:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swc.c(long, java.lang.Object, aoln):java.lang.Object");
    }
}
