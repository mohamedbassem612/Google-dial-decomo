package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahad implements defpackage.ahae {
    public final java.lang.Object a;

    public ahad(java.lang.Object obj) {
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ahad) && aooh.n(this.a, ((defpackage.ahad) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NewData(result=" + this.a + ')';
    }
}
