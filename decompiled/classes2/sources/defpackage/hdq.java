package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdq implements defpackage.hdo {
    public final android.graphics.Path.FillType a;
    public final defpackage.hdc b;
    public final defpackage.hdd c;
    public final defpackage.hdf d;
    public final defpackage.hdf e;
    public final java.lang.String f;
    public final boolean g;
    public final int h;

    public hdq(java.lang.String str, int i, android.graphics.Path.FillType fillType, defpackage.hdc hdcVar, defpackage.hdd hddVar, defpackage.hdf hdfVar, defpackage.hdf hdfVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = hdcVar;
        this.c = hddVar;
        this.d = hdfVar;
        this.e = hdfVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.hal(gzsVar, gzhVar, hefVar, this);
    }
}
