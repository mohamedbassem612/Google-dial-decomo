package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sk {
    public defpackage.pe[] a;
    private final java.lang.String b;
    private java.lang.String[] c;
    private long[] d;
    private double[] e;
    private boolean[] f;
    private byte[][] g;
    private androidx.appsearch.safeparcel.GenericDocumentParcel[] h;
    private defpackage.pu[] i;

    public sk(java.lang.String str) {
        this.b = (java.lang.String) j$.util.Objects.requireNonNull(str);
    }

    public final androidx.appsearch.safeparcel.PropertyParcel a() {
        return new androidx.appsearch.safeparcel.PropertyParcel(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a);
    }

    public final void b(boolean[] zArr) {
        this.f = (boolean[]) j$.util.Objects.requireNonNull(zArr);
    }

    public final void c(byte[][] bArr) {
        this.g = (byte[][]) j$.util.Objects.requireNonNull(bArr);
    }

    public final void d(androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr) {
        this.h = (androidx.appsearch.safeparcel.GenericDocumentParcel[]) j$.util.Objects.requireNonNull(genericDocumentParcelArr);
    }

    public final void e(double[] dArr) {
        this.e = (double[]) j$.util.Objects.requireNonNull(dArr);
    }

    public final void f(defpackage.pu[] puVarArr) {
        this.i = (defpackage.pu[]) j$.util.Objects.requireNonNull(puVarArr);
    }

    public final void g(long[] jArr) {
        this.d = (long[]) j$.util.Objects.requireNonNull(jArr);
    }

    public final void h(java.lang.String[] strArr) {
        this.c = (java.lang.String[]) j$.util.Objects.requireNonNull(strArr);
    }
}
