package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qg {
    public final java.lang.String a;
    public final int b;

    public qg(java.lang.String str, int i) {
        dzk.z(str);
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.qg)) {
            defpackage.qg qgVar = (defpackage.qg) obj;
            if (this.b == qgVar.b && this.a.equals(qgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        int i = this.b;
        java.lang.String str = this.a;
        if (i == -1) {
            return str;
        }
        return str + '[' + i + ']';
    }
}
