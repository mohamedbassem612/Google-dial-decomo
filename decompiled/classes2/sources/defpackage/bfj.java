package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bfj extends dca {
    private final defpackage.bfl a;

    public bfj(defpackage.bfl bflVar) {
        this.a = bflVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bfm(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.bfm) cmvVar).b(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bfj) && aooh.n(this.a, ((defpackage.bfj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
