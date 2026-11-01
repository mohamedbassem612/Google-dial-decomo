package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class iwa extends aomh implements aonn {
    int a;
    java.lang.Object b;
    int c;
    final /* synthetic */ okj d;
    final /* synthetic */ oko e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwa(okj okjVar, oko okoVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = okjVar;
        this.e = okoVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:24:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            aolu r0 = aolu.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            int r4 = r7.a
            if (r1 == r2) goto L14
            java.lang.Object r1 = r7.b
            aooc.af(r8)
            goto L6b
        L14:
            java.lang.Object r1 = r7.b
            aooc.af(r8)
            goto L5a
        L1a:
            int r1 = r7.a
            aooc.af(r8)
            goto L30
        L20:
            aooc.af(r8)
            okj r8 = r7.d
            r1 = 0
            r7.a = r1
            r7.c = r3
            java.lang.Object r8 = r8.i(r7)
            if (r8 == r0) goto L81
        L30:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L7b
            java.util.Iterator r8 = r8.iterator()
            r4 = r1
        L39:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r8.next()
            android.telephony.SubscriptionInfo r1 = (android.telephony.SubscriptionInfo) r1
            oko r5 = r7.e
            int r1 = r1.getSubscriptionId()
            r7.b = r8
            r7.a = r4
            r7.c = r2
            java.lang.Object r1 = r5.Q(r1, r7)
            if (r1 == r0) goto L81
            r6 = r1
            r1 = r8
            r8 = r6
        L5a:
            oko r8 = (oko) r8
            if (r8 == 0) goto L78
            r7.b = r1
            r7.a = r4
            r5 = 3
            r7.c = r5
            java.lang.Object r8 = r8.J(r7)
            if (r8 == r0) goto L81
        L6b:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5 = 1839(0x72f, float:2.577E-42)
            if (r8 != r5) goto L78
            r8 = r1
            r4 = r3
            goto L39
        L78:
            r8 = r1
            goto L39
        L7a:
            r1 = r4
        L7b:
            java.lang.String r7 = "IS_VERIZON"
            afpl r0 = abxl.L(r7, r1)
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwa.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.iwa(this.d, this.e, aolnVar);
    }
}
