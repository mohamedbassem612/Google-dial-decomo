package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rqq implements defpackage.ahth {
    public final java.lang.String a;

    public rqq(java.lang.String str) {
        defpackage.aooh.f(str, "spokenText");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rqq) && defpackage.aooh.n(this.a, ((defpackage.rqq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VoiceSearchRequestEvent(spokenText=" + this.a + ')';
    }
}
