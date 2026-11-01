package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxh extends dzl {
    private final defpackage.fvs a;

    public fxh(defpackage.fvs fvsVar) {
        super((byte[]) null);
        this.a = fvsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aooh.n(this.a, ((defpackage.fxh) obj).a);
    }

    public final int hashCode() {
        defpackage.fvs fvsVar = this.a;
        if (fvsVar != null) {
            return fvsVar.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return "NavBackStackEntryInfo(visibleEntry=" + this.a + ')';
    }

    public fxh() {
        this(null);
    }
}
