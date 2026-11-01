package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hec implements defpackage.hdo {
    public final java.lang.String a;
    public final defpackage.hdb b;
    public final java.util.List c;
    public final defpackage.hda d;
    public final defpackage.hdd e;
    public final defpackage.hdb f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public hec(java.lang.String str, defpackage.hdb hdbVar, java.util.List list, defpackage.hda hdaVar, defpackage.hdd hddVar, defpackage.hdb hdbVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = hdbVar;
        this.c = list;
        this.d = hdaVar;
        this.e = hddVar;
        this.f = hdbVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.haw(gzsVar, hefVar, this);
    }
}
