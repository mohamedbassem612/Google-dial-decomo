package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apit {
    public final defpackage.apjq a;
    public final defpackage.apii b;
    public final java.util.List c;
    private final defpackage.aoir d;

    public apit(defpackage.apjq apjqVar, defpackage.apii apiiVar, java.util.List list, defpackage.aomy aomyVar) {
        if (list == null) {
            defpackage.aooh.i("localCertificates");
        }
        this.a = apjqVar;
        this.b = apiiVar;
        this.c = list;
        this.d = new defpackage.aoiy(new defpackage.acik(aomyVar, 14));
    }

    public static final java.util.List b(defpackage.aomy aomyVar) {
        try {
            return (java.util.List) aomyVar.a();
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            return defpackage.aokc.a;
        }
    }

    private static final java.lang.String c(java.security.cert.Certificate certificate) {
        if (certificate instanceof java.security.cert.X509Certificate) {
            return ((java.security.cert.X509Certificate) certificate).getSubjectDN().toString();
        }
        java.lang.String type = certificate.getType();
        defpackage.aooh.e(type, "getType(...)");
        return type;
    }

    public final java.util.List a() {
        return (java.util.List) this.d.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.apit) {
            defpackage.apit apitVar = (defpackage.apit) obj;
            if (apitVar.a == this.a && defpackage.aooh.n(apitVar.b, this.b) && defpackage.aooh.n(apitVar.a(), a()) && defpackage.aooh.n(apitVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.util.List listA = a();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listA, 10));
        java.util.Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((java.security.cert.Certificate) it.next()));
        }
        java.lang.String string = arrayList.toString();
        defpackage.apjq apjqVar = this.a;
        defpackage.apii apiiVar = this.b;
        java.util.List list = this.c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((java.security.cert.Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + apjqVar + " cipherSuite=" + apiiVar + " peerCertificates=" + string + " localCertificates=" + arrayList2 + '}';
    }
}
