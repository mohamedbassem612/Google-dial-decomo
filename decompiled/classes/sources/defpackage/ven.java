package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ven {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/sms/OmtpSmsMessageConverter");
    public final defpackage.vej b;
    public final defpackage.ajct c;
    public final defpackage.aoin d;

    public ven(defpackage.vej vejVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.b = vejVar;
        this.c = ajctVar;
        this.d = aoinVar;
    }

    public static defpackage.alcf a(java.lang.String str) {
        try {
            defpackage.akzx akzxVarM = defpackage.alcf.a.m();
            long epochSecond = ((j$.time.Instant) j$.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm Z").withLocale(java.util.Locale.US).parse(str, new vlt(1))).getEpochSecond();
            akzxVarM.u();
            ((defpackage.alcf) akzxVarM.b).b = epochSecond;
            return (defpackage.alcf) akzxVarM.r();
        } catch (j$.time.format.DateTimeParseException e) {
            throw new java.lang.IllegalArgumentException("unrecognized date time format", e);
        }
    }

    public static void b(android.os.Bundle bundle, java.lang.String str, java.util.function.Consumer consumer) {
        if (bundle.containsKey(str)) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, bundle.getString(str));
        } else {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/sms/OmtpSmsMessageConverter", "addField", (char) 234, "OmtpSmsMessageConverter.java")).y("fields doesn't contain key: %s", str);
        }
    }

    public static final veo c(android.telecom.PhoneAccountHandle phoneAccountHandle, android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("st", "");
        if (string.length() >= 2 && string.startsWith("\"") && string.endsWith("\"")) {
            string = string.substring(1, string.length() - 1);
        }
        java.lang.String string2 = bundle.getString("rc", "");
        defpackage.akzx akzxVarM = veo.a.m();
        akzxVarM.u();
        veo veoVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        veoVar.c = string;
        akzxVarM.u();
        veo veoVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        veoVar2.d = string2;
        defpackage.akzx akzxVarM2 = vgm.a.m();
        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
        akzxVarM2.u();
        vgm vgmVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(strFlattenToString);
        vgmVar.b |= 1;
        vgmVar.c = strFlattenToString;
        java.lang.String id = phoneAccountHandle.getId();
        akzxVarM2.u();
        vgm vgmVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(id);
        vgmVar2.b |= 2;
        vgmVar2.d = id;
        j$.util.Objects.requireNonNull(akzxVarM2);
        b(bundle, "u", new oxs(akzxVarM2, 19));
        j$.util.Objects.requireNonNull(akzxVarM2);
        b(bundle, "pw", new oxs(akzxVarM2, 20));
        j$.util.Objects.requireNonNull(akzxVarM2);
        b(bundle, "ipt", new vel(akzxVarM2, 1));
        j$.util.Objects.requireNonNull(akzxVarM2);
        b(bundle, "srv", new vel(akzxVarM2, 0));
        j$.util.Objects.requireNonNull(akzxVarM2);
        d(bundle, "pw_len", new vel(akzxVarM2, 2));
        j$.util.Objects.requireNonNull(akzxVarM2);
        d(bundle, "g_len", new vel(akzxVarM2, 3));
        j$.util.Objects.requireNonNull(akzxVarM2);
        d(bundle, "p", new vel(akzxVarM2, 4));
        vgm vgmVarR = akzxVarM2.r();
        akzxVarM.u();
        veo veoVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(vgmVarR);
        veoVar3.e = vgmVarR;
        veoVar3.b |= 1;
        return akzxVarM.r();
    }

    private static void d(android.os.Bundle bundle, java.lang.String str, java.util.function.Consumer consumer) {
        if (bundle.containsKey(str)) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, bundle.getString(str));
        }
    }
}
