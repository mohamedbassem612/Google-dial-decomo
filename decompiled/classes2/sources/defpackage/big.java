package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class big extends dca {
    private final aonn a;

    public big(aonn aonnVar) {
        this.a = aonnVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bih(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.bih) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.big) && this.a == ((defpackage.big) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
