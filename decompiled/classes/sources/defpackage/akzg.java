package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akzg {
    public final defpackage.akzf a;
    public int b;
    public int c = 0;
    private int d;

    public akzg(defpackage.akzf akzfVar) {
        this.a = akzfVar;
        akzfVar.h = this;
    }

    private final void P(java.lang.Object obj, defpackage.albw albwVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.akzf akzfVar = this.a;
        akzfVar.K();
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        akzfVar.e++;
        try {
            albwVar.i(obj, this, akzqVar);
            if (this.b != this.d) {
                throw new defpackage.alaz("Failed to parse the message.");
            }
            this.a.e--;
            this.d = i;
        } catch (java.lang.Throwable th) {
            this.a.e--;
            this.d = i;
            throw th;
        }
    }

    private final void Q(java.lang.Object obj, defpackage.albw albwVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.akzf akzfVar = this.a;
        int iK = akzfVar.k();
        akzfVar.K();
        int iF = akzfVar.f(iK);
        akzfVar.d++;
        albwVar.i(obj, this, akzqVar);
        akzfVar.A(0);
        akzfVar.d--;
        if (akzfVar.d() != 0) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        akzfVar.B(iF);
    }

    private final void R(int i) throws defpackage.alaz {
        if (this.a.e() != i) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void S(int i) throws defpackage.alaz {
        if ((i & 3) != 0) {
            throw new defpackage.alaz("Failed to parse the message.");
        }
    }

    private static final void T(int i) throws defpackage.alaz {
        if ((i & 7) != 0) {
            throw new defpackage.alaz("Failed to parse the message.");
        }
    }

    public final void A(java.util.List list) throws defpackage.alaz {
        int iN;
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.akzf akzfVar = this.a;
                int iO = akzfVar.o();
                S(iO);
                int iE = akzfVar.e() + iO;
                while (akzfVar.e() < iE) {
                    alaeVar.g(akzfVar.h());
                }
                R(iE);
                return;
            }
            if (i != 5) {
                throw new defpackage.alay();
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                alaeVar.g(akzfVar2.h());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN = akzfVar2.n();
                }
            } while (iN == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.akzf akzfVar3 = this.a;
                int iO2 = akzfVar3.o();
                S(iO2);
                int iE2 = akzfVar3.e() + iO2;
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Integer.valueOf(akzfVar3.h()));
                }
                R(iE2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.alay();
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Integer.valueOf(akzfVar4.h()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
        }
        this.c = iN;
    }

    public final void B(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.albd) {
            defpackage.albd albdVar = (defpackage.albd) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iO = akzfVar.o();
                T(iO);
                int iE = akzfVar.e() + iO;
                while (akzfVar.e() < iE) {
                    albdVar.g(akzfVar.q());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                albdVar.g(akzfVar2.q());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iO2 = akzfVar3.o();
                T(iO2);
                int iE2 = akzfVar3.e() + iO2;
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Long.valueOf(akzfVar3.q()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Long.valueOf(akzfVar4.q()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void C(java.util.List list) throws defpackage.alaz {
        int iN;
        if (list instanceof defpackage.akzu) {
            defpackage.akzu akzuVar = (defpackage.akzu) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.akzf akzfVar = this.a;
                int iO = akzfVar.o();
                S(iO);
                int iE = akzfVar.e() + iO;
                while (akzfVar.e() < iE) {
                    akzuVar.g(akzfVar.c());
                }
                R(iE);
                return;
            }
            if (i != 5) {
                throw new defpackage.alay();
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                akzuVar.g(akzfVar2.c());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN = akzfVar2.n();
                }
            } while (iN == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.akzf akzfVar3 = this.a;
                int iO2 = akzfVar3.o();
                S(iO2);
                int iE2 = akzfVar3.e() + iO2;
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Float.valueOf(akzfVar3.c()));
                }
                R(iE2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.alay();
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Float.valueOf(akzfVar4.c()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
        }
        this.c = iN;
    }

    public final void D(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    alaeVar.g(akzfVar.i());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                alaeVar.g(akzfVar2.i());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Integer.valueOf(akzfVar3.i()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Integer.valueOf(akzfVar4.i()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void E(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.albd) {
            defpackage.albd albdVar = (defpackage.albd) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    albdVar.g(akzfVar.r());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                albdVar.g(akzfVar2.r());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Long.valueOf(akzfVar3.r()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Long.valueOf(akzfVar4.r()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void F(java.util.List list) throws defpackage.alaz {
        int iN;
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.akzf akzfVar = this.a;
                int iO = akzfVar.o();
                S(iO);
                int iE = akzfVar.e() + iO;
                while (akzfVar.e() < iE) {
                    alaeVar.g(akzfVar.l());
                }
                R(iE);
                return;
            }
            if (i != 5) {
                throw new defpackage.alay();
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                alaeVar.g(akzfVar2.l());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN = akzfVar2.n();
                }
            } while (iN == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.akzf akzfVar3 = this.a;
                int iO2 = akzfVar3.o();
                S(iO2);
                int iE2 = akzfVar3.e() + iO2;
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Integer.valueOf(akzfVar3.l()));
                }
                R(iE2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.alay();
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Integer.valueOf(akzfVar4.l()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
        }
        this.c = iN;
    }

    public final void G(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.albd) {
            defpackage.albd albdVar = (defpackage.albd) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iO = akzfVar.o();
                T(iO);
                int iE = akzfVar.e() + iO;
                while (akzfVar.e() < iE) {
                    albdVar.g(akzfVar.u());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                albdVar.g(akzfVar2.u());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iO2 = akzfVar3.o();
                T(iO2);
                int iE2 = akzfVar3.e() + iO2;
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Long.valueOf(akzfVar3.u()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Long.valueOf(akzfVar4.u()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void H(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    alaeVar.g(akzfVar.m());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                alaeVar.g(akzfVar2.m());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Integer.valueOf(akzfVar3.m()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Integer.valueOf(akzfVar4.m()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void I(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.albd) {
            defpackage.albd albdVar = (defpackage.albd) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    albdVar.g(akzfVar.v());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                albdVar.g(akzfVar2.v());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Long.valueOf(akzfVar3.v()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Long.valueOf(akzfVar4.v()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void J(java.util.List list, boolean z) throws defpackage.alay {
        int iN;
        int iN2;
        if ((this.b & 7) != 2) {
            throw new defpackage.alay();
        }
        if (!(list instanceof defpackage.albc) || z) {
            do {
                list.add(z ? u() : t());
                defpackage.akzf akzfVar = this.a;
                if (akzfVar.D()) {
                    return;
                } else {
                    iN = akzfVar.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        } else {
            defpackage.albc albcVar = (defpackage.albc) list;
            do {
                o();
                albcVar.b();
                defpackage.akzf akzfVar2 = this.a;
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        }
        this.c = iN2;
    }

    public final void K(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    alaeVar.g(akzfVar.o());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                alaeVar.g(akzfVar2.o());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Integer.valueOf(akzfVar3.o()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Integer.valueOf(akzfVar4.o()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void L(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.albd) {
            defpackage.albd albdVar = (defpackage.albd) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    albdVar.g(akzfVar.w());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                albdVar.g(akzfVar2.w());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Long.valueOf(akzfVar3.w()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Long.valueOf(akzfVar4.w()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void M(int i) throws defpackage.alay {
        if ((this.b & 7) != i) {
            throw new defpackage.alay();
        }
    }

    public final boolean N() throws defpackage.alay {
        M(0);
        return this.a.E();
    }

    public final boolean O() {
        int i;
        defpackage.akzf akzfVar = this.a;
        if (akzfVar.D() || (i = this.b) == this.d) {
            return false;
        }
        return akzfVar.F(i);
    }

    public final double a() throws defpackage.alay {
        M(1);
        return this.a.b();
    }

    public final float b() throws defpackage.alay {
        M(5);
        return this.a.c();
    }

    public final int c() {
        int iN = this.c;
        if (iN != 0) {
            this.b = iN;
            this.c = 0;
        } else {
            iN = this.a.n();
            this.b = iN;
        }
        if (iN == 0 || iN == this.d) {
            return Integer.MAX_VALUE;
        }
        return iN >>> 3;
    }

    public final int d() throws defpackage.alay {
        M(0);
        return this.a.g();
    }

    public final int e() throws defpackage.alay {
        M(5);
        return this.a.h();
    }

    public final int f() throws defpackage.alay {
        M(0);
        return this.a.i();
    }

    public final int g() throws defpackage.alay {
        M(5);
        return this.a.l();
    }

    public final int h() throws defpackage.alay {
        M(0);
        return this.a.m();
    }

    public final int i() throws defpackage.alay {
        M(0);
        return this.a.o();
    }

    public final long j() throws defpackage.alay {
        M(1);
        return this.a.q();
    }

    public final long k() throws defpackage.alay {
        M(0);
        return this.a.r();
    }

    public final long l() throws defpackage.alay {
        M(1);
        return this.a.u();
    }

    public final long m() throws defpackage.alay {
        M(0);
        return this.a.v();
    }

    public final long n() throws defpackage.alay {
        M(0);
        return this.a.w();
    }

    public final defpackage.akzc o() throws defpackage.alay {
        M(2);
        return this.a.x();
    }

    public final java.lang.Object p(defpackage.alcr alcrVar, java.lang.Class cls, defpackage.akzq akzqVar) {
        defpackage.alcr alcrVar2 = defpackage.alcr.DOUBLE;
        switch (alcrVar.ordinal()) {
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Integer.valueOf(e());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(N());
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return u();
            case 9:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case 10:
                return s(cls, akzqVar);
            case 11:
                return o();
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

    public final java.lang.Object q(defpackage.albw albwVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        java.lang.Object objE = albwVar.e();
        P(objE, albwVar, akzqVar);
        albwVar.g(objE);
        return objE;
    }

    public final java.lang.Object r(defpackage.albw albwVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        java.lang.Object objE = albwVar.e();
        Q(objE, albwVar, akzqVar);
        albwVar.g(objE);
        return objE;
    }

    public final java.lang.Object s(java.lang.Class cls, defpackage.akzq akzqVar) {
        M(2);
        return r(defpackage.albp.a.b(cls), akzqVar);
    }

    public final java.lang.String t() throws defpackage.alay {
        M(2);
        return this.a.y();
    }

    public final java.lang.String u() throws defpackage.alay {
        M(2);
        return this.a.z();
    }

    public final void v(java.lang.Object obj, defpackage.albw albwVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        M(3);
        P(obj, albwVar, akzqVar);
    }

    public final void w(java.lang.Object obj, defpackage.albw albwVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        M(2);
        Q(obj, albwVar, akzqVar);
    }

    public final void x(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.akyt) {
            defpackage.akyt akytVar = (defpackage.akyt) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    akytVar.e(akzfVar.E());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                akytVar.e(akzfVar2.E());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Boolean.valueOf(akzfVar3.E()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Boolean.valueOf(akzfVar4.E()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void y(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.akzl) {
            defpackage.akzl akzlVar = (defpackage.akzl) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iO = akzfVar.o();
                T(iO);
                int iE = akzfVar.e() + iO;
                while (akzfVar.e() < iE) {
                    akzlVar.g(akzfVar.b());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                akzlVar.g(akzfVar2.b());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iO2 = akzfVar3.o();
                T(iO2);
                int iE2 = akzfVar3.e() + iO2;
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Double.valueOf(akzfVar3.b()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Double.valueOf(akzfVar4.b()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }

    public final void z(java.util.List list) throws defpackage.alaz {
        int iN;
        int iN2;
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar = this.a;
                int iE = akzfVar.e() + akzfVar.o();
                while (akzfVar.e() < iE) {
                    alaeVar.g(akzfVar.g());
                }
                R(iE);
                return;
            }
            do {
                defpackage.akzf akzfVar2 = this.a;
                alaeVar.g(akzfVar2.g());
                if (akzfVar2.D()) {
                    return;
                } else {
                    iN2 = akzfVar2.n();
                }
            } while (iN2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.alay();
                }
                defpackage.akzf akzfVar3 = this.a;
                int iE2 = akzfVar3.e() + akzfVar3.o();
                while (akzfVar3.e() < iE2) {
                    list.add(java.lang.Integer.valueOf(akzfVar3.g()));
                }
                R(iE2);
                return;
            }
            do {
                defpackage.akzf akzfVar4 = this.a;
                list.add(java.lang.Integer.valueOf(akzfVar4.g()));
                if (akzfVar4.D()) {
                    return;
                } else {
                    iN = akzfVar4.n();
                }
            } while (iN == this.b);
            iN2 = iN;
        }
        this.c = iN2;
    }
}
