package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olr {
    public final java.lang.String a;
    public final j$.util.Optional b;

    public olr(java.lang.String str, j$.util.Optional optional) {
        this.a = str;
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.olr) {
            defpackage.olr olrVar = (defpackage.olr) obj;
            if (this.a.equals(olrVar.a) && this.b.equals(olrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FeatureDemoAnimationInfo{fileName=" + this.a + ", imageAssetFolder=" + java.lang.String.valueOf(this.b) + '}';
    }

    public olr() {
        throw null;
    }
}
