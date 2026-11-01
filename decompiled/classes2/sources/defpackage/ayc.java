package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ayc implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ayc(java.lang.Object obj, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((czb) obj).s((czc) this.c, this.a, this.b, 0.0f);
            return aojh.a;
        }
        if (i == 1) {
            czb.B((czb) obj, (czc) this.c, this.a, this.b);
            return aojh.a;
        }
        int i2 = 0;
        if (i != 2) {
            czb czbVar = (czb) obj;
            aooh.f(czbVar, "$this$layout");
            int i3 = 0;
            for (defpackage.abej abejVar : this.c) {
                int i4 = this.a;
                czc czcVar = abejVar.a;
                defpackage.abek abekVar = abejVar.b;
                boolean z = abekVar.b;
                int i5 = true != z ? i3 : i2;
                int i6 = i4 - czcVar.b;
                boolean z2 = abekVar.a;
                float f = (z2 && z) ? 1.0f : 0.0f;
                int i7 = this.b;
                czbVar.u(czcVar, i5, i6 / 2, f);
                if (z) {
                    i2 += czcVar.a + i7;
                }
                if (z2) {
                    i3 += czcVar.a + i7;
                }
            }
            return aojh.a;
        }
        dka dkaVar = (dka) obj;
        djb djbVar = dkaVar.g;
        int iE = dkaVar.e(this.a);
        int iE2 = dkaVar.e(this.b);
        if (iE < 0 || iE > iE2 || iE2 > djbVar.c.length()) {
            defpackage.dnv.b("start(" + iE + ") or end(" + iE2 + ") is out of range [0.." + djbVar.c.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        if (djbVar.e) {
            dll dllVar = djbVar.b;
            float fE = dllVar.e(iE, false);
            float fE2 = dllVar.e(iE2, false);
            path.addRect(java.lang.Math.min(fE, fE2), djbVar.d(0), java.lang.Math.max(fE, fE2), djbVar.c(0), android.graphics.Path.Direction.CW);
        } else {
            dll dllVar2 = djbVar.b;
            dllVar2.f.getSelectionPath(iE, iE2, path);
            int i8 = dllVar2.h;
            if (i8 != 0 && !path.isEmpty()) {
                path.offset(0.0f, i8);
            }
        }
        java.lang.Object obj2 = this.c;
        cpx cpxVar = new cpx(path);
        cpxVar.o(((long) java.lang.Float.floatToRawIntBits(dkaVar.e)) & 4294967295L);
        ((cpx) obj2).s(cpxVar);
        return aojh.a;
    }
}
