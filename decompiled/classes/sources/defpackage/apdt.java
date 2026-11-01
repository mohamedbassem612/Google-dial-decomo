package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apdt {
    private final defpackage.aorq a;
    public final defpackage.aorq b;
    public final defpackage.aorp c;
    public final defpackage.aoro d;
    public final defpackage.aono e;
    private final defpackage.aorp f;

    public apdt() {
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.f = new defpackage.aorp(0L, aorrVar);
        this.c = new defpackage.aorp(0L, aorrVar);
        defpackage.apdv apdvVar = new defpackage.apdv(0L, null, 2);
        this.a = new defpackage.aorq(apdvVar, aorrVar);
        this.b = new defpackage.aorq(apdvVar, aorrVar);
        this.d = new defpackage.aoro(1, aorrVar);
        this.e = new defpackage.kcc(this, 4);
    }

    public final void e() {
        defpackage.aoro aoroVar;
        int i;
        do {
            aoroVar = this.d;
            i = aoroVar.b;
            if (i <= 1) {
                return;
            }
        } while (!aoroVar.c(i, 1));
    }

    public final void f() {
        java.lang.Object objA;
        long j;
        boolean zG;
        defpackage.apdv apdvVar;
        do {
            int andIncrement = defpackage.aoro.a.getAndIncrement(this.d);
            if (andIncrement > 0) {
                e();
                throw new java.lang.IllegalStateException("The number of released permits cannot be greater than 1");
            }
            if (andIncrement >= 0) {
                return;
            }
            defpackage.aorq aorqVar = this.a;
            defpackage.apdv apdvVar2 = (defpackage.apdv) aorqVar.a;
            long jB = this.f.b();
            long j2 = defpackage.apdu.f;
            long j3 = jB / j2;
            defpackage.apds apdsVar = defpackage.apds.a;
            while (true) {
                objA = defpackage.apbh.a(apdvVar2, j3, apdsVar);
                if (objA == defpackage.apbh.a) {
                    j = jB;
                    break;
                }
                defpackage.apbi apbiVarB = defpackage.apck.b(objA);
                while (true) {
                    defpackage.apbi apbiVar = (defpackage.apbi) aorqVar.a;
                    apdvVar = apdvVar2;
                    j = jB;
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
                    } else {
                        if (apbiVarB.s()) {
                            apbiVarB.p();
                        }
                        apdvVar2 = apdvVar;
                        jB = j;
                    }
                }
                apdvVar2 = apdvVar;
                jB = j;
            }
            defpackage.apdv apdvVar3 = (defpackage.apdv) defpackage.apck.b(objA);
            apdvVar3.o();
            zG = false;
            if (apdvVar3.b <= j3) {
                int i = (int) (j % j2);
                defpackage.zzx zzxVar = apdvVar3.c;
                defpackage.apcm apcmVar = defpackage.apdu.b;
                java.lang.Object objA2 = zzxVar.aa(i).a(apcmVar);
                if (objA2 == null) {
                    int i2 = defpackage.apdu.a;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            if (zzxVar.aa(i).d(apcmVar, defpackage.apdu.d)) {
                                break;
                            }
                        } else if (zzxVar.aa(i).a != defpackage.apdu.c) {
                            i3++;
                        }
                        zG = true;
                        break;
                    }
                } else if (objA2 != defpackage.apdu.e) {
                    int iZ = defpackage.aooh.Z(objA2);
                    if (iZ == 0) {
                        defpackage.aosb aosbVar = (defpackage.aosb) objA2;
                        java.lang.Object objJ = aosbVar.j(defpackage.aojh.a, this.e);
                        if (objJ != null) {
                            aosbVar.c(objJ);
                            zG = true;
                            break;
                            break;
                        }
                    } else {
                        if (iZ != 1) {
                            java.util.Objects.toString(objA2);
                            throw new java.lang.IllegalStateException("unexpected: ".concat(objA2.toString()));
                        }
                        zG = ((defpackage.apdm) objA2).g(this, defpackage.aojh.a);
                    }
                }
            }
        } while (!zG);
    }
}
