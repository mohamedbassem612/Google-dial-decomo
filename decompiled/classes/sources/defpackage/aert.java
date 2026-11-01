package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aert implements defpackage.aepy {
    public final java.lang.String a;
    private final int b;

    public aert(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return this.b == 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aert) {
            defpackage.aert aertVar = (defpackage.aert) obj;
            int i = this.b;
            int i2 = aertVar.b;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1 && this.a.equals(aertVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.anty.aJ(this.b);
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final java.lang.String toString() {
        return "ApplicationExitConfigurations{enablement=" + defpackage.aepz.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public aert() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
