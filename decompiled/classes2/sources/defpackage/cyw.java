package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cyw extends dca {
    private final aonj a;

    public cyw(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cyx(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.cyx cyxVar = (defpackage.cyx) cmvVar;
        cyxVar.a = this.a;
        cyxVar.b = -9223372034707292160L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cyw) && this.a == ((defpackage.cyw) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
