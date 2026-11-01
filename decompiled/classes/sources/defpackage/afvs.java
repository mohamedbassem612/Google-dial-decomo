package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class afvs {
    public final android.view.View a;
    public final int b;
    public final int c;
    protected final int d;
    public mk e;
    private final android.animation.TimeInterpolator f = new android.view.animation.PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    public afvs(android.view.View view) {
        this.a = view;
        android.content.Context context = view.getContext();
        this.b = defpackage.agab.v(context.getTheme(), 2130970059, 300);
        this.c = defpackage.agab.v(context.getTheme(), 2130970064, 150);
        this.d = defpackage.agab.v(context.getTheme(), 2130970063, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final mk b() {
        if (this.e == null) {
            android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        mk mkVar = this.e;
        this.e = null;
        return mkVar;
    }

    public final mk c() {
        mk mkVar = this.e;
        this.e = null;
        return mkVar;
    }

    protected final mk d(mk mkVar) {
        if (this.e == null) {
            android.util.Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        mk mkVar2 = this.e;
        this.e = mkVar;
        return mkVar2;
    }
}
