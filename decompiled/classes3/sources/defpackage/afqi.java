package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqi implements ebo {
    final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior a;

    public afqi(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior) {
        j$.util.Objects.requireNonNull(swipeDismissBehavior);
        this.a = swipeDismissBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    public final boolean a(android.view.View view) {
        int width;
        defpackage.aprf aprfVar;
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.a;
        boolean z = false;
        if (!swipeDismissBehavior.e(view)) {
            return false;
        }
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.c;
        if (i == 0) {
            if (z2) {
                width = -view.getWidth();
            }
            int i2 = dzs.a;
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            aprfVar = swipeDismissBehavior.f;
            if (aprfVar != null) {
                aprfVar.l(view);
            }
            return true;
        }
        z = z2;
        if (i != 1 || z) {
            width = view.getWidth();
        } else {
            width = -view.getWidth();
        }
        int i3 = dzs.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        aprfVar = swipeDismissBehavior.f;
        if (aprfVar != null) {
            aprfVar.l(view);
        }
        return true;
    }
}
