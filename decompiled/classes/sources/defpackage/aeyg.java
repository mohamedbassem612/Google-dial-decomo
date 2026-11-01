package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeyg extends defpackage.aeyh {
    private volatile boolean d;
    private java.lang.Object e;

    public aeyg(java.lang.String str, java.lang.String str2, defpackage.aeyz aeyzVar, defpackage.aeyd aeydVar, java.lang.String str3) {
        super(str, str2, aeyzVar, aeydVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.aexz
    public final java.lang.Object e() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    java.lang.Object objFb = fb((java.lang.String) this.e);
                    if (objFb == null) {
                        throw null;
                    }
                    this.e = objFb;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
