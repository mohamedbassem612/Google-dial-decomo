package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hus extends defpackage.hut {
    private static final aimz ak = aimz.i("com/android/dialer/assisteddialing/ui/AssistedDialingSettingsFragmentCompat");
    private defpackage.hud al;
    public huf c;
    public rlv d;
    public hum e;

    private final void aY(androidx.preference.ListPreference listPreference) {
        if (!listPreference.l().toString().equals(listPreference.g[0].toString())) {
            listPreference.p(listPreference.l());
            return;
        }
        j$.util.Optional optionalB = this.al.b();
        if (optionalB.isPresent()) {
            try {
                listPreference.p(Z(2132017361, new java.lang.Object[]{listPreference.g[listPreference.k((java.lang.String) optionalB.orElseThrow())]}));
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                ak.b().l("com/android/dialer/assisteddialing/ui/AssistedDialingSettingsFragmentCompat", "updateCountryChooserSummary", 142, "AssistedDialingSettingsFragmentCompat.java").v("Failed to find human readable mapping for country code, using default.");
            }
        }
    }

    @Override // defpackage.ger
    public final void aU(java.lang.String str) {
        this.al = this.e.a();
        c(2132213763);
        ee(Y(2132017366)).n = new defpackage.jcj(this, 1);
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) ee(Y(2132017363));
        java.lang.CharSequence[] charSequenceArr = listPreference.g;
        java.lang.CharSequence[] charSequenceArr2 = listPreference.h;
        ahvr.bZ(charSequenceArr.length == charSequenceArr2.length, "Unexpected mismatch in country chooser key/value size");
        java.util.ArrayList<defpackage.hur> arrayList = new java.util.ArrayList();
        java.util.Locale localeM = aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(dX().getConfiguration()), 0);
        android.icu.util.ULocale uLocaleM = fh$.ExternalSyntheticApiModelOutline0.m(fh$.ExternalSyntheticApiModelOutline0.m$1(fh$.ExternalSyntheticApiModelOutline0.m(new android.icu.util.ULocale.Builder(), localeM.getCountry()), localeM.getLanguage()));
        for (int i = 0; i < charSequenceArr.length; i++) {
            java.lang.String strM = fh$.ExternalSyntheticApiModelOutline0.m(fh$.ExternalSyntheticApiModelOutline0.m(fh$.ExternalSyntheticApiModelOutline0.m(new android.icu.util.ULocale.Builder(), charSequenceArr2[i].toString())), uLocaleM);
            java.lang.String string = charSequenceArr[i].toString();
            arrayList.add(new defpackage.hur(strM + ' ' + ("(" + defpackage.dxt.a().d(string.substring(1, string.length() - 1), defpackage.dxv.a) + ')'), charSequenceArr2[i]));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList2.add(listPreference.g[0]);
        arrayList3.add(listPreference.h[0]);
        for (defpackage.hur hurVar : arrayList) {
            huf hufVar = this.c;
            java.lang.CharSequence charSequence = hurVar.b;
            if (hufVar.a(charSequence.toString())) {
                arrayList2.add(hurVar.a);
                arrayList3.add(charSequence);
            }
        }
        listPreference.e((java.lang.CharSequence[]) arrayList2.toArray(new java.lang.CharSequence[0]));
        listPreference.h = (java.lang.CharSequence[]) arrayList3.toArray(new java.lang.CharSequence[0]);
        if (!arrayList3.contains(listPreference.i)) {
            listPreference.q(listPreference.h[0].toString());
            ak.b().l("com/android/dialer/assisteddialing/ui/AssistedDialingSettingsFragmentCompat", "ameliorateInvalidSelectedValue", 193, "AssistedDialingSettingsFragmentCompat.java").v("Reset the country chooser preference to the default value.");
        }
        aY(listPreference);
        listPreference.n = new defpackage.huq();
        androidx.preference.Preference preferenceEe = ee(Y(2132017358));
        akwb akwbVar = new akwb(z(), false);
        java.lang.String strY = Y(2132017359);
        java.lang.String strY2 = Y(2132017360);
        java.lang.String string2 = ((android.content.Context) akwbVar.a).getString(2132018781);
        android.text.SpannableString spannableString = new android.text.SpannableString(fh$.ExternalSyntheticApiModelOutline0.m(java.lang.String.format(strY, string2), 63));
        ahvr.bR(spannableString.toString().contains(string2), "Couldn't add learn more link to %s", strY);
        int iLastIndexOf = spannableString.toString().lastIndexOf(string2);
        int length = string2.length() + iLastIndexOf;
        if (akwbVar.b) {
            spannableString.setSpan(new android.text.style.TypefaceSpan(android.graphics.Typeface.create("google-sans-text-medium", 0)), iLastIndexOf, length, 33);
        } else {
            spannableString.setSpan(new android.text.style.TypefaceSpan("google-sans-text-medium"), iLastIndexOf, length, 33);
        }
        spannableString.setSpan(new com.android.dialer.spannable.UrlSpanWithoutUnderline(strY2), iLastIndexOf, length, 33);
        preferenceEe.Q(spannableString);
        dW().P(2132017365);
    }

    public final void an() {
        super.an();
        G().i().j(dW().r);
    }

    @Override // defpackage.ger
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        super.ao(view, bundle);
        ft$.ExternalSyntheticApiModelOutline0.m(((aw) this).Q, dW().r);
    }
}
