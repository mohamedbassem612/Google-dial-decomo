package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aehp {
    public final boolean a;

    public aehp(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.aehp) && this.a == ((defpackage.aehp) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "AccountCapabilities{shouldHideEmail=" + this.a + '}';
    }

    public aehp() {
        throw null;
    }
}
