package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hww implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;

    public hww(int i) {
        this.$cid = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(view, "view");
            ahvr.j(defpackage.hwu.a, view);
            return;
        }
        if (i == 1) {
            aooh.f(view, "view");
            ahvr.j(defpackage.hwt.a, view);
            return;
        }
        if (i == 3) {
            defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer", "showDeleteContactSnackbar", 418, "SelectedContactNumbersFragmentPeer.java").v("contact delete undo triggered");
            return;
        }
        if (i == 5) {
            com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "onNotVisibleRttConfigClick", 185, "RttSettingsPreferenceCompat.java").v("onNotVisibleRttConfigClick");
            view.findViewById(2131428830).performClick();
        } else if (i == 6) {
            com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "onVisibleDuringCallRttConfigClick", 190, "RttSettingsPreferenceCompat.java").v("onVisibleDuringCallRttConfigClick");
            view.findViewById(2131428831).performClick();
        } else if (i == 7) {
            com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "onAlwaysVisibleRttConfigClick", 195, "RttSettingsPreferenceCompat.java").v("onAlwaysVisibleRttConfigClick");
            view.findViewById(2131428829).performClick();
        }
    }
}
