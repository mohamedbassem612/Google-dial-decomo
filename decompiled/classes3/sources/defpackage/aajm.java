package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aajm {
    public final boolean a;
    public final android.os.Bundle b;

    public aajm(boolean z, android.os.Bundle bundle) {
        this.a = z;
        this.b = bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aajm) {
            defpackage.aajm aajmVar = (defpackage.aajm) obj;
            if (this.a == aajmVar.a && this.b.equals(aajmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DroidGuardClientOptions{reinitializeHandleOnGetSnapshot=" + this.a + ", extras=" + java.lang.String.valueOf(this.b) + '}';
    }

    public aajm() {
        throw null;
    }
}
