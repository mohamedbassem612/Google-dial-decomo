package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class leb {
    private static final aimz i = aimz.i("com/android/dialer/callscreen/impl/postcall/SurveyActivityPeer");
    public byte[] b;
    public boolean c;
    public android.os.Bundle d;
    public final com.android.dialer.callscreen.impl.postcall.SurveyActivity e;
    public final j$.util.Optional f;
    public final urg g;
    private final defpackage.lea j;
    public int a = 1;
    public int h = 1;

    public leb(com.android.dialer.callscreen.impl.postcall.SurveyActivity surveyActivity, defpackage.lea leaVar, j$.util.Optional optional, urg urgVar) {
        this.e = surveyActivity;
        this.j = leaVar;
        this.f = optional;
        this.g = urgVar;
    }

    private final boolean d(int i2) {
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            throw new java.lang.IllegalStateException("Unhandled question");
        }
        if (!this.c) {
            i.b().l("com/android/dialer/callscreen/impl/postcall/SurveyActivityPeer", "getShouldShowAudioDonationQuestion", 362, "SurveyActivityPeer.java").v("audio donation survey question is explicitly disabled");
            return true;
        }
        if (this.b != null) {
            return false;
        }
        i.b().l("com/android/dialer/callscreen/impl/postcall/SurveyActivityPeer", "getShouldShowAudioDonationQuestion", 367, "SurveyActivityPeer.java").v("audio donation survey question is disabled because no audio is available");
        return true;
    }

    public final void a() {
        this.a++;
        b();
    }

    public final void b() {
        com.android.dialer.callscreen.impl.postcall.SurveyActivity surveyActivity = this.e;
        defpackage.ldz ldzVar = (defpackage.ldz) surveyActivity.a().e("IS_SPAM_SURVEY_TAG");
        int i2 = this.a;
        if (i2 == 1) {
            if (d(i2)) {
                i.b().l("com/android/dialer/callscreen/impl/postcall/SurveyActivityPeer", "showDialog", 293, "SurveyActivityPeer.java").v("not showing the isSpam question");
                a();
                return;
            } else {
                if (ldzVar == null) {
                    defpackage.ldz ldzVar2 = new defpackage.ldz();
                    ldzVar2.t();
                    ldzVar2.ak = this;
                    ldzVar2.r(surveyActivity.a(), "IS_SPAM_SURVEY_TAG");
                    return;
                }
                return;
            }
        }
        if (i2 != 2) {
            android.widget.Toast.makeText(surveyActivity.getApplicationContext(), 2132017829, 1).show();
            surveyActivity.finish();
            return;
        }
        if (ldzVar != null && ldzVar.aG()) {
            ldzVar.s(false, false);
        }
        if (d(this.a)) {
            i.b().l("com/android/dialer/callscreen/impl/postcall/SurveyActivityPeer", "showDialog", 311, "SurveyActivityPeer.java").v("not showing the audioDonation question");
            a();
        } else if (((defpackage.ldw) surveyActivity.a().e("AUDIO_DONATION_SURVEY_TAG")) == null) {
            defpackage.ldw ldwVar = new defpackage.ldw();
            ldwVar.t();
            ldwVar.ak = this;
            ldwVar.r(surveyActivity.a(), "AUDIO_DONATION_SURVEY_TAG");
        }
    }

    public final void c(int i2) {
        this.h = i2;
        if (i2 == 2) {
            android.os.Bundle bundle = this.d;
            if (bundle == null) {
                i.b().l("com/android/dialer/callscreen/impl/postcall/SurveyActivityPeer", "reportSpam", 230, "SurveyActivityPeer.java").v("No call info available not logging spam report.");
                return;
            }
            rms rmsVarB = rms.b(bundle.getInt("contact_lookup_result_type", 0));
            i.b().l("com/android/dialer/callscreen/impl/postcall/SurveyActivityPeer", "reportSpam", 237, "SurveyActivityPeer.java").v("Attempting to report spam to scooby");
            akzx akzxVarM = ucq.a.m();
            akzxVarM.u();
            ucq ucqVar = akzxVarM.b;
            ucqVar.b |= 4;
            ucqVar.e = 1;
            java.lang.String strA = rlt.a(this.e.getApplicationContext(), (android.telecom.PhoneAccountHandle) null);
            akzxVarM.u();
            ucq ucqVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(strA);
            ucqVar2.b |= 2;
            ucqVar2.d = strA;
            akzx akzxVarM2 = defpackage.aivu.a.m();
            defpackage.aivt aivtVar = defpackage.aivt.SPAM;
            akzxVarM2.u();
            defpackage.aivu aivuVar = (defpackage.aivu) akzxVarM2.b;
            aivuVar.f = aivtVar.e;
            aivuVar.b |= 4;
            java.lang.String strCo = ahvr.co(this.d.getString("phone_number"));
            akzxVarM2.u();
            defpackage.aivu aivuVar2 = (defpackage.aivu) akzxVarM2.b;
            j$.util.Objects.requireNonNull(strCo);
            aivuVar2.b |= 8;
            aivuVar2.g = strCo;
            akzxVarM2.u();
            defpackage.aivu aivuVar3 = (defpackage.aivu) akzxVarM2.b;
            aivuVar3.o = 6;
            aivuVar3.b |= 4096;
            akzxVarM2.u();
            defpackage.aivu aivuVar4 = (defpackage.aivu) akzxVarM2.b;
            aivuVar4.i = wsc.bH(1) - 1;
            aivuVar4.b |= 32;
            akzxVarM2.u();
            defpackage.aivu aivuVar5 = (defpackage.aivu) akzxVarM2.b;
            aivuVar5.q = rmsVarB.B;
            aivuVar5.b |= 16384;
            akzxVarM2.u();
            defpackage.aivu aivuVar6 = (defpackage.aivu) akzxVarM2.b;
            j$.util.Objects.requireNonNull("dialer");
            aivuVar6.b |= 1;
            aivuVar6.d = "dialer";
            akzxVarM.u();
            ucq ucqVar3 = akzxVarM.b;
            defpackage.aivu aivuVar7 = (defpackage.aivu) akzxVarM2.p();
            j$.util.Objects.requireNonNull(aivuVar7);
            ucqVar3.c = aivuVar7;
            ucqVar3.b |= 1;
            defpackage.lea leaVar = this.j;
            ahvr.J(leaVar.b.e(akzxVarM), new defpackage.jya(leaVar, 6), ajbm.a);
        }
    }
}
