package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghi extends dye {
    final /* synthetic */ com.google.android.setupdesign.items.ExpandableItem a;

    public aghi(com.google.android.setupdesign.items.ExpandableItem expandableItem) {
        j$.util.Objects.requireNonNull(expandableItem);
        this.a = expandableItem;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        ebdVar.i(this.a.b ? ebc.j : ebc.i);
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.i(view, i, bundle);
        }
        com.google.android.setupdesign.items.ExpandableItem expandableItem = this.a;
        expandableItem.f(!expandableItem.b);
        return true;
    }
}
