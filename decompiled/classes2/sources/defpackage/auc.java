package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class auc extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.aud c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auc(defpackage.aud audVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = audVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:5:0x000e, B:11:0x001b, B:13:0x0025, B:15:0x0035, B:8:0x0014), top: B:23:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0044 -> B:11:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            aoss r0 = (aoss) r0
            aolu r1 = aolu.a
            int r2 = r6.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L18
            if (r2 == r3) goto L12
            aooc.af(r7)     // Catch: java.lang.Throwable -> L4e
            goto L1b
        L12:
            java.lang.Object r2 = r6.a
            aooc.af(r7)     // Catch: java.lang.Throwable -> L4e
            goto L35
        L18:
            aooc.af(r7)
        L1b:
            aolr r7 = r0.c()     // Catch: java.lang.Throwable -> L4e
            boolean r7 = aooc.aa(r7)     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L47
            aud r2 = r6.c     // Catch: java.lang.Throwable -> L4e
            aowi r7 = r2.a     // Catch: java.lang.Throwable -> L4e
            r6.d = r0     // Catch: java.lang.Throwable -> L4e
            r6.a = r2     // Catch: java.lang.Throwable -> L4e
            r6.b = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = r7.i(r6)     // Catch: java.lang.Throwable -> L4e
            if (r7 == r1) goto L4d
        L35:
            atz r7 = (defpackage.atz) r7     // Catch: java.lang.Throwable -> L4e
            r6.d = r0     // Catch: java.lang.Throwable -> L4e
            r6.a = r4     // Catch: java.lang.Throwable -> L4e
            r5 = 2
            r6.b = r5     // Catch: java.lang.Throwable -> L4e
            aud r2 = (defpackage.aud) r2     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = r2.c(r7, r6)     // Catch: java.lang.Throwable -> L4e
            if (r7 == r1) goto L4d
            goto L1b
        L47:
            aud r6 = r6.c
            r6.b = r4
            aojh r1 = aojh.a
        L4d:
            return r1
        L4e:
            r7 = move-exception
            aud r6 = r6.c
            r6.b = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auc.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.auc aucVar = new defpackage.auc(this.c, aolnVar);
        aucVar.d = obj;
        return aucVar;
    }
}
