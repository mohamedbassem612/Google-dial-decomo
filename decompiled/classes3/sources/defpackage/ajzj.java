package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajzj {
    public final java.lang.String a;

    public ajzj(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null key");
        }
        this.a = str;
    }

    public static defpackage.ajzj a(java.lang.String str) {
        ahvr.bR(ahwz.a.h(str), "Only ASCII header keys are permitted: %s", str);
        return new defpackage.ajzj(str.toLowerCase(java.util.Locale.US));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajzj) {
            return this.a.equals(((defpackage.ajzj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "HttpHeaderKey{key=" + this.a + '}';
    }

    public ajzj() {
        throw null;
    }
}
