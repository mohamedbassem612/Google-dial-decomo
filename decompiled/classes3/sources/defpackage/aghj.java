package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghj extends dye {
    final /* synthetic */ com.google.android.setupdesign.items.ExpandableSwitchItem a;

    public aghj(com.google.android.setupdesign.items.ExpandableSwitchItem expandableSwitchItem) {
        j$.util.Objects.requireNonNull(expandableSwitchItem);
        this.a = expandableSwitchItem;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        if (view.getId() == 2131429090) {
            java.lang.String string = java.lang.Integer.toString(this.a.c);
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                ebdVar.a.setUniqueId(string);
            } else {
                ebdVar.a.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", string);
            }
        }
        ebdVar.i(this.a.b ? ebc.j : ebc.i);
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.i(view, i, bundle);
        }
        com.google.android.setupdesign.items.ExpandableSwitchItem expandableSwitchItem = this.a;
        expandableSwitchItem.f(!expandableSwitchItem.b);
        return true;
    }
}
