package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class om extends defpackage.ok {
    final /* synthetic */ defpackage.on a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ defpackage.or c;

    public om(defpackage.on onVar, java.lang.String str, defpackage.or orVar) {
        this.a = onVar;
        this.b = str;
        this.c = orVar;
    }

    @Override // defpackage.ok
    public final void a() {
        this.a.d(this.b);
    }

    @Override // defpackage.ok
    public final void b(java.lang.Object obj) throws java.lang.Exception {
        defpackage.on onVar = this.a;
        java.util.Map map = onVar.b;
        defpackage.or orVar = this.c;
        java.lang.String str = this.b;
        java.lang.Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(obj, orVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int iIntValue = ((java.lang.Number) obj2).intValue();
        onVar.c.add(str);
        try {
            onVar.f(iIntValue, orVar, obj);
        } catch (java.lang.Exception e) {
            defpackage.on onVar2 = this.a;
            onVar2.c.remove(this.b);
            throw e;
        }
    }
}
