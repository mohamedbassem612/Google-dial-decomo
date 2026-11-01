package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class epf extends eoa {
    public static final eoe a = new ahha(1);
    public final aed b = new aed((byte[]) null);
    public boolean c = false;

    final defpackage.epd a(int i) {
        return (defpackage.epd) defpackage.aee.a(this.b, i);
    }

    final void b() {
        this.c = false;
    }

    protected final void d() {
        aed aedVar = this.b;
        int iC = aedVar.c();
        for (int i = 0; i < iC; i++) {
            ((defpackage.epd) aedVar.e(i)).c(true);
        }
        int i2 = aedVar.d;
        java.lang.Object[] objArr = aedVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        aedVar.d = 0;
        aedVar.a = false;
    }
}
