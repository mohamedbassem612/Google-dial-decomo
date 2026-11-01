package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybv implements defpackage.xxe, defpackage.xxb {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public ybv(android.graphics.Bitmap bitmap, defpackage.xxm xxmVar, int i) {
        this.$cid = i;
        anty.aI(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        anty.aI(xxmVar, "BitmapPool must not be null");
        this.b = xxmVar;
    }

    public static defpackage.xxe f(android.content.res.Resources resources, defpackage.xxe xxeVar) {
        if (xxeVar == null) {
            return null;
        }
        return new defpackage.ybv(resources, xxeVar, 0);
    }

    public static defpackage.ybv g(android.graphics.Bitmap bitmap, defpackage.xxm xxmVar) {
        if (bitmap == null) {
            return null;
        }
        return new defpackage.ybv(bitmap, xxmVar, 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xxe] */
    @Override // defpackage.xxe
    public final int a() {
        return this.$cid != 0 ? defpackage.ygc.a((android.graphics.Bitmap) this.a) : this.b.a();
    }

    @Override // defpackage.xxe
    public final java.lang.Class b() {
        return this.$cid != 0 ? android.graphics.Bitmap.class : android.graphics.drawable.BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xxe] */
    @Override // defpackage.xxe
    public final /* synthetic */ java.lang.Object c() {
        if (this.$cid != 0) {
            return this.a;
        }
        return new android.graphics.drawable.BitmapDrawable((android.content.res.Resources) this.a, (android.graphics.Bitmap) this.b.c());
    }

    @Override // defpackage.xxb
    public final void d() {
        if (this.$cid != 0) {
            ((android.graphics.Bitmap) this.a).prepareToDraw();
            return;
        }
        java.lang.Object obj = this.b;
        if (obj instanceof defpackage.xxb) {
            ((defpackage.xxb) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xxe, xxm] */
    @Override // defpackage.xxe
    public final void e() {
        int i = this.$cid;
        ?? r1 = this.b;
        if (i != 0) {
            r1.d((android.graphics.Bitmap) this.a);
        } else {
            r1.e();
        }
    }

    private ybv(android.content.res.Resources resources, defpackage.xxe xxeVar, int i) {
        this.$cid = i;
        anty.aI(resources, "Argument must not be null");
        this.a = resources;
        this.b = xxeVar;
    }
}
