package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeui implements defpackage.aepy {
    public final defpackage.ahyn a;
    private final int b;

    public aeui(int i, defpackage.ahyn ahynVar) {
        this.b = i;
        this.a = ahynVar;
    }

    public static final defpackage.aeuh d() {
        defpackage.aeuh aeuhVar = new defpackage.aeuh();
        aeuhVar.a = (byte) 1;
        aeuhVar.c = defpackage.ahwt.a;
        aeuhVar.b = 1;
        return aeuhVar;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeui) {
            defpackage.aeui aeuiVar = (defpackage.aeui) obj;
            int i = this.b;
            int i2 = aeuiVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a.equals(aeuiVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        defpackage.anty.aJ(i);
        return (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final java.lang.String toString() {
        return "StorageConfigurations{enablement=" + defpackage.aepz.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + java.lang.String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    public aeui() {
        throw null;
    }

    @Override // defpackage.aepy
    public final void c() {
    }
}
