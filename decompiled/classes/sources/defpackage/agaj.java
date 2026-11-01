package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agaj extends defpackage.agab {
    public final float a = -1.0f;

    @Override // defpackage.agab
    public final void b(defpackage.agav agavVar, float f, float f2) {
        float f3 = f2 * f;
        agavVar.e(0.0f, f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        defpackage.agar agarVar = new defpackage.agar(0.0f, 0.0f, f4, f4);
        agarVar.e = 180.0f;
        agarVar.f = 90.0f;
        agavVar.g.add(agarVar);
        agavVar.b(new defpackage.agap(agarVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        agavVar.c = ((-1.8369701E-16f) * f6) + f7;
        agavVar.d = f7 + (f6 * (-1.0f));
    }
}
