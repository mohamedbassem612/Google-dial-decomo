package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tuu {
    public final defpackage.ablb a;

    public tuu(defpackage.ablb ablbVar) {
        this.a = ablbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tuu) && aooh.n(this.a, ((defpackage.tuu) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        defpackage.ablb ablbVar = this.a;
        if (ablbVar == null) {
            return 0;
        }
        return ablbVar.hashCode();
    }

    public final java.lang.String toString() {
        return "SharpieVoiceCallScreenComposableUiModel(alertCardUiData=" + this.a + ')';
    }
}
