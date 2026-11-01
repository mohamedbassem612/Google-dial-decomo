package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abzt {
    private final java.lang.String a;

    public abzt(java.lang.String str) {
        this.a = str;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abzt) && defpackage.aooh.n(this.a, ((defpackage.abzt) obj).a);
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
        return "GrowthKitEventResponse(promoId=" + this.a + ')';
    }

    public abzt() {
        this(null);
    }
}
