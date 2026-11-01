package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dag {
    public final defpackage.dah a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private defpackage.dah i;
    public boolean b = true;
    public final java.util.Map h = new java.util.HashMap();

    public dag(defpackage.dah dahVar) {
        this.a = dahVar;
    }

    public abstract int a(defpackage.dck dckVar, defpackage.cwk cwkVar);

    protected abstract long b(defpackage.dck dckVar, long j);

    public abstract java.util.Map c(defpackage.dck dckVar);

    public final void d(defpackage.cwk cwkVar, int i, defpackage.dck dckVar) {
        float f = i;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L);
        while (true) {
            jFloatToRawIntBits = b(dckVar, jFloatToRawIntBits);
            dckVar = dckVar.A;
            if (dckVar == null) {
                defpackage.aooh.g();
            }
            if (defpackage.aooh.n(dckVar, this.a.k())) {
                break;
            } else if (c(dckVar).containsKey(cwkVar)) {
                float fA = a(dckVar, cwkVar);
                jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fA)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA)) & 4294967295L);
            }
        }
        float fIntBitsToFloat = cwkVar instanceof defpackage.cxa ? java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        java.util.Map map = this.h;
        int iRound = java.lang.Math.round(fIntBitsToFloat);
        if (map.containsKey(cwkVar)) {
            iRound = ((java.lang.Number) cwkVar.a.a(java.lang.Integer.valueOf(((java.lang.Number) defpackage.ajsz.aK(map, cwkVar)).intValue()), java.lang.Integer.valueOf(iRound))).intValue();
        }
        map.put(cwkVar, java.lang.Integer.valueOf(iRound));
    }

    public final void e() {
        this.b = true;
        defpackage.dah dahVar = this.a;
        defpackage.dah dahVarJ = dahVar.j();
        if (dahVarJ != null) {
            if (this.c) {
                dahVarJ.o();
            } else if (this.e || this.d) {
                dahVarJ.n();
            }
            if (this.f) {
                dahVar.o();
            }
            if (this.g) {
                dahVar.n();
            }
            dahVarJ.i().e();
        }
    }

    public final void f() {
        java.util.Map map = this.h;
        map.clear();
        defpackage.clc clcVar = new defpackage.clc(this, 17);
        defpackage.dah dahVar = this.a;
        dahVar.l(clcVar);
        map.putAll(c(dahVar.k()));
        this.b = false;
    }

    public final void g() {
        defpackage.dag dagVarI;
        defpackage.dag dagVarI2;
        boolean zI = i();
        defpackage.dah dahVar = this.a;
        if (!zI) {
            defpackage.dah dahVarJ = dahVar.j();
            if (dahVarJ == null) {
                return;
            }
            dahVar = dahVarJ.i().i;
            if (dahVar == null || !dahVar.i().i()) {
                defpackage.dah dahVar2 = this.i;
                if (dahVar2 == null || dahVar2.i().i()) {
                    return;
                }
                defpackage.dah dahVarJ2 = dahVar2.j();
                if (dahVarJ2 != null && (dagVarI2 = dahVarJ2.i()) != null) {
                    dagVarI2.g();
                }
                defpackage.dah dahVarJ3 = dahVar2.j();
                dahVar = null;
                if (dahVarJ3 != null && (dagVarI = dahVarJ3.i()) != null) {
                    dahVar = dagVarI.i;
                }
            }
        }
        this.i = dahVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean j() {
        g();
        return this.i != null;
    }
}
