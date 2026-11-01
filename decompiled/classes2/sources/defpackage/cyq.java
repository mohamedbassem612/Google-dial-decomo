package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cyq extends dca {
    private final long a = 0;
    private final long b = 0;
    private final aonj d;

    public cyq(aonj aonjVar) {
        this.d = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cyr(this.d);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.cyr cyrVar = (defpackage.cyr) cmvVar;
        cyrVar.a = this.d;
        cyrVar.b();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cyq) {
            defpackage.cyq cyqVar = (defpackage.cyq) obj;
            long j = cyqVar.a;
            long j2 = cyqVar.b;
            if (this.d == cyqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
