package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hjs implements amyz {
    private final /* synthetic */ int $cid;
    private final defpackage.him a;
    private final int b;
    private final java.lang.Object c;

    public hjs(defpackage.him himVar, java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.a = himVar;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [amyz, java.lang.Object] */
    public final java.lang.Object a() {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            if (i2 == 0) {
                defpackage.hjg hjgVar = (defpackage.hjg) this.c;
                return anah.a(hjgVar.c, hjgVar.d);
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    defpackage.him himVar = this.a;
                    return i2 != 3 ? new suv((android.content.Context) himVar.s.a(), (aolr) himVar.ca.a(), (zjs) himVar.cn.a(), (defpackage.kvt) himVar.Gs.a(), (defpackage.nvw) himVar.a.eM.a()) : new sup((aolr) himVar.bg.a(), (ojo) himVar.oF.a(), (zjs) himVar.cn.a());
                }
                defpackage.him himVar2 = this.a;
                return new suo((android.content.Context) himVar2.s.a(), (aolr) himVar2.bg.a(), (aolr) himVar2.bY.a(), (aolr) himVar2.ca.a(), (ojo) himVar2.oF.a(), himVar2.dT());
            }
            java.lang.Object obj = this.c;
            aihb aihbVarI = aihd.i(2);
            aihbVarI.i(new ahrh());
            aihbVarI.k(((defpackage.hjg) obj).a.hr());
            return aihbVarI.h();
        }
        switch (i2) {
            case 0:
                defpackage.iix iixVar = (defpackage.iix) this.c;
                aigf aigfVarL = aigf.l(amdd.b, (amdf) iixVar.a.a(), amdd.a, (amdf) iixVar.c.a());
                defpackage.him himVar3 = this.a;
                return defpackage.achr.j(aigfVarL, (amey) himVar3.Tj.a(), (aizr) himVar3.Bk.a(), (amac) iixVar.i.a(), (alpg) iixVar.k.a(), (alqf) iixVar.e.a(), (amci) iixVar.g.a());
            case 1:
                amey ameyVar = (amey) this.a.Tj.a();
                defpackage.iix iixVar2 = (defpackage.iix) this.c;
                return defpackage.achr.k(ameyVar, (amac) iixVar2.i.a(), (amci) iixVar2.g.a());
            case 2:
                return new amac((alpg) ((defpackage.iix) this.c).k.a());
            case 3:
                return new alpg();
            case 4:
                defpackage.iix iixVar3 = (defpackage.iix) this.c;
                return new amci((alpg) iixVar3.k.a(), (alqf) iixVar3.e.a());
            case 5:
                return new alqf((amac) ((defpackage.iix) this.c).i.a());
            case 6:
                return new amdu();
            case 7:
                return new alzw((amad) ((defpackage.iix) this.c).d.a());
            default:
                return new alzu();
        }
    }
}
