package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ykm implements android.graphics.drawable.Drawable.Callback {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ykm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.$cid != 0) {
            ((glw) this.a).invalidateSelf();
            return;
        }
        aooh.f(drawable, "d");
        defpackage.ykn yknVar = (defpackage.ykn) this.a;
        yknVar.b.b(java.lang.Integer.valueOf(yknVar.g() + 1));
        yknVar.c.b(new cpp(defpackage.yko.a(yknVar.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        if (this.$cid != 0) {
            ((glw) this.a).scheduleSelf(runnable, j);
            return;
        }
        aooh.f(drawable, "d");
        aooh.f(runnable, "what");
        defpackage.yko.b().postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        if (this.$cid != 0) {
            ((glw) this.a).unscheduleSelf(runnable);
            return;
        }
        aooh.f(drawable, "d");
        aooh.f(runnable, "what");
        defpackage.yko.b().removeCallbacks(runnable);
    }
}
