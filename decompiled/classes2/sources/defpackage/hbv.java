package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbv extends aomh implements aonn {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ defpackage.gzh d;
    final /* synthetic */ int e;
    final /* synthetic */ float f;
    final /* synthetic */ defpackage.hch g;
    final /* synthetic */ ccp h;
    final /* synthetic */ defpackage.hcb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbv(boolean z, boolean z2, defpackage.hcb hcbVar, defpackage.gzh gzhVar, int i, float f, defpackage.hch hchVar, ccp ccpVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = z;
        this.c = z2;
        this.i = hcbVar;
        this.d = gzhVar;
        this.e = i;
        this.f = f;
        this.g = hchVar;
        this.h = ccpVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            aolu r0 = aolu.a
            int r1 = r10.a
            r2 = 1
            aooc.af(r11)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L5c
            goto L83
        Le:
            boolean r11 = r10.b
            if (r11 == 0) goto L5c
            ccp r11 = r10.h
            boolean r11 = a.C(r11)
            if (r11 != 0) goto L5c
            boolean r11 = r10.c
            if (r11 == 0) goto L5c
            hcb r3 = r10.i
            r10.a = r2
            gzh r11 = r3.g()
            hch r1 = r3.h()
            float r4 = r3.d()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 >= 0) goto L37
            if (r11 == 0) goto L3b
        L37:
            if (r11 == 0) goto L41
            if (r4 >= 0) goto L3d
        L3b:
            r5 = r6
            goto L41
        L3d:
            if (r1 == 0) goto L41
            float r5 = r1.a
        L41:
            gzh r4 = r3.g()
            float r11 = r3.c()
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 != 0) goto L4e
            r2 = 0
        L4e:
            r7 = r2
            r6 = 1
            r8 = r10
            java.lang.Object r10 = r3.i(r4, r5, r6, r7, r8)
            if (r10 == r0) goto L59
            aojh r10 = aojh.a
        L59:
            if (r10 != r0) goto L5d
            goto L85
        L5c:
            r8 = r10
        L5d:
            ccp r10 = r8.h
            boolean r11 = r8.b
            a.E(r10, r11)
            if (r11 == 0) goto L83
            hcb r1 = r8.i
            gzh r2 = r8.d
            int r4 = r8.e
            float r5 = r8.f
            hch r6 = r8.g
            float r7 = r1.c()
            r10 = 2
            r8.a = r10
            int r3 = r1.e()
            r9 = r8
            r8 = 1
            java.lang.Object r10 = r1.p(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r10 == r0) goto L85
        L83:
            aojh r0 = aojh.a
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbv.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.hbv(this.b, this.c, this.i, this.d, this.e, this.f, this.g, this.h, aolnVar);
    }
}
