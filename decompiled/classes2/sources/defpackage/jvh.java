package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class jvh implements agye {
    final /* synthetic */ defpackage.jvk a;

    public jvh(defpackage.jvk jvkVar) {
        j$.util.Objects.requireNonNull(jvkVar);
        this.a = jvkVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.jvk.a.c(), "Error loading caller tag selector data", "com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorFragmentPeer$1", "onError", (char) 150, "CallerTagSelectorFragmentPeer.java", th, zct.b);
        this.a.c.f();
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        boolean z;
        defpackage.jvk jvkVar = this.a;
        defpackage.jvm jvmVar = (defpackage.jvm) obj;
        jvkVar.h = jvmVar;
        if (jvmVar.d.isEmpty() && jvmVar.e.isEmpty()) {
            a.bI(defpackage.jvk.a.c().m(aioa.b), "CallerTagSelector opened but no tags available", "com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorFragmentPeer$1", "onNewData", 'V', "CallerTagSelectorFragmentPeer.java", zct.b);
            jvkVar.c.f();
        }
        java.util.Iterator it = ahvr.aN(jvmVar.d).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            } else {
                jvkVar.e((zai) it.next(), 1).setChecked(false);
            }
        }
        java.util.Iterator it2 = ahvr.aN(jvmVar.e).iterator();
        while (it2.hasNext()) {
            jvkVar.e((zai) it2.next(), 2).setChecked(false);
        }
        defpackage.jvf jvfVar = jvkVar.c;
        android.view.View viewN = jvfVar.N();
        viewN.findViewById(2131429145).setVisibility(true != jvkVar.d() ? 8 : 0);
        viewN.findViewById(2131429144).setVisibility(true == jvkVar.d() ? 0 : 8);
        if (!jvkVar.d()) {
            viewN.findViewById(2131427452).setVisibility(0);
            jvkVar.a(true);
        }
        com.google.android.material.bottomsheet.BottomSheetBehavior.h(jvfVar.c().findViewById(2131427944)).w = !jvkVar.d();
        boolean zC = jvkVar.c();
        if (zC) {
            aca acaVar = jvkVar.g;
            zai zaiVar = jvmVar.f;
            if (zaiVar == null) {
                zaiVar = zai.a;
            }
            if (acaVar.containsKey(zaiVar)) {
                zai zaiVar2 = jvmVar.f;
                if (zaiVar2 == null) {
                    zaiVar2 = zai.a;
                }
                ((com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView) acaVar.get(zaiVar2)).setChecked(true);
                z = zC;
            } else {
                aimw aimwVarL = defpackage.jvk.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorFragmentPeer$1", "onNewData", 128, "CallerTagSelectorFragmentPeer.java");
                zai zaiVar3 = jvmVar.f;
                if (zaiVar3 == null) {
                    zaiVar3 = zai.a;
                }
                aimwVarL.y("Selected caller tag not present: %s", zaiVar3.b);
                jvkVar.d.a();
            }
        } else {
            z = zC;
        }
        android.view.View viewFindViewById = jvfVar.c().findViewById(2131429041);
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(z);
        }
        viewN.findViewById(2131428452).requestLayout();
    }

    public final /* synthetic */ void c() {
    }
}
