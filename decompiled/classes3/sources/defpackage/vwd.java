package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vwd extends defpackage.vwg {
    private final aify a;

    public vwd(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null selectedRows");
        }
        this.a = aifyVar;
    }

    @Override // defpackage.vwg
    public final aify a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vwg) {
            return ahvr.aP(this.a, ((defpackage.vwg) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "DeleteSelectedItemsButtonClickedEvent{selectedRows=" + this.a.toString() + '}';
    }
}
