package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class agax {
    public defpackage.agal b;
    public boolean a = false;
    public android.graphics.RectF c = new android.graphics.RectF();
    public final android.graphics.Path d = new android.graphics.Path();

    public abstract void a(android.view.View view);

    public final void b() {
        if (this.c.left > this.c.right || this.c.top > this.c.bottom || this.b == null) {
            return;
        }
        defpackage.agam.a.c(this.b, null, 1.0f, this.c, null, this.d);
    }

    public abstract boolean c();
}
