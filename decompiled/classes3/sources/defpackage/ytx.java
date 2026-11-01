package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytx implements defpackage.yty {
    public final defpackage.ahdv a;

    public ytx(defpackage.ahdv ahdvVar) {
        this.a = ahdvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ytx) && aooh.n(this.a, ((defpackage.ytx) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Succeeded(session=" + this.a + ')';
    }
}
