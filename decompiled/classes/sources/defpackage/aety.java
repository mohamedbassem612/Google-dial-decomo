package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aety implements defpackage.aepy {
    public final defpackage.ahyn a;
    public final defpackage.ahyn b;
    private final int c;

    public aety(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2) {
        this.c = 1;
        this.a = ahynVar;
        this.b = ahynVar2;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aety) {
            defpackage.aety aetyVar = (defpackage.aety) obj;
            int i = this.c;
            int i2 = aetyVar.c;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.a.equals(aetyVar.a) && this.b.equals(aetyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.anty.aJ(this.c);
        return 395873938;
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.b;
        return "StartupConfigurations{enablement=" + defpackage.aepz.a(this.c) + ", metricExtensionProvider=" + java.lang.String.valueOf(this.a) + ", customTimestampProvider=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public aety() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
