package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ris extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.riv e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ris(defpackage.riv rivVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = rivVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007a  */
    /* JADX WARN: Code duplicated, block: B:14:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009b -> B:15:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            aolu r0 = aolu.a
            int r1 = r9.d
            if (r1 == 0) goto L15
            java.lang.Object r1 = r9.c
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.a
            java.lang.Object r4 = r9.f
            java.util.Map r4 = (java.util.Map) r4
            aooc.af(r10)
            goto L9c
        L15:
            aooc.af(r10)
            java.lang.Object r10 = r9.f
            aoss r10 = (aoss) r10
            riv r1 = r9.e
            java.util.Map r2 = r1.a
            aikj r2 = (aikj) r2
            int r3 = r2.d
            int r3 = ajsz.aL(r3)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            aihd r2 = r2.e()
            aikg r2 = (aikg) r2
            ailj r2 = r2.k()
        L37:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            rio r3 = (defpackage.rio) r3
            rir r6 = new rir
            r7 = 0
            r8 = 0
            r6.<init>(r1, r3, r7, r8)
            r3 = 3
            aosy r3 = aoov.am(r10, r8, r6, r3)
            r4.put(r5, r3)
            goto L37
        L5d:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r1 = r4.size()
            int r1 = ajsz.aL(r1)
            r10.<init>(r1)
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = r10
            r3 = r1
        L74:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto La3
            java.lang.Object r10 = r3.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            aosy r10 = (aosy) r10
            r9.f = r2
            r9.a = r3
            r9.b = r2
            r9.c = r1
            r4 = 1
            r9.d = r4
            java.lang.Object r10 = r10.a(r9)
            if (r10 == r0) goto La4
            r4 = r2
        L9c:
            riq r10 = (defpackage.riq) r10
            r2.put(r1, r10)
            r2 = r4
            goto L74
        La3:
            r0 = r2
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ris.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ris risVar = new defpackage.ris(this.e, aolnVar);
        risVar.f = obj;
        return risVar;
    }
}
