package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqc implements defpackage.aepy {
    public final defpackage.agab a;
    private final int b;

    public aeqc(int i, defpackage.agab agabVar) {
        this.b = i;
        this.a = agabVar;
    }

    public static final defpackage.aeqb d() {
        defpackage.aeqb aeqbVar = new defpackage.aeqb();
        aeqbVar.c = new defpackage.agab((int[]) null);
        aeqbVar.b = 1;
        aeqbVar.a = (byte) 1;
        return aeqbVar;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeqc) {
            defpackage.aeqc aeqcVar = (defpackage.aeqc) obj;
            int i = this.b;
            int i2 = aeqcVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a.equals(aeqcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        defpackage.anty.aJ(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "BatteryConfigurations{enablement=" + defpackage.aepz.a(this.b) + ", chargeCounterEnabled=false, metricExtensionProvider=" + java.lang.String.valueOf(this.a) + '}';
    }

    public aeqc() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
