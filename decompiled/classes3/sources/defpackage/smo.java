package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smo implements defpackage.smp {
    public final java.lang.String a;

    public smo(java.lang.String str) {
        aooh.f(str, "text");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.smo) && aooh.n(this.a, ((defpackage.smo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Text(text=" + this.a + ')';
    }
}
