package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ayg extends dca {
    private final int a;

    public ayg(int i) {
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.ayh(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.ayh ayhVar = (defpackage.ayh) cmvVar;
        ayhVar.b = this.a;
        ayhVar.a = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.ayg aygVar = obj instanceof defpackage.ayg ? (defpackage.ayg) obj : null;
        return aygVar != null && this.a == aygVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
