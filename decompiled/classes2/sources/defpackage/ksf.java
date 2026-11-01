package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksf extends aomh implements aonn {
    int a;
    final /* synthetic */ az b;
    final /* synthetic */ or c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ aomy e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksf(az azVar, or orVar, java.lang.Object obj, aomy aomyVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = azVar;
        this.c = orVar;
        this.d = obj;
        this.e = aomyVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aows) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aows aowsVar = (aows) this.f;
            az azVar = this.b;
            or orVar = this.c;
            java.util.Objects.toString(orVar);
            ok okVarA = ((mp) azVar).g.a("launchAwaitingForResult".concat(orVar.toString()), orVar, new defpackage.kse(aowsVar, 0));
            okVarA.b(this.d);
            this.e.a();
            defpackage.kgq kgqVar = new defpackage.kgq(okVarA, 9);
            this.a = 1;
            if (aooh.D(aowsVar, kgqVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ksf ksfVar = new defpackage.ksf(this.b, this.c, this.d, this.e, aolnVar);
        ksfVar.f = obj;
        return ksfVar;
    }
}
