package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rly implements defpackage.zqk {
    private final android.content.Context a;
    private final zzd b;
    private final aoss c;
    private final int d;
    private final zzx e;

    public rly(android.content.Context context, zzd zzdVar, zzx zzxVar, aoss aossVar, int i) {
        aooh.f(context, "appContext");
        aooh.f(zzdVar, "anonymousLogger");
        aooh.f(aossVar, "lightweightScope");
        this.a = context;
        this.b = zzdVar;
        this.e = zzxVar;
        this.c = aossVar;
        this.d = 5;
    }

    private static final long h(long j) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        return timeUnit.toMillis(j / 3600000);
    }

    @Override // defpackage.zqk
    public final long a(long j) {
        return h(j);
    }

    @Override // defpackage.zqk
    public final long b(long j) {
        return h(j);
    }

    @Override // defpackage.zqk
    public final zzd c() {
        return this.b;
    }

    @Override // defpackage.zqk
    public final zzu d() {
        return abtl.b(this.a, new defpackage.apea());
    }

    @Override // defpackage.zqk
    public final /* synthetic */ ajcq e() {
        return aehj.ch();
    }

    @Override // defpackage.zqk
    public final ajcq f() {
        return aosv.F(this.c, 0, new oxe(this, (aoln) null, 20), 3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object g(aoln r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rlx
            if (r0 == 0) goto L13
            r0 = r5
            rlx r0 = (defpackage.rlx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rlx r0 = new rlx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.a
            aooc.af(r5)
            goto L73
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            aooc.af(r5)
            zzx r4 = r4.e
            aihd r4 = r4.e()
            java.lang.String r5 = "get(...)"
            aooh.e(r4, r5)
            amtp r5 = defpackage.amtp.a
            akzx r5 = r5.m()
            java.lang.String r2 = "builder"
            aooh.f(r5, r2)
            alad r5 = r5.p()
            java.lang.String r2 = "build(...)"
            aooh.e(r5, r2)
            amtp r5 = (defpackage.amtp) r5
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r4.next()
            rlw r2 = (defpackage.rlw) r2
            ajcq r5 = r2.a(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = aosv.D(r5, r0)
            if (r5 == r1) goto L7f
        L73:
            amtp r5 = (defpackage.amtp) r5
            goto L59
        L76:
            j$.util.Optional r1 = j$.util.Optional.of(r5)
            java.lang.String r4 = "of(...)"
            aooh.e(r1, r4)
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rly.g(aoln):java.lang.Object");
    }
}
