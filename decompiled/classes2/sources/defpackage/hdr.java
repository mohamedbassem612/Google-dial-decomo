package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdr implements defpackage.hdo {
    public final java.lang.String a;
    public final defpackage.hdc b;
    public final defpackage.hdd c;
    public final defpackage.hdf d;
    public final defpackage.hdf e;
    public final defpackage.hdb f;
    public final float g;
    public final java.util.List h;
    public final defpackage.hdb i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public hdr(java.lang.String str, int i, defpackage.hdc hdcVar, defpackage.hdd hddVar, defpackage.hdf hdfVar, defpackage.hdf hdfVar2, defpackage.hdb hdbVar, int i2, int i3, float f, java.util.List list, defpackage.hdb hdbVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = hdcVar;
        this.c = hddVar;
        this.d = hdfVar;
        this.e = hdfVar2;
        this.f = hdbVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = hdbVar2;
        this.j = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.ham(gzsVar, hefVar, this);
    }
}
