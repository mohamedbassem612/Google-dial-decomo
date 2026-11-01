package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpf {
    private final java.lang.String a;

    public abpf(java.lang.String str) {
        aooh.f(str, "text");
        this.a = str;
    }

    public final java.lang.String a(android.content.Context context) {
        aooh.f(context, "context");
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abpf) && aooh.n(this.a, ((defpackage.abpf) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TextString(text=" + this.a + ')';
    }
}
