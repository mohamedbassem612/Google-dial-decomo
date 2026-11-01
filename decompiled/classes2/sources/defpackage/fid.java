package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fid extends defpackage.fif implements java.lang.Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;

    public fid(int i, defpackage.ern ernVar, int i2, defpackage.fib fibVar, int i3, java.lang.String str, java.lang.String str2) {
        int iB;
        int i4;
        boolean z;
        super(i, ernVar, i2);
        int i5 = 0;
        this.f = defpackage.hgt.aw(i3, false);
        int i6 = this.d.e;
        int i7 = fibVar.C;
        this.g = 1 == (i6 & 1);
        this.h = (i6 & 2) != 0;
        aify aifyVarP = str2 != null ? aify.p(str2) : fibVar.y.isEmpty() ? aify.p("") : fibVar.y;
        int i8 = 0;
        while (true) {
            if (i8 >= ((aike) aifyVarP).d) {
                iB = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            defpackage.eqg eqgVar = this.d;
            java.lang.String str3 = (java.lang.String) aifyVarP.get(i8);
            boolean z2 = fibVar.D;
            iB = defpackage.fih.b(eqgVar, str3, false);
            if (iB > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.i = i8;
        this.j = iB;
        if (str2 != null) {
            i4 = 1088;
        } else {
            int i9 = fibVar.A;
            i4 = 0;
        }
        int iC = defpackage.fih.c(this.d.f, i4);
        this.k = iC;
        defpackage.eqg eqgVar2 = this.d;
        this.n = (eqgVar2.f & 1088) != 0;
        int iA = defpackage.fih.a(eqgVar2, fibVar.z);
        this.l = iA;
        int iB2 = defpackage.fih.b(this.d, str, defpackage.fih.d(str) == null);
        this.m = iB2;
        if (iB > 0 || ((fibVar.y.isEmpty() && iC > 0) || ((fibVar.y.isEmpty() && iA != Integer.MAX_VALUE) || this.g || (this.h && iB2 > 0)))) {
            z = true;
        } else {
            boolean z3 = fibVar.x;
            z = false;
        }
        if (defpackage.hgt.aw(i3, fibVar.V) && z) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.fid fidVar) {
        defpackage.aieh aiehVarD = defpackage.aieh.b.e(this.f, fidVar.f).d(java.lang.Integer.valueOf(this.i), java.lang.Integer.valueOf(fidVar.i), j$.util.Comparator.-CC.reverseOrder());
        int i = this.j;
        defpackage.aieh aiehVarB = aiehVarD.b(i, fidVar.j);
        int i2 = this.k;
        defpackage.aieh aiehVarB2 = aiehVarB.b(i2, fidVar.k).d(java.lang.Integer.valueOf(this.l), java.lang.Integer.valueOf(fidVar.l), j$.util.Comparator.-CC.reverseOrder()).e(this.g, fidVar.g).d(java.lang.Boolean.valueOf(this.h), java.lang.Boolean.valueOf(fidVar.h), i == 0 ? j$.util.Comparator.-CC.naturalOrder() : j$.util.Comparator.-CC.reverseOrder()).b(this.m, fidVar.m);
        if (i2 == 0) {
            aiehVarB2 = aiehVarB2.f(this.n, fidVar.n);
        }
        return aiehVarB2.a();
    }

    @Override // defpackage.fif
    public final int b() {
        return this.e;
    }

    @Override // defpackage.fif
    public final /* bridge */ /* synthetic */ boolean c(defpackage.fif fifVar) {
        return false;
    }
}
