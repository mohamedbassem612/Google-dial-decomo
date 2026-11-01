package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
public final class lpa extends aw {
    public static final aimz a = aimz.i("com/android/dialer/common/concurrent/SupportUiListener");
    private final java.util.Set b = ahvr.ar();

    public static defpackage.lpa a(bo boVar, java.lang.String str) {
        defpackage.lpa lpaVar = (defpackage.lpa) boVar.e(str);
        if (lpaVar != null) {
            return lpaVar;
        }
        a.b().l("com/android/dialer/common/concurrent/SupportUiListener", "create", 83, "SupportUiListener.java").y("creating new SupportUiListener for %s", str);
        defpackage.lpa lpaVar2 = new defpackage.lpa();
        u uVar = new u(boVar);
        uVar.e(0, lpaVar2, str, 1);
        uVar.i(true, true);
        return lpaVar2;
    }

    public final void b(android.content.Context context, ajcq ajcqVar, defpackage.lot lotVar, defpackage.los losVar) {
        defpackage.loy loyVar = new defpackage.loy(lotVar, losVar);
        ahvr.ci(ajcqVar);
        ahvr.J(ajcqVar, loyVar, ((loz) agab.aH(context, loz.class)).fI());
        this.b.add(loyVar);
    }

    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        int i = defpackage.eku.a;
        defpackage.eky ekyVar = new defpackage.eky(this);
        defpackage.eku.d(ekyVar);
        defpackage.ekt ektVarB = defpackage.eku.b(this);
        if (ektVarB.b.contains(defpackage.eks.f) && defpackage.eku.e(ektVarB, getClass(), ekyVar.getClass())) {
            defpackage.eku.c(ektVarB, ekyVar);
        }
        ((aw) this).K = true;
        bo boVar = ((aw) this).B;
        if (boVar != null) {
            boVar.z.a(this);
        } else {
            ((aw) this).L = true;
        }
    }

    public final void j() {
        super.j();
        a.b().l("com/android/dialer/common/concurrent/SupportUiListener", "onDetach", 154, "SupportUiListener.java").v("onDetach");
        for (defpackage.loy loyVar : this.b) {
            loyVar.a = null;
            loyVar.b = null;
        }
    }
}
