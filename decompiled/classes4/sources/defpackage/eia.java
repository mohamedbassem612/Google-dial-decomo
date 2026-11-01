package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class eia implements eig {
    private final ehw a;
    private final ein b;
    private final boolean c;

    public eia(ein einVar, ehw ehwVar) {
        this.b = einVar;
        this.c = ehwVar instanceof ehf;
        this.a = ehwVar;
    }

    public final int a(java.lang.Object obj) {
        eio eioVarC = this.b.c(obj);
        int iAu = eioVarC.e;
        if (iAu == -1) {
            iAu = 0;
            for (int i = 0; i < eioVarC.b; i++) {
                iAu += 2 + a.au(2, eioVarC.c[i] >>> 3) + egv.E(3, (egm) eioVarC.d[i]);
            }
            eioVarC.e = iAu;
        }
        if (this.c) {
            eik eikVar = dzl.g(obj).b;
            if (eikVar.size() > 0) {
                defpackage.eii eiiVar = (defpackage.eii) eikVar.a(0);
                aehu aehuVar = eiiVar.c;
                java.lang.Object obj2 = eiiVar.a;
                throw null;
            }
        }
        return iAu;
    }

    public final int b(java.lang.Object obj) {
        int iHashCode = this.b.c(obj).hashCode();
        return this.c ? (iHashCode * 53) + dzl.g(obj).hashCode() : iHashCode;
    }

    public final java.lang.Object c() {
        ehg ehgVar = this.a;
        return ehgVar instanceof ehg ? ehgVar.l() : ehgVar.m().e();
    }

    public final void d(java.lang.Object obj) {
        this.b.e(obj);
        dzl.i(obj);
    }

    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        eih.i(this.b, obj, obj2);
        if (this.c) {
            eih.l(obj, obj2);
        }
    }

    public final void f(java.lang.Object obj, egr egrVar, egz egzVar) {
        boolean zN;
        ein einVar = this.b;
        eio eioVarB = einVar.b(obj);
        dzl.h(obj);
        while (egrVar.c() != Integer.MAX_VALUE) {
            try {
                int i = egrVar.b;
                int i2 = 0;
                if (i == 11) {
                    ece eceVarB = null;
                    egm egmVarO = null;
                    while (egrVar.c() != Integer.MAX_VALUE) {
                        int i3 = egrVar.b;
                        if (i3 == 16) {
                            i2 = egrVar.i();
                            eceVarB = egzVar.b(this.a, i2);
                        } else if (i3 == 26) {
                            if (eceVarB != null) {
                                throw null;
                            }
                            egmVarO = egrVar.o();
                        } else if (i3 == 12 || !egrVar.N()) {
                            break;
                        }
                    }
                    if (egrVar.b != 12) {
                        throw new eho("Protocol message end-group tag did not match expected tag.");
                    }
                    if (egmVarO != null) {
                        if (eceVarB != null) {
                            throw null;
                        }
                        eioVarB.e((i2 << 3) | 2, egmVarO);
                    }
                    zN = true;
                } else if ((i & 7) != 2) {
                    zN = egrVar.N();
                } else {
                    if (egzVar.b(this.a, i >>> 3) != null) {
                        throw null;
                    }
                    zN = einVar.a(eioVarB, egrVar, 0);
                }
                if (!zN) {
                    break;
                }
            } catch (java.lang.Throwable th) {
                einVar.f(obj, eioVarB);
                throw th;
            }
        }
        einVar.f(obj, eioVarB);
    }

    public final boolean g(java.lang.Object obj, java.lang.Object obj2) {
        ein einVar = this.b;
        if (!einVar.c(obj).equals(einVar.c(obj2))) {
            return false;
        }
        if (this.c) {
            return dzl.g(obj).equals(dzl.g(obj2));
        }
        return true;
    }

    public final boolean h(java.lang.Object obj) {
        dzl.g(obj).f();
        return true;
    }

    public final void i(java.lang.Object obj, ipc ipcVar) {
        java.util.Iterator itB = dzl.g(obj).b();
        if (itB.hasNext()) {
            throw null;
        }
        eio eioVarC = this.b.c(obj);
        for (int i = 0; i < eioVarC.b; i++) {
            int i2 = eioVarC.c[i] >>> 3;
            java.lang.Object obj2 = eioVarC.d[i];
            if (obj2 instanceof egm) {
                ((egv) ipcVar.a).p(i2, (egm) obj2);
            } else {
                ((egv) ipcVar.a).o(i2, (ehw) obj2);
            }
        }
    }
}
