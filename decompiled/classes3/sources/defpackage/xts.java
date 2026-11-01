package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xts extends defpackage.xff {
    public final aonj a;

    public xts(aonj aonjVar) {
        super(null, null);
        this.a = aonjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xts) && aooh.n(this.a, ((defpackage.xts) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AsyncGlideSize(asyncSize=" + this.a + ')';
    }
}
