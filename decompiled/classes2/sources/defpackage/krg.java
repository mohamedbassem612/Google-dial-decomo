package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krg implements defpackage.krj {
    public final int a;

    public krg(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.krg) && this.a == ((defpackage.krg) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ActionLaunched(targetApp=" + ((java.lang.Object) defpackage.hhb.z(this.a)) + ')';
    }
}
