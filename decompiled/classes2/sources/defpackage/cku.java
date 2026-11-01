package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cku extends aomg implements aonn {
    java.lang.Object a;
    int b;
    int c;
    int d;
    final /* synthetic */ ckv e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cku(ckv ckvVar, aoln aolnVar) {
        super(aolnVar);
        this.e = ckvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0052 -> B:15:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:24:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:24:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.f
            aoqn r1 = (aoqn) r1
            aolu r2 = aolu.a
            int r3 = r0.d
            r4 = 0
            r7 = 64
            r8 = 2
            r9 = 0
            r10 = 0
            r12 = 1
            if (r3 == 0) goto L2b
            if (r3 == r12) goto L21
            int r13 = r0.b
            aooc.af(r19)
            r16 = 1
            if (r3 == r8) goto L85
            goto Lb8
        L21:
            int r3 = r0.c
            int r13 = r0.b
            java.lang.Object r14 = r0.a
            aooc.af(r19)
            goto L54
        L2b:
            aooc.af(r19)
            ckv r3 = r0.e
            long[] r3 = r3.e
            if (r3 == 0) goto L56
            int r13 = r3.length
            r14 = r3
            r3 = r13
            r13 = r9
        L38:
            if (r13 >= r3) goto L56
            r15 = r14
            long[] r15 = (long[]) r15
            r5 = r15[r13]
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r5)
            r0.f = r1
            r0.a = r14
            r0.b = r13
            r0.c = r3
            r0.d = r12
            java.lang.Object r5 = r1.a(r15, r0)
            if (r5 == r2) goto Lbd
        L54:
            int r13 = r13 + r12
            goto L38
        L56:
            r16 = 1
            ckv r3 = r0.e
            long r5 = r3.c
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 == 0) goto L87
            r13 = r9
        L61:
            if (r13 >= r7) goto L87
            ckv r3 = r0.e
            long r5 = r16 << r13
            long r14 = r3.c
            long r14 = r14 & r5
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 == 0) goto L85
            long r5 = r3.d
            long r14 = (long) r13
            java.lang.Long r3 = new java.lang.Long
            long r5 = r5 + r14
            r3.<init>(r5)
            r0.f = r1
            r0.a = r4
            r0.b = r13
            r0.d = r8
            java.lang.Object r3 = r1.a(r3, r0)
            if (r3 == r2) goto Lbd
        L85:
            int r13 = r13 + r12
            goto L61
        L87:
            ckv r3 = r0.e
            long r5 = r3.b
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 == 0) goto Lbb
        L8f:
            if (r9 >= r7) goto Lbb
            ckv r3 = r0.e
            long r5 = r16 << r9
            long r13 = r3.b
            long r13 = r13 & r5
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 == 0) goto Lb7
            long r5 = r3.d
            long r13 = (long) r9
            long r5 = r5 + r13
            java.lang.Long r3 = new java.lang.Long
            r13 = 64
            long r5 = r5 + r13
            r3.<init>(r5)
            r0.f = r1
            r0.a = r4
            r0.b = r9
            r5 = 3
            r0.d = r5
            java.lang.Object r3 = r1.a(r3, r0)
            if (r3 == r2) goto Lbd
        Lb7:
            r13 = r9
        Lb8:
            int r9 = r13 + 1
            goto L8f
        Lbb:
            aojh r2 = aojh.a
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cku.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.cku ckuVar = new defpackage.cku(this.e, aolnVar);
        ckuVar.f = obj;
        return ckuVar;
    }
}
