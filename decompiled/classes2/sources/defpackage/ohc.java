package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ohc {
    public final defpackage.ohb a;

    public ohc(defpackage.ohb ohbVar) {
        aooh.f(ohbVar, "state");
        this.a = ohbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ohc) && this.a == ((defpackage.ohc) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ExpressoCallUiModel(state=" + this.a + ')';
    }
}
