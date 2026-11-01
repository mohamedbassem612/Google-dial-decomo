package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class upb implements aonj {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ defpackage.uow b;
    public final /* synthetic */ aomy c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ccp e;
    public final /* synthetic */ kaw f;

    public /* synthetic */ upb(java.lang.String str, defpackage.uow uowVar, aomy aomyVar, int i, kaw kawVar, ccp ccpVar) {
        this.a = str;
        this.b = uowVar;
        this.c = aomyVar;
        this.d = i;
        this.f = kawVar;
        this.e = ccpVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        diq diqVar = (diq) obj;
        aooh.f(diqVar, "$this$clearAndSetSemantics");
        dfb.j(diqVar, this.a);
        java.lang.String str = ((defpackage.uov) this.b).c;
        aooh.f(diqVar, "<this>");
        aooh.f(str, "<set-?>");
        diqVar.a(defpackage.upa.a, str);
        dfb.h(diqVar, (java.lang.String) null, new sky(this.c, 17));
        dfb.i(diqVar, (java.lang.String) null, new agsd(this.d, this.f, this.e, 1));
        return aojh.a;
    }
}
