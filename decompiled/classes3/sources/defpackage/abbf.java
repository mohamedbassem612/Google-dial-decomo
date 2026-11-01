package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbf extends aazc {
    public final java.lang.String a;

    public abbf(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abbf) && aooh.n(this.a, ((defpackage.abbf) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
