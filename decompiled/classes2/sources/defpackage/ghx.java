package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ghx implements java.lang.Comparable {
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    private final int d;

    public ghx(int i, int i2, java.lang.String str, java.lang.String str2) {
        aooh.f(str, "from");
        aooh.f(str2, "to");
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.ghx ghxVar = (defpackage.ghx) obj;
        aooh.f(ghxVar, "other");
        int i = this.a - ghxVar.a;
        return i == 0 ? this.d - ghxVar.d : i;
    }
}
