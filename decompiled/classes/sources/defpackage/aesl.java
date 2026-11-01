package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesl implements defpackage.aepy {
    private final int a;
    private final int b;

    public aesl(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static final defpackage.alto d() {
        defpackage.alto altoVar = new defpackage.alto();
        altoVar.a = 10;
        altoVar.b = 1;
        altoVar.c = (byte) 3;
        return altoVar;
    }

    @Override // defpackage.aepy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aesl) {
            defpackage.aesl aeslVar = (defpackage.aesl) obj;
            int i = this.b;
            int i2 = aeslVar.b;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == aeslVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        defpackage.anty.aJ(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        return "JankConfigurations{enablement=" + defpackage.aepz.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    public aesl() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
