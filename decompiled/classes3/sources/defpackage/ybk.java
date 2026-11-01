package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybk implements defpackage.xuw {
    private final defpackage.xuw b;
    private final boolean c;

    public ybk(defpackage.xuw xuwVar, boolean z) {
        this.b = xuwVar;
        this.c = z;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.xuw
    public final defpackage.xxe b(android.content.Context context, defpackage.xxe xxeVar, int i, int i2) {
        defpackage.xxm xxmVar = defpackage.xrr.b(context).b;
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) xxeVar.c();
        defpackage.xxe xxeVarA = defpackage.ybj.a(xxmVar, drawable, i, i2);
        if (xxeVarA == null) {
            if (this.c) {
                throw new java.lang.IllegalArgumentException(hgb.i(drawable, "Unable to convert ", " to a Bitmap"));
            }
            return xxeVar;
        }
        defpackage.xxe xxeVarB = this.b.b(context, xxeVarA, i, i2);
        if (!xxeVarB.equals(xxeVarA)) {
            return defpackage.ybv.f(context.getResources(), xxeVarB);
        }
        xxeVarB.e();
        return xxeVar;
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ybk) {
            return this.b.equals(((defpackage.ybk) obj).b);
        }
        return false;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return this.b.hashCode();
    }
}
