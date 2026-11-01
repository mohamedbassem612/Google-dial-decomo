package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class afkw implements android.view.View.OnKeyListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afkw(afky afkyVar, int i) {
        this.$cid = i;
        this.a = afkyVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (this.$cid == 0) {
            if (i != 4) {
                return false;
            }
            afky afkyVar = (afky) this.a;
            afkyVar.j(afkyVar.d, afkyVar.k, afkyVar.h, afjz.l(afkyVar.f));
            afkyVar.b.dismissAllowingStateLoss();
            return afkyVar.j;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        androidx.preference.SeekBarPreference seekBarPreference = (androidx.preference.SeekBarPreference) this.a;
        if ((!seekBarPreference.e && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        android.widget.SeekBar seekBar = seekBarPreference.d;
        if (seekBar != null) {
            return seekBar.onKeyDown(i, keyEvent);
        }
        android.util.Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }

    public afkw(androidx.preference.SeekBarPreference seekBarPreference, int i) {
        this.$cid = i;
        this.a = seekBarPreference;
    }
}
