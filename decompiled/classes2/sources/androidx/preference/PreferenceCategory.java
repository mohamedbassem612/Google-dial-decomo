package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class PreferenceCategory extends androidx.preference.PreferenceGroup {
    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, dvf.h(context, 2130970243, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean X() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        super.a(gfcVar);
        ft$.ExternalSyntheticApiModelOutline0.m(gfcVar.a, true);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.X();
    }

    public PreferenceCategory(android.content.Context context) {
        this(context, null);
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
