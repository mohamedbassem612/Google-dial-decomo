package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class suw extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.util.Set e;
    final /* synthetic */ aoin f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suw(java.util.Set set, aoin aoinVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = set;
        this.f = aoinVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004a -> B:10:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:8:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            aolu r0 = aolu.a
            int r1 = r9.d
            if (r1 == 0) goto L10
            java.lang.Object r1 = r9.c
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.a
            aooc.af(r10)
            goto L4c
        L10:
            aooc.af(r10)
            java.util.Set r10 = r9.e
            aoin r1 = r9.f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
            r3 = r1
            r1 = r10
        L22:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L54
            java.lang.Object r10 = r1.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r4 = r3.a()
            sup r4 = (defpackage.sup) r4
            r9.a = r3
            r9.b = r2
            r9.c = r1
            r5 = 1
            r9.d = r5
            aolr r5 = r4.b
            ryd r6 = new ryd
            r7 = 0
            r8 = 4
            r6.<init>(r4, r10, r7, r8)
            java.lang.Object r10 = aoov.aj(r5, r6, r9)
            if (r10 == r0) goto L58
        L4c:
            android.telecom.PhoneAccountHandle r10 = (android.telecom.PhoneAccountHandle) r10
            if (r10 == 0) goto L22
            r2.add(r10)
            goto L22
        L54:
            java.util.Set r0 = ajsz.cf(r2)
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suw.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.suw(this.e, this.f, aolnVar);
    }
}
