package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class afke extends aw {
    public defpackage.amiv a;
    protected defpackage.amhw b;
    protected java.lang.Integer c;

    static android.os.Bundle a(defpackage.amiv amivVar, java.lang.Integer num, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("Question", amivVar.i());
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putInt("QuestionIndex", i);
        return bundle;
    }

    protected final defpackage.aflw b() {
        defpackage.aflw aflwVar;
        android.app.Activity activityB;
        java.lang.Object objZ = z();
        defpackage.aflw aflwVar2 = ((aw) this).E;
        if (aflwVar2 instanceof defpackage.aflw) {
            return aflwVar2;
        }
        if (!(objZ instanceof defpackage.aflw) || (activityB = (aflwVar = (defpackage.aflw) objZ).b()) == null || activityB.isFinishing() || activityB.isDestroyed()) {
            return null;
        }
        return aflwVar;
    }

    public abstract amig c();

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        android.view.LayoutInflater layoutInflaterAM = aM();
        aw awVar = ((aw) this).E;
        if (awVar == null || (bundle2 = awVar.m) == null) {
            return layoutInflaterAM;
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(layoutInflaterAM.getContext(), 2132085218);
        int i = bundle2.getInt("EmbeddedSurveyThemeOverlay", 0);
        if (i != 0) {
            contextThemeWrapper.getTheme().applyStyle(i, true);
        }
        return layoutInflaterAM.cloneInContext(contextThemeWrapper);
    }

    public void h(android.os.Bundle bundle) {
        super.h(bundle);
        android.os.Bundle bundle2 = ((aw) this).m;
        byte[] byteArray = bundle2.getByteArray("Question");
        if (byteArray != null) {
            this.a = afjz.c(defpackage.amiv.a, byteArray);
        }
        this.c = bundle2.containsKey("DisplayLogoResId") ? java.lang.Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null;
        bundle2.getInt("QuestionIndex");
        byte[] byteArray2 = bundle2.getByteArray("Completion");
        if (byteArray2 != null) {
            this.b = afjz.c(defpackage.amhw.b, byteArray2);
        }
    }

    public abstract void p();

    public abstract void q(java.lang.String str);

    public void f() {
    }
}
