package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrm extends dye {
    final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup a;

    public afrm(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup) {
        j$.util.Objects.requireNonNull(materialButtonToggleGroup);
        this.a = materialButtonToggleGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(android.view.View view, ebd ebdVar) {
        int i;
        super.c(view, ebdVar);
        if (view instanceof com.google.android.material.button.MaterialButton) {
            int i2 = 0;
            i = 0;
            while (true) {
                com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = this.a;
                if (i2 >= materialButtonToggleGroup.getChildCount()) {
                    break;
                }
                if (materialButtonToggleGroup.getChildAt(i2) != view) {
                    if ((materialButtonToggleGroup.getChildAt(i2) instanceof com.google.android.material.button.MaterialButton) && materialButtonToggleGroup.k(i2)) {
                        i++;
                    }
                    i2++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        ebdVar.v(ni.r(0, 1, i, 1, false, ((com.google.android.material.button.MaterialButton) view).f));
    }
}
