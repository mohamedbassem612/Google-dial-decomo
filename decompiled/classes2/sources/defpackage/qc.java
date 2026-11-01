package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qc extends defpackage.rm {
    final java.util.List a;
    private final java.lang.String b;
    private final boolean c;
    private final defpackage.qk d;

    public qc(java.lang.String str, boolean z, defpackage.qk qkVar, java.util.List list) {
        this.c = z;
        this.b = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.d = (defpackage.qk) j$.util.Objects.requireNonNull(qkVar);
        this.a = (java.util.List) j$.util.Objects.requireNonNull(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.qc)) {
            defpackage.qc qcVar = (defpackage.qc) obj;
            if (this.c == qcVar.c && j$.util.Objects.equals(this.b, qcVar.b) && j$.util.Objects.equals(this.d, qcVar.d) && j$.util.Objects.equals(this.a, qcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.c), this.b, this.d, this.a, -1});
    }
}
