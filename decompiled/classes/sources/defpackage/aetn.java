package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aetn implements defpackage.aepy {
    public final int a;
    public final boolean b;
    public final defpackage.ahyn c;
    public final defpackage.aify d;
    private final int e;

    public aetn(int i, int i2, boolean z, defpackage.ahyn ahynVar, defpackage.aify aifyVar) {
        this.e = i;
        this.a = i2;
        this.b = z;
        this.c = ahynVar;
        this.d = aifyVar;
    }

    public static final defpackage.aetm d() {
        defpackage.aetm aetmVar = new defpackage.aetm();
        aetmVar.b(false);
        aetmVar.a = 50;
        aetmVar.c = (byte) (aetmVar.c | 1);
        aetmVar.b = defpackage.ahwt.a;
        aetmVar.d = 1;
        return aetmVar;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.e == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aetn) {
            defpackage.aetn aetnVar = (defpackage.aetn) obj;
            int i = this.e;
            int i2 = aetnVar.e;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == aetnVar.a && this.b == aetnVar.b && this.c.equals(aetnVar.c) && defpackage.ahvr.aP(this.d, aetnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        defpackage.anty.aJ(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.aify aifyVar = this.d;
        return "NetworkConfigurations{enablement=" + defpackage.aepz.a(this.e) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=" + this.b + ", metricExtensionProvider=" + java.lang.String.valueOf(this.c) + ", customDomainAllowlist=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public aetn() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
