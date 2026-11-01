package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ato {
    public defpackage.ati a;
    public defpackage.ars b;
    public defpackage.aso c;
    public boolean d;
    public defpackage.cuq e;
    public final defpackage.aomy f;
    public boolean g;
    public defpackage.amn k;
    private final defpackage.ath m;
    public int h = 1;
    public defpackage.asv i = defpackage.atc.a;
    public final defpackage.apnt l = new defpackage.apnt(this, (byte[]) null);
    public final defpackage.aonj j = new defpackage.afz(this, 3);

    public ato(defpackage.ati atiVar, defpackage.amn amnVar, defpackage.ars arsVar, defpackage.aso asoVar, boolean z, defpackage.cuq cuqVar, defpackage.ath athVar, defpackage.aomy aomyVar) {
        this.a = atiVar;
        this.k = amnVar;
        this.b = arsVar;
        this.c = asoVar;
        this.d = z;
        this.e = cuqVar;
        this.m = athVar;
        this.f = aomyVar;
    }

    public final float a(float f) {
        return this.d ? -f : f;
    }

    public final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.c == defpackage.aso.b ? j >> 32 : j & 4294967295L));
    }

    public final long c(defpackage.asv asvVar, long j, int i) {
        long jB = this.e.b(j, i);
        long jAM = defpackage.mni.aM(j, jB);
        long jD = d(f(asvVar.a(b(d(e(jAM))))));
        defpackage.ath athVar = this.m;
        if (athVar.D) {
            defpackage.dcv dcvVarC = defpackage.cfo.C(athVar);
            if (android.os.Build.VERSION.SDK_INT < 36 || defpackage.a.D() < 3600001) {
                android.view.ViewTreeObserver viewTreeObserver = ((defpackage.deg) dcvVarC).getViewTreeObserver();
                try {
                    if (wt.a == null) {
                        java.lang.reflect.Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                        declaredMethod.setAccessible(true);
                        wt.a = declaredMethod;
                    }
                    java.lang.reflect.Method method = wt.a;
                    if (method != null) {
                        method.invoke(viewTreeObserver, null);
                    }
                } catch (java.lang.Exception unused) {
                }
            } else {
                dfg.a(((defpackage.deg) dcvVarC).getViewTreeObserver());
            }
        }
        return defpackage.mni.bl(defpackage.mni.bl(jB, jD), this.e.a(jD, defpackage.mni.aM(jAM, jD), i));
    }

    public final long d(long j) {
        return this.d ? defpackage.mni.bm(j, -1.0f) : j;
    }

    public final long e(long j) {
        char c = this.c == defpackage.aso.b ? (char) 1 : (char) 2;
        return defpackage.mni.bk((c & 1) != 0 ? java.lang.Float.intBitsToFloat((int) (j >> 32)) : 0.0f, (c & 2) != 0 ? java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) : 0.0f);
    }

    public final long f(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.c == defpackage.aso.b ? ((long) java.lang.Float.floatToRawIntBits(f)) << 32 : ((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        atj atjVar;
        defpackage.ato atoVar;
        java.lang.Throwable th;
        defpackage.aoos aoosVar;
        if (aolnVar instanceof atj) {
            atjVar = (atj) aolnVar;
            int i = atjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                atjVar.c = i - Integer.MIN_VALUE;
            } else {
                atjVar = new atj(this, aolnVar);
            }
        } else {
            atjVar = new atj(this, aolnVar);
        }
        java.lang.Object obj = atjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = atjVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aoosVar = atjVar.d;
            try {
                defpackage.aooc.af(obj);
                atoVar = this;
                atoVar.g = false;
                return new dpu(aoosVar.a);
            } catch (java.lang.Throwable th2) {
                th = th2;
                atoVar = this;
                atoVar.g = false;
                throw th;
            }
        }
        defpackage.aooc.af(obj);
        defpackage.aoos aoosVar2 = new defpackage.aoos();
        aoosVar2.a = j;
        this.g = true;
        try {
            aoc aocVar = aoc.a;
            atoVar = this;
            try {
                atl atlVar = new atl(atoVar, aoosVar2, j, (defpackage.aoln) null);
                atjVar.d = aoosVar2;
                atjVar.c = 1;
                if (atoVar.i(aocVar, atlVar, atjVar) == aoluVar) {
                    return aoluVar;
                }
                aoosVar = aoosVar2;
                atoVar.g = false;
                return new dpu(aoosVar.a);
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                atoVar.g = false;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            atoVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(long j, boolean z, defpackage.aoln aolnVar) {
        atm atmVar;
        if (aolnVar instanceof atm) {
            atmVar = (atm) aolnVar;
            int i = atmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                atmVar.c = i - Integer.MIN_VALUE;
            } else {
                atmVar = new atm(this, aolnVar);
            }
        } else {
            atmVar = new atm(this, aolnVar);
        }
        java.lang.Object obj = atmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = atmVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!z || !(this.b instanceof defpackage.aqm)) {
                long jC = this.c == defpackage.aso.b ? dpu.c(j, 0.0f, 0.0f, 1) : dpu.c(j, 0.0f, 0.0f, 2);
                defpackage.aonn atnVar = new atn(this, (defpackage.aoln) null);
                defpackage.amn amnVar = this.k;
                if (amnVar == null || !j()) {
                    dpu dpuVar = new dpu(jC);
                    atmVar.c = 2;
                    if (atnVar.a(dpuVar, atmVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    atmVar.c = 1;
                    if (amnVar.f(jC, atnVar, atmVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final java.lang.Object i(aoc aocVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        java.lang.Object objD = this.a.d(aocVar, new apw(this, aonnVar, (defpackage.aoln) null, 5), aolnVar);
        return objD != defpackage.aolu.a ? defpackage.aojh.a : objD;
    }

    public final boolean j() {
        if (this.a.g() || this.a.f()) {
            return true;
        }
        defpackage.amn amnVar = this.k;
        return amnVar != null && amnVar.j();
    }

    public final boolean k() {
        return this.c == defpackage.aso.a;
    }
}
