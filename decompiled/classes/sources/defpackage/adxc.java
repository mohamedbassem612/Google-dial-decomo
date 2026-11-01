package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxc {
    public static final defpackage.adxc a = a("Content-Encoding");
    public static final defpackage.adxc b;
    public static final defpackage.adxc c;
    public static final defpackage.adxc d;
    public static final defpackage.adxc e;
    public final java.lang.String f;

    static {
        a("Content-Type");
        b = a("X-DFE-Device-Id");
        c = a("X-DFE-Debug-Overrides");
        d = a("X-Server-Timeout");
        e = a("X-Server-Token");
    }

    public adxc(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null key");
        }
        this.f = str;
    }

    public static defpackage.adxc a(java.lang.String str) {
        defpackage.ahvr.bR(defpackage.ahwz.a.h(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new defpackage.adxc(str.toLowerCase(java.util.Locale.US));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adxc) {
            return this.f.equals(((defpackage.adxc) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "GnpHttpHeaderKey{key=" + this.f + '}';
    }

    public adxc() {
        throw null;
    }
}
