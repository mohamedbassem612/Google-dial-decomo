package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class jzq extends defpackage.aomh implements defpackage.aonr {
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.jzr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzq(defpackage.jzr jzrVar, defpackage.aoln aolnVar) {
        super(6, aolnVar);
        this.d = jzrVar;
    }

    @Override // defpackage.aonr
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        ((java.lang.Number) obj2).intValue();
        defpackage.jzq jzqVar = new defpackage.jzq(this.d, (defpackage.aoln) obj6);
        jzqVar.a = (defpackage.kgl) obj;
        jzqVar.b = (defpackage.wgi) obj3;
        jzqVar.c = (defpackage.tcp) obj4;
        return jzqVar.b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        java.lang.Object obj2 = this.a;
        defpackage.kcw kcwVar = new defpackage.kcw((defpackage.wgi) this.b, (defpackage.tcp) this.c);
        defpackage.jzr jzrVar = this.d;
        return defpackage.dzn.p(defpackage.dzn.p((defpackage.kgl) obj2, new defpackage.emu(jzrVar, (defpackage.aoln) null, 2)), new defpackage.jzp(jzrVar, kcwVar, null));
    }
}
