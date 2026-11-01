package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class arv extends aomg implements aonn {
    int a;
    final /* synthetic */ aolr b;
    final /* synthetic */ aonn c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arv(aolr aolrVar, aonn aonnVar, aoln aolnVar) {
        super(aolnVar);
        this.b = aolrVar;
        this.c = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[Catch: CancellationException -> 0x003c, TRY_ENTER, TryCatch #0 {CancellationException -> 0x003c, blocks: (B:6:0x0010, B:12:0x0023, B:14:0x002f, B:7:0x0014), top: B:26:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0039 -> B:10:0x001b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0050 -> B:10:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:30:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.d
            cwc r0 = (cwc) r0
            aolu r1 = aolu.a
            int r2 = r5.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L18
            if (r2 == r4) goto L14
            if (r2 != r3) goto L18
            aooc.af(r6)     // Catch: java.util.concurrent.CancellationException -> L3c
            goto L1b
        L14:
            aooc.af(r6)     // Catch: java.util.concurrent.CancellationException -> L3c
            goto L2f
        L18:
            aooc.af(r6)
        L1b:
            aolr r6 = r5.b
            boolean r6 = aooc.aa(r6)
            if (r6 == 0) goto L54
            aonn r6 = r5.c     // Catch: java.util.concurrent.CancellationException -> L3c
            r5.d = r0     // Catch: java.util.concurrent.CancellationException -> L3c
            r5.a = r4     // Catch: java.util.concurrent.CancellationException -> L3c
            java.lang.Object r6 = r6.a(r0, r5)     // Catch: java.util.concurrent.CancellationException -> L3c
            if (r6 == r1) goto L56
        L2f:
            r5.d = r0     // Catch: java.util.concurrent.CancellationException -> L3c
            r5.a = r3     // Catch: java.util.concurrent.CancellationException -> L3c
            cvg r6 = defpackage.cvg.c     // Catch: java.util.concurrent.CancellationException -> L3c
            java.lang.Object r6 = defpackage.ro.e(r0, r6, r5)     // Catch: java.util.concurrent.CancellationException -> L3c
            if (r6 != r1) goto L1b
            goto L56
        L3c:
            r6 = move-exception
            aolr r2 = r5.b
            boolean r2 = aooc.aa(r2)
            if (r2 == 0) goto L53
            r5.d = r0
            r6 = 3
            r5.a = r6
            cvg r6 = defpackage.cvg.c
            java.lang.Object r6 = defpackage.ro.e(r0, r6, r5)
            if (r6 == r1) goto L56
            goto L1b
        L53:
            throw r6
        L54:
            aojh r1 = aojh.a
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arv.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.arv arvVar = new defpackage.arv(this.b, this.c, aolnVar);
        arvVar.d = obj;
        return arvVar;
    }
}
