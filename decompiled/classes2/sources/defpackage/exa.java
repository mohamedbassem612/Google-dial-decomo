package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exa {
    public static final defpackage.exa a = new defpackage.exa(new java.util.HashMap());
    public final java.util.Map b;

    public exa(java.util.Map map) {
        this.b = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.exa) {
            return this.b.equals(((defpackage.exa) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
