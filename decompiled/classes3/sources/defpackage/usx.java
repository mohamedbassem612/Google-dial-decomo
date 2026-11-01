package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class usx implements agye {
    final /* synthetic */ defpackage.usy a;

    public usx(defpackage.usy usyVar) {
        j$.util.Objects.requireNonNull(usyVar);
        this.a = usyVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.usy.a.c(), "failed fetching call history", "com/android/dialer/timekeeper/impl/feedback/TimeKeeperFeedbackQuickSurveyFragmentPeer$3", "onError", (char) 235, "TimeKeeperFeedbackQuickSurveyFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.usy usyVar = this.a;
        j$.util.Optional optional = (j$.util.Optional) obj;
        usyVar.g = optional;
        if (!optional.isPresent() || ((defpackage.uru) optional.orElseThrow()).g) {
            usyVar.a();
        } else {
            defpackage.usw uswVar = usyVar.e;
            android.view.View viewN = uswVar.N();
            android.widget.TextView textView = (android.widget.TextView) viewN.findViewById(2131427547);
            android.widget.TextView textView2 = (android.widget.TextView) viewN.findViewById(2131427543);
            defpackage.urw urwVar = ((defpackage.uru) optional.orElseThrow()).d;
            if (urwVar == null) {
                urwVar = defpackage.urw.a;
            }
            defpackage.urv urvVar = urwVar.c;
            if (urvVar == null) {
                urvVar = defpackage.urv.a;
            }
            java.lang.CharSequence text = uswVar.z().getText(2132018694);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            java.lang.CharSequence charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(text, java.lang.String.valueOf(((long) urvVar.d) / 60));
            textView.setText(android.text.TextUtils.expandTemplate(uswVar.z().getText(2132018693), new java.lang.CharSequence[0]));
            textView2.setText(charSequenceExpandTemplate);
            viewN.setVisibility(0);
        }
        if (optional.isPresent()) {
            akzx akzxVarM = amrw.a.m();
            int i = ((defpackage.uru) optional.orElseThrow()).h;
            akzxVarM.u();
            amrw amrwVar = akzxVarM.b;
            amrwVar.b |= 8;
            amrwVar.f = i;
            akzx akzxVarM2 = defpackage.amrv.a.m();
            defpackage.urw urwVar2 = ((defpackage.uru) optional.orElseThrow()).d;
            if (urwVar2 == null) {
                urwVar2 = defpackage.urw.a;
            }
            defpackage.urv urvVar2 = urwVar2.c;
            if (urvVar2 == null) {
                urvVar2 = defpackage.urv.a;
            }
            int i2 = urvVar2.c;
            akzxVarM2.u();
            defpackage.amrv amrvVar = (defpackage.amrv) akzxVarM2.b;
            amrvVar.b |= 1;
            amrvVar.c = i2;
            defpackage.urw urwVar3 = ((defpackage.uru) optional.orElseThrow()).d;
            if (urwVar3 == null) {
                urwVar3 = defpackage.urw.a;
            }
            defpackage.urv urvVar3 = urwVar3.c;
            if (urvVar3 == null) {
                urvVar3 = defpackage.urv.a;
            }
            int i3 = urvVar3.d;
            akzxVarM2.u();
            defpackage.amrv amrvVar2 = (defpackage.amrv) akzxVarM2.b;
            amrvVar2.b |= 2;
            amrvVar2.d = i3;
            defpackage.amrv amrvVar3 = (defpackage.amrv) akzxVarM2.p();
            akzxVarM.u();
            amrw amrwVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(amrvVar3);
            amrwVar2.d = amrvVar3;
            amrwVar2.b |= 2;
            java.lang.String str = ((defpackage.uru) optional.orElseThrow()).e;
            akzxVarM.u();
            amrw amrwVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            amrwVar3.b |= 1;
            amrwVar3.c = str;
            akzxVarM.u();
            amrw amrwVar4 = akzxVarM.b;
            amrwVar4.g = 1;
            amrwVar4.b |= 16;
            usyVar.f = j$.util.Optional.of(akzxVarM.p());
        }
    }

    public final /* synthetic */ void c() {
    }
}
