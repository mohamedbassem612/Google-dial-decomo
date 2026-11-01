package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class poi {
    public final java.lang.String a;

    public poi(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.poi) && aooh.n(this.a, ((defpackage.poi) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final java.lang.String toString() {
        return "DeviceNumberRow(label=" + this.a + ')';
    }

    public poi() {
        this(null);
    }
}
