package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpc implements defpackage.xpb {
    final /* synthetic */ aomi a;
    final /* synthetic */ java.lang.Enum b;

    public xpc(aomi aomiVar, java.lang.Enum r2) {
        this.a = aomiVar;
        this.b = r2;
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        return defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    public final /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        java.lang.Object next;
        aooh.f(persistableBundle, "persistableBundle");
        java.lang.String strF = defpackage.xpo.f(persistableBundle);
        aojl aojlVar = new aojl(this.a);
        do {
            if (!aojlVar.hasNext()) {
                next = null;
                break;
            }
            next = aojlVar.next();
        } while (!aooh.n(((defpackage.xpe) ((java.lang.Enum) next)).a(), strF));
        java.lang.Enum r1 = (java.lang.Enum) next;
        return r1 == null ? this.b : r1;
    }
}
