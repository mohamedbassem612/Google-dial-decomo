package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class alad extends defpackage.akym {
    public static final /* synthetic */ int Q = 0;
    private static final java.util.concurrent.ConcurrentMap a = new j$.util.concurrent.ConcurrentHashMap();
    private int b = -1;
    protected defpackage.alcj P = defpackage.alcj.a;

    public static defpackage.alad A(defpackage.alad aladVar, java.io.InputStream inputStream, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.alad aladVarD = D(aladVar, defpackage.akzf.J(inputStream, 4096), akzqVar);
        V(aladVarD);
        return aladVarD;
    }

    public static defpackage.alad B(defpackage.alad aladVar, byte[] bArr, defpackage.akzq akzqVar) {
        defpackage.alad aladVarE = E(aladVar, bArr, 0, bArr.length, akzqVar);
        V(aladVarE);
        return aladVarE;
    }

    public static defpackage.alad C(defpackage.alad aladVar, java.io.InputStream inputStream, defpackage.akzq akzqVar) throws defpackage.alaz {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            int i2 = defpackage.akzf.i;
            if ((i & 128) != 0) {
                i &= 127;
                int i3 = 7;
                while (i3 < 32) {
                    int i4 = inputStream.read();
                    if (i4 == -1) {
                        throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    i |= (i4 & 127) << i3;
                    if ((i4 & 128) != 0) {
                        i3 += 7;
                    }
                }
                while (i3 < 64) {
                    int i5 = inputStream.read();
                    if (i5 == -1) {
                        throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    if ((i5 & 128) != 0) {
                        i3 += 7;
                    }
                }
                throw new defpackage.alaz("CodedInputStream encountered a malformed varint.");
            }
            defpackage.akze akzeVar = new defpackage.akze(new defpackage.akyk(inputStream, i), 4096);
            defpackage.alad aladVarD = D(aladVar, akzeVar, akzqVar);
            akzeVar.A(0);
            return aladVarD;
        } catch (defpackage.alaz e) {
            if (e.a) {
                throw new defpackage.alaz(e);
            }
            throw e;
        } catch (java.io.IOException e2) {
            throw new defpackage.alaz(e2);
        }
    }

    public static defpackage.alad D(defpackage.alad aladVar, defpackage.akzf akzfVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.alad aladVarS = aladVar.s();
        try {
            defpackage.albw albwVarA = defpackage.albp.a.a(aladVarS);
            java.lang.Object akzgVar = akzfVar.h;
            if (akzgVar == null) {
                akzgVar = new defpackage.akzg(akzfVar);
            }
            albwVarA.i(aladVarS, (defpackage.akzg) akzgVar, akzqVar);
            albwVarA.g(aladVarS);
            return aladVarS;
        } catch (defpackage.alaz e) {
            if (e.a) {
                throw new defpackage.alaz(e);
            }
            throw e;
        } catch (defpackage.alch e2) {
            throw e2.a();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof defpackage.alaz) {
                throw ((defpackage.alaz) e3.getCause());
            }
            throw new defpackage.alaz(e3);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof defpackage.alaz) {
                throw ((defpackage.alaz) e4.getCause());
            }
            throw e4;
        }
    }

    public static defpackage.alad E(defpackage.alad aladVar, byte[] bArr, int i, int i2, defpackage.akzq akzqVar) throws defpackage.alaz {
        if (i2 == 0) {
            return aladVar;
        }
        defpackage.alad aladVarS = aladVar.s();
        try {
            defpackage.albw albwVarA = defpackage.albp.a.a(aladVarS);
            albwVarA.j(aladVarS, bArr, i, i + i2, new defpackage.akyq(akzqVar));
            albwVarA.g(aladVarS);
            return aladVarS;
        } catch (defpackage.alaz e) {
            if (e.a) {
                throw new defpackage.alaz(e);
            }
            throw e;
        } catch (defpackage.alch e2) {
            throw e2.a();
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof defpackage.alaz) {
                throw ((defpackage.alaz) e3.getCause());
            }
            throw new defpackage.alaz(e3);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static defpackage.alag F(defpackage.alag alagVar) {
        return alagVar.f(alagVar.size() << 1);
    }

    public static defpackage.alaj G(defpackage.alaj alajVar) {
        return alajVar.d(alajVar.size() << 1);
    }

    public static defpackage.alak H(defpackage.alak alakVar) {
        return alakVar.d(alakVar.size() << 1);
    }

    public static defpackage.alan I(defpackage.alan alanVar) {
        return alanVar.f(alanVar.size() << 1);
    }

    public static defpackage.alat J(defpackage.alat alatVar) {
        return alatVar.d(alatVar.size() << 1);
    }

    public static defpackage.albn M(java.lang.Class cls) {
        java.util.concurrent.ConcurrentMap concurrentMap = a;
        java.lang.Object obj = concurrentMap.get(cls);
        if (obj == null) {
            q(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            throw new java.lang.IllegalStateException("Default instance cannot be null.");
        }
        if (obj instanceof defpackage.albn) {
            return (defpackage.albn) obj;
        }
        defpackage.akzy akzyVar = new defpackage.akzy((defpackage.alad) obj);
        return concurrentMap.replace(cls, obj, akzyVar) ? akzyVar : (defpackage.albn) concurrentMap.get(cls);
    }

    protected static void Q(java.lang.Class cls, defpackage.alad aladVar) {
        aladVar.P();
        a.put(cls, aladVar);
    }

    public static final boolean T(defpackage.alad aladVar, boolean z) {
        java.lang.Object objA = aladVar.a(1, null);
        if (objA == null) {
            return true;
        }
        if (objA instanceof java.lang.Byte) {
            byte bByteValue = ((java.lang.Byte) objA).byteValue();
            if (bByteValue == 1) {
                return true;
            }
            if (bByteValue == 0) {
                return false;
            }
        }
        boolean zL = defpackage.albp.a.a(aladVar).l(aladVar);
        if (z) {
            aladVar.a(2, true == zL ? aladVar : null);
        }
        return zL;
    }

    public static void V(defpackage.alad aladVar) throws defpackage.alaz {
        if (aladVar != null && !T(aladVar, true)) {
            throw new defpackage.alch().a();
        }
    }

    public static defpackage.apdi W(defpackage.albh albhVar, java.lang.Object obj, defpackage.albh albhVar2, int i, defpackage.alcr alcrVar) {
        return new defpackage.apdi(albhVar, obj, albhVar2, new defpackage.alac(i, alcrVar));
    }

    private final int b(defpackage.albw albwVar) {
        return albwVar == null ? defpackage.albp.a.a(this).a(this) : albwVar.a(this);
    }

    static defpackage.alad q(java.lang.Class cls) {
        java.util.concurrent.ConcurrentMap concurrentMap = a;
        java.lang.Object objT = concurrentMap.get(cls);
        if (objT == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                objT = concurrentMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (objT == null) {
            objT = ((defpackage.alad) defpackage.alco.e(cls)).t();
            if (objT == null) {
                throw new java.lang.IllegalStateException();
            }
            concurrentMap.put(cls, objT);
        }
        if (objT instanceof defpackage.alad) {
            return (defpackage.alad) objT;
        }
        int i = defpackage.akzy.b;
        return ((defpackage.akzy) objT).a;
    }

    public static defpackage.alad u(defpackage.alad aladVar, java.io.InputStream inputStream, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.alad aladVarC = C(aladVar, inputStream, akzqVar);
        V(aladVarC);
        return aladVarC;
    }

    public static defpackage.alad v(defpackage.alad aladVar, defpackage.akzc akzcVar) throws defpackage.alaz {
        defpackage.alad aladVarZ = z(aladVar, akzcVar, defpackage.akzq.a);
        V(aladVarZ);
        return aladVarZ;
    }

    public static defpackage.alad x(defpackage.alad aladVar, java.io.InputStream inputStream) throws defpackage.alaz {
        defpackage.alad aladVarD = D(aladVar, defpackage.akzf.J(inputStream, 4096), defpackage.akzq.a);
        V(aladVarD);
        return aladVarD;
    }

    public static defpackage.alad y(defpackage.alad aladVar, byte[] bArr) {
        defpackage.alad aladVarE = E(aladVar, bArr, 0, bArr.length, defpackage.akzq.a);
        V(aladVarE);
        return aladVarE;
    }

    public static defpackage.alad z(defpackage.alad aladVar, defpackage.akzc akzcVar, defpackage.akzq akzqVar) throws defpackage.alaz {
        defpackage.akzf akzfVarG = akzcVar.g();
        defpackage.alad aladVarD = D(aladVar, akzfVarG, akzqVar);
        akzfVarG.A(0);
        V(aladVarD);
        return aladVarD;
    }

    @Override // defpackage.albh
    public final defpackage.albn N() {
        return (defpackage.albn) a(7, null);
    }

    protected final void O() {
        defpackage.albp.a.a(this).g(this);
        P();
    }

    final void P() {
        this.b &= Integer.MAX_VALUE;
    }

    final void R(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException(defpackage.a.bj(i, "serialized size must be non-negative, was "));
        }
        this.b = (this.b & Integer.MIN_VALUE) | i;
    }

    @Override // defpackage.albh
    public final void S(defpackage.akzk akzkVar) {
        defpackage.albw albwVarA = defpackage.albp.a.a(this);
        java.lang.Object ajykVar = akzkVar.a;
        if (ajykVar == null) {
            ajykVar = new defpackage.ajyk(akzkVar);
        }
        albwVarA.m(this, (defpackage.ajyk) ajykVar);
    }

    final boolean U() {
        return this.b < 0;
    }

    protected abstract java.lang.Object a(int i, java.lang.Object obj);

    @Override // defpackage.akym
    public final int e(defpackage.albw albwVar) {
        if (U()) {
            int iB = b(albwVar);
            if (iB < 0) {
                throw new java.lang.IllegalStateException(defpackage.a.bj(iB, "serialized size must be non-negative, was "));
            }
            return iB;
        }
        if (k() != Integer.MAX_VALUE) {
            return k();
        }
        int iB2 = b(albwVar);
        R(iB2);
        return iB2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return defpackage.albp.a.a(this).k(this, (defpackage.alad) obj);
    }

    public final int hashCode() {
        if (U()) {
            return j();
        }
        int i = this.O;
        if (i != 0) {
            return i;
        }
        int iJ = j();
        this.O = iJ;
        return iJ;
    }

    final int j() {
        return defpackage.albp.a.a(this).b(this);
    }

    final int k() {
        return this.b & Integer.MAX_VALUE;
    }

    @Override // defpackage.albh
    public final int l() {
        return e(null);
    }

    public final defpackage.akzx m() {
        return (defpackage.akzx) a(5, null);
    }

    public final defpackage.akzx n(defpackage.alad aladVar) {
        defpackage.akzx akzxVarM = m();
        akzxVarM.z(aladVar);
        return akzxVarM;
    }

    @Override // defpackage.albh
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final defpackage.akzx K() {
        return (defpackage.akzx) a(5, null);
    }

    @Override // defpackage.albh
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final defpackage.akzx L() {
        defpackage.akzx akzxVar = (defpackage.akzx) a(5, null);
        akzxVar.z(this);
        return akzxVar;
    }

    @Override // defpackage.albi
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final defpackage.alad t() {
        return (defpackage.alad) a(6, null);
    }

    final defpackage.alad s() {
        return (defpackage.alad) a(4, null);
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        int i = defpackage.albj.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        defpackage.albj.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.albi
    public final boolean w() {
        return T(this, true);
    }
}
