package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aboh implements abok {
    public final java.lang.String a;

    public aboh(java.lang.String str) {
        aooh.f(str, "text");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.aboh) && aooh.n(this.a, ((defpackage.aboh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CheckmarkMetadata(text=" + this.a + ')';
    }
}
