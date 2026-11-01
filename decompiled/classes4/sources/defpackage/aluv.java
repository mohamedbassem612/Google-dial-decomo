package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aluv implements defpackage.aluw {
    public final java.lang.String a;

    public aluv(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.aluw
    public final int a() {
        return 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.aluv) && aooh.n(this.a, ((defpackage.aluv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Speak(intentName=" + this.a + ')';
    }
}
