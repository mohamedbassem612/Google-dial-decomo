package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cof extends defpackage.cmv implements defpackage.dbd, defpackage.dat {
    public defpackage.css a;
    public boolean b;
    public defpackage.cmj c;
    public cwy d;
    public float e;
    public defpackage.cqh f;

    public cof(defpackage.css cssVar, boolean z, defpackage.cmj cmjVar, cwy cwyVar, float f, defpackage.cqh cqhVar) {
        this.a = cssVar;
        this.b = z;
        this.c = cmjVar;
        this.d = cwyVar;
        this.e = f;
        this.f = cqhVar;
    }

    private final long d(long j) {
        boolean z = defpackage.dpd.h(j) && defpackage.dpd.g(j);
        boolean z2 = defpackage.dpd.j(j) && defpackage.dpd.i(j);
        if ((!g() && z) || z2) {
            return defpackage.dpd.k(j, defpackage.dpd.b(j), 0, defpackage.dpd.a(j), 0, 10);
        }
        long jA = this.a.a();
        int iRound = k(jA) ? java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jA >> 32))) : defpackage.dpd.d(j);
        int iRound2 = h(jA) ? java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L))) : defpackage.dpd.c(j);
        int iD = defpackage.dpd.d(j);
        int iB = defpackage.dpd.b(j);
        if (iRound < iD) {
            iRound = iD;
        }
        if (iRound <= iB) {
            iB = iRound;
        }
        int iC = defpackage.dpd.c(j);
        int iA = defpackage.dpd.a(j);
        if (iRound2 < iC) {
            iRound2 = iC;
        }
        if (iRound2 <= iA) {
            iA = iRound2;
        }
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(iB)) << 32) | (((long) java.lang.Float.floatToRawIntBits(iA)) & 4294967295L);
        if (g()) {
            int i = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat = !k(this.a.a()) ? java.lang.Float.intBitsToFloat(i) : java.lang.Float.intBitsToFloat((int) (this.a.a() >> 32));
            float fIntBitsToFloat2 = !h(this.a.a()) ? java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
            long jFloatToRawIntBits3 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
            if (java.lang.Float.intBitsToFloat(i) == 0.0f || java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                jFloatToRawIntBits = 0;
            } else {
                long j2 = jFloatToRawIntBits2 | jFloatToRawIntBits3;
                jFloatToRawIntBits = defpackage.wi.e(j2, this.d.a(j2, jFloatToRawIntBits));
            }
        }
        int iRound3 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        int iD2 = defpackage.dpd.d(j);
        int iB2 = defpackage.dpd.b(j);
        if (iRound3 < iD2) {
            iRound3 = iD2;
        }
        int i2 = iRound3 > iB2 ? iB2 : iRound3;
        int iRound4 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
        int iC2 = defpackage.dpd.c(j);
        int iA2 = defpackage.dpd.a(j);
        if (iRound4 < iC2) {
            iRound4 = iC2;
        }
        return defpackage.dpd.k(j, i2, 0, iRound4 > iA2 ? iA2 : iRound4, 0, 10);
    }

    private final boolean g() {
        return this.b && this.a.a() != 9205357640488583168L;
    }

    private static final boolean h(long j) {
        return j != 9205357640488583168L && (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    private static final boolean k(long j) {
        return j != 9205357640488583168L && (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        defpackage.czc czcVarV = cydVar.v(d(j));
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.clc(czcVarV, 4));
    }

    @Override // defpackage.dbd
    public final int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        if (!g()) {
            return cxeVar.c(i);
        }
        long jD = d(defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE));
        return java.lang.Math.max(defpackage.dpd.c(jD), cxeVar.c(i));
    }

    @Override // defpackage.dbd
    public final int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        if (!g()) {
            return cxeVar.d(i);
        }
        long jD = d(defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i));
        return java.lang.Math.max(defpackage.dpd.d(jD), cxeVar.d(i));
    }

    @Override // defpackage.dbd
    public final int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        if (!g()) {
            return cxeVar.e(i);
        }
        long jD = d(defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE));
        return java.lang.Math.max(defpackage.dpd.c(jD), cxeVar.e(i));
    }

    @Override // defpackage.dbd
    public final int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        if (!g()) {
            return cxeVar.f(i);
        }
        long jD = d(defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i));
        return java.lang.Math.max(defpackage.dpd.d(jD), cxeVar.f(i));
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        long jE;
        long jA = this.a.a();
        float fIntBitsToFloat = k(jA) ? java.lang.Float.intBitsToFloat((int) (jA >> 32)) : java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> 32));
        float fIntBitsToFloat2 = h(jA) ? java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (dbmVar.o() & 4294967295L));
        long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
        if (java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> 32)) == 0.0f || java.lang.Float.intBitsToFloat((int) (dbmVar.o() & 4294967295L)) == 0.0f) {
            jE = 0;
        } else {
            long j = jFloatToRawIntBits | jFloatToRawIntBits2;
            jE = defpackage.wi.e(j, this.d.a(j, dbmVar.o()));
        }
        long j2 = jE;
        long jA2 = this.c.a((((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j2 >> 32)))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L), (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> 32)))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (dbmVar.o() & 4294967295L)))) & 4294967295L), dbmVar.p());
        float f = (int) (jA2 >> 32);
        float f2 = (int) (jA2 & 4294967295L);
        dbmVar.q().c.r(f, f2);
        float f3 = -f;
        float f4 = -f2;
        try {
            this.a.e(dbmVar, j2, this.e, this.f);
            dbmVar.q().c.r(f3, f4);
            dbmVar.D();
        } catch (java.lang.Throwable th) {
            dbmVar.q().c.r(f3, f4);
            throw th;
        }
    }

    public final java.lang.String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }
}
