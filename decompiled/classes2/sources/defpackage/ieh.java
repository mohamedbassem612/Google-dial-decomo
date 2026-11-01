package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ieh implements ahth {
    public final defpackage.ied a;

    public ieh(defpackage.ied iedVar) {
        aooh.f(iedVar, "audioInfo");
        this.a = iedVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ieh) && aooh.n(this.a, ((defpackage.ieh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DeleteButtonClickEvent(audioInfo=" + this.a + ')';
    }
}
