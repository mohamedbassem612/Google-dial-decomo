package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zpb {
    public final java.lang.Object a;

    public static final java.lang.Throwable a(java.lang.Object obj) {
        if (obj instanceof defpackage.zoy) {
            return ((defpackage.zoy) obj).a;
        }
        return null;
    }

    public static final boolean b(java.lang.Object obj) {
        return ((obj instanceof defpackage.zoz) || (obj instanceof defpackage.zoy) || (obj instanceof defpackage.zpa)) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.zpb) && aooh.n(this.a, ((defpackage.zpb) obj).a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "InCallCacheResult(value=" + this.a + ')';
    }
}
