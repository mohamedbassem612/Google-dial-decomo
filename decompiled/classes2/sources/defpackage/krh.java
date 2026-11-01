package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krh implements defpackage.krj {
    public final int a;

    public krh(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.krh) && this.a == ((defpackage.krh) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ActionNotSupported(actionType=" + ((java.lang.Object) defpackage.hgz.J(this.a)) + ')';
    }
}
