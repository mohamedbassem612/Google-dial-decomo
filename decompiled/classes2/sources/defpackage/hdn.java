package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdn implements defpackage.hdo {
    public final java.lang.String a;
    public final defpackage.hdl b;
    public final defpackage.hdf c;
    public final boolean d;
    public final boolean e;

    public hdn(java.lang.String str, defpackage.hdl hdlVar, defpackage.hdf hdfVar, boolean z, boolean z2) {
        this.a = str;
        this.b = hdlVar;
        this.c = hdfVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.haj(gzsVar, hefVar, this);
    }
}
