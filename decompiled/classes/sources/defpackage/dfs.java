package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dfs extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.aowi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfs(defpackage.aowi aowiVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = aowiVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.dfs) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {all -> 0x004a, blocks: (B:5:0x000a, B:11:0x0028, B:13:0x0030, B:9:0x0018, B:8:0x0013), top: B:22:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aowu] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            aolu r0 = defpackage.aolu.a
            int r1 = r4.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.aooc.af(r5)     // Catch: java.lang.Throwable -> L4a
            goto L28
        Le:
            defpackage.aooc.af(r5)
            aowi r2 = r4.d
            aovx r5 = r2.A()     // Catch: java.lang.Throwable -> L4a
            r1 = r5
        L18:
            r4.a = r2     // Catch: java.lang.Throwable -> L4a
            r4.b = r1     // Catch: java.lang.Throwable -> L4a
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> L4a
            r5 = r1
            aovx r5 = (defpackage.aovx) r5     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Throwable -> L4a
            if (r5 == r0) goto L49
        L28:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4a
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r5 == 0) goto L43
            r5 = r1
            aovx r5 = (defpackage.aovx) r5     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L4a
            aojh r5 = (defpackage.aojh) r5     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.dft.b     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> L4a
            defpackage.cfd.j()     // Catch: java.lang.Throwable -> L4a
            goto L18
        L43:
            r4 = 0
            r2.s(r4)
            aojh r0 = defpackage.aojh.a
        L49:
            return r0
        L4a:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L4c
        L4c:
            r5 = move-exception
            defpackage.aooh.F(r2, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.dfs(this.d, aolnVar);
    }
}
