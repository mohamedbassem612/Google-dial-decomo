package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class uzr implements agtk {
    final /* synthetic */ defpackage.uzs a;

    public uzr(defpackage.uzs uzsVar) {
        j$.util.Objects.requireNonNull(uzsVar);
        this.a = uzsVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.uzs.a.c(), "Failed to load the current voicemail configuration in VVM config override fragment.", "com/android/dialer/voicemail/configui/ConfigOverrideFragmentPeer$1", "onFailure", 'B', "ConfigOverrideFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string;
        java.lang.Object obj3;
        android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) obj2;
        androidx.preference.PreferenceScreen preferenceScreenDW = this.a.c.dW();
        for (int i = 0; i < preferenceScreenDW.k(); i++) {
            androidx.preference.SwitchPreference switchPreferenceN = preferenceScreenDW.n(i);
            java.lang.String str = ((androidx.preference.Preference) switchPreferenceN).s;
            if (str.startsWith("vvm_config_override_key_")) {
                java.lang.String strSubstring = str.substring(24);
                if (persistableBundle.get(strSubstring) == null) {
                    continue;
                } else {
                    if (strSubstring.endsWith("bool")) {
                        boolean z = persistableBundle.getBoolean(strSubstring);
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                        boolValueOf.getClass();
                        switchPreferenceN.k(z);
                        obj3 = boolValueOf;
                    } else if (strSubstring.endsWith("int")) {
                        java.lang.String strValueOf = java.lang.String.valueOf(persistableBundle.getInt(strSubstring));
                        ((androidx.preference.EditTextPreference) switchPreferenceN).i(strValueOf);
                        obj3 = strValueOf;
                    } else if (strSubstring.endsWith("string")) {
                        java.lang.String string2 = persistableBundle.getString(strSubstring);
                        if (strSubstring.equals("vvm_type_string")) {
                            ((androidx.preference.ListPreference) switchPreferenceN).q(string2);
                            obj3 = string2;
                        } else {
                            ((androidx.preference.EditTextPreference) switchPreferenceN).i(string2);
                            obj3 = string2;
                        }
                    } else {
                        if (!strSubstring.endsWith("string_array")) {
                            throw new java.lang.AssertionError("unknown type for key ".concat(java.lang.String.valueOf(strSubstring)));
                        }
                        java.lang.String[] stringArray = persistableBundle.getStringArray(strSubstring);
                        if (stringArray == null) {
                            string = "";
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            for (java.lang.String str2 : stringArray) {
                                if (sb.length() != 0) {
                                    sb.append(',');
                                }
                                sb.append(str2);
                            }
                            string = sb.toString();
                        }
                        java.lang.String str3 = string;
                        ((androidx.preference.EditTextPreference) switchPreferenceN).i(str3);
                        obj3 = str3;
                    }
                    switchPreferenceN.U(obj3);
                }
            }
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
