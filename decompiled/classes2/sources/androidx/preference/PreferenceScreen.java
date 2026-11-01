package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class PreferenceScreen extends androidx.preference.PreferenceGroup {
    public final boolean e;

    public PreferenceScreen(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, dvf.h(context, 2130970250, android.R.attr.preferenceScreenStyle));
        this.e = true;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        defpackage.gex gexVar;
        if (this.t != null || this.u != null || k() == 0 || (gexVar = this.k.g) == null) {
            return;
        }
        gexVar.aV();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public final boolean q() {
        return false;
    }
}
