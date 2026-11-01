package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class diy {
    public final defpackage.dao a;
    public defpackage.diy b;
    public long c;
    public long d;
    public long e = Long.MIN_VALUE;
    final /* synthetic */ defpackage.diz f;
    private final int g;
    private final defpackage.aonj h;

    public diy(defpackage.diz dizVar, int i, defpackage.dao daoVar, defpackage.aonj aonjVar) {
        this.f = dizVar;
        this.g = i;
        this.a = daoVar;
        this.h = aonjVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        dix dixVar;
        defpackage.dao daoVar = this.a;
        long j5 = this.f.e;
        defpackage.dck dckVarB = defpackage.cfo.B(daoVar, 2);
        defpackage.dbk dbkVarA = defpackage.cfo.A(daoVar);
        if (!dbkVarA.am()) {
            dixVar = null;
        } else if (dbkVarA.p() != dckVarB) {
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits((int) (j >> 32));
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits((int) (j & 4294967295L));
            long jH = dckVarB.h();
            long jL = defpackage.dfd.l(dbkVarA.p().i(dckVarB, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L)));
            dixVar = new dix(jL, (((long) (((int) (jL >> 32)) + ((int) (jH >> 32)))) << 32) | (((long) (((int) (jL & 4294967295L)) + ((int) (jH & 4294967295L)))) & 4294967295L), j3, j4, j5, fArr, daoVar);
        } else {
            dixVar = new dix(j, j2, j3, j4, j5, fArr, daoVar);
        }
        if (dixVar != null) {
            this.h.a(dixVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[LOOP:1: B:32:0x0078->B:31:0x0076, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        r0 = r1.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            diz r0 = r7.f
            aco r1 = r0.g
            int r2 = r7.g
            java.lang.Object r3 = r1.d(r2)
            diy r3 = (defpackage.diy) r3
            r4 = 0
            if (r3 == 0) goto L5c
            boolean r5 = defpackage.aooh.n(r3, r7)
            if (r5 == 0) goto L48
            diy r0 = r7.b
            r7.b = r4
            if (r0 != 0) goto L44
            dao r7 = r7.a
            cmv r7 = r7.L()
            dbk r7 = defpackage.cfo.A(r7)
            boolean r0 = r7.al()
            if (r0 == 0) goto L7c
            dcv r0 = defpackage.dbn.a(r7)
            deg r0 = (defpackage.deg) r0
            diw r0 = r0.o
            boolean r1 = defpackage.diw.h(r7)
            if (r1 == 0) goto L7c
            diu r1 = r0.b
            int r7 = r0.a(r7)
            r0 = 0
            r1.b(r7, r0)
            goto L7c
        L44:
            r1.h(r2, r0)
            goto L7c
        L48:
            r1.h(r2, r3)
        L4b:
            if (r3 == 0) goto L7c
            diy r1 = r3.b
            if (r1 == 0) goto L5c
            if (r1 == r7) goto L55
            r3 = r1
            goto L4b
        L55:
            diy r0 = r7.b
            r3.b = r0
            r7.b = r4
            goto L7c
        L5c:
            diy r1 = r0.a
            if (r1 != r7) goto L67
            diy r1 = r1.b
            r0.a = r1
        L64:
            r7.b = r4
            goto L7c
        L67:
            if (r1 != 0) goto L76
            r0 = r4
            goto L78
        L6b:
            if (r1 == 0) goto L7c
            if (r1 != r7) goto L76
            if (r0 == 0) goto L64
            diy r1 = r1.b
            r0.b = r1
            goto L64
        L76:
            diy r0 = r1.b
        L78:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L6b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diy.b():void");
    }
}
