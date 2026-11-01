package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class acjr implements android.content.DialogInterface.OnShowListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ acjr(ahpz ahpzVar, android.content.DialogInterface.OnShowListener onShowListener, int i) {
        this.$cid = i;
        this.a = ahpzVar;
        this.c = "OnShowListener called from Revelio confirmation dialog";
        this.b = onShowListener;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.content.DialogInterface$OnShowListener, java.lang.Object] */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        int i = this.$cid;
        if (i == 0) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorH = com.google.android.material.bottomsheet.BottomSheetBehavior.h(((defpackage.ds) this.a).findViewById(2131427944));
            android.app.Activity activity = (android.app.Activity) this.b;
            bottomSheetBehaviorH.C(aofv.j(activity, true, activity.findViewById(android.R.id.content).getHeight()));
            bottomSheetBehaviorH.t(3);
            bottomSheetBehaviorH.w = true;
            bottomSheetBehaviorH.s(true);
            this.c.run();
            return;
        }
        if (i != 1) {
            ahok ahokVarF = ((ahpz) this.a).f(868, (java.lang.String) this.c);
            try {
                this.b.onShow(dialogInterface);
                ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                return;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahokVarF, th);
                    throw th2;
                }
            }
        }
        java.lang.Object obj = this.a;
        aooh.c(obj);
        defpackage.cy cyVar = (defpackage.cy) obj;
        android.widget.Button buttonB = cyVar.b(-1);
        buttonB.setEnabled(false);
        cyVar.requireViewById(2131429147).addTextChangedListener(new defpackage.jul(buttonB, 1));
        java.lang.Object obj2 = this.b;
        java.lang.String string = obj2 != null ? ((android.os.Bundle) obj2).getString("saved_input_text") : null;
        com.google.android.material.textfield.TextInputEditText textInputEditTextRequireViewById = cyVar.requireViewById(2131429147);
        if (string == null) {
            string = ((defpackage.jly) this.c).b.d;
            aooh.e(string, "getScamSuggestionText(...)");
        }
        textInputEditTextRequireViewById.setText(string);
    }

    public /* synthetic */ acjr(afqy afqyVar, android.app.Activity activity, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = afqyVar;
        this.b = activity;
        this.c = runnable;
    }

    public /* synthetic */ acjr(defpackage.jly jlyVar, defpackage.cy cyVar, android.os.Bundle bundle, int i) {
        this.$cid = i;
        this.c = jlyVar;
        this.a = cyVar;
        this.b = bundle;
    }
}
