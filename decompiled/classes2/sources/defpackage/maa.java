package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class maa {
    public final int a;
    public final java.lang.Integer b;

    public maa(int i, java.lang.Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.maa) {
            defpackage.maa maaVar = (defpackage.maa) obj;
            if (this.a == maaVar.a && aooh.n(this.b, maaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "CallDetailsFeatureIcon(iconResourceId=" + this.a + ", iconTintResourceId=" + this.b + ')';
    }
}
