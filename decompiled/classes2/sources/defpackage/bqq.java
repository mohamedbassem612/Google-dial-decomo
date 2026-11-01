package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bqq extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aii d;
    final /* synthetic */ java.util.List e;
    final /* synthetic */ cei f;
    final /* synthetic */ ceg g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqq(aii aiiVar, java.util.List list, cei ceiVar, ceg cegVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = aiiVar;
        this.e = list;
        this.f = ceiVar;
        this.g = cegVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005a A[PHI: r2 r13
      0x005a: PHI (r2v3 java.lang.Object) = (r2v4 java.lang.Object), (r2v6 java.lang.Object) binds: [B:9:0x0058, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r13v2 aosy) = (r13v7 aosy), (r13v6 aosy) binds: [B:9:0x0058, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0032 A[PHI: r2
      0x0032: PHI (r2v4 java.lang.Object) = (r2v2 java.lang.Object), (r2v3 java.lang.Object), (r2v7 java.lang.Object) binds: [B:7:0x001d, B:11:0x0068, B:5:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0068 -> B:8:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.h
            aoss r0 = (aoss) r0
            aolu r1 = aolu.a
            int r2 = r12.c
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 == r3) goto L13
            java.lang.Object r2 = r12.a
            aooc.af(r13)
            goto L32
        L13:
            java.lang.Object r2 = r12.b
            java.lang.Object r4 = r12.a
            aooc.af(r13)
            r13 = r2
            r2 = r4
            goto L5a
        L1d:
            aooc.af(r13)
            java.lang.Float r13 = new java.lang.Float
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r13.<init>(r2)
            aku r2 = new aku
            r4 = 1058642330(0x3f19999a, float:0.6)
            r5 = 1128792064(0x43480000, float:200.0)
            r2.<init>(r4, r5, r13)
        L32:
            buj r4 = new buj
            aii r5 = r12.d
            r6 = r2
            aku r6 = (aku) r6
            java.util.List r7 = r12.e
            cei r8 = r12.f
            ceg r9 = r12.g
            r10 = 0
            r11 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r13 = 3
            r5 = 0
            aosy r13 = aoov.am(r0, r5, r4, r13)
            r12.h = r0
            r12.a = r2
            r12.b = r13
            r12.c = r3
            r4 = 650(0x28a, double:3.21E-321)
            java.lang.Object r4 = aosv.j(r4, r12)
            if (r4 == r1) goto L6a
        L5a:
            r12.h = r0
            r12.a = r2
            r4 = 0
            r12.b = r4
            r4 = 2
            r12.c = r4
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r1) goto L32
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqq.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bqq bqqVar = new defpackage.bqq(this.d, this.e, this.f, this.g, aolnVar);
        bqqVar.h = obj;
        return bqqVar;
    }
}
