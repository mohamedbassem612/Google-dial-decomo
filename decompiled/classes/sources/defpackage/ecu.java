package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ecu extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    /* synthetic */ java.lang.Object f;
    final /* synthetic */ java.util.List g;
    final /* synthetic */ java.util.List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecu(java.util.List list, java.util.List list2, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.g = list;
        this.h = list2;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ecu) c(obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ecs] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v1 */
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
            aolu r1 = defpackage.aolu.a
            int r2 = r9.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            if (r2 == r3) goto L14
            java.lang.Object r0 = r9.b
            java.lang.Object r2 = r9.a
            defpackage.aooc.af(r10)
            goto L31
        L14:
            java.lang.Object r0 = r9.d
            java.lang.Object r2 = r9.c
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.a
            defpackage.aooc.af(r10)
            r8 = r6
            r6 = r2
            r2 = r8
            goto L54
        L23:
            defpackage.aooc.af(r10)
            java.util.List r10 = r9.g
            java.util.List r2 = r9.h
            java.util.Iterator r10 = r10.iterator()
            r8 = r0
            r0 = r10
            r10 = r8
        L31:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r0.next()
            ecs r5 = (defpackage.ecs) r5
            r9.f = r4
            r9.a = r2
            r9.b = r0
            r9.c = r5
            r9.d = r10
            r9.e = r3
            java.lang.Object r6 = r5.c(r10, r9)
            if (r6 == r1) goto L7d
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L54:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L79
            blq r10 = new blq
            r7 = 4
            r10.<init>(r6, r4, r7)
            r2.add(r10)
            r9.f = r4
            r9.a = r2
            r9.b = r5
            r9.c = r4
            r9.d = r4
            r10 = 2
            r9.e = r10
            java.lang.Object r10 = r6.b(r0, r9)
            if (r10 == r1) goto L7d
            goto L7a
        L79:
            r10 = r0
        L7a:
            r0 = r5
            goto L31
        L7c:
            r1 = r10
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.ecu ecuVar = new defpackage.ecu(this.g, this.h, aolnVar);
        ecuVar.f = obj;
        return ecuVar;
    }
}
