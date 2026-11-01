package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class adj extends aomg implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    long f;
    long g;
    int h;
    final /* synthetic */ adl i;
    final /* synthetic */ defpackage.adk j;
    private /* synthetic */ java.lang.Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adj(adl adlVar, defpackage.adk adkVar, aoln aolnVar) {
        super(aolnVar);
        this.i = adlVar;
        this.j = adkVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007f -> B:13:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x0086
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.k
            aoqn r1 = (aoqn) r1
            aolu r2 = aolu.a
            int r3 = r0.h
            if (r3 == 0) goto L27
            long r3 = r0.g
            long r5 = r0.f
            int r7 = r0.e
            int r8 = r0.d
            java.lang.Object r9 = r0.c
            java.lang.Object r10 = r0.b
            java.lang.Object r11 = r0.a
            aooc.af(r19)
            r15 = r11
            r11 = r7
            r7 = r9
            r16 = r5
            r5 = r10
            r9 = r16
            r6 = r15
            goto L81
        L27:
            aooc.af(r19)
            adl r3 = r0.i
            adk r4 = r0.j
            ady r5 = r3.a
            long[] r5 = r5.a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L91
            r7 = 0
        L38:
            r8 = r5
            long[] r8 = (long[]) r8
            r9 = r8[r7]
            long r11 = ~r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            r8 = r6
            r6 = r4
            r15 = r5
            r5 = r3
            r3 = r11
            r11 = r7
            r7 = r15
        L4b:
            r12 = 0
            int r12 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r11 << 3
            int r13 = java.lang.Long.numberOfTrailingZeros(r3)
            int r13 = r13 >>> 3
            r14 = r6
            adk r14 = (defpackage.adk) r14
            int r12 = r12 + r13
            r14.a = r12
            r13 = r5
            adl r13 = (adl) r13
            ady r13 = r13.a
            java.lang.Object[] r13 = r13.b
            r12 = r13[r12]
            r0.k = r1
            r0.a = r6
            r0.b = r5
            r0.c = r7
            r0.d = r8
            r0.e = r11
            r0.f = r9
            r0.g = r3
            r13 = 1
            r0.h = r13
            java.lang.Object r12 = r1.a(r12, r0)
            if (r12 == r2) goto L93
        L81:
            r12 = -1
            long r12 = r12 + r3
            long r3 = r3 & r12
            goto L4b
        L86:
            if (r11 == r8) goto L91
            int r3 = r11 + 1
            r4 = r7
            r7 = r3
            r3 = r5
            r5 = r4
            r4 = r6
            r6 = r8
            goto L38
        L91:
            aojh r2 = aojh.a
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adj.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.adj adjVar = new defpackage.adj(this.i, this.j, aolnVar);
        adjVar.k = obj;
        return adjVar;
    }
}
