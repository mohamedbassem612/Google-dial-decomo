package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ceq extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.aomy e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceq(defpackage.aomy aomyVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.e = aomyVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ceq) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[Catch: all -> 0x008c, PHI: r2 r4 r6
      0x0069: PHI (r2v8 ??) = (r2v17 ??), (r2v18 ??) binds: [B:24:0x0067, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r4v5 java.lang.Object) = (r4v9 java.lang.Object), (r4v11 java.lang.Object) binds: [B:24:0x0067, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r6v5 java.lang.Object) = (r6v14 java.lang.Object), (r6v15 java.lang.Object) binds: [B:24:0x0067, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x008c, blocks: (B:8:0x0017, B:23:0x0059, B:25:0x0069, B:27:0x0078, B:11:0x001f, B:19:0x003e), top: B:40:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:8:0x0017, B:23:0x0059, B:25:0x0069, B:27:0x0078, B:11:0x001f, B:19:0x003e), top: B:40:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [cee] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [aowv] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [aowv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aiyy] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:23:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:23:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            aoxi r0 = (defpackage.aoxi) r0
            aolu r1 = defpackage.aolu.a
            int r2 = r9.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L30
            if (r2 == r4) goto L23
            java.lang.Object r4 = r9.c
            if (r2 == r3) goto L1b
            java.lang.Object r2 = r9.b
            java.lang.Object r6 = r9.a
            defpackage.aooc.af(r10)     // Catch: java.lang.Throwable -> L8c
            goto L59
        L1b:
            java.lang.Object r2 = r9.b
            java.lang.Object r6 = r9.a
            defpackage.aooc.af(r10)     // Catch: java.lang.Throwable -> L8c
            goto L69
        L23:
            java.lang.Object r2 = r9.c
            java.lang.Object r4 = r9.b
            java.lang.Object r6 = r9.a
            defpackage.aooc.af(r10)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L2d:
            r9 = move-exception
            r2 = r4
            goto L8d
        L30:
            defpackage.aooc.af(r10)
            aiyy r6 = new aiyy
            r6.<init>(r5, r5)
            r10 = 0
            r2 = 6
            aowi r2 = defpackage.aooh.H(r4, r10, r5, r2)
            aomy r10 = r9.e     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r6.i(r2, r10)     // Catch: java.lang.Throwable -> L8c
            r9.f = r0     // Catch: java.lang.Throwable -> L8c
            r9.a = r6     // Catch: java.lang.Throwable -> L8c
            r9.b = r2     // Catch: java.lang.Throwable -> L8c
            r9.c = r10     // Catch: java.lang.Throwable -> L8c
            r9.d = r4     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r4 = r0.a(r10, r9)     // Catch: java.lang.Throwable -> L8c
            if (r4 == r1) goto L8b
            r4 = r2
            r2 = r10
        L56:
            r8 = r4
            r4 = r2
            r2 = r8
        L59:
            r9.f = r0     // Catch: java.lang.Throwable -> L8c
            r9.a = r6     // Catch: java.lang.Throwable -> L8c
            r9.b = r2     // Catch: java.lang.Throwable -> L8c
            r9.c = r4     // Catch: java.lang.Throwable -> L8c
            r9.d = r3     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r2.i(r9)     // Catch: java.lang.Throwable -> L8c
            if (r10 == r1) goto L8b
        L69:
            aomy r10 = r9.e     // Catch: java.lang.Throwable -> L8c
            r7 = r6
            aiyy r7 = (defpackage.aiyy) r7     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r7.i(r2, r10)     // Catch: java.lang.Throwable -> L8c
            boolean r7 = defpackage.aooh.n(r10, r4)     // Catch: java.lang.Throwable -> L8c
            if (r7 != 0) goto L59
            r9.f = r0     // Catch: java.lang.Throwable -> L8c
            r9.a = r6     // Catch: java.lang.Throwable -> L8c
            r9.b = r2     // Catch: java.lang.Throwable -> L8c
            r9.c = r10     // Catch: java.lang.Throwable -> L8c
            r4 = 3
            r9.d = r4     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r4 = r0.a(r10, r9)     // Catch: java.lang.Throwable -> L8c
            if (r4 == r1) goto L8b
            r4 = r10
            goto L59
        L8b:
            return r1
        L8c:
            r9 = move-exception
        L8d:
            aiyy r6 = (defpackage.aiyy) r6
            java.lang.Object r10 = r6.a
            if (r10 == 0) goto L98
            cee r10 = (defpackage.cee) r10
            r10.e(r2)
        L98:
            java.lang.Object r10 = r6.a
            if (r10 != 0) goto La1
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.cdh.b(r0)
        La1:
            cee r10 = (defpackage.cee) r10
            r10.d()
            r6.a = r5
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.ceq ceqVar = new defpackage.ceq(this.e, aolnVar);
        ceqVar.f = obj;
        return ceqVar;
    }
}
