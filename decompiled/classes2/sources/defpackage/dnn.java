package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dnn {
    private final java.lang.String a = "com.google.android.gms.fonts";
    private final java.lang.String b = "com.google.android.gms";
    private final java.util.List c = null;
    private final int d = 2130903057;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dnn) {
            defpackage.dnn dnnVar = (defpackage.dnn) obj;
            if (aooh.n(this.a, dnnVar.a) && aooh.n(this.b, dnnVar.b)) {
                java.util.List list = dnnVar.c;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    int i = dnnVar.d;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + 2130903057;
    }
}
