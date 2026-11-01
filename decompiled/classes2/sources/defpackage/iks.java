package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iks implements defpackage.ikt {
    public final java.lang.String a;

    public iks(java.lang.String str) {
        aooh.f(str, "unzippedFilePath");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.iks) && aooh.n(this.a, ((defpackage.iks) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "WithPath(unzippedFilePath=" + this.a + ')';
    }
}
