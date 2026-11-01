package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hau implements defpackage.hay, defpackage.hag {
    public final defpackage.hbd a;
    public defpackage.hdy b;
    private final defpackage.gzs c;

    public hau(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hdx hdxVar) {
        this.c = gzsVar;
        defpackage.hbd hbdVarA = hdxVar.a.a();
        this.a = hbdVarA;
        hefVar.i(hbdVarA);
        hbdVarA.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    @Override // defpackage.hay
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        throw null;
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
    }
}
