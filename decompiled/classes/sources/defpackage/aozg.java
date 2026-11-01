package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aozg implements defpackage.aozc {
    public final long a;
    public final long b;

    public aozg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.aozc
    public final defpackage.aoxh a(defpackage.aozh aozhVar) {
        defpackage.aozf aozfVar = new defpackage.aozf(this, null);
        int i = defpackage.aoyc.a;
        return defpackage.aoxo.a(new defpackage.gdc(new defpackage.apaa(aozfVar, aozhVar), new defpackage.fys((defpackage.aoln) null, 4, (int[]) null), 10));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aozg) {
            defpackage.aozg aozgVar = (defpackage.aozg) obj;
            if (this.a == aozgVar.a && this.b == aozgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (aoil.g(this.a) * 31) + aoil.g(this.b);
    }

    public final java.lang.String toString() throws java.io.IOException {
        defpackage.aokv aokvVar = new defpackage.aokv(2);
        long j = this.a;
        if (j > 0) {
            aokvVar.add(defpackage.a.bC(j, "stopTimeout=", "ms"));
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            aokvVar.add(defpackage.a.bC(j2, "replayExpiration=", "ms"));
        }
        return "SharingStarted.WhileSubscribed(" + defpackage.ajsz.cr(defpackage.ajsz.aX(aokvVar), null, null, null, null, 63) + ')';
    }
}
