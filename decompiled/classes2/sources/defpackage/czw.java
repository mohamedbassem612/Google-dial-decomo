package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class czw {
    public static final cze[] a;
    public static final aco b;
    public static final aco c;
    public static final aco d;
    public final czx e;

    static {
        cze[] czeVarArr = new cze[4];
        for (int i = 0; i < 4; i++) {
            czeVarArr[i] = new czf((java.lang.String) null);
        }
        a = czeVarArr;
        aco acoVar = new aco(8);
        acoVar.g(1, new czf("status bars source"));
        acoVar.g(2, new czf("navigation bars source"));
        acoVar.g(4, new czf("caption bar source"));
        acoVar.g(8, new czf("IME source"));
        acoVar.g(16, new czf("system gestures source"));
        acoVar.g(32, new czf("mandatory system gestures source"));
        acoVar.g(64, new czf("tappable element source"));
        acoVar.g(128, new czf("display cutout source"));
        b = acoVar;
        aco acoVar2 = new aco(8);
        acoVar2.g(1, new czf("status bars target"));
        acoVar2.g(2, new czf("navigation bars target"));
        acoVar2.g(4, new czf("caption bar target"));
        acoVar2.g(8, new czf("IME target"));
        acoVar2.g(16, new czf("system gestures target"));
        acoVar2.g(32, new czf("mandatory system gestures target"));
        acoVar2.g(64, new czf("tappable element target"));
        acoVar2.g(128, new czf("display cutout target"));
        c = acoVar2;
        aco acoVar3 = new aco(8);
        int i2 = defpackage.czu.a;
        acoVar3.g(1, defpackage.czt.f);
        acoVar3.g(2, defpackage.czt.e);
        acoVar3.g(4, defpackage.czt.a);
        acoVar3.g(8, defpackage.czt.c);
        acoVar3.g(16, defpackage.czt.g);
        acoVar3.g(32, defpackage.czt.d);
        acoVar3.g(64, defpackage.czt.h);
        acoVar3.g(128, defpackage.czt.b);
        d = acoVar3;
    }

    public czw(czx czxVar) {
        this.e = czxVar;
        new adq(16);
        aco acoVar = acp.a;
        new aco(6);
    }

    public static final boolean b(czi cziVar, cze czeVar) {
        return cziVar == czeVar.c() || cziVar == czeVar.b() || cziVar == czeVar.d() || cziVar == czeVar.a();
    }

    public static final void c(defpackage.dbq dbqVar, cze czeVar, dwn dwnVar) {
        dbqVar.a = true;
        dbt dbtVar = dbqVar.d;
        cxi cxiVarK = dbtVar.K();
        if (dbqVar.b == 9223372034707292159L) {
            dbqVar.b = dfd.l(cxiVarK.l(0L));
            dbqVar.c = cxiVarK.h();
        }
        dbtVar.M().w.f();
        long jH = cxiVarK.h();
        dbqVar.n(czeVar.c(), dwnVar.b);
        dbqVar.n(czeVar.b(), dwnVar.c);
        dbqVar.n(czeVar.d(), ((int) (jH >> 32)) - dwnVar.d);
        dbqVar.n(czeVar.a(), ((int) (jH & 4294967295L)) - dwnVar.e);
    }

    public final eax a() {
        return this.e.g();
    }
}
