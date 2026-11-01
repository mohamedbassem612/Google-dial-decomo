package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apdp extends defpackage.apdt {
    public final defpackage.aorq a = new defpackage.aorq(defpackage.apdq.a, defpackage.aorr.a);

    public final boolean a() {
        return java.lang.Math.max(this.d.b, 0) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        java.lang.Object objA;
        defpackage.apdv apdvVar;
        if (c()) {
            return defpackage.aojh.a;
        }
        defpackage.aosc aoscVarAf = defpackage.aoov.af(defpackage.ajsz.ap(aolnVar));
        try {
            defpackage.apdo apdoVar = new defpackage.apdo(this, aoscVarAf);
            while (true) {
                int andDecrement = defpackage.aoro.a.getAndDecrement(this.d);
                if (andDecrement <= 1) {
                    if (andDecrement > 0) {
                        apdoVar.e(defpackage.aojh.a, this.e);
                        break;
                    }
                    defpackage.aorq aorqVar = this.b;
                    defpackage.apdv apdvVar2 = (defpackage.apdv) aorqVar.a;
                    long jB = this.c.b();
                    defpackage.apdr apdrVar = defpackage.apdr.a;
                    long j = defpackage.apdu.f;
                    long j2 = jB / j;
                    while (true) {
                        objA = defpackage.apbh.a(apdvVar2, j2, apdrVar);
                        if (objA == defpackage.apbh.a) {
                            break;
                        }
                        defpackage.apbi apbiVarB = defpackage.apck.b(objA);
                        while (true) {
                            defpackage.apbi apbiVar = (defpackage.apbi) aorqVar.a;
                            apdvVar = apdvVar2;
                            if (apbiVar.b >= apbiVarB.b) {
                                break;
                            }
                            if (!apbiVarB.u()) {
                                break;
                            }
                            if (aorqVar.d(apbiVar, apbiVarB)) {
                                if (!apbiVar.s()) {
                                    break;
                                }
                                apbiVar.p();
                                break;
                            }
                            if (apbiVarB.s()) {
                                apbiVarB.p();
                            }
                            apdvVar2 = apdvVar;
                        }
                        apdvVar2 = apdvVar;
                    }
                    defpackage.apdv apdvVar3 = (defpackage.apdv) defpackage.apck.b(objA);
                    int i = (int) (jB % j);
                    defpackage.zzx zzxVar = apdvVar3.c;
                    if (zzxVar.aa(i).d(null, apdoVar)) {
                        apdoVar.a.E(apdvVar3, i);
                        break;
                    }
                    if (zzxVar.aa(i).d(defpackage.apdu.b, defpackage.apdu.c)) {
                        int iZ = defpackage.aooh.Z(apdoVar);
                        if (iZ == 0) {
                            apdoVar.e(defpackage.aojh.a, this.e);
                            break;
                        }
                        if (iZ == 1) {
                            ((defpackage.apdm) apdoVar).e = defpackage.aojh.a;
                            break;
                        }
                        apdoVar.toString();
                        throw new java.lang.IllegalStateException("unexpected: ".concat(apdoVar.toString()));
                    }
                    boolean z = defpackage.aosu.a;
                }
            }
            java.lang.Object objK = aoscVarAf.k();
            defpackage.aolu aoluVar = defpackage.aolu.a;
            if (objK == aoluVar && aolnVar == null) {
                defpackage.aooh.i("frame");
            }
            if (objK != aoluVar) {
                objK = defpackage.aojh.a;
            }
            return objK != aoluVar ? defpackage.aojh.a : objK;
        } catch (java.lang.Throwable th) {
            aoscVarAf.B();
            throw th;
        }
    }

    public final boolean c() {
        while (true) {
            defpackage.aoro aoroVar = this.d;
            int i = aoroVar.b;
            if (i > 1) {
                super.e();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (aoroVar.c(1, 0)) {
                    boolean z = defpackage.aosu.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    public final void d() {
        while (a()) {
            defpackage.aorq aorqVar = this.a;
            java.lang.Object obj = aorqVar.a;
            defpackage.apcm apcmVar = defpackage.apdq.a;
            if (obj != apcmVar && aorqVar.d(obj, apcmVar)) {
                f();
                return;
            }
        }
        throw new java.lang.IllegalStateException("This mutex is not locked");
    }

    public final java.lang.String toString() {
        return "Mutex@" + defpackage.aosv.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + ']';
    }
}
