package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrf extends ejy {
    public final /* synthetic */ float a(java.lang.Object obj) {
        int i = com.google.android.material.button.MaterialButton.o;
        return ((com.google.android.material.button.MaterialButton) obj).m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    public final /* synthetic */ void b(java.lang.Object obj, float f) {
        ?? r2 = (com.google.android.material.button.MaterialButton) obj;
        int i = com.google.android.material.button.MaterialButton.o;
        if (r2.m != f) {
            r2.m = f;
            r2.u();
            r2.invalidate();
            if (r2.getParent() instanceof defpackage.afrk) {
                defpackage.afrk afrkVar = (defpackage.afrk) r2.getParent();
                int i2 = (int) r2.m;
                int iIndexOfChild = afrkVar.indexOfChild(r2);
                if (iIndexOfChild >= 0) {
                    com.google.android.material.button.MaterialButton materialButtonI = afrkVar.i(iIndexOfChild);
                    com.google.android.material.button.MaterialButton materialButtonH = afrkVar.h(iIndexOfChild);
                    if (materialButtonI == null) {
                        if (materialButtonH == null) {
                            return;
                        } else {
                            materialButtonH.l(i2);
                        }
                    }
                    if (materialButtonH == null) {
                        materialButtonI.l(i2);
                    }
                    if (materialButtonI == null || materialButtonH == null) {
                        return;
                    }
                    materialButtonI.l(i2 / 2);
                    materialButtonH.l((i2 + 1) / 2);
                }
            }
        }
    }
}
