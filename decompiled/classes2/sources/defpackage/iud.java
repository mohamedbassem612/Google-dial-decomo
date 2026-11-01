package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iud {
    public final int a;

    public iud(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.iud) && this.a == ((defpackage.iud) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return defpackage.iuc.b(this.a);
    }

    public final java.lang.String toString() {
        return "BeeslyCallContentVerdictState(contentState=" + ((java.lang.Object) defpackage.iuc.a(this.a)) + ')';
    }
}
