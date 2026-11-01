package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afya extends ejy {
    public final /* bridge */ /* synthetic */ float a(java.lang.Object obj) {
        int i = defpackage.afyb.h;
        return ((defpackage.afyb) obj).b() * 10000.0f;
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, float f) {
        defpackage.afyb afybVar = (defpackage.afyb) obj;
        int i = defpackage.afyb.h;
        afybVar.d(f / 10000.0f);
        if (afybVar.j.c(true)) {
            if (afybVar.d == null) {
                android.content.Context context = afybVar.i;
                android.animation.TimeInterpolator timeInterpolator = afpc.a;
                afybVar.f = agab.C(context, 2130970077, timeInterpolator);
                afybVar.g = agab.C(context, 2130970069, timeInterpolator);
                afybVar.d = new android.animation.ValueAnimator();
                afybVar.d.setDuration(500L);
                afybVar.d.setFloatValues(0.0f, 1.0f);
                afybVar.d.setInterpolator(null);
                afybVar.d.addUpdateListener(new mh(afybVar, 18, (byte[]) null));
            }
            float fA = afybVar.a((int) f);
            if (fA == afybVar.c) {
                if (afybVar.d.isRunning()) {
                    return;
                }
                afybVar.c(fA);
                return;
            }
            if (afybVar.d.isRunning()) {
                afybVar.d.cancel();
            }
            afybVar.c = fA;
            if (fA == 1.0f) {
                afybVar.e = afybVar.f;
                afybVar.d.start();
            } else {
                afybVar.e = afybVar.g;
                afybVar.d.reverse();
            }
        }
    }
}
