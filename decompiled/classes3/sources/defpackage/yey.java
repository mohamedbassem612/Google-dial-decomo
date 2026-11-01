package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class yey extends defpackage.yfc implements defpackage.yfh {
    private android.graphics.drawable.Animatable c;

    public yey(android.widget.ImageView imageView) {
        super(imageView);
    }

    private final void o(java.lang.Object obj) {
        if (!(obj instanceof android.graphics.drawable.Animatable)) {
            this.c = null;
            return;
        }
        android.graphics.drawable.Animatable animatable = (android.graphics.drawable.Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    private final void p(java.lang.Object obj) {
        d(obj);
        o(obj);
    }

    @Override // defpackage.yet, defpackage.yfa
    public final void a(android.graphics.drawable.Drawable drawable) {
        p(null);
        n(drawable);
    }

    @Override // defpackage.yfa
    public final void c(java.lang.Object obj, defpackage.yfi yfiVar) {
        if (yfiVar == null || !yfiVar.a(obj, this)) {
            p(obj);
        } else {
            o(obj);
        }
    }

    protected abstract void d(java.lang.Object obj);

    @Override // defpackage.yfh
    public final android.graphics.drawable.Drawable e() {
        return ((android.widget.ImageView) this.a).getDrawable();
    }

    @Override // defpackage.yet, defpackage.yfa
    public final void ei(android.graphics.drawable.Drawable drawable) {
        this.b.p();
        android.graphics.drawable.Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    @Override // defpackage.yet, defpackage.yfa
    public final void h(android.graphics.drawable.Drawable drawable) {
        p(null);
        n(drawable);
    }

    @Override // defpackage.yet, defpackage.ydm
    public final void j() {
        android.graphics.drawable.Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.yet, defpackage.ydm
    public final void k() {
        android.graphics.drawable.Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.yfh
    public final void n(android.graphics.drawable.Drawable drawable) {
        ((android.widget.ImageView) this.a).setImageDrawable(drawable);
    }
}
