package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aook implements aonz {
    private final java.lang.Class a;

    public aook(java.lang.Class cls) {
        this.a = cls;
    }

    public final java.lang.Class a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aook) && aooh.n(this.a, ((defpackage.aook) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
