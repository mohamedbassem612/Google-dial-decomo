package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftx {
    public final java.util.Map a = new java.util.HashMap();
    public final java.util.Set b = new java.util.HashSet();
    public boolean c;
    public boolean d;
    public defpackage.aprf e;

    public final java.util.List a(android.view.ViewGroup viewGroup) {
        java.util.Set setB = b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof defpackage.afuh) && setB.contains(java.lang.Integer.valueOf(childAt.getId()))) {
                arrayList.add(java.lang.Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final java.util.Set b() {
        return new java.util.HashSet(this.b);
    }

    public final void c() {
        boolean zIsEmpty = this.b.isEmpty();
        java.util.Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            f((defpackage.afuh) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        d();
    }

    public final void d() {
        defpackage.aprf aprfVar = this.e;
        if (aprfVar != null) {
            b();
            java.lang.Object obj = aprfVar.a;
            com.google.android.material.chip.ChipGroup chipGroup = (com.google.android.material.chip.ChipGroup) obj;
            defpackage.rai raiVar = chipGroup.b;
            if (raiVar != null) {
                ((android.widget.Button) ft$.ExternalSyntheticApiModelOutline0.m((android.view.View) raiVar.a, 2131428709)).setEnabled(!chipGroup.a.a((android.view.ViewGroup) obj).isEmpty());
            }
        }
    }

    public final boolean e(defpackage.afuh afuhVar) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(afuhVar.getId());
        java.util.Set set = this.b;
        boolean zAdd = false;
        if (!set.contains(numValueOf)) {
            java.util.Map map = this.a;
            int iIntValue = -1;
            if (this.c && !set.isEmpty()) {
                iIntValue = ((java.lang.Integer) set.iterator().next()).intValue();
            }
            defpackage.afuh afuhVar2 = (defpackage.afuh) map.get(java.lang.Integer.valueOf(iIntValue));
            if (afuhVar2 != null) {
                f(afuhVar2, false);
            }
            zAdd = set.add(numValueOf);
            if (!afuhVar.isChecked()) {
                afuhVar.setChecked(true);
            }
        }
        return zAdd;
    }

    public final boolean f(defpackage.afuh afuhVar, boolean z) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(afuhVar.getId());
        java.util.Set set = this.b;
        if (!set.contains(numValueOf)) {
            return false;
        }
        if (z && set.size() == 1 && set.contains(numValueOf)) {
            afuhVar.setChecked(true);
            return false;
        }
        boolean zRemove = set.remove(numValueOf);
        if (afuhVar.isChecked()) {
            afuhVar.setChecked(false);
        }
        return zRemove;
    }
}
