package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfs implements defpackage.tfz {
    public final defpackage.tfj a;
    public final android.net.Uri b;

    public tfs(defpackage.tfj tfjVar, android.net.Uri uri) {
        this.a = tfjVar;
        this.b = uri;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfs) {
            defpackage.tfs tfsVar = (defpackage.tfs) obj;
            if (aooh.n(this.a, tfsVar.a) && aooh.n(this.b, tfsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LaunchContactDetails(actionContext=" + this.a + ", contactUri=" + this.b + ')';
    }
}
