package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekt {
    private final aesg a;

    public aekt(aesg aesgVar) {
        this.a = aesgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aekt) {
            return this.a.equals(((defpackage.aekt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "LogoViewFeature{logoViewInflater=" + this.a.toString() + '}';
    }

    public aekt() {
        throw null;
    }
}
