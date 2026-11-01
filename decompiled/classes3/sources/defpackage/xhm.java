package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xhm implements defpackage.xhl {
    public final java.lang.String a;

    public xhm(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.xhl
    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xhm) {
            return j$.util.Objects.equals(((defpackage.xhm) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NonSensitiveString(" + this.a + ')';
    }
}
