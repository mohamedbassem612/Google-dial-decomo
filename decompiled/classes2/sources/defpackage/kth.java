package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kth {
    public static final aimz a = aimz.i("com/android/dialer/callqualityrating/impl/CallQualityRatingActivityPeer");
    public defpackage.ktx b;
    public final com.android.dialer.callqualityrating.impl.CallQualityRatingActivity c;
    public final zjm d;
    private java.lang.String e;
    private final zzd f;
    private final zzd g;
    private final zzd h;
    private final aoin i;
    private final defpackage.ktj j;
    private final defpackage.ktk k;
    private final rai l;
    private final rai m;

    public kth(com.android.dialer.callqualityrating.impl.CallQualityRatingActivity callQualityRatingActivity, zjm zjmVar, defpackage.ktj ktjVar, defpackage.ktk ktkVar, zzd zzdVar, zzd zzdVar2, zzd zzdVar3, aoin aoinVar, rai raiVar, rai raiVar2) {
        this.c = callQualityRatingActivity;
        this.d = zjmVar;
        this.j = ktjVar;
        this.k = ktkVar;
        this.f = zzdVar;
        this.g = zzdVar2;
        this.h = zzdVar3;
        this.i = aoinVar;
        this.m = raiVar;
        this.l = raiVar2;
    }

    private final defpackage.ktw g() {
        java.lang.String strH = h();
        if (!"CARRIERSERVICES".equals(strH)) {
            if (!"CONNECTIVITYMONITOR".equals(strH)) {
                return this.b;
            }
            rai raiVar = this.l;
            com.android.dialer.callqualityrating.impl.CallQualityRatingActivity callQualityRatingActivity = this.c;
            return new defpackage.ktv(callQualityRatingActivity.getApplicationContext(), callQualityRatingActivity.getIntent(), this.h, ((hjc) raiVar.a).a.dK());
        }
        com.android.dialer.callqualityrating.impl.CallQualityRatingActivity callQualityRatingActivity2 = this.c;
        android.os.Bundle bundleExtra = callQualityRatingActivity2.getIntent().getBundleExtra("call_info_bundle");
        java.lang.String string = bundleExtra != null ? bundleExtra.getString("clearcut_log_source", "") : "";
        boolean zEquals = string.equals("NOVA_VOICE");
        rai raiVar2 = this.m;
        if (zEquals) {
            return raiVar2.j(callQualityRatingActivity2.getIntent(), this.g, string);
        }
        return raiVar2.j(callQualityRatingActivity2.getIntent(), this.f, string);
    }

    private final java.lang.String h() {
        android.os.Bundle bundleExtra = this.c.getIntent().getBundleExtra("call_info_bundle");
        if (bundleExtra == null) {
            return null;
        }
        return bundleExtra.getString("com.google.android.ims.caller_source", "");
    }

    private final void i(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.google.android.ims.receivers.FEEDBACK_UNSUBSCRIBE");
        intent.setPackage(str);
        this.c.sendBroadcast(intent);
    }

    public final int a() {
        return this.c.getIntent().getIntExtra("rating", 0);
    }

    public final void b(java.lang.String str) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/callqualityrating/impl/CallQualityRatingActivityPeer", "onCallIssueSelected", 216, "CallQualityRatingActivityPeer.java").v("showing issues");
        this.e = str;
        defpackage.ktw ktwVarG = g();
        com.android.dialer.callqualityrating.impl.CallQualityRatingActivity callQualityRatingActivity = this.c;
        ktwVarG.b(str, callQualityRatingActivity.getResources());
        if (!((java.lang.Boolean) this.i.a()).booleanValue() || !"CARRIERSERVICES".equals(h())) {
            callQualityRatingActivity.finish();
            return;
        }
        aimzVar.b().l("com/android/dialer/callqualityrating/impl/CallQualityRatingActivityPeer", "sendFeedback", 150, "CallQualityRatingActivityPeer.java").y("Canned description: %s", str);
        defpackage.ktk ktkVar = this.k;
        defpackage.ktj ktjVar = this.j;
        ktjVar.c("rating", "1");
        ktjVar.c("call_issue", this.e);
        android.os.Bundle bundleExtra = callQualityRatingActivity.getIntent().getBundleExtra("call_info_bundle");
        for (java.lang.String str2 : bundleExtra.keySet()) {
            ktjVar.c(str2, java.lang.String.valueOf(bundleExtra.get(str2)));
        }
        aalu aaluVar = ktkVar.c;
        ktjVar.a = bundleExtra.getString("com.google.android.ims.sip_call_id", "");
        aaluVar.b(ktjVar, false);
        aaluVar.c = str;
        aaluVar.d = "com.google.android.ims.CALL_FEEDBACK_CS_BUG";
        aaluVar.f = new com.google.android.gms.feedback.LogOptions((java.lang.String) null, true, false, false, false, (com.google.android.gms.feedback.ServiceDumpRequest[]) null, false);
        com.google.android.gms.feedback.FeedbackOptions feedbackOptionsA = aaluVar.a();
        defpackage.ktk.a.b().l("com/android/dialer/callqualityrating/impl/CallQualityRatingFeedbackSenderImpl", "sendFeedbackImpl", 79, "CallQualityRatingFeedbackSenderImpl.java").v("calling startFeedback");
        android.content.Context context = ktkVar.b;
        acxg acxgVar = aals.a;
        ahvr.J(aazc.e(new aawd(context).m(feedbackOptionsA, (uwk) null)), new defpackage.jya(ktkVar, 2), ktkVar.d);
        callQualityRatingActivity.finish();
    }

    public final void c() {
        a.b().l("com/android/dialer/callqualityrating/impl/CallQualityRatingActivityPeer", "onGoodCallRatingSelected", 188, "CallQualityRatingActivityPeer.java").v("Good rating selected");
        g().a();
        this.c.finish();
    }

    public final void d() {
        this.c.finish();
    }

    public final void e() {
        a.b().l("com/android/dialer/callqualityrating/impl/CallQualityRatingActivityPeer", "onUnsubscribeSelected", 202, "CallQualityRatingActivityPeer.java").v("sending unsubscribe broadcast");
        g().c();
        java.lang.String strH = h();
        if ("CARRIERSERVICES".equals(strH)) {
            i("com.google.android.ims");
            i("com.google.android.apps.tycho");
        } else if ("CONNECTIVITYMONITOR".equals(strH)) {
            i("com.google.android.apps.scone");
        }
        this.c.finish();
    }

    public final void f() {
        com.android.dialer.callqualityrating.impl.CallQualityRatingActivity callQualityRatingActivity = this.c;
        defpackage.al alVar = (defpackage.al) callQualityRatingActivity.a().e("call_rating_chooser");
        if (alVar != null) {
            alVar.f();
        }
        if (a() == 0) {
            defpackage.kty ktyVar = new defpackage.kty();
            amxr.g(ktyVar);
            ktyVar.r(callQualityRatingActivity.a(), "call_rating_chooser");
            return;
        }
        akzx akzxVarM = defpackage.ktp.a.m();
        int iA = a();
        akzxVarM.u();
        ((defpackage.ktp) akzxVarM.b).b = iA;
        java.lang.String string = callQualityRatingActivity.getIntent().getBundleExtra("call_info_bundle").getString("CONTACT_NAME");
        akzxVarM.u();
        defpackage.ktp ktpVar = (defpackage.ktp) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        ktpVar.c = string;
        java.lang.String strH = h();
        akzxVarM.u();
        defpackage.ktp ktpVar2 = (defpackage.ktp) akzxVarM.b;
        j$.util.Objects.requireNonNull(strH);
        ktpVar2.d = strH;
        defpackage.ktp ktpVar3 = (defpackage.ktp) akzxVarM.p();
        defpackage.kto ktoVar = new defpackage.kto();
        amxr.g(ktoVar);
        ahgl.b(ktoVar, ktpVar3);
        ktoVar.r(callQualityRatingActivity.a(), "call_issues_chooser");
    }
}
