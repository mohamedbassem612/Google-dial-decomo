package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajlx extends defpackage.aiql {
    public final akxm a;

    public ajlx(akxm akxmVar, ajfk ajfkVar) throws java.security.GeneralSecurityException {
        ar(akxmVar, ajfkVar);
        this.a = akxmVar;
    }

    private static void ar(akxm akxmVar, ajfk ajfkVar) throws java.security.GeneralSecurityException {
        java.lang.Object obj = akxmVar.e;
        if ((obj.equals(ajfd.b) || obj.equals(ajfd.c)) && ajfkVar == null) {
            throw new java.security.GeneralSecurityException("SecretKeyAccess is required");
        }
    }

    @Override // defpackage.aiql
    public final defpackage.ajsz ac() {
        akxm akxmVar = this.a;
        return new ajlw((java.lang.String) akxmVar.b, (defpackage.ajfe) akxmVar.c);
    }

    public final ajst ap() throws java.security.GeneralSecurityException {
        akxm akxmVar = this.a;
        java.lang.Object obj = akxmVar.c;
        if (obj.equals(defpackage.ajfe.d)) {
            return ajst.b(new byte[0]);
        }
        if (obj.equals(defpackage.ajfe.b)) {
            return ajmh.b(((java.lang.Integer) akxmVar.a).intValue());
        }
        if (obj.equals(defpackage.ajfe.c) || obj.equals(defpackage.ajfe.e)) {
            return ajmh.a(((java.lang.Integer) akxmVar.a).intValue());
        }
        throw new java.security.GeneralSecurityException("Unknown output prefix type");
    }

    public final akxm aq(ajfk ajfkVar) throws java.security.GeneralSecurityException {
        akxm akxmVar = this.a;
        ar(akxmVar, ajfkVar);
        return akxmVar;
    }

    @Override // defpackage.aiql
    public final java.lang.Integer m() {
        return (java.lang.Integer) this.a.a;
    }
}
