package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xty extends defpackage.xtw {
    public final android.graphics.drawable.Drawable a;
    private final defpackage.xub b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public xty(defpackage.xub xubVar, android.graphics.drawable.Drawable drawable) throws aois {
        this.b = xubVar;
        this.a = drawable;
        int iOrdinal = xubVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        if (iOrdinal == 2) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (iOrdinal != 3) {
            throw new aois();
        }
    }

    @Override // defpackage.xtw
    public final defpackage.xub a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xty) {
            defpackage.xty xtyVar = (defpackage.xty) obj;
            if (this.b == xtyVar.b && aooh.n(this.a, xtyVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        android.graphics.drawable.Drawable drawable = this.a;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final java.lang.String toString() {
        return "Placeholder(status=" + this.b + ", placeholder=" + this.a + ')';
    }
}
