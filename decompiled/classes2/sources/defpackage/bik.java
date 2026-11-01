package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bik extends dca {
    private final aonn a;

    public bik(aonn aonnVar) {
        this.a = aonnVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bin(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.bin) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bik) && this.a == ((defpackage.bik) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
