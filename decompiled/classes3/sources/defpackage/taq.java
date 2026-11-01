package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class taq {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public taq(aoin aoinVar) {
        aooh.f(aoinVar, "audioGeminiAdditionalAllowlistLocales");
        this.b = aoinVar;
        java.util.Set setCW = ajsz.cW(new java.util.Locale[]{java.util.Locale.forLanguageTag("hi-IN"), java.util.Locale.forLanguageTag("en-IN")});
        alat alatVar = ((alfc) aoinVar.a()).b;
        aooh.e(alatVar, "getElementList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
        java.util.Iterator it = alatVar.iterator();
        while (it.hasNext()) {
            arrayList.add(java.util.Locale.forLanguageTag((java.lang.String) it.next()));
        }
        this.a = ajsz.aI(setCW, arrayList);
    }

    public final com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat a() {
        return (com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) ((defpackage.tap) this.b).er();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rlv] */
    public final android.text.SpannableString b(android.app.Activity activity, java.lang.String str) {
        this.a.o(rmx.cy);
        com.google.android.gms.feedback.ThemeSettings themeSettings = new com.google.android.gms.feedback.ThemeSettings(3, 0);
        themeSettings.a = 0;
        com.google.android.gms.googlehelp.GoogleHelp googleHelp = new com.google.android.gms.googlehelp.GoogleHelp("call_screen_privacy");
        android.content.Context context = (android.content.Context) this.b;
        googleHelp.q = android.net.Uri.parse(context.getString(2132019925));
        googleHelp.s = themeSettings;
        defpackage.akwb akwbVar = new defpackage.akwb(context, false);
        knj knjVar = new knj(this, activity, googleHelp, 6);
        java.lang.String string = ((android.content.Context) akwbVar.a).getString(2132018781);
        android.text.SpannableString spannableString = new android.text.SpannableString(java.lang.String.format(str, string));
        ahvr.bR(spannableString.toString().contains(string), "Couldn't add learn more link to %s", str);
        int iLastIndexOf = spannableString.toString().lastIndexOf(string);
        akwbVar.e(spannableString, iLastIndexOf, string.length() + iLastIndexOf, knjVar);
        return spannableString;
    }

    public final void c() {
        j$.util.Optional optionalOf = j$.util.Optional.of(defpackage.qtz.SNACKBAR_SONIC_FAILED_TO_PLAY_ERROR);
        ((java.util.concurrent.atomic.AtomicReference) this.b).set(optionalOf);
        optionalOf.isPresent();
        ((zpz) this.a).a(ajcm.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final boolean d(java.util.Locale locale) {
        aooh.f(locale, "locale");
        return this.a.contains(locale);
    }

    public taq(java.lang.String str, defpackage.tap tapVar) {
        this.a = str;
        this.b = tapVar;
    }

    public taq(defpackage.ysb ysbVar, defpackage.tnq tnqVar) {
        aooh.f(ysbVar, "aiCoreAvailability");
        aooh.f(tnqVar, "aiCoreAvailabilityListener");
        this.b = ysbVar;
        this.a = tnqVar;
    }

    public taq(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public taq(java.lang.String str, android.os.Bundle bundle) {
        ahvr.ci(str);
        this.a = str;
        ahvr.ci(bundle);
        this.b = bundle;
    }

    public taq(zpz zpzVar) {
        this.b = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
        this.a = zpzVar;
    }

    public taq(java.lang.String str, defpackage.ucu ucuVar) {
        ahvr.ci(str);
        this.b = str;
        this.a = ucuVar;
    }

    public taq(aoin aoinVar, aoin aoinVar2, byte[] bArr) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public taq(aoin aoinVar, aoin aoinVar2) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
    }

    public taq(android.content.Context context) {
        this.a = ahvr.bJ(new defpackage.wtx(this, 4), j$.time.Duration.ofMinutes(30L));
        this.b = context;
    }
}
