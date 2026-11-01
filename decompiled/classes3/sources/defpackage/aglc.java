package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aglc implements defpackage.aglv {
    public final java.lang.String b;

    public aglc(java.lang.String str) {
        this.b = str;
    }

    @Override // defpackage.aglv
    public java.lang.String a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aooh.n(a(), ((defpackage.aglc) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() * 31;
    }

    public java.lang.String toString() {
        return "FloatArrayUniform(name='" + a() + "')";
    }
}
