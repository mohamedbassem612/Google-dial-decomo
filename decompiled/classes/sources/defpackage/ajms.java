package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajms implements defpackage.ajff {
    public final java.util.Map a;
    public final java.util.Map b;
    public final java.util.Map c;
    public final java.util.Map d;

    public ajms(java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4) {
        this.a = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
        this.b = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map2));
        this.c = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map3));
        this.d = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map4));
    }

    @Override // defpackage.ajff
    public final defpackage.aiql a(akxm akxmVar, ajfk ajfkVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.c;
        java.lang.Object obj = akxmVar.b;
        ajmt ajmtVar = (ajmt) map.get(obj);
        if (ajmtVar != null) {
            return ajmtVar.a(akxmVar, ajfkVar);
        }
        throw new java.security.GeneralSecurityException(defpackage.a.bk((java.lang.String) obj, "No Key Parser for requested key type ", " available"));
    }

    @Override // defpackage.ajff
    public final akxm b(defpackage.aiql aiqlVar, ajfk ajfkVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.a;
        java.lang.Class<?> cls = aiqlVar.getClass();
        ajmu ajmuVar = (ajmu) map.get(cls);
        if (ajmuVar != null) {
            return ajmuVar.a(aiqlVar, ajfkVar);
        }
        throw new java.security.GeneralSecurityException(defpackage.hgb.i(cls, "No Key serializer for ", " available"));
    }

    @Override // defpackage.ajff
    public final defpackage.ajsz c(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.d;
        java.lang.Object obj = aogcVar.b;
        defpackage.ajmv ajmvVar = (defpackage.ajmv) map.get(obj);
        if (ajmvVar != null) {
            return ajmvVar.a(aogcVar);
        }
        throw new java.security.GeneralSecurityException(defpackage.a.bk((java.lang.String) obj, "No Parameters Parser for requested key type ", " available"));
    }

    @Override // defpackage.ajff
    public final defpackage.aogc d(defpackage.ajsz ajszVar) throws java.security.GeneralSecurityException {
        java.util.Map map = this.b;
        java.lang.Class<?> cls = ajszVar.getClass();
        defpackage.ajmw ajmwVar = (defpackage.ajmw) map.get(cls);
        if (ajmwVar != null) {
            return ajmwVar.a(ajszVar);
        }
        throw new java.security.GeneralSecurityException(defpackage.hgb.i(cls, "No Key Format serializer for ", " available"));
    }
}
