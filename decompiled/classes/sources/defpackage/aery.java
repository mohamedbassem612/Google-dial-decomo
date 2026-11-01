package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aery implements defpackage.aepy {
    private final int a;

    public aery(byte[] bArr) {
        this.a = 2;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.aepy
    public final boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aery) {
            int i = this.a;
            int i2 = ((defpackage.aery) obj).a;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        defpackage.anty.aJ(i);
        return i ^ (-721379959);
    }

    public final java.lang.String toString() {
        return "CuiConfigurations{metricExtensionProvider=null, enablement=" + defpackage.aepz.a(this.a) + '}';
    }

    public aery() {
        throw null;
    }

    @Override // defpackage.aepy
    public final /* synthetic */ void c() {
    }
}
