package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bg extends defpackage.na {
    final /* synthetic */ defpackage.bo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(defpackage.bo boVar) {
        super(false);
        this.a = boVar;
    }

    @Override // defpackage.na
    public final void a() {
        if (defpackage.bo.Z(3)) {
            android.util.Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + defpackage.bo.a + " fragment manager " + this.a);
        }
        if (defpackage.bo.a) {
            this.a.p();
        }
    }

    @Override // defpackage.na
    public final void b() {
        int i;
        if (defpackage.bo.Z(3)) {
            android.util.Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + defpackage.bo.a + " fragment manager " + this.a);
        }
        defpackage.bo boVar = this.a;
        boVar.h = true;
        boVar.ak(true);
        boVar.h = false;
        if (!defpackage.bo.a || boVar.g == null) {
            if (boVar.i.b) {
                if (defpackage.bo.Z(3)) {
                    android.util.Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                boVar.al(null, 0);
                return;
            } else {
                if (defpackage.bo.Z(3)) {
                    android.util.Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                boVar.f.e();
                return;
            }
        }
        if (!boVar.k.isEmpty()) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.bo.ag(boVar.g));
            java.util.ArrayList arrayList = boVar.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                java.util.Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                    }
                }
                i2 = i;
            }
        }
        java.util.ArrayList arrayList2 = boVar.g.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            defpackage.aw awVar = ((defpackage.bv) arrayList2.get(i3)).b;
            if (awVar != null) {
                awVar.t = false;
            }
        }
        for (defpackage.ck ckVar : boVar.l(new java.util.ArrayList(java.util.Collections.singletonList(boVar.g)), 0, 1)) {
            if (defpackage.bo.Z(3)) {
                android.util.Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            java.util.List list = ckVar.c;
            ckVar.h(list);
            ckVar.d(list);
        }
        java.util.ArrayList arrayList3 = boVar.g.d;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            defpackage.aw awVar2 = ((defpackage.bv) arrayList3.get(i4)).b;
            if (awVar2 != null && awVar2.P == null) {
                boVar.j(awVar2).e();
            }
        }
        boVar.g = null;
        boVar.U();
        if (defpackage.bo.Z(3)) {
            android.util.Log.d("FragmentManager", "Op is being set to null");
            android.util.Log.d("FragmentManager", "OnBackPressedCallback enabled=" + boVar.i.b + " for  FragmentManager " + boVar);
        }
    }

    @Override // defpackage.na
    public final void c(mk mkVar) {
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + defpackage.bo.a + " fragment manager " + this.a);
        }
        defpackage.bo boVar = this.a;
        defpackage.u uVar = boVar.g;
        if (uVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Collections.singletonList(uVar));
            for (defpackage.ck ckVar : boVar.l(arrayList, 0, 1)) {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + mkVar.b);
                }
                java.util.List list = ckVar.c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    defpackage.ajsz.bv(arrayList2, ((defpackage.cj) it.next()).g);
                }
                java.util.List listBZ = defpackage.ajsz.bZ(defpackage.ajsz.cf(arrayList2));
                int size = listBZ.size();
                for (int i = 0; i < size; i++) {
                    ((ch) listBZ.get(i)).c(mkVar, ckVar.a);
                }
            }
            java.util.ArrayList arrayList3 = boVar.k;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
            }
        }
    }

    @Override // defpackage.na
    public final void d() {
        if (defpackage.bo.Z(3)) {
            android.util.Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + defpackage.bo.a + " fragment manager " + this.a);
        }
        if (defpackage.bo.a) {
            defpackage.bo boVar = this.a;
            boVar.H();
            boVar.I(new bn(boVar), false);
        }
    }
}
