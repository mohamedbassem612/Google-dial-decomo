package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ges implements defpackage.gei {
    final /* synthetic */ androidx.preference.PreferenceGroup a;
    final /* synthetic */ defpackage.geu b;

    public ges(defpackage.geu geuVar, androidx.preference.PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
        this.b = geuVar;
    }

    @Override // defpackage.gei
    public final boolean a(androidx.preference.Preference preference) {
        this.a.o(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        this.b.y();
        return true;
    }
}
