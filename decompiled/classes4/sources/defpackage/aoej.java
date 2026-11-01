package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoej extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean c;
    final /* synthetic */ defpackage.anql d;
    final /* synthetic */ aowi e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoej(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, defpackage.anql anqlVar, aowi aowiVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = atomicBoolean;
        this.d = anqlVar;
        this.e = aowiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:7:0x000f, B:23:0x0065, B:16:0x0037, B:19:0x0049, B:21:0x0051, B:10:0x0017, B:15:0x0030), top: B:32:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:23:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            aolu r0 = aolu.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1b
            java.lang.Object r3 = r6.a
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.f
            aoxi r1 = (aoxi) r1
            aooc.af(r7)     // Catch: java.lang.Exception -> L6f
            goto L65
        L13:
            java.lang.Object r1 = r6.f
            aoxi r1 = (aoxi) r1
            aooc.af(r7)     // Catch: java.lang.Exception -> L6f
            goto L49
        L1b:
            aooc.af(r7)
            java.lang.Object r7 = r6.f
            aoxi r7 = (aoxi) r7
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.c
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L81
            anql r1 = r6.d
            r1.c(r2)
            aowi r1 = r6.e     // Catch: java.lang.Exception -> L6f
            aovx r1 = r1.A()     // Catch: java.lang.Exception -> L6f
            r3 = r1
        L37:
            r6.f = r7     // Catch: java.lang.Exception -> L6f
            r6.a = r3     // Catch: java.lang.Exception -> L6f
            r6.b = r2     // Catch: java.lang.Exception -> L6f
            r1 = r3
            aovx r1 = (aovx) r1     // Catch: java.lang.Exception -> L6f
            java.lang.Object r1 = r1.a(r6)     // Catch: java.lang.Exception -> L6f
            if (r1 == r0) goto L6e
            r5 = r1
            r1 = r7
            r7 = r5
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L6f
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L6f
            if (r7 == 0) goto L6c
            r7 = r3
            aovx r7 = (aovx) r7     // Catch: java.lang.Exception -> L6f
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Exception -> L6f
            r6.f = r1     // Catch: java.lang.Exception -> L6f
            r6.a = r3     // Catch: java.lang.Exception -> L6f
            r4 = 2
            r6.b = r4     // Catch: java.lang.Exception -> L6f
            java.lang.Object r7 = r1.a(r7, r6)     // Catch: java.lang.Exception -> L6f
            if (r7 == r0) goto L6e
        L65:
            r7 = r1
            anql r1 = r6.d     // Catch: java.lang.Exception -> L6f
            r1.c(r2)     // Catch: java.lang.Exception -> L6f
            goto L37
        L6c:
            aojh r0 = aojh.a
        L6e:
            return r0
        L6f:
            r7 = move-exception
            aowi r0 = r6.e
            java.lang.String r1 = "Exception thrown while collecting requests"
            java.util.concurrent.CancellationException r1 = aodc.l(r1, r7)
            r0.s(r1)
            anql r6 = r6.d
            r6.c(r2)
            throw r7
        L81:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "requests flow can only be collected once"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoej.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aoej aoejVar = new defpackage.aoej(this.c, this.d, this.e, aolnVar);
        aoejVar.f = obj;
        return aoejVar;
    }
}
