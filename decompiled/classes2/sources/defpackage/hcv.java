package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcv {
    public final java.util.List a;
    public final double b;
    private final char c;
    private final java.lang.String d;
    private final java.lang.String e;

    public hcv(java.util.List list, char c, double d, java.lang.String str, java.lang.String str2) {
        this.a = list;
        this.c = c;
        this.b = d;
        this.d = str;
        this.e = str2;
    }

    public final int hashCode() {
        return (((this.c * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }
}
