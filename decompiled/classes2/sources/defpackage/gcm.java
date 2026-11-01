package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gcm extends gfz {
    public final java.lang.Throwable a;

    public gcm(java.lang.Throwable th) {
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.gcm) && aooh.n(this.a, ((defpackage.gcm) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return aoov.n("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
    }
}
