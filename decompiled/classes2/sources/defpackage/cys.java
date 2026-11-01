package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cys extends dca {
    private final aonj a;

    public cys(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new cyu(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((cyu) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cys) && this.a == ((defpackage.cys) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
