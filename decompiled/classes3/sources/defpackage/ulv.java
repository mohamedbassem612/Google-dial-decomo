package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ulv implements ahth {
    public final defpackage.uls a;

    public ulv(defpackage.uls ulsVar) {
        aooh.f(ulsVar, "dialogType");
        this.a = ulsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ulv) && this.a == ((defpackage.ulv) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DismissDialogEvent(dialogType=" + this.a + ')';
    }
}
