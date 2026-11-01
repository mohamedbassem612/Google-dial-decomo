package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xky implements defpackage.xfs {
    private final /* synthetic */ java.lang.String[] a;
    private final /* synthetic */ java.lang.String[] b;

    public /* synthetic */ xky(java.lang.String[] strArr, int i) {
        strArr = (i & 1) != 0 ? new java.lang.String[0] : strArr;
        aooh.f(strArr, "scopes");
        this.a = strArr;
        this.b = new java.lang.String[0];
    }

    @Override // defpackage.xfs
    public final /* synthetic */ java.lang.String[] a() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ java.lang.Class annotationType() {
        return defpackage.xfs.class;
    }

    @Override // defpackage.xfs
    public final /* synthetic */ java.lang.String[] b() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xfs)) {
            return false;
        }
        defpackage.xfs xfsVar = (defpackage.xfs) obj;
        return java.util.Arrays.equals(this.a, xfsVar.b()) && java.util.Arrays.equals(this.b, xfsVar.a());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.a) ^ 677495521) + (java.util.Arrays.hashCode(this.b) ^ (-991098902));
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        java.lang.String[] strArr = this.b;
        return "@com.android.onboarding.contracts.annotations.AllowedCallers(scopes=" + java.util.Arrays.toString(this.a) + ", components=" + java.util.Arrays.toString(strArr) + ')';
    }
}
