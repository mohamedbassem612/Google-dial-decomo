package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class btn implements cun {
    final /* synthetic */ defpackage.btt a;
    final /* synthetic */ ars b;
    final /* synthetic */ aso c;

    public btn(defpackage.btt bttVar, ars arsVar, aso asoVar) {
        this.a = bttVar;
        this.b = arsVar;
        this.c = asoVar;
    }

    private final float e(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.c == aso.b ? j >> 32 : j & 4294967295L));
    }

    private final float f(long j) {
        return this.c == aso.b ? defpackage.dpu.a(j) : java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    private final long g(float f) {
        aso asoVar = this.c;
        float f2 = asoVar == aso.b ? f : 0.0f;
        aso asoVar2 = aso.a;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2);
        if (asoVar != asoVar2) {
            f = 0.0f;
        }
        return (jFloatToRawIntBits << 32) | (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L);
    }

    public final long a(long j, long j2, int i) {
        float fE = e(j2);
        if (!a.x(i, 1) || fE == 0.0f) {
            return 0L;
        }
        return g(this.a.d.a(fE));
    }

    public final long b(long j, int i) {
        float fE = e(j);
        if (fE >= 0.0f || !a.x(i, 1)) {
            return 0L;
        }
        return g(this.a.d.a(fE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(long j, long j2, aoln aolnVar) {
        defpackage.btl btlVar;
        if (aolnVar instanceof defpackage.btl) {
            btlVar = (defpackage.btl) aolnVar;
            int i = btlVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                btlVar.d = i - Integer.MIN_VALUE;
            } else {
                btlVar = new defpackage.btl(this, aolnVar);
            }
        } else {
            btlVar = new defpackage.btl(this, aolnVar);
        }
        java.lang.Object objE = btlVar.b;
        aolu aoluVar = aolu.a;
        int i2 = btlVar.d;
        if (i2 == 0) {
            aooc.af(objE);
            float f = f(j2);
            defpackage.btt bttVar = this.a;
            ars arsVar = this.b;
            btlVar.a = j;
            btlVar.d = 1;
            objE = bttVar.e(arsVar, f, btlVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = btlVar.a;
            aooc.af(objE);
        }
        return new defpackage.dpu(mni.bj(defpackage.dpu.a(j), ((java.lang.Number) objE).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(long j, aoln aolnVar) {
        defpackage.btm btmVar;
        if (aolnVar instanceof defpackage.btm) {
            btmVar = (defpackage.btm) aolnVar;
            int i = btmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                btmVar.d = i - Integer.MIN_VALUE;
            } else {
                btmVar = new defpackage.btm(this, aolnVar);
            }
        } else {
            btmVar = new defpackage.btm(this, aolnVar);
        }
        java.lang.Object obj = btmVar.b;
        aolu aoluVar = aolu.a;
        int i2 = btmVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            float f = f(j);
            defpackage.btt bttVar = this.a;
            float fB = bttVar.b();
            float fB2 = bttVar.d.p().b();
            if (f >= 0.0f || fB <= fB2) {
                j = 0;
            } else {
                ars arsVar = this.b;
                btmVar.a = j;
                btmVar.d = 1;
                if (bttVar.e(arsVar, f, btmVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = btmVar.a;
            aooc.af(obj);
        }
        return new defpackage.dpu(j);
    }
}
