package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhx extends defpackage.fif implements java.lang.Comparable {
    private final int e;
    private final boolean f;
    private final java.lang.String g;
    private final defpackage.fib h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private final int o;
    private final int p;
    private final boolean q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final boolean v;
    private final boolean w;
    private final boolean x;

    public fhx(int i, defpackage.ern ernVar, int i2, defpackage.fib fibVar, int i3, boolean z, java.util.function.Predicate predicate) {
        int i4;
        int iB;
        int i5;
        int iB2;
        boolean z2;
        int iHashCode;
        super(i, ernVar, i2);
        this.h = fibVar;
        int i6 = 1;
        int i7 = true != fibVar.T ? 16 : 24;
        boolean z3 = fibVar.P;
        this.g = defpackage.fih.d(this.d.d);
        this.i = defpackage.hgt.aw(i3, false);
        int i8 = 0;
        while (true) {
            aike aikeVar = fibVar.q;
            int i9 = aikeVar.d;
            i4 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
            if (i8 >= i9) {
                iB = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iB = defpackage.fih.b(this.d, (java.lang.String) aikeVar.get(i8), false);
                if (iB > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.k = i8;
        this.j = iB;
        int i10 = this.d.f;
        int i11 = fibVar.s;
        this.l = defpackage.fih.c(i10, 0);
        this.m = defpackage.fih.a(this.d, fibVar.r);
        defpackage.eqg eqgVar = this.d;
        int i12 = eqgVar.f;
        this.n = i12 == 0 || (i12 & 1) != 0;
        this.q = 1 == (eqgVar.e & 1);
        java.lang.String str = eqgVar.p;
        this.x = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        this.r = eqgVar.H;
        this.s = eqgVar.J;
        this.t = eqgVar.j;
        int i13 = eqgVar.j;
        this.f = (i13 == -1 || i13 <= fibVar.u) && ((i5 = eqgVar.H) == -1 || i5 <= fibVar.t) && aa$.ExternalSyntheticApiModelOutline1.m$1(predicate, eqgVar);
        java.lang.String str2 = eum.a;
        java.lang.String[] strArrSplit = aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(android.content.res.Resources.getSystem().getConfiguration())).split(",", -1);
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = eum.L(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= strArrSplit.length) {
                iB2 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iB2 = defpackage.fih.b(this.d, strArrSplit[i15], false);
                if (iB2 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.o = i15;
        this.p = iB2;
        int i16 = 0;
        while (true) {
            aike aikeVar2 = fibVar.v;
            if (i16 >= aikeVar2.d) {
                break;
            }
            java.lang.String str3 = this.d.p;
            if (str3 != null && str3.equals(aikeVar2.get(i16))) {
                i4 = i16;
                break;
            }
            i16++;
        }
        this.u = i4;
        this.v = (i3 & 384) == 128;
        this.w = (i3 & 64) == 64;
        defpackage.fib fibVar2 = this.h;
        if (defpackage.hgt.aw(i3, fibVar2.V) && ((z2 = this.f) || fibVar2.O)) {
            int i17 = fibVar2.w.b;
            if (defpackage.hgt.aw(i3, false) && z2 && this.d.j != -1) {
                boolean z4 = fibVar2.G;
                boolean z5 = fibVar2.F;
                if ((fibVar2.X || !z) && (i3 & i7) != 0) {
                    i6 = 2;
                }
            }
        } else {
            i6 = 0;
        }
        this.e = i6;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.fhx fhxVar) {
        boolean z = this.f;
        java.util.Comparator comparatorReversed = (z && this.i) ? defpackage.fih.a : j$.util.Comparator.-EL.reversed(defpackage.fih.a);
        defpackage.aieh aiehVarD = defpackage.aieh.b.e(this.i, fhxVar.i).d(java.lang.Integer.valueOf(this.k), java.lang.Integer.valueOf(fhxVar.k), j$.util.Comparator.-CC.reverseOrder()).b(this.j, fhxVar.j).b(this.l, fhxVar.l).d(java.lang.Integer.valueOf(this.m), java.lang.Integer.valueOf(fhxVar.m), j$.util.Comparator.-CC.reverseOrder()).e(this.q, fhxVar.q).e(this.n, fhxVar.n).d(java.lang.Integer.valueOf(this.o), java.lang.Integer.valueOf(fhxVar.o), j$.util.Comparator.-CC.reverseOrder()).b(this.p, fhxVar.p).e(z, fhxVar.f).d(java.lang.Integer.valueOf(this.u), java.lang.Integer.valueOf(fhxVar.u), j$.util.Comparator.-CC.reverseOrder());
        boolean z2 = this.h.F;
        defpackage.aieh aiehVarD2 = aiehVarD.e(this.v, fhxVar.v).e(this.w, fhxVar.w).e(this.x, fhxVar.x).d(java.lang.Integer.valueOf(this.r), java.lang.Integer.valueOf(fhxVar.r), comparatorReversed).d(java.lang.Integer.valueOf(this.s), java.lang.Integer.valueOf(fhxVar.s), comparatorReversed);
        if (j$.util.Objects.equals(this.g, fhxVar.g)) {
            aiehVarD2 = aiehVarD2.d(java.lang.Integer.valueOf(this.t), java.lang.Integer.valueOf(fhxVar.t), comparatorReversed);
        }
        return aiehVarD2.a();
    }

    @Override // defpackage.fif
    public final int b() {
        return this.e;
    }

    @Override // defpackage.fif
    public final /* bridge */ /* synthetic */ boolean c(defpackage.fif fifVar) {
        java.lang.String str;
        defpackage.fib fibVar = this.h;
        defpackage.fhx fhxVar = (defpackage.fhx) fifVar;
        boolean z = fibVar.R;
        defpackage.eqg eqgVar = this.d;
        int i = eqgVar.H;
        if (i != -1) {
            defpackage.eqg eqgVar2 = fhxVar.d;
            if (i == eqgVar2.H && (str = eqgVar.p) != null && android.text.TextUtils.equals(str, eqgVar2.p)) {
                boolean z2 = fibVar.Q;
                int i2 = eqgVar.J;
                if (i2 != -1 && i2 == eqgVar2.J) {
                    boolean z3 = fibVar.S;
                    if (this.v == fhxVar.v && this.w == fhxVar.w) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
