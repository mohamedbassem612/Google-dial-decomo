package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gdf extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.aoxi d;
    final /* synthetic */ defpackage.aonn e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdf(defpackage.aoxi aoxiVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = aoxiVar;
        this.e = aonnVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.gdf) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0067 -> B:9:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            aoss r0 = (defpackage.aoss) r0
            aolu r1 = defpackage.aolu.a
            int r2 = r8.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            java.lang.Object r0 = r8.b
            if (r2 == r3) goto L16
            java.lang.Object r2 = r8.a
            defpackage.aooc.af(r9)
            goto L38
        L16:
            java.lang.Object r2 = r8.a
            defpackage.aooc.af(r9)
            goto L49
        L1c:
            defpackage.aooc.af(r9)
            r9 = 6
            r2 = 0
            aowi r9 = defpackage.aooh.H(r2, r2, r4, r9)
            aonn r5 = r8.e
            bur r6 = new bur
            r7 = 8
            r6.<init>(r9, r5, r4, r7)
            r5 = 3
            aoub r2 = defpackage.aoov.an(r0, r4, r2, r6, r5)
            aovx r9 = r9.A()
            r0 = r9
        L38:
            r8.f = r4
            r8.a = r2
            r8.b = r0
            r8.c = r3
            r9 = r0
            aovx r9 = (defpackage.aovx) r9
            java.lang.Object r9 = r9.a(r8)
            if (r9 == r1) goto L6f
        L49:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6a
            r9 = r0
            aovx r9 = (defpackage.aovx) r9
            java.lang.Object r9 = r9.b()
            aoxi r5 = r8.d
            r8.f = r4
            r8.a = r2
            r8.b = r0
            r6 = 2
            r8.c = r6
            java.lang.Object r9 = r5.a(r9, r8)
            if (r9 != r1) goto L38
            goto L6f
        L6a:
            r2.s(r4)
            aojh r1 = defpackage.aojh.a
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.gdf gdfVar = new defpackage.gdf(this.d, this.e, aolnVar);
        gdfVar.f = obj;
        return gdfVar;
    }
}
