package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajnb implements defpackage.ajff {
    public final java.util.Map a;
    public final java.util.Map b;
    public final java.util.Map c;
    public final java.util.Map d;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public ajnb(defpackage.apdi apdiVar) {
        this.a = new java.util.HashMap((java.util.Map) apdiVar.d);
        this.b = new java.util.HashMap((java.util.Map) apdiVar.a);
        this.c = new java.util.HashMap((java.util.Map) apdiVar.b);
        this.d = new java.util.HashMap((java.util.Map) apdiVar.c);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [ajls, java.lang.Object] */
    @Override // defpackage.ajff
    public final defpackage.aiql a(akxm akxmVar, ajfk ajfkVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.b;
        java.lang.Object obj = akxmVar.b;
        if (map.containsKey(obj)) {
            return ((defpackage.ajmk) map.get(obj)).b.a(akxmVar, ajfkVar);
        }
        throw new java.security.GeneralSecurityException(defpackage.a.bk((java.lang.String) obj, "No Key Parser for requested key type ", " available"));
    }

    @Override // defpackage.ajff
    public final akxm b(defpackage.aiql aiqlVar, ajfk ajfkVar) {
        return e(aiqlVar, ajfkVar);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [ajmi, java.lang.Object] */
    @Override // defpackage.ajff
    public final defpackage.ajsz c(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.d;
        java.lang.Object obj = aogcVar.b;
        if (map.containsKey(obj)) {
            return ((defpackage.ajmk) map.get(obj)).b.a(aogcVar);
        }
        throw new java.security.GeneralSecurityException(defpackage.a.bk((java.lang.String) obj, "No Parameters Parser for requested key type ", " available"));
    }

    @Override // defpackage.ajff
    public final defpackage.aogc d(defpackage.ajsz ajszVar) {
        return f(ajszVar);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [ajlt, java.lang.Object] */
    public final akxm e(defpackage.aiql aiqlVar, ajfk ajfkVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.a;
        if (map.containsKey(aiqlVar.getClass())) {
            return ((defpackage.ajmk) map.get(aiqlVar.getClass())).b.a(aiqlVar, ajfkVar);
        }
        throw new java.security.GeneralSecurityException("No Key serializer for " + java.lang.String.valueOf(aiqlVar.getClass()) + " available");
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [ajmj, java.lang.Object] */
    public final defpackage.aogc f(defpackage.ajsz ajszVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.c;
        if (map.containsKey(ajszVar.getClass())) {
            return ((defpackage.ajmk) map.get(ajszVar.getClass())).b.a(ajszVar);
        }
        throw new java.security.GeneralSecurityException("No Key Format serializer for " + java.lang.String.valueOf(ajszVar.getClass()) + " available");
    }
}
