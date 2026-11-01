package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cfe extends aomg implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    int d;
    int e;
    int f;
    long g;
    int h;
    final /* synthetic */ cff i;
    private /* synthetic */ java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfe(cff cffVar, aoln aolnVar) {
        super(aolnVar);
        this.i = cffVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0046 -> B:11:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:16:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:16:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0044 -> B:19:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object b(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.j
            aoqn r1 = (aoqn) r1
            aolu r2 = aolu.a
            int r3 = r0.h
            r4 = 0
            r5 = 1
            r6 = 8
            if (r3 == 0) goto L22
            int r3 = r0.f
            int r7 = r0.e
            long r8 = r0.g
            int r10 = r0.d
            int r11 = r0.c
            java.lang.Object r12 = r0.b
            java.lang.Object r13 = r0.a
            aooc.af(r21)
            goto L82
        L22:
            aooc.af(r21)
            cff r3 = r0.i
            ady r3 = r3.a
            java.lang.Object[] r7 = r3.b
            long[] r3 = r3.a
            int r8 = r3.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L90
            r9 = r4
        L33:
            r10 = r3
            long[] r10 = (long[]) r10
            r11 = r10[r9]
            long r13 = ~r11
            r10 = 7
            long r13 = r13 << r10
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto L8b
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r13 = r7
            r7 = r10
            r10 = r9
            r18 = r11
            r12 = r3
            r3 = r4
            r11 = r8
            r8 = r18
        L57:
            if (r3 >= r7) goto L85
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L82
            int r14 = r10 << 3
            int r14 = r14 + r3
            r15 = r13
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            r14 = r15[r14]
            r0.j = r1
            r0.a = r13
            r0.b = r12
            r0.c = r11
            r0.d = r10
            r0.g = r8
            r0.e = r7
            r0.f = r3
            r0.h = r5
            java.lang.Object r14 = r1.a(r14, r0)
            if (r14 == r2) goto L92
        L82:
            long r8 = r8 >> r6
            int r3 = r3 + r5
            goto L57
        L85:
            if (r7 != r6) goto L90
            r9 = r10
            r8 = r11
            r3 = r12
            r7 = r13
        L8b:
            if (r9 == r8) goto L90
            int r9 = r9 + 1
            goto L33
        L90:
            aojh r2 = aojh.a
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfe.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.cfe cfeVar = new defpackage.cfe(this.i, aolnVar);
        cfeVar.j = obj;
        return cfeVar;
    }
}
