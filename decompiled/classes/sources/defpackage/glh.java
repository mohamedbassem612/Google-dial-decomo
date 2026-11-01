package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class glh extends defpackage.gkz {
    private int A;
    private defpackage.gkz[] B;
    java.util.ArrayList w;
    int x;
    boolean y;
    private boolean z;

    public glh(byte[] bArr) {
        this();
        U(1);
        S(new defpackage.gko(2));
        S(new defpackage.gkm());
        S(new defpackage.gko(1));
    }

    private final void X(defpackage.gkz gkzVar) {
        this.w.add(gkzVar);
        gkzVar.f = this;
    }

    private final void Y(defpackage.gkz[] gkzVarArr) {
        java.util.Arrays.fill(gkzVarArr, (java.lang.Object) null);
        this.B = gkzVarArr;
    }

    private final defpackage.gkz[] Z() {
        defpackage.gkz[] gkzVarArr = this.B;
        this.B = null;
        if (gkzVarArr == null) {
            gkzVarArr = new defpackage.gkz[this.w.size()];
        }
        return (defpackage.gkz[]) this.w.toArray(gkzVarArr);
    }

    @Override // defpackage.gkz
    public final boolean A() {
        for (int i = 0; i < this.w.size(); i++) {
            if (((defpackage.gkz) this.w.get(i)).A()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gkz
    public final void H(java.lang.Class cls) {
        for (int i = 0; i < this.w.size(); i++) {
            ((defpackage.gkz) this.w.get(i)).H(cls);
        }
        super.H(cls);
    }

    @Override // defpackage.gkz
    public final /* bridge */ /* synthetic */ void J(android.view.View view) {
        for (int i = 0; i < this.w.size(); i++) {
            ((defpackage.gkz) this.w.get(i)).J(view);
        }
        super.J(view);
    }

    @Override // defpackage.gkz
    public final void M() {
        this.A |= 2;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gkz) this.w.get(i)).M();
        }
    }

    @Override // defpackage.gkz
    public final /* synthetic */ void N(long j) {
        this.a = j;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // defpackage.gkz
    public final void O(android.view.ViewGroup viewGroup, defpackage.kgl kglVar, defpackage.kgl kglVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        long j;
        long j2 = this.a;
        int size = this.w.size();
        int i = 0;
        while (i < size) {
            defpackage.gkz gkzVar = (defpackage.gkz) this.w.get(i);
            if (j2 > 0) {
                if (this.z) {
                    j = gkzVar.a;
                    if (j > 0) {
                        gkzVar.N(j + j2);
                    } else {
                        gkzVar.N(j2);
                    }
                } else if (i == 0) {
                    i = 0;
                    j = gkzVar.a;
                    if (j > 0) {
                        gkzVar.N(j + j2);
                    } else {
                        gkzVar.N(j2);
                    }
                }
            }
            gkzVar.O(viewGroup, kglVar, kglVar2, arrayList, arrayList2);
            i++;
        }
    }

    @Override // defpackage.gkz
    public final void P(defpackage.dzk dzkVar) {
        super.P(dzkVar);
        this.A |= 4;
        if (this.w != null) {
            for (int i = 0; i < this.w.size(); i++) {
                ((defpackage.gkz) this.w.get(i)).P(dzkVar);
            }
        }
    }

    @Override // defpackage.gkz
    public final void Q(fsu fsuVar) {
        this.v = fsuVar;
        this.A |= 8;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gkz) this.w.get(i)).Q(fsuVar);
        }
    }

    public final void R(gkw gkwVar) {
        super.D(gkwVar);
    }

    public final void S(defpackage.gkz gkzVar) {
        X(gkzVar);
        long j = this.b;
        if (j >= 0) {
            gkzVar.K(j);
        }
        if ((this.A & 1) != 0) {
            gkzVar.L(this.c);
        }
        if ((this.A & 2) != 0) {
            gkzVar.M();
        }
        if ((this.A & 4) != 0) {
            gkzVar.P(this.u);
        }
        if ((this.A & 8) != 0) {
            gkzVar.Q(this.v);
        }
    }

    @Override // defpackage.gkz
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void K(long j) {
        java.util.ArrayList arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.w) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gkz) this.w.get(i)).K(j);
        }
    }

    public final void U(int i) {
        this.z = i == 0;
    }

    @Override // defpackage.gkz
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void F(android.view.View view) {
        for (int i = 0; i < this.w.size(); i++) {
            ((defpackage.gkz) this.w.get(i)).F(view);
        }
        super.F(view);
    }

    @Override // defpackage.gkz
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void L(android.animation.TimeInterpolator timeInterpolator) {
        this.A |= 1;
        java.util.ArrayList arrayList = this.w;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.gkz) this.w.get(i)).L(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.gkz
    public final void b(gli gliVar) {
        if (C(gliVar.b)) {
            java.util.ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.gkz gkzVar = (defpackage.gkz) arrayList.get(i);
                if (gkzVar.C(gliVar.b)) {
                    gkzVar.b(gliVar);
                    gliVar.c.add(gkzVar);
                }
            }
        }
    }

    @Override // defpackage.gkz
    public final void c(gli gliVar) {
        if (C(gliVar.b)) {
            java.util.ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.gkz gkzVar = (defpackage.gkz) arrayList.get(i);
                if (gkzVar.C(gliVar.b)) {
                    gkzVar.c(gliVar);
                    gliVar.c.add(gkzVar);
                }
            }
        }
    }

    @Override // defpackage.gkz
    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        return clone();
    }

    @Override // defpackage.gkz
    public final boolean d() {
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            if (!((defpackage.gkz) this.w.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.w.size();
    }

    public final defpackage.gkz g(int i) {
        if (i < 0 || i >= this.w.size()) {
            return null;
        }
        return (defpackage.gkz) this.w.get(i);
    }

    @Override // defpackage.gkz
    /* JADX INFO: renamed from: i */
    public final defpackage.gkz clone() {
        defpackage.glh glhVar = (defpackage.glh) super.clone();
        glhVar.w = new java.util.ArrayList();
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            glhVar.X(((defpackage.gkz) this.w.get(i)).clone());
        }
        return glhVar;
    }

    @Override // defpackage.gkz
    public final java.lang.String m(java.lang.String str) {
        java.lang.String strM = super.m(str);
        for (int i = 0; i < this.w.size(); i++) {
            strM = strM + '\n' + ((defpackage.gkz) this.w.get(i)).m(str.concat("  "));
        }
        return strM;
    }

    @Override // defpackage.gkz
    public final void n() {
        super.n();
        defpackage.gkz[] gkzVarArrZ = Z();
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            gkzVarArrZ[i].n();
        }
        Y(gkzVarArrZ);
    }

    @Override // defpackage.gkz
    public final void o(gli gliVar) {
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gkz) this.w.get(i)).o(gliVar);
        }
    }

    @Override // defpackage.gkz
    public final void t(android.view.View view) {
        super.t(view);
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gkz) this.w.get(i)).t(view);
        }
    }

    @Override // defpackage.gkz
    public final void u() {
        this.p = 0L;
        gkw glfVar = new glf(this);
        for (int i = 0; i < this.w.size(); i++) {
            defpackage.gkz gkzVar = (defpackage.gkz) this.w.get(i);
            gkzVar.D(glfVar);
            gkzVar.u();
            long j = gkzVar.p;
            boolean z = this.z;
            long j2 = this.p;
            if (z) {
                this.p = java.lang.Math.max(j2, j);
            } else {
                gkzVar.r = j2;
                this.p = j2 + j;
            }
        }
    }

    @Override // defpackage.gkz
    public final void v() {
        for (int i = 0; i < this.w.size(); i++) {
            ((defpackage.gkz) this.w.get(i)).v();
        }
    }

    @Override // defpackage.gkz
    public final void w(android.view.View view) {
        super.w(view);
        defpackage.gkz[] gkzVarArrZ = Z();
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            gkzVarArrZ[i].w(view);
        }
        Y(gkzVarArrZ);
    }

    @Override // defpackage.gkz
    protected final void x() {
        java.util.ArrayList arrayList;
        if (this.w.isEmpty()) {
            z();
            r();
            return;
        }
        gkw glgVar = new glg(this);
        java.util.ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gkz) arrayList2.get(i)).D(glgVar);
        }
        this.x = this.w.size();
        if (this.z) {
            java.util.ArrayList arrayList3 = this.w;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((defpackage.gkz) arrayList3.get(i2)).x();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.w.size();
            arrayList = this.w;
            if (i3 >= size3) {
                break;
            }
            ((defpackage.gkz) arrayList.get(i3 - 1)).D(new gle((defpackage.gkz) this.w.get(i3)));
            i3++;
        }
        defpackage.gkz gkzVar = (defpackage.gkz) arrayList.get(0);
        if (gkzVar != null) {
            gkzVar.x();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean, int] */
    @Override // defpackage.gkz
    public final void y(long j, long j2) {
        long j3;
        int size;
        long j4 = this.p;
        long j5 = 0;
        if (this.f != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        ?? r10 = i >>> 31;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.l = false;
            super.s(this, gky.a, r10);
        }
        if (!this.z) {
            int i2 = 1;
            while (true) {
                int size2 = this.w.size();
                java.util.ArrayList arrayList = this.w;
                if (i2 >= size2) {
                    j3 = j5;
                    size = arrayList.size() - 1;
                    break;
                }
                j3 = j5;
                if (((defpackage.gkz) arrayList.get(i2)).r > j2) {
                    size = i2 - 1;
                    break;
                } else {
                    i2++;
                    j5 = j3;
                }
            }
            if (i < 0) {
                while (size >= 0) {
                    defpackage.gkz gkzVar = (defpackage.gkz) this.w.get(size);
                    long j6 = gkzVar.r;
                    long j7 = j - j6;
                    gkzVar.y(j7, j2 - j6);
                    if (j7 >= j3) {
                        break;
                    } else {
                        size--;
                    }
                }
            } else {
                while (size < this.w.size()) {
                    defpackage.gkz gkzVar2 = (defpackage.gkz) this.w.get(size);
                    long j8 = gkzVar2.r;
                    long j9 = j - j8;
                    if (j9 < j3) {
                        break;
                    }
                    gkzVar2.y(j9, j2 - j8);
                    size++;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.w.size(); i3++) {
                ((defpackage.gkz) this.w.get(i3)).y(j, j2);
            }
            j3 = 0;
        }
        if (this.f != null) {
            if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                return;
            }
            if (j > j4) {
                this.l = true;
            }
            super.s(this, gky.b, r10);
        }
    }

    public glh() {
        this.w = new java.util.ArrayList();
        this.z = true;
        this.y = false;
        this.A = 0;
    }
}
