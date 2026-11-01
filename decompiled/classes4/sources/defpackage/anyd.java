package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anyd {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public anyd(defpackage.anrj anrjVar, defpackage.anly anlyVar) {
        this.a = anlyVar;
        j$.util.Objects.requireNonNull(anrjVar);
        this.b = anrjVar;
    }

    public final java.lang.Object a(ajew ajewVar) throws java.security.GeneralSecurityException {
        aiql aiqlVarA = ajewVar.a();
        java.lang.Class<?> cls = aiqlVarA.getClass();
        java.lang.Class cls2 = (java.lang.Class) ((defpackage.apjb) this.b).a;
        ajmo ajmoVar = (ajmo) ((ajmr) this.a).b.get(new ajmx(cls, cls2));
        if (ajmoVar != null) {
            return ajmoVar.c(aiqlVarA);
        }
        throw new java.security.GeneralSecurityException("No PrimitiveConstructor registered for key class " + aiqlVarA.getClass().getName() + " and primitive " + cls2.getName());
    }

    public /* synthetic */ anyd(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public anyd() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public anyd(defpackage.anut anutVar, defpackage.anom anomVar) {
        this();
        this.a = anomVar;
        j$.util.Objects.requireNonNull(anutVar);
        this.b = anutVar;
    }
}
