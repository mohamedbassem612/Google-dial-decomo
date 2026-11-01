package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lph implements aonj {
    public final /* synthetic */ agf a;
    public final /* synthetic */ agf b;
    public final /* synthetic */ agf c;
    public final /* synthetic */ agg d;
    public final /* synthetic */ agg e;
    public final /* synthetic */ agf f;
    public final /* synthetic */ agg g;
    public final /* synthetic */ agg h;

    public /* synthetic */ lph(agf agfVar, agf agfVar2, agf agfVar3, agg aggVar, agg aggVar2, agf agfVar4, agg aggVar3, agg aggVar4) {
        this.a = agfVar;
        this.b = agfVar2;
        this.c = agfVar3;
        this.d = aggVar;
        this.e = aggVar2;
        this.f = agfVar4;
        this.g = aggVar3;
        this.h = aggVar4;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        afo afoVar;
        defpackage.aes aesVar = (defpackage.aes) obj;
        aooh.f(aesVar, "$this$AnimatedContent");
        boolean zBooleanValue = ((java.lang.Boolean) aesVar.c()).booleanValue();
        agf agfVar = this.a;
        agg aggVar = this.d;
        if (zBooleanValue) {
            agg aggVar2 = this.e;
            afoVar = new afo(agfVar.a(this.b).a(this.c), aggVar.a(aggVar2), (ahu) null, 12);
        } else {
            afoVar = new afo(agfVar.a(this.f), aggVar.a(this.g).a(this.h), (ahu) null, 12);
        }
        aesVar.a(afoVar, uu.d(2));
        return afoVar;
    }
}
