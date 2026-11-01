package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dmj {
    public final java.lang.Object a;

    public /* synthetic */ dmj(java.lang.Object obj) {
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dmj) && defpackage.aooh.n(this.a, ((defpackage.dmj) obj).a);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
