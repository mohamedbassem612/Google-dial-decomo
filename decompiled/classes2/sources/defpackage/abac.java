package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abac extends aazc {
    public final java.lang.String a;
    public final java.lang.String b;
    private final boolean c;
    private final int d;
    private final j$.time.Duration e;

    public abac(byte[] bArr) {
        this.a = "ondevicesafety-pa.googleapis.com";
        this.b = "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8";
        this.c = false;
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.e = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abac) {
            defpackage.abac abacVar = (defpackage.abac) obj;
            if (aooh.n(this.a, abacVar.a) && aooh.n(this.b, abacVar.b)) {
                boolean z = abacVar.c;
                int i = abacVar.d;
                j$.time.Duration duration = abacVar.e;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) * 31;
    }

    public abac() {
        this(null);
    }
}
