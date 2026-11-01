package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class osn {
    public final boolean a;

    public osn(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.osn) && this.a == ((defpackage.osn) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "AccountSelectorDialogContainerModel{dismissDialog=" + this.a + '}';
    }

    public osn() {
        throw null;
    }
}
