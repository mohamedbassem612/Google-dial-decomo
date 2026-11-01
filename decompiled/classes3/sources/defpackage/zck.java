package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zck extends wsc {
    public final int a;

    public zck(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zck) && this.a == ((defpackage.zck) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "IntValue(value=" + this.a + ')';
    }
}
