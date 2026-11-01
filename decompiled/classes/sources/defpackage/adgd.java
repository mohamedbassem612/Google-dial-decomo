package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adgd implements defpackage.adhp {
    public static final defpackage.abrz b = new defpackage.abrz();
    public final defpackage.aify a;
    public final defpackage.abrz c;

    public adgd(defpackage.abrz abrzVar, defpackage.aify aifyVar) {
        this.c = abrzVar;
        this.a = aifyVar;
    }

    public static void b(defpackage.akex akexVar, defpackage.adis adisVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName) throws defpackage.adgf {
        java.lang.String strK = akexVar.k();
        try {
            adisVar.i(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", adfy.a).parse(strK));
        } catch (java.text.ParseException e) {
            throw new defpackage.adgf(java.lang.String.format("Error parsing expiry date %s for superpack %s", strK, versionedName), e);
        }
    }

    public static void c(defpackage.akex akexVar, defpackage.adgb adgbVar) {
        akexVar.m();
        while (akexVar.s()) {
            adgbVar.a(akexVar.k());
        }
        akexVar.o();
    }

    @Override // defpackage.adhp
    public final java.lang.String a() {
        return "JsonManifestParser";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adgd) {
            defpackage.adgd adgdVar = (defpackage.adgd) obj;
            if (this.c.equals(adgdVar.c) && defpackage.ahvr.aP(this.a, adgdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.aify aifyVar = this.a;
        return "JsonManifestParser{extraHandler=" + java.lang.String.valueOf(this.c) + ", indexSpecs=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public adgd() {
        throw null;
    }
}
