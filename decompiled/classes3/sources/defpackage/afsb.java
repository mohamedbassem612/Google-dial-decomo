package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsb implements android.view.ViewGroup.OnHierarchyChangeListener {
    public android.view.ViewGroup.OnHierarchyChangeListener a;
    final /* synthetic */ com.google.android.material.chip.ChipGroup b;

    public afsb(com.google.android.material.chip.ChipGroup chipGroup) {
        j$.util.Objects.requireNonNull(chipGroup);
        this.b = chipGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        com.google.android.material.chip.ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof com.google.android.material.chip.Chip)) {
            if (view2.getId() == -1) {
                view2.setId(android.view.View.generateViewId());
            }
            defpackage.aftx aftxVar = chipGroup.a;
            com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) view2;
            aftxVar.a.put(java.lang.Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                aftxVar.e(chip);
            }
            chip.p(new defpackage.aprf(aftxVar));
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
        com.google.android.material.chip.ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof com.google.android.material.chip.Chip)) {
            defpackage.aftx aftxVar = chipGroup.a;
            com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) view2;
            chip.p(null);
            aftxVar.a.remove(java.lang.Integer.valueOf(chip.getId()));
            aftxVar.b.remove(java.lang.Integer.valueOf(chip.getId()));
        }
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
