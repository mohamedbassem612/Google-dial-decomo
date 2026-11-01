package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aosr extends defpackage.aolj {
    public static final defpackage.cch b = new defpackage.cch();
    public final java.lang.String a;

    public aosr(java.lang.String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.aosr) && defpackage.aooh.n(this.a, ((defpackage.aosr) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CoroutineName(" + this.a + ')';
    }
}
