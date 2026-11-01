package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apxt {
    public int a;
    public int b;
    public int c;
    public final java.lang.Object d;

    public apxt(defpackage.apxs apxsVar) {
        this.c = 0;
        byte[] bArr = defpackage.apyj.a;
        this.d = apxsVar;
        apxsVar.d = this;
    }

    private final void Q(java.lang.Object obj, defpackage.apze apzeVar, defpackage.apxy apxyVar) throws defpackage.apym {
        defpackage.apxs apxsVar = (defpackage.apxs) this.d;
        int iN = apxsVar.n();
        apxsVar.F();
        int iE = apxsVar.e(iN);
        apxsVar.a++;
        apzeVar.f(obj, this, apxyVar);
        apxsVar.x(0);
        apxsVar.a--;
        apxsVar.y(iE);
    }

    private final void R(int i) throws defpackage.apym {
        if (((defpackage.apxs) this.d).d() != i) {
            throw new defpackage.apym("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void S(int i) throws defpackage.apym {
        if ((i & 3) != 0) {
            throw new defpackage.apym("Failed to parse the message.");
        }
    }

    private static final void T(int i) throws defpackage.apym {
        if ((i & 7) != 0) {
            throw new defpackage.apym("Failed to parse the message.");
        }
    }

    public final void A(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyq) {
            defpackage.apyq apyqVar = (defpackage.apyq) list;
            int i = this.a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iN = apxsVar.n();
                T(iN);
                int iD = apxsVar.d() + iN;
                do {
                    apyqVar.f(apxsVar.o());
                } while (apxsVar.d() < iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apyqVar.f(apxsVar2.o());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iN2 = apxsVar3.n();
                T(iN2);
                int iD2 = apxsVar3.d() + iN2;
                do {
                    list.add(java.lang.Long.valueOf(apxsVar3.o()));
                } while (apxsVar3.d() < iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Long.valueOf(apxsVar4.o()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void B(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyc) {
            defpackage.apyc apycVar = (defpackage.apyc) list;
            int i = this.a & 7;
            if (i == 2) {
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iN = apxsVar.n();
                S(iN);
                int iD = apxsVar.d() + iN;
                do {
                    apycVar.f(apxsVar.c());
                } while (apxsVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new defpackage.apyl();
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apycVar.f(apxsVar2.c());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 == 2) {
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iN2 = apxsVar3.n();
                S(iN2);
                int iD2 = apxsVar3.d() + iN2;
                do {
                    list.add(java.lang.Float.valueOf(apxsVar3.c()));
                } while (apxsVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.apyl();
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Float.valueOf(apxsVar4.c()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void C(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apygVar.f(apxsVar.h());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apygVar.f(apxsVar2.h());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(apxsVar3.h()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Integer.valueOf(apxsVar4.h()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void D(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyq) {
            defpackage.apyq apyqVar = (defpackage.apyq) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apyqVar.f(apxsVar.p());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apyqVar.f(apxsVar2.p());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Long.valueOf(apxsVar3.p()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Long.valueOf(apxsVar4.p()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void E(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            int i = this.a & 7;
            if (i == 2) {
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iN = apxsVar.n();
                S(iN);
                int iD = apxsVar.d() + iN;
                do {
                    apygVar.f(apxsVar.k());
                } while (apxsVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new defpackage.apyl();
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apygVar.f(apxsVar2.k());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 == 2) {
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iN2 = apxsVar3.n();
                S(iN2);
                int iD2 = apxsVar3.d() + iN2;
                do {
                    list.add(java.lang.Integer.valueOf(apxsVar3.k()));
                } while (apxsVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.apyl();
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Integer.valueOf(apxsVar4.k()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void F(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyq) {
            defpackage.apyq apyqVar = (defpackage.apyq) list;
            int i = this.a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iN = apxsVar.n();
                T(iN);
                int iD = apxsVar.d() + iN;
                do {
                    apyqVar.f(apxsVar.r());
                } while (apxsVar.d() < iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apyqVar.f(apxsVar2.r());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iN2 = apxsVar3.n();
                T(iN2);
                int iD2 = apxsVar3.d() + iN2;
                do {
                    list.add(java.lang.Long.valueOf(apxsVar3.r()));
                } while (apxsVar3.d() < iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Long.valueOf(apxsVar4.r()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void G(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apygVar.f(apxsVar.l());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apygVar.f(apxsVar2.l());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(apxsVar3.l()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Integer.valueOf(apxsVar4.l()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void H(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyq) {
            defpackage.apyq apyqVar = (defpackage.apyq) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apyqVar.f(apxsVar.s());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apyqVar.f(apxsVar2.s());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Long.valueOf(apxsVar3.s()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Long.valueOf(apxsVar4.s()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void I(java.util.List list, boolean z) throws defpackage.apyl {
        int iM;
        int iM2;
        if ((this.a & 7) != 2) {
            throw new defpackage.apyl();
        }
        if (!(list instanceof defpackage.apyp) || z) {
            do {
                list.add(z ? r() : q());
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                if (apxsVar.A()) {
                    return;
                } else {
                    iM = apxsVar.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        } else {
            defpackage.apyp apypVar = (defpackage.apyp) list;
            do {
                s();
                apypVar.a();
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        }
        this.c = iM2;
    }

    public final void J(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apygVar.f(apxsVar.n());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apygVar.f(apxsVar2.n());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(apxsVar3.n()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Integer.valueOf(apxsVar4.n()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyq) {
            defpackage.apyq apyqVar = (defpackage.apyq) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apyqVar.f(apxsVar.t());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apyqVar.f(apxsVar2.t());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Long.valueOf(apxsVar3.t()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Long.valueOf(apxsVar4.t()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void L(int i) throws defpackage.apyl {
        if ((this.a & 7) != i) {
            throw new defpackage.apyl();
        }
    }

    public final boolean M() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).B();
    }

    public final boolean N() {
        int i;
        defpackage.apxs apxsVar = (defpackage.apxs) this.d;
        if (apxsVar.A() || (i = this.a) == this.b) {
            return false;
        }
        return apxsVar.C(i);
    }

    public final void O() {
        android.view.View view = (android.view.View) this.d;
        int top = this.a - (view.getTop() - this.c);
        int i = dzs.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(-(view.getLeft() - this.b));
    }

    public final boolean P(int i) {
        if (this.a == i) {
            return false;
        }
        this.a = i;
        O();
        return true;
    }

    public final double a() throws defpackage.apyl {
        L(1);
        return ((defpackage.apxs) this.d).b();
    }

    public final float b() throws defpackage.apyl {
        L(5);
        return ((defpackage.apxs) this.d).c();
    }

    public final int c() {
        int iM = this.c;
        if (iM != 0) {
            this.a = iM;
            this.c = 0;
        } else {
            iM = ((defpackage.apxs) this.d).m();
            this.a = iM;
        }
        if (iM == 0 || iM == this.b) {
            return Integer.MAX_VALUE;
        }
        return iM >>> 3;
    }

    public final int d() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).f();
    }

    public final int e() throws defpackage.apyl {
        L(5);
        return ((defpackage.apxs) this.d).g();
    }

    public final int f() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).h();
    }

    public final int g() throws defpackage.apyl {
        L(5);
        return ((defpackage.apxs) this.d).k();
    }

    public final int h() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).l();
    }

    public final int i() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).n();
    }

    public final long j() throws defpackage.apyl {
        L(1);
        return ((defpackage.apxs) this.d).o();
    }

    public final long k() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).p();
    }

    public final long l() throws defpackage.apyl {
        L(1);
        return ((defpackage.apxs) this.d).r();
    }

    public final long m() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).s();
    }

    public final long n() throws defpackage.apyl {
        L(0);
        return ((defpackage.apxs) this.d).t();
    }

    public final java.lang.Object o(defpackage.apzv apzvVar, java.lang.Class cls, defpackage.apxy apxyVar) throws defpackage.apyl {
        defpackage.apzv apzvVar2 = defpackage.apzv.DOUBLE;
        switch (apzvVar.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(a());
            case 1:
                return java.lang.Float.valueOf(b());
            case 2:
                return java.lang.Long.valueOf(k());
            case 3:
                return java.lang.Long.valueOf(n());
            case 4:
                return java.lang.Integer.valueOf(f());
            case 5:
                return java.lang.Long.valueOf(j());
            case 6:
                return java.lang.Integer.valueOf(e());
            case 7:
                return java.lang.Boolean.valueOf(M());
            case 8:
                return r();
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                L(2);
                return p(defpackage.apzb.a.a(cls), apxyVar);
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return s();
            case 12:
                return java.lang.Integer.valueOf(i());
            case 13:
                return java.lang.Integer.valueOf(d());
            case 14:
                return java.lang.Integer.valueOf(g());
            case 15:
                return java.lang.Long.valueOf(l());
            case 16:
                return java.lang.Integer.valueOf(h());
            case 17:
                return java.lang.Long.valueOf(m());
        }
    }

    public final java.lang.Object p(defpackage.apze apzeVar, defpackage.apxy apxyVar) throws defpackage.apym {
        java.lang.Object objC = apzeVar.c();
        Q(objC, apzeVar, apxyVar);
        apzeVar.d(objC);
        return objC;
    }

    public final java.lang.String q() throws defpackage.apyl {
        L(2);
        return ((defpackage.apxs) this.d).u();
    }

    public final java.lang.String r() throws defpackage.apyl {
        L(2);
        return ((defpackage.apxs) this.d).v();
    }

    public final defpackage.apxo s() throws defpackage.apyl {
        L(2);
        return ((defpackage.apxs) this.d).w();
    }

    public final void t(java.lang.Object obj, defpackage.apze apzeVar, defpackage.apxy apxyVar) throws defpackage.apym {
        L(3);
        u(obj, apzeVar, apxyVar);
    }

    public final void u(java.lang.Object obj, defpackage.apze apzeVar, defpackage.apxy apxyVar) throws defpackage.apym {
        defpackage.apxs apxsVar = (defpackage.apxs) this.d;
        apxsVar.F();
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        apxsVar.b++;
        try {
            apzeVar.f(obj, this, apxyVar);
            if (this.a != this.b) {
                throw new defpackage.apym("Failed to parse the message.");
            }
            ((defpackage.apxs) this.d).b--;
            this.b = i;
        } catch (java.lang.Throwable th) {
            ((defpackage.apxs) this.d).b--;
            this.b = i;
            throw th;
        }
    }

    public final void v(java.lang.Object obj, defpackage.apze apzeVar, defpackage.apxy apxyVar) throws defpackage.apym {
        L(2);
        Q(obj, apzeVar, apxyVar);
    }

    public final void w(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apxi) {
            defpackage.apxi apxiVar = (defpackage.apxi) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apxiVar.e(apxsVar.B());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apxiVar.e(apxsVar2.B());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Boolean.valueOf(apxsVar3.B()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Boolean.valueOf(apxsVar4.B()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void x(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apxv) {
            defpackage.apxv apxvVar = (defpackage.apxv) list;
            int i = this.a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iN = apxsVar.n();
                T(iN);
                int iD = apxsVar.d() + iN;
                do {
                    apxvVar.f(apxsVar.b());
                } while (apxsVar.d() < iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apxvVar.f(apxsVar2.b());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iN2 = apxsVar3.n();
                T(iN2);
                int iD2 = apxsVar3.d() + iN2;
                do {
                    list.add(java.lang.Double.valueOf(apxsVar3.b()));
                } while (apxsVar3.d() < iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Double.valueOf(apxsVar4.b()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void y(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iD = apxsVar.d() + apxsVar.n();
                do {
                    apygVar.f(apxsVar.f());
                } while (apxsVar.d() < iD);
                R(iD);
                return;
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apygVar.f(apxsVar2.f());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.apyl();
                }
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iD2 = apxsVar3.d() + apxsVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(apxsVar3.f()));
                } while (apxsVar3.d() < iD2);
                R(iD2);
                return;
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Integer.valueOf(apxsVar4.f()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void z(java.util.List list) throws defpackage.apym {
        int iM;
        int iM2;
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            int i = this.a & 7;
            if (i == 2) {
                defpackage.apxs apxsVar = (defpackage.apxs) this.d;
                int iN = apxsVar.n();
                S(iN);
                int iD = apxsVar.d() + iN;
                do {
                    apygVar.f(apxsVar.g());
                } while (apxsVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new defpackage.apyl();
            }
            do {
                defpackage.apxs apxsVar2 = (defpackage.apxs) this.d;
                apygVar.f(apxsVar2.g());
                if (apxsVar2.A()) {
                    return;
                } else {
                    iM2 = apxsVar2.m();
                }
            } while (iM2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 == 2) {
                defpackage.apxs apxsVar3 = (defpackage.apxs) this.d;
                int iN2 = apxsVar3.n();
                S(iN2);
                int iD2 = apxsVar3.d() + iN2;
                do {
                    list.add(java.lang.Integer.valueOf(apxsVar3.g()));
                } while (apxsVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.apyl();
            }
            do {
                defpackage.apxs apxsVar4 = (defpackage.apxs) this.d;
                list.add(java.lang.Integer.valueOf(apxsVar4.g()));
                if (apxsVar4.A()) {
                    return;
                } else {
                    iM = apxsVar4.m();
                }
            } while (iM == this.a);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public apxt(android.view.View view) {
        this.d = view;
    }
}
