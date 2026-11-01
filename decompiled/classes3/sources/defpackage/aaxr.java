package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxr implements aaec {
    private final /* synthetic */ int $cid;
    final /* synthetic */ zzx a;

    public aaxr(defpackage.aawd aawdVar, zzx zzxVar, int i, char[] cArr) {
        this.$cid = i;
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aawdVar);
    }

    public final /* synthetic */ void c(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aaxp aaxpVar = (defpackage.aaxp) obj;
            aais.ax(aaxpVar.a, java.lang.Integer.valueOf(aaxpVar.b), this.a);
        } else if (i != 1) {
            defpackage.aaxc aaxcVar = (defpackage.aaxc) obj;
            aais.ax(aaxcVar.a, aaxcVar.b, this.a);
        } else {
            defpackage.aaww aawwVar = (defpackage.aaww) obj;
            aais.ax(aawwVar.a, aawwVar.b, this.a);
        }
    }

    public aaxr(defpackage.aawd aawdVar, zzx zzxVar, int i) {
        this.$cid = i;
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aawdVar);
    }

    public aaxr(defpackage.aawd aawdVar, zzx zzxVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aawdVar);
    }
}
