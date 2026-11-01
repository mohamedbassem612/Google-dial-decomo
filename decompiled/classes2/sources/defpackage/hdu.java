package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdu implements defpackage.hdo {
    public final java.lang.String a;
    public final defpackage.hdb b;
    public final defpackage.hdl c;
    public final defpackage.hdb d;
    public final defpackage.hdb e;
    public final defpackage.hdb f;
    public final defpackage.hdb g;
    public final defpackage.hdb h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public hdu(java.lang.String str, int i, defpackage.hdb hdbVar, defpackage.hdl hdlVar, defpackage.hdb hdbVar2, defpackage.hdb hdbVar3, defpackage.hdb hdbVar4, defpackage.hdb hdbVar5, defpackage.hdb hdbVar6, boolean z, boolean z2) {
        this.a = str;
        this.k = i;
        this.b = hdbVar;
        this.c = hdlVar;
        this.d = hdbVar2;
        this.e = hdbVar3;
        this.f = hdbVar4;
        this.g = hdbVar5;
        this.h = hdbVar6;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.har(gzsVar, hefVar, this);
    }
}
