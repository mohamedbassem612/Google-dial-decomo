package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ycq extends defpackage.yco {
    static defpackage.xxe g(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            return new defpackage.ycq(drawable);
        }
        return null;
    }

    @Override // defpackage.xxe
    public final int a() {
        android.graphics.drawable.Drawable drawable = this.a;
        return java.lang.Math.max(1, (drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight()) << 2);
    }

    @Override // defpackage.xxe
    public final java.lang.Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.xxe
    public final void e() {
    }
}
