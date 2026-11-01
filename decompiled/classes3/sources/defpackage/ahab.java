package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahab implements defpackage.ahae {
    public final java.lang.Throwable a;

    public ahab(java.lang.Throwable th) {
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ahab) && aooh.n(this.a, ((defpackage.ahab) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(throwable=" + this.a + ')';
    }
}
