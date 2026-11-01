package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agae extends defpackage.ejy {
    private final int a;

    public agae(int i) {
        this.a = i;
    }

    @Override // defpackage.ejy
    public final /* bridge */ /* synthetic */ float a(java.lang.Object obj) {
        int i = defpackage.agaf.C;
        float[] fArr = ((defpackage.agaf) obj).A;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.ejy
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, float f) {
        defpackage.agaf agafVar = (defpackage.agaf) obj;
        int i = defpackage.agaf.C;
        float[] fArr = agafVar.A;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                aprf aprfVar = agafVar.B;
                if (aprfVar != null) {
                    float fY = agafVar.y() * 0.11f;
                    com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) aprfVar.a;
                    int i3 = (int) fY;
                    if (materialButton.h != i3) {
                        materialButton.h = i3;
                        materialButton.u();
                        materialButton.invalidate();
                    }
                }
                agafVar.invalidateSelf();
            }
        }
    }
}
