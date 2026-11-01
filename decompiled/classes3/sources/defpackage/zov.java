package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zov extends aehj {
    public final aoub a;

    public zov(aoub aoubVar) {
        super((char[]) null);
        this.a = aoubVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zov) && aooh.n(this.a, ((defpackage.zov) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Loading(pendingTask=" + this.a + ')';
    }
}
