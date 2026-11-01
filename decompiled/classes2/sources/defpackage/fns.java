package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fns implements defpackage.eqx {
    public final long a;

    public fns(long j) {
        this.a = j;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.a == ((defpackage.fns) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.M(this.a) + 527;
    }

    public final java.lang.String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
