package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gfe implements android.widget.CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public gfe(androidx.preference.TwoStatePreference twoStatePreference, int i) {
        this.$cid = i;
        this.a = twoStatePreference;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Type inference failed for: r4v14, types: [afuh, java.lang.Object] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            if (((androidx.preference.Preference) obj).U(java.lang.Boolean.valueOf(z))) {
                ((androidx.preference.TwoStatePreference) obj).k(z);
                return;
            } else {
                compoundButton.setChecked(!z);
                return;
            }
        }
        if (i == 1) {
            java.lang.Object obj2 = this.a;
            if (((androidx.preference.Preference) obj2).U(java.lang.Boolean.valueOf(z))) {
                ((androidx.preference.TwoStatePreference) obj2).k(z);
                return;
            } else {
                compoundButton.setChecked(!z);
                return;
            }
        }
        if (i == 2) {
            java.lang.Object obj3 = this.a;
            if (((androidx.preference.Preference) obj3).U(java.lang.Boolean.valueOf(z))) {
                ((androidx.preference.TwoStatePreference) obj3).k(z);
                return;
            } else {
                compoundButton.setChecked(!z);
                return;
            }
        }
        if (i == 3) {
            aooh.f(compoundButton, "<unused var>");
            java.lang.Object obj4 = this.a;
            if (z) {
                ((com.google.android.material.chip.Chip) obj4).j((android.graphics.drawable.Drawable) null);
                return;
            } else {
                ((com.google.android.material.chip.Chip) obj4).k(2131231975);
                return;
            }
        }
        if (i == 4) {
            ((defpackage.lvk) this.a).am = z;
            return;
        }
        if (i == 5) {
            aooh.f(compoundButton, "buttonView");
            ((defpackage.nwp) this.a).d = z;
            return;
        }
        ?? r4 = this.a;
        com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) r4;
        aprf aprfVar = chip.g;
        if (aprfVar != null) {
            if (!z) {
                aftx aftxVar = (aftx) aprfVar.a;
                if (aftxVar.f((afuh) r4, aftxVar.d)) {
                    ((aftx) aprfVar.a).d();
                }
            } else if (((aftx) aprfVar.a).e((afuh) r4)) {
                ((aftx) aprfVar.a).d();
            }
        }
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.d;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    public /* synthetic */ gfe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
