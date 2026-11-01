package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ewy extends defpackage.erm {
    public static final /* synthetic */ int e = 0;
    public final int b;
    public final defpackage.erm[] c;
    public final java.lang.Object[] d;
    private final int f;
    private final int g;
    private final int[] h;
    private final int[] i;
    private final java.util.HashMap j;
    private final izg k;

    public ewy(defpackage.erm[] ermVarArr, java.lang.Object[] objArr, izg izgVar) {
        this.k = izgVar;
        this.f = izgVar.u();
        this.c = ermVarArr;
        int length = ermVarArr.length;
        this.h = new int[length];
        this.i = new int[length];
        this.d = objArr;
        this.j = new java.util.HashMap();
        int i = 0;
        int iC = 0;
        int iB = 0;
        int i2 = 0;
        while (i < ermVarArr.length) {
            defpackage.erm ermVar = ermVarArr[i];
            this.c[i2] = ermVar;
            this.i[i2] = iC;
            this.h[i2] = iB;
            iC += ermVar.c();
            iB += this.c[i2].b();
            this.j.put(objArr[i2], java.lang.Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.b = iC;
        this.g = iB;
    }

    public static java.lang.Object p(java.lang.Object obj) {
        return ((android.util.Pair) obj).second;
    }

    public static java.lang.Object q(java.lang.Object obj) {
        return ((android.util.Pair) obj).first;
    }

    private final int y(int i, boolean z) {
        if (!z) {
            if (i < this.f - 1) {
                return i + 1;
            }
            return -1;
        }
        izg izgVar = this.k;
        int i2 = ((int[]) izgVar.a)[i] + 1;
        int[] iArr = (int[]) izgVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    private final int z(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return (-1) + i;
            }
            return -1;
        }
        izg izgVar = this.k;
        int i2 = ((int[]) izgVar.a)[i] - 1;
        if (i2 >= 0) {
            return ((int[]) izgVar.b)[i2];
        }
        return -1;
    }

    @Override // defpackage.erm
    public final int a(java.lang.Object obj) {
        int iA;
        if (!(obj instanceof android.util.Pair)) {
            return -1;
        }
        java.lang.Object objQ = q(obj);
        java.lang.Object objP = p(obj);
        int iR = r(objQ);
        if (iR == -1 || (iA = w(iR).a(objP)) == -1) {
            return -1;
        }
        return u(iR) + iA;
    }

    @Override // defpackage.erm
    public final int b() {
        return this.g;
    }

    @Override // defpackage.erm
    public final int c() {
        return this.b;
    }

    @Override // defpackage.erm
    public final defpackage.erk d(int i, defpackage.erk erkVar, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        w(iS).d(i - u(iS), erkVar, z);
        erkVar.c += iV;
        if (z) {
            java.lang.Object objX = x(iS);
            java.lang.Object obj = erkVar.b;
            ahvr.ci(obj);
            erkVar.b = android.util.Pair.create(objX, obj);
        }
        return erkVar;
    }

    @Override // defpackage.erm
    public final defpackage.erl e(int i, defpackage.erl erlVar, long j) {
        int iT = t(i);
        int iV = v(iT);
        int iU = u(iT);
        w(iT).e(i - iV, erlVar, j);
        java.lang.Object objX = x(iT);
        if (!defpackage.erl.a.equals(erlVar.b)) {
            objX = android.util.Pair.create(objX, erlVar.b);
        }
        erlVar.b = objX;
        erlVar.n += iU;
        erlVar.o += iU;
        return erlVar;
    }

    @Override // defpackage.erm
    public final java.lang.Object f(int i) {
        int iS = s(i);
        return android.util.Pair.create(x(iS), w(iS).f(i - u(iS)));
    }

    @Override // defpackage.erm
    public final int g(boolean z) {
        if (this.f == 0) {
            return -1;
        }
        int iY = 0;
        if (z) {
            int[] iArr = (int[]) this.k.b;
            iY = iArr.length > 0 ? iArr[0] : -1;
        }
        while (w(iY).n()) {
            iY = y(iY, z);
            if (iY == -1) {
                return -1;
            }
        }
        return v(iY) + w(iY).g(z);
    }

    @Override // defpackage.erm
    public final int h(boolean z) {
        int iZ;
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = (int[]) this.k.b;
            int length = iArr.length;
            iZ = length > 0 ? iArr[length - 1] : -1;
        } else {
            iZ = i - 1;
        }
        while (w(iZ).n()) {
            iZ = z(iZ, z);
            if (iZ == -1) {
                return -1;
            }
        }
        return v(iZ) + w(iZ).h(z);
    }

    @Override // defpackage.erm
    public final int j(int i, int i2, boolean z) {
        int iT = t(i);
        int iV = v(iT);
        int iJ = w(iT).j(i - iV, i2 == 2 ? 0 : i2, z);
        if (iJ != -1) {
            return iV + iJ;
        }
        int iY = y(iT, z);
        while (iY != -1 && w(iY).n()) {
            iY = y(iY, z);
        }
        if (iY != -1) {
            return v(iY) + w(iY).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // defpackage.erm
    public final defpackage.erk m(java.lang.Object obj, defpackage.erk erkVar) {
        java.lang.Object objQ = q(obj);
        java.lang.Object objP = p(obj);
        int iR = r(objQ);
        int iV = v(iR);
        w(iR).m(objP, erkVar);
        erkVar.c += iV;
        erkVar.b = obj;
        return erkVar;
    }

    @Override // defpackage.erm
    public final int o(int i) {
        int iT = t(i);
        int iV = v(iT);
        int iO = w(iT).o(i - iV);
        if (iO != -1) {
            return iV + iO;
        }
        int iZ = z(iT, false);
        while (iZ != -1 && w(iZ).n()) {
            iZ = z(iZ, false);
        }
        if (iZ != -1) {
            return v(iZ) + w(iZ).h(false);
        }
        return -1;
    }

    protected final int r(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected final int s(int i) {
        return eum.b(this.h, i + 1, false, false);
    }

    protected final int t(int i) {
        return eum.b(this.i, i + 1, false, false);
    }

    protected final int u(int i) {
        return this.h[i];
    }

    protected final int v(int i) {
        return this.i[i];
    }

    protected final defpackage.erm w(int i) {
        return this.c[i];
    }

    protected final java.lang.Object x(int i) {
        return this.d[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ewy(java.util.Collection collection, izg izgVar) {
        defpackage.erm[] ermVarArr = new defpackage.erm[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ermVarArr[i2] = ((defpackage.eyt) it.next()).a();
            i2++;
        }
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((defpackage.eyt) it2.next()).b();
            i++;
        }
        this(ermVarArr, objArr, izgVar);
    }
}
