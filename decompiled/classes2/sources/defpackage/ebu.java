package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ebu {
    public final int a;
    public final defpackage.ebt b = new defpackage.ebt();
    public dwn c;
    public dwn d;
    public java.lang.Object e;

    static {
        new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new android.view.animation.PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new android.view.animation.PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public ebu() {
        dwn dwnVar = dwn.a;
        this.c = dwnVar;
        this.d = dwnVar;
        this.e = null;
        this.a = 2;
    }

    public void b() {
        throw null;
    }

    final void d(float f) {
        defpackage.ebt ebtVar = this.b;
        if (ebtVar.f != f) {
            ebtVar.f = f;
            defpackage.ebw ebwVar = ebtVar.g;
            if (ebwVar != null) {
                ((android.view.View) ebwVar.b).setAlpha(f);
            }
        }
    }

    final void e(float f) {
        defpackage.ebt ebtVar = this.b;
        float f2 = (-(1.0f - f)) * ebtVar.a;
        if (ebtVar.e != f2) {
            ebtVar.e = f2;
            defpackage.ebw ebwVar = ebtVar.g;
            if (ebwVar != null) {
                ((android.view.View) ebwVar.b).setTranslationY(f2);
            }
        }
    }

    final void f(boolean z) {
        defpackage.ebt ebtVar = this.b;
        if (ebtVar.c != z) {
            ebtVar.c = z;
            defpackage.ebw ebwVar = ebtVar.g;
            if (ebwVar != null) {
                ((android.view.View) ebwVar.b).setVisibility(true != z ? 8 : 0);
            }
        }
    }

    public void a() {
    }

    public int c(int i) {
        return i;
    }
}
