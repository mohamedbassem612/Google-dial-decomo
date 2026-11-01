package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gri implements defpackage.grh {
    private final /* synthetic */ int $cid;
    public static final defpackage.gri b = new defpackage.gri(1);
    public static final defpackage.gri a = new defpackage.gri(0);

    private gri(int i) {
        this.$cid = i;
    }

    @Override // defpackage.grh
    public final defpackage.gqe a(android.app.Activity activity, defpackage.gre greVar) {
        if (this.$cid == 0) {
            if (activity == null) {
                defpackage.aooh.i("activity");
            }
            return b.a(activity, greVar);
        }
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        int i = defpackage.grd.a;
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        android.graphics.Rect rectM = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m((android.view.WindowManager) activity.getSystemService(android.view.WindowManager.class)));
        defpackage.aooh.e(rectM, "getBounds(...)");
        return new defpackage.gqe(new defpackage.gmv(rectM), greVar.a(activity));
    }

    @Override // defpackage.grh
    public final defpackage.gqe b(android.content.Context context, defpackage.gre greVar) {
        if (this.$cid == 0) {
            defpackage.aooh.f(context, "context");
            return b.b(context, greVar);
        }
        defpackage.aooh.f(context, "context");
        int i = defpackage.grd.a;
        defpackage.aooh.f(context, "context");
        android.graphics.Rect rectM = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m$1((android.view.WindowManager) context.getSystemService(android.view.WindowManager.class)));
        defpackage.aooh.e(rectM, "getBounds(...)");
        return new defpackage.gqe(new defpackage.gmv(rectM), greVar.a(context));
    }

    @Override // defpackage.grh
    public final defpackage.gqe c(android.view.WindowMetrics windowMetrics, float f) {
        if (this.$cid != 0) {
            defpackage.aooh.f(windowMetrics, "windowMetrics");
            android.graphics.Rect rectM = baa$.ExternalSyntheticApiModelOutline1.m(windowMetrics);
            defpackage.aooh.e(rectM, "getBounds(...)");
            return new defpackage.gqe(rectM, f);
        }
        defpackage.aooh.f(windowMetrics, "windowMetrics");
        android.graphics.Rect rectM2 = baa$.ExternalSyntheticApiModelOutline1.m(windowMetrics);
        defpackage.aooh.e(rectM2, "getBounds(...)");
        return new defpackage.gqe(rectM2, rp$.ExternalSyntheticApiModelOutline0.m(windowMetrics));
    }

    @Override // defpackage.grh
    public final defpackage.gqe d(android.content.Context context) {
        if (this.$cid == 0) {
            defpackage.aooh.f(context, "context");
            android.view.WindowManager windowManager = mp$.ExternalSyntheticApiModelOutline0.m(context) ? (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class) : (android.view.WindowManager) context.getApplicationContext().getSystemService(android.view.WindowManager.class);
            android.graphics.Rect rectM = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(windowManager));
            defpackage.aooh.e(rectM, "getBounds(...)");
            return new defpackage.gqe(rectM, rp$.ExternalSyntheticApiModelOutline0.m(baa$.ExternalSyntheticApiModelOutline1.m(windowManager)));
        }
        defpackage.aooh.f(context, "context");
        android.view.WindowManager windowManager2 = (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        android.graphics.Rect rectM2 = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(windowManager2));
        defpackage.aooh.e(rectM2, "getBounds(...)");
        return new defpackage.gqe(rectM2, f);
    }
}
