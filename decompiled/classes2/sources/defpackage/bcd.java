package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bcd extends bei {
    public final defpackage.bbv a;
    final /* synthetic */ defpackage.bcl b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;
    final /* synthetic */ bee f;
    private final int g;
    private final bee h;

    public bcd(defpackage.bbv bbvVar, bee beeVar, int i, defpackage.bcl bclVar, int i2, int i3, long j) {
        this.f = beeVar;
        this.b = bclVar;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.a = bbvVar;
        this.h = beeVar;
        this.g = i;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.bcc b(int i, int i2, int i3, long j) {
        return c(i, j, i2, i3, this.g);
    }

    public final defpackage.bcc c(int i, long j, int i2, int i3, int i4) {
        int iC;
        defpackage.bbv bbvVar = this.a;
        java.lang.Object objD = bbvVar.d(i);
        bbvVar.c(i);
        boolean zJ = dpd.j(j);
        java.util.List listE = e(this.h, i, j);
        if (zJ) {
            iC = dpd.d(j);
        } else {
            if (!dpd.i(j)) {
                defpackage.avo.c("does not have fixed height");
            }
            iC = dpd.c(j);
        }
        bee beeVar = this.f;
        defpackage.bcl bclVar = this.b;
        return new defpackage.bcc(i, objD, iC, i4, beeVar.p(), this.c, this.d, listE, this.e, bclVar.h, j, i2, i3);
    }

    public final aaif d() {
        return this.a.b;
    }
}
