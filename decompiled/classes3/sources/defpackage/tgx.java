package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgx {
    public final java.lang.String a;

    public static java.lang.String a(java.lang.String str) {
        return "Key(value=" + str + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.tgx) && aooh.n(this.a, ((defpackage.tgx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
