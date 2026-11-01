package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpu extends amzm {
    private final amzg b;

    public jpu(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpu.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        sql sqlVar = (sql) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(sqlVar, "consolidator");
        int iOrdinal = sqlVar.b().ordinal();
        java.lang.String strH = (iOrdinal == 3 || iOrdinal == 12) ? sqlVar.h() : "";
        akzx akzxVarM = defpackage.aixu.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.c(strH);
        aooh.f(strH, "value");
        akzxVarM.u();
        defpackage.aixu aixuVar = (defpackage.aixu) akzxVarM.b;
        j$.util.Objects.requireNonNull(strH);
        aixuVar.b |= 1;
        aixuVar.c = strH;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.aixu) akzxVarM.b).d);
        aooh.e(listUnmodifiableList, "getCallerTagList(...)");
        new alct(listUnmodifiableList);
        zai zaiVar = sqlVar.u().c;
        if (zaiVar == null) {
            zaiVar = zai.a;
        }
        java.lang.String str = zaiVar.b;
        aooh.e(str, "getTagId(...)");
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.aixu aixuVar2 = (defpackage.aixu) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alat alatVar = aixuVar2.d;
        if (!alatVar.c()) {
            aixuVar2.d = alad.J(alatVar);
        }
        aixuVar2.d.add(str);
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return aiql.z((defpackage.aixu) aladVarP);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
