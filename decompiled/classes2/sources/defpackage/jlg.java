package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jlg implements android.content.DialogInterface.OnShowListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jlg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        switch (this.$cid) {
            case 0:
                com.google.android.material.bottomsheet.BottomSheetBehavior.h(((afqy) this.a).requireViewById(2131427944)).t(3);
                break;
            case 1:
                afsq.cq((afqy) this.a);
                break;
            case 2:
                ((defpackage.cy) dialogInterface).b(-1).setEnabled(defpackage.jum.a(j$.util.Optional.ofNullable(((com.google.android.material.textfield.TextInputEditText) this.a).getEditableText())));
                break;
            case 3:
                afsq.cq((afqy) this.a);
                break;
            case 4:
                ((android.widget.TextView) ((android.view.View) this.a).findViewById(2131427799)).setMovementMethod(new android.text.method.LinkMovementMethod());
                break;
            case 5:
                android.view.View viewFindViewById = ((defpackage.ds) this.a).findViewById(2131427944);
                if (viewFindViewById != null) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.h(viewFindViewById).t(3);
                }
                break;
            case 6:
                ((android.widget.EditText) this.a).requestFocus();
                ((defpackage.cy) dialogInterface).b(-1).setEnabled(false);
                break;
            case 7:
                android.view.View viewFindViewById2 = ((defpackage.ds) this.a).findViewById(2131427944);
                if (viewFindViewById2 != null) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior.h(viewFindViewById2).t(3);
                }
                break;
            case 8:
                afsq.cq((afqy) this.a);
                break;
            case 9:
                j$.util.Optional optionalA = ((rcm) this.a).a();
                if (true == optionalA.isPresent()) {
                    ((qvo) optionalA.get()).d.b(mce.bf);
                }
                break;
            case 10:
                ((com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) this.a).o();
                break;
            case 11:
                ((android.widget.TextView) ((android.app.Dialog) this.a).findViewById(android.R.id.message)).setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                break;
            case 12:
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a).t.n(rmw.ck);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a).t.n(rmw.co);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a).t.n(rmw.ch);
                break;
            default:
                this.a.run();
                break;
        }
    }
}
