package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class voq extends defpackage.von {
    private int ak;
    private java.lang.String c;
    private android.os.Bundle d;
    private java.lang.String e;

    public final void aU(java.lang.String str) {
        this.c = ((aw) this).m.getString("target_fragment");
        android.os.Bundle bundle = new android.os.Bundle();
        this.d = bundle;
        bundle.putAll(((aw) this).m.getBundle("arguments"));
        this.e = ((aw) this).m.getString("phone_account_handle_key");
        this.ak = ((aw) this).m.getInt("target_title_res", 0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00dc  */
    public final void an() {
        java.lang.CharSequence shortDescription;
        java.lang.String strA;
        s(((ger) this).a.f(z()));
        androidx.preference.PreferenceScreen preferenceScreenDW = dW();
        preferenceScreenDW.P(this.ak);
        G().i().j(((androidx.preference.Preference) dW()).r);
        java.util.List<android.telecom.PhoneAccountHandle> listS = wsc.ay(z()).dO().s();
        android.content.Context contextG = G();
        for (android.telecom.PhoneAccountHandle phoneAccountHandle : listS) {
            j$.util.Optional optionalJ = wsc.ay(z()).dO().j(phoneAccountHandle);
            if (optionalJ.isPresent() && (((android.telecom.PhoneAccount) optionalJ.orElseThrow()).getCapabilities() & 4) != 0) {
                androidx.preference.Preference preference = new androidx.preference.Preference(contextG);
                preference.q = -1;
                preference.Q(((android.telecom.PhoneAccount) optionalJ.orElseThrow()).getLabel());
                android.telecom.PhoneAccount phoneAccount = (android.telecom.PhoneAccount) optionalJ.orElseThrow();
                if (phoneAccount.getAddress() != null) {
                    java.lang.String schemeSpecificPart = phoneAccount.getAddress().getSchemeSpecificPart();
                    if (android.text.TextUtils.isEmpty(schemeSpecificPart)) {
                        shortDescription = phoneAccount.getShortDescription();
                    } else {
                        j$.util.Optional optionalH = wsc.ay(contextG).bd().h(phoneAccountHandle);
                        if (optionalH.isPresent()) {
                            java.lang.String countryIso = ((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getCountryIso();
                            strA = android.text.TextUtils.isEmpty(countryIso) ? rlt.a(contextG, (android.telecom.PhoneAccountHandle) null) : countryIso.toUpperCase(java.util.Locale.US);
                        } else {
                            strA = rlt.a(contextG, (android.telecom.PhoneAccountHandle) null);
                        }
                        shortDescription = pez.aq(contextG, android.telephony.PhoneNumberUtils.formatNumber(schemeSpecificPart, strA));
                    }
                } else {
                    shortDescription = phoneAccount.getShortDescription();
                }
                preference.p(shortDescription);
                android.graphics.drawable.Icon icon = ((android.telecom.PhoneAccount) optionalJ.orElseThrow()).getIcon();
                if (icon != null) {
                    preference.K(icon.loadDrawable(contextG));
                }
                preference.u = this.c;
                this.d.putParcelable(this.e, phoneAccountHandle);
                preference.t().putAll(this.d);
                preferenceScreenDW.ae(preference);
            }
        }
        super.an();
    }
}
