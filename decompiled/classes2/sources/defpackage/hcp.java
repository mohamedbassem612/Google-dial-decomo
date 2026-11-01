package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hcp extends aomh implements aonn {
    java.lang.Object a;
    int b;
    int c;
    final /* synthetic */ aono d;
    final /* synthetic */ android.content.Context e;
    final /* synthetic */ java.lang.String f = "fonts/";
    final /* synthetic */ java.lang.String g = "__LottieInternalDefaultCacheKey__";
    final /* synthetic */ ccp h;
    final /* synthetic */ defpackage.hcj i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcp(aono aonoVar, android.content.Context context, defpackage.hcj hcjVar, ccp ccpVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = aonoVar;
        this.e = context;
        this.i = hcjVar;
        this.h = ccpVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:50:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0058 A[EXC_TOP_SPLITTER, PHI: r0 r4 r12
      0x0058: PHI (r0v6 'th' java.lang.Object) = (r0v9 'th' java.lang.Object), (r0v10 'th' java.lang.Object) binds: [B:19:0x0056, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r4v4 int) = (r4v5 int), (r4v6 int) binds: [B:19:0x0056, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r12v5 'this' hcp) = (r12v6 'this' hcp), (r12v7 'this' hcp) binds: [B:19:0x0056, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008c -> B:52:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:50:0x006e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            aolu r1 = aolu.a
            int r0 = r12.c
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            int r4 = r12.b
            if (r0 == r3) goto L18
            java.lang.Object r0 = r12.a
            aooc.af(r13)     // Catch: java.lang.Throwable -> L14
            r11 = r12
            goto L8e
        L14:
            r0 = move-exception
            r11 = r12
            goto La1
        L18:
            java.lang.Object r0 = r12.a
            aooc.af(r13)
            goto L50
        L1e:
            aooc.af(r13)
            r13 = 0
            r4 = r13
            r0 = r2
        L24:
            ccp r13 = r12.h
            hci r13 = hcq.a(r13)
            cer r13 = r13.a
            java.lang.Object r13 = r13.a()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto La4
            if (r4 == 0) goto L58
            aono r13 = r12.d
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            aooh.c(r0)
            r12.a = r0
            r12.b = r4
            r12.c = r3
            java.lang.Object r13 = r13.a(r5, r0, r12)
            if (r13 == r1) goto Lbe
        L50:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto La4
        L58:
            android.content.Context r5 = r12.e     // Catch: java.lang.Throwable -> L9c
            hcj r6 = r12.i     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = hcq.b(r2)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r13 = r12.f     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = hcq.b(r13)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r13 = ".ttf"
            boolean r9 = aoov.H(r13)     // Catch: java.lang.Throwable -> L9c
            if (r9 != 0) goto L78
            java.lang.String r9 = "."
            boolean r9 = aoov.ad(r13, r9)     // Catch: java.lang.Throwable -> L7a
            if (r9 != 0) goto L78
            java.lang.String r13 = "..ttf"
        L78:
            r9 = r13
            goto L7e
        L7a:
            r0 = move-exception
            r13 = r0
            r11 = r12
            goto La0
        L7e:
            java.lang.String r10 = r12.g     // Catch: java.lang.Throwable -> L9c
            r12.a = r0     // Catch: java.lang.Throwable -> L9c
            r12.b = r4     // Catch: java.lang.Throwable -> L9c
            r13 = 2
            r12.c = r13     // Catch: java.lang.Throwable -> L9c
            r11 = r12
            java.lang.Object r13 = hcq.c(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9a
            if (r13 == r1) goto Lbe
        L8e:
            gzh r13 = (defpackage.gzh) r13     // Catch: java.lang.Throwable -> L9a
            ccp r12 = r11.h     // Catch: java.lang.Throwable -> L9a
            hci r12 = hcq.a(r12)     // Catch: java.lang.Throwable -> L9a
            r12.d(r13)     // Catch: java.lang.Throwable -> L9a
            goto La2
        L9a:
            r0 = move-exception
            goto L9e
        L9c:
            r0 = move-exception
            r11 = r12
        L9e:
            r12 = r0
            r13 = r12
        La0:
            r0 = r13
        La1:
            int r4 = r4 + r3
        La2:
            r12 = r11
            goto L24
        La4:
            r11 = r12
            ccp r12 = r11.h
            hci r13 = hcq.a(r12)
            boolean r13 = r13.f()
            if (r13 != 0) goto Lbc
            if (r0 == 0) goto Lbc
            hci r12 = hcq.a(r12)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r12.e(r0)
        Lbc:
            aojh r1 = aojh.a
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcp.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.hcp(this.d, this.e, this.i, this.h, aolnVar);
    }
}
