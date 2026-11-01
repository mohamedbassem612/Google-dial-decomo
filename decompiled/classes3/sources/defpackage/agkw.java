package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agkw implements defpackage.aglv {
    private final java.lang.String a;

    public agkw(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.aglv
    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aooh.n(this.a, ((defpackage.agkw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "BooleanUniform(name='" + this.a + "')";
    }
}
