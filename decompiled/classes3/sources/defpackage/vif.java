package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vif extends defpackage.viq {
    private final java.lang.String e;

    public vif(java.lang.String str) {
        this.e = str == null ? "" : str;
    }

    @Override // defpackage.viq
    public final java.io.InputStream a() {
        return akzc.v(this.e, java.nio.charset.StandardCharsets.US_ASCII).h();
    }

    @Override // defpackage.viq
    public final java.lang.String b() {
        return this.e;
    }

    @Override // defpackage.viq, defpackage.vih
    public final void c(defpackage.vhg vhgVar, defpackage.vin vinVar) {
        vhgVar.c(this.e);
    }

    public final java.lang.String toString() {
        return "\"" + this.e + '\"';
    }
}
