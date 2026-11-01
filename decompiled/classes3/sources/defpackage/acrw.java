package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acrw implements cci {
    public int b;
    public long c;
    public long d;
    private final cci e;

    public acrw(cci cciVar, int i) {
        this.e = cciVar;
        int iW = aooc.w(i, 1, 120);
        this.b = iW;
        this.c = 1000000000 / ((long) iW);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [aonj] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ba -> B:37:0x00bc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object a(aonj r11, aoln r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.acrv
            if (r0 == 0) goto L13
            r0 = r12
            acrv r0 = (defpackage.acrv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            acrv r0 = new acrv
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            aoot r11 = r0.f
            aoop r2 = r0.e
            java.lang.Object r4 = r0.a
            aooc.af(r12)
            r5 = r10
            r8 = r4
            goto Lbc
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r11 = r0.a
            aooc.af(r12)
            goto L86
        L44:
            aooc.af(r12)
            goto Lc4
        L48:
            aooc.af(r12)
            cci r12 = r10.e
            if (r12 == 0) goto L5e
            int r2 = r10.b
            r6 = 120(0x78, float:1.68E-43)
            if (r2 < r6) goto L5e
            r0.d = r5
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto Lc4
            goto Lb8
        L5e:
            long r5 = r10.c
            if (r12 != 0) goto L96
            long r2 = java.lang.System.nanoTime()
            long r7 = r10.d
            long r2 = r2 - r7
            long r5 = r5 - r2
            r2 = 0
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 <= 0) goto L86
            long r2 = aorh.a
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r2
            aorj r12 = aorj.c
            long r2 = aooh.B(r5, r12)
            r0.a = r11
            r0.d = r4
            java.lang.Object r12 = aosv.k(r2, r0)
            if (r12 == r1) goto Lb8
        L86:
            long r0 = java.lang.System.nanoTime()
            r10.d = r0
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r0)
            java.lang.Object r12 = r11.a(r10)
            goto Lc4
        L96:
            r8 = r11
        L97:
            aoop r6 = new aoop
            r6.<init>()
            aoot r7 = new aoot
            r7.<init>()
            tfm r4 = new tfm
            r9 = 7
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r8
            r0.e = r6
            r0.f = r7
            r0.d = r3
            cci r10 = r5.e
            java.lang.Object r10 = r10.a(r4, r0)
            if (r10 != r1) goto Lba
        Lb8:
            r12 = r1
            goto Lc4
        Lba:
            r2 = r6
            r11 = r7
        Lbc:
            boolean r10 = r2.a
            if (r10 != 0) goto Lc2
            r10 = r5
            goto L97
        Lc2:
            java.lang.Object r12 = r11.a
        Lc4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrw.a(aonj, aoln):java.lang.Object");
    }

    public final void b(int i) {
        int iW = aooc.w(i, 1, 120);
        this.b = iW;
        this.c = 1000000000 / ((long) iW);
    }

    public final java.lang.Object fold(java.lang.Object obj, aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    public final aolp get(aolq aolqVar) {
        return ajsz.aq(this, aolqVar);
    }

    public final /* synthetic */ aolq getKey() {
        return cci.a;
    }

    public final aolr minusKey(aolq aolqVar) {
        return ajsz.ar(this, aolqVar);
    }

    public final aolr plus(aolr aolrVar) {
        return ajsz.as(this, aolrVar);
    }
}
