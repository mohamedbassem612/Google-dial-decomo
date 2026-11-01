package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apyz implements defpackage.apze {
    private final defpackage.apyv a;
    private final defpackage.apzm b;
    private final boolean c;

    public apyz(defpackage.apzm apzmVar, defpackage.apyv apyvVar) {
        this.b = apzmVar;
        this.c = apyvVar instanceof defpackage.apye;
        this.a = apyvVar;
    }

    @Override // defpackage.apze
    public final int a(java.lang.Object obj) {
        defpackage.apzn apznVarC = this.b.c(obj);
        int iAu = apznVarC.e;
        if (iAu == -1) {
            iAu = 0;
            for (int i = 0; i < apznVarC.b; i++) {
                iAu += 2 + a.au(2, apznVarC.c[i] >>> 3) + defpackage.apxj.a(3, (defpackage.apxo) apznVarC.d[i]);
            }
            apznVarC.e = iAu;
        }
        if (this.c) {
            defpackage.apzj apzjVar = aoog.n(obj).b;
            if (apzjVar.size() > 0) {
                defpackage.apzg apzgVar = (defpackage.apzg) apzjVar.a(0);
                aehu aehuVar = apzgVar.c;
                java.lang.Object obj2 = apzgVar.a;
                throw null;
            }
        }
        return iAu;
    }

    @Override // defpackage.apze
    public final int b(java.lang.Object obj) {
        int iHashCode = this.b.c(obj).hashCode();
        return this.c ? (iHashCode * 53) + aoog.n(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.apze
    public final java.lang.Object c() {
        defpackage.apyv apyvVar = this.a;
        return apyvVar instanceof defpackage.apyf ? ((defpackage.apyf) apyvVar).k() : ((defpackage.apyd) apyvVar.l()).d();
    }

    @Override // defpackage.apze
    public final void d(java.lang.Object obj) {
        this.b.e(obj);
        aoog.p(obj);
    }

    @Override // defpackage.apze
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.apzf.h(this.b, obj, obj2);
        if (this.c) {
            defpackage.apzf.l(obj, obj2);
        }
    }

    @Override // defpackage.apze
    public final void f(java.lang.Object obj, defpackage.apxt apxtVar, defpackage.apxy apxyVar) {
        boolean zN;
        defpackage.apzm apzmVar = this.b;
        defpackage.apzn apznVarB = apzmVar.b(obj);
        aoog.o(obj);
        while (apxtVar.c() != Integer.MAX_VALUE) {
            try {
                int i = apxtVar.a;
                int i2 = 0;
                if (i == 11) {
                    aoog aoogVarB = null;
                    defpackage.apxo apxoVarS = null;
                    while (apxtVar.c() != Integer.MAX_VALUE) {
                        int i3 = apxtVar.a;
                        if (i3 == 16) {
                            i2 = apxtVar.i();
                            aoogVarB = apxyVar.b(this.a, i2);
                        } else if (i3 == 26) {
                            if (aoogVarB != null) {
                                throw null;
                            }
                            apxoVarS = apxtVar.s();
                        } else if (i3 == 12 || !apxtVar.N()) {
                            break;
                        }
                    }
                    if (apxtVar.a != 12) {
                        throw new defpackage.apym("Protocol message end-group tag did not match expected tag.");
                    }
                    if (apxoVarS != null) {
                        if (aoogVarB != null) {
                            throw null;
                        }
                        apznVarB.e((i2 << 3) | 2, apxoVarS);
                    }
                    zN = true;
                } else if ((i & 7) != 2) {
                    zN = apxtVar.N();
                } else {
                    if (apxyVar.b(this.a, i >>> 3) != null) {
                        throw null;
                    }
                    zN = apzmVar.a(apznVarB, apxtVar, 0);
                }
                if (!zN) {
                    break;
                }
            } catch (java.lang.Throwable th) {
                apzmVar.f(obj, apznVarB);
                throw th;
            }
        }
        apzmVar.f(obj, apznVarB);
    }

    @Override // defpackage.apze
    public final boolean g(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.apzm apzmVar = this.b;
        if (!apzmVar.c(obj).equals(apzmVar.c(obj2))) {
            return false;
        }
        if (this.c) {
            return aoog.n(obj).equals(aoog.n(obj2));
        }
        return true;
    }

    @Override // defpackage.apze
    public final boolean h(java.lang.Object obj) {
        aoog.n(obj).f();
        return true;
    }

    @Override // defpackage.apze
    public final void i(java.lang.Object obj, uzx uzxVar) throws defpackage.apxu {
        java.util.Iterator itB = aoog.n(obj).b();
        if (itB.hasNext()) {
            throw null;
        }
        defpackage.apzn apznVarC = this.b.c(obj);
        for (int i = 0; i < apznVarC.b; i++) {
            int i2 = apznVarC.c[i] >>> 3;
            java.lang.Object obj2 = apznVarC.d[i];
            if (obj2 instanceof defpackage.apxo) {
                defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
                apxjVar.B(11);
                apxjVar.A(2, i2);
                apxjVar.p(3, (defpackage.apxo) obj2);
                apxjVar.B(12);
            } else {
                defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
                apxjVar2.B(11);
                apxjVar2.A(2, i2);
                apxjVar2.B(26);
                apxjVar2.x((defpackage.apyv) obj2);
                apxjVar2.B(12);
            }
        }
    }
}
