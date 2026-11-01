package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class egr {
    public final defpackage.egq a;
    public int b;
    public int c = 0;
    private int d;

    public egr(defpackage.egq egqVar) {
        byte[] bArr = defpackage.ehl.a;
        this.a = egqVar;
        egqVar.d = this;
    }

    private final void O(java.lang.Object obj, defpackage.eig eigVar, defpackage.egz egzVar) throws defpackage.eho {
        defpackage.egq egqVar = this.a;
        int iN = egqVar.n();
        egqVar.F();
        int iE = egqVar.e(iN);
        egqVar.a++;
        eigVar.f(obj, this, egzVar);
        egqVar.x(0);
        egqVar.a--;
        egqVar.y(iE);
    }

    private final void P(int i) throws defpackage.eho {
        if (this.a.d() != i) {
            throw new defpackage.eho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void Q(int i) throws defpackage.eho {
        if ((i & 3) != 0) {
            throw new defpackage.eho("Failed to parse the message.");
        }
    }

    private static final void R(int i) throws defpackage.eho {
        if ((i & 7) != 0) {
            throw new defpackage.eho("Failed to parse the message.");
        }
    }

    public final void A(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehs) {
            ehs ehsVar = (ehs) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iN = egqVar.n();
                R(iN);
                int iD = egqVar.d() + iN;
                do {
                    ehsVar.f(egqVar.o());
                } while (egqVar.d() < iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehsVar.f(egqVar2.o());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iN2 = egqVar3.n();
                R(iN2);
                int iD2 = egqVar3.d() + iN2;
                do {
                    list.add(java.lang.Long.valueOf(egqVar3.o()));
                } while (egqVar3.d() < iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Long.valueOf(egqVar4.o()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void B(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehd) {
            ehd ehdVar = (ehd) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.egq egqVar = this.a;
                int iN = egqVar.n();
                Q(iN);
                int iD = egqVar.d() + iN;
                do {
                    ehdVar.f(egqVar.c());
                } while (egqVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new defpackage.ehn();
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehdVar.f(egqVar2.c());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.egq egqVar3 = this.a;
                int iN2 = egqVar3.n();
                Q(iN2);
                int iD2 = egqVar3.d() + iN2;
                do {
                    list.add(java.lang.Float.valueOf(egqVar3.c()));
                } while (egqVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.ehn();
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Float.valueOf(egqVar4.c()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void C(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    ehhVar.f(egqVar.h());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehhVar.f(egqVar2.h());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(egqVar3.h()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Integer.valueOf(egqVar4.h()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void D(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehs) {
            ehs ehsVar = (ehs) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    ehsVar.f(egqVar.p());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehsVar.f(egqVar2.p());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Long.valueOf(egqVar3.p()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Long.valueOf(egqVar4.p()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void E(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.egq egqVar = this.a;
                int iN = egqVar.n();
                Q(iN);
                int iD = egqVar.d() + iN;
                do {
                    ehhVar.f(egqVar.k());
                } while (egqVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new defpackage.ehn();
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehhVar.f(egqVar2.k());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.egq egqVar3 = this.a;
                int iN2 = egqVar3.n();
                Q(iN2);
                int iD2 = egqVar3.d() + iN2;
                do {
                    list.add(java.lang.Integer.valueOf(egqVar3.k()));
                } while (egqVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.ehn();
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Integer.valueOf(egqVar4.k()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void F(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehs) {
            ehs ehsVar = (ehs) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iN = egqVar.n();
                R(iN);
                int iD = egqVar.d() + iN;
                do {
                    ehsVar.f(egqVar.r());
                } while (egqVar.d() < iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehsVar.f(egqVar2.r());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iN2 = egqVar3.n();
                R(iN2);
                int iD2 = egqVar3.d() + iN2;
                do {
                    list.add(java.lang.Long.valueOf(egqVar3.r()));
                } while (egqVar3.d() < iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Long.valueOf(egqVar4.r()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void G(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    ehhVar.f(egqVar.l());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehhVar.f(egqVar2.l());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(egqVar3.l()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Integer.valueOf(egqVar4.l()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void H(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehs) {
            ehs ehsVar = (ehs) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    ehsVar.f(egqVar.s());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehsVar.f(egqVar2.s());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Long.valueOf(egqVar3.s()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Long.valueOf(egqVar4.s()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void I(java.util.List list, boolean z) throws defpackage.ehn {
        int iM;
        int iM2;
        if ((this.b & 7) != 2) {
            throw new defpackage.ehn();
        }
        if (!(list instanceof defpackage.ehr) || z) {
            do {
                list.add(z ? s() : r());
                defpackage.egq egqVar = this.a;
                if (egqVar.A()) {
                    return;
                } else {
                    iM = egqVar.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        } else {
            defpackage.ehr ehrVar = (defpackage.ehr) list;
            do {
                o();
                ehrVar.b();
                defpackage.egq egqVar2 = this.a;
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        }
        this.c = iM2;
    }

    public final void J(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    ehhVar.f(egqVar.n());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehhVar.f(egqVar2.n());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(egqVar3.n()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Integer.valueOf(egqVar4.n()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehs) {
            ehs ehsVar = (ehs) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    ehsVar.f(egqVar.t());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehsVar.f(egqVar2.t());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Long.valueOf(egqVar3.t()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Long.valueOf(egqVar4.t()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void L(int i) throws defpackage.ehn {
        if ((this.b & 7) != i) {
            throw new defpackage.ehn();
        }
    }

    public final boolean M() throws defpackage.ehn {
        L(0);
        return this.a.B();
    }

    public final boolean N() {
        int i;
        defpackage.egq egqVar = this.a;
        if (egqVar.A() || (i = this.b) == this.d) {
            return false;
        }
        return egqVar.C(i);
    }

    public final double a() throws defpackage.ehn {
        L(1);
        return this.a.b();
    }

    public final float b() throws defpackage.ehn {
        L(5);
        return this.a.c();
    }

    public final int c() {
        int iM = this.c;
        if (iM != 0) {
            this.b = iM;
            this.c = 0;
        } else {
            iM = this.a.m();
            this.b = iM;
        }
        if (iM == 0 || iM == this.d) {
            return Integer.MAX_VALUE;
        }
        return iM >>> 3;
    }

    public final int d() throws defpackage.ehn {
        L(0);
        return this.a.f();
    }

    public final int e() throws defpackage.ehn {
        L(5);
        return this.a.g();
    }

    public final int f() throws defpackage.ehn {
        L(0);
        return this.a.h();
    }

    public final int g() throws defpackage.ehn {
        L(5);
        return this.a.k();
    }

    public final int h() throws defpackage.ehn {
        L(0);
        return this.a.l();
    }

    public final int i() throws defpackage.ehn {
        L(0);
        return this.a.n();
    }

    public final long j() throws defpackage.ehn {
        L(1);
        return this.a.o();
    }

    public final long k() throws defpackage.ehn {
        L(0);
        return this.a.p();
    }

    public final long l() throws defpackage.ehn {
        L(1);
        return this.a.r();
    }

    public final long m() throws defpackage.ehn {
        L(0);
        return this.a.s();
    }

    public final long n() throws defpackage.ehn {
        L(0);
        return this.a.t();
    }

    public final defpackage.egm o() throws defpackage.ehn {
        L(2);
        return this.a.u();
    }

    public final java.lang.Object p(defpackage.eja ejaVar, java.lang.Class cls, defpackage.egz egzVar) throws defpackage.ehn {
        defpackage.eja ejaVar2 = defpackage.eja.DOUBLE;
        switch (ejaVar.ordinal()) {
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
                return java.lang.Boolean.valueOf(M());
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return s();
            case 9:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case 10:
                L(2);
                return q(defpackage.eid.a.b(cls), egzVar);
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

    public final java.lang.Object q(defpackage.eig eigVar, defpackage.egz egzVar) throws defpackage.eho {
        java.lang.Object objC = eigVar.c();
        O(objC, eigVar, egzVar);
        eigVar.d(objC);
        return objC;
    }

    public final java.lang.String r() throws defpackage.ehn {
        L(2);
        return this.a.v();
    }

    public final java.lang.String s() throws defpackage.ehn {
        L(2);
        return this.a.w();
    }

    public final void t(java.lang.Object obj, defpackage.eig eigVar, defpackage.egz egzVar) throws defpackage.eho {
        L(3);
        u(obj, eigVar, egzVar);
    }

    public final void u(java.lang.Object obj, defpackage.eig eigVar, defpackage.egz egzVar) throws defpackage.eho {
        defpackage.egq egqVar = this.a;
        egqVar.F();
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        egqVar.b++;
        try {
            eigVar.f(obj, this, egzVar);
            if (this.b != this.d) {
                throw new defpackage.eho("Failed to parse the message.");
            }
            this.a.b--;
            this.d = i;
        } catch (java.lang.Throwable th) {
            this.a.b--;
            this.d = i;
            throw th;
        }
    }

    public final void v(java.lang.Object obj, defpackage.eig eigVar, defpackage.egz egzVar) throws defpackage.eho {
        L(2);
        O(obj, eigVar, egzVar);
    }

    public final void w(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ege) {
            ege egeVar = (ege) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    egeVar.e(egqVar.B());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                egeVar.e(egqVar2.B());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Boolean.valueOf(egqVar3.B()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Boolean.valueOf(egqVar4.B()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void x(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof egw) {
            egw egwVar = (egw) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iN = egqVar.n();
                R(iN);
                int iD = egqVar.d() + iN;
                do {
                    egwVar.f(egqVar.b());
                } while (egqVar.d() < iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                egwVar.f(egqVar2.b());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iN2 = egqVar3.n();
                R(iN2);
                int iD2 = egqVar3.d() + iN2;
                do {
                    list.add(java.lang.Double.valueOf(egqVar3.b()));
                } while (egqVar3.d() < iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Double.valueOf(egqVar4.b()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void y(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar = this.a;
                int iD = egqVar.d() + egqVar.n();
                do {
                    ehhVar.f(egqVar.f());
                } while (egqVar.d() < iD);
                P(iD);
                return;
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehhVar.f(egqVar2.f());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new defpackage.ehn();
                }
                defpackage.egq egqVar3 = this.a;
                int iD2 = egqVar3.d() + egqVar3.n();
                do {
                    list.add(java.lang.Integer.valueOf(egqVar3.f()));
                } while (egqVar3.d() < iD2);
                P(iD2);
                return;
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Integer.valueOf(egqVar4.f()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void z(java.util.List list) throws defpackage.eho {
        int iM;
        int iM2;
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            int i = this.b & 7;
            if (i == 2) {
                defpackage.egq egqVar = this.a;
                int iN = egqVar.n();
                Q(iN);
                int iD = egqVar.d() + iN;
                do {
                    ehhVar.f(egqVar.g());
                } while (egqVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new defpackage.ehn();
            }
            do {
                defpackage.egq egqVar2 = this.a;
                ehhVar.f(egqVar2.g());
                if (egqVar2.A()) {
                    return;
                } else {
                    iM2 = egqVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                defpackage.egq egqVar3 = this.a;
                int iN2 = egqVar3.n();
                Q(iN2);
                int iD2 = egqVar3.d() + iN2;
                do {
                    list.add(java.lang.Integer.valueOf(egqVar3.g()));
                } while (egqVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new defpackage.ehn();
            }
            do {
                defpackage.egq egqVar4 = this.a;
                list.add(java.lang.Integer.valueOf(egqVar4.g()));
                if (egqVar4.A()) {
                    return;
                } else {
                    iM = egqVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}
