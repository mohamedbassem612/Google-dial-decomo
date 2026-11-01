package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycy implements defpackage.xuw {
    private final defpackage.xuw b;

    public ycy(defpackage.xuw xuwVar) {
        this.b = xuwVar;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.xuw
    public final defpackage.xxe b(android.content.Context context, defpackage.xxe xxeVar, int i, int i2) {
        defpackage.ycv ycvVar = (defpackage.ycv) xxeVar.c();
        defpackage.xxe ybvVar = new defpackage.ybv(ycvVar.a(), defpackage.xrr.b(context).b, 1);
        defpackage.xuw xuwVar = this.b;
        defpackage.xxe xxeVarB = xuwVar.b(context, ybvVar, i, i2);
        if (!ybvVar.equals(xxeVarB)) {
            ybvVar.e();
        }
        ycvVar.a.a.e(xuwVar, (android.graphics.Bitmap) xxeVarB.c());
        return xxeVar;
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ycy) {
            return this.b.equals(((defpackage.ycy) obj).b);
        }
        return false;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return this.b.hashCode();
    }
}
