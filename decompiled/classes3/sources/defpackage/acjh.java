package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjh {
    public static final defpackage.acjh a = new defpackage.acjh();

    public static final adtz a(defpackage.akkc akkcVar, java.util.List list) {
        java.lang.Object next;
        defpackage.akkc akkcVarB;
        aooh.f(akkcVar, "theme");
        aooh.f(list, "styles");
        java.util.Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            akkcVarB = defpackage.akkc.b(((akkd) next).c);
            if (akkcVarB == null) {
                akkcVarB = defpackage.akkc.UNSPECIFIED;
            }
        } while (akkcVarB != akkcVar);
        akkd akkdVar = (akkd) next;
        return akkdVar != null ? new adub(akkdVar) : new defpackage.adtw(new java.lang.IllegalArgumentException(a.bg(akkcVar, "Theme ", " not found in styles")), adty.U);
    }

    public static final boolean c(defpackage.akkc akkcVar, java.util.List list) {
        return akkcVar == defpackage.akkc.UNSPECIFIED || list.isEmpty();
    }

    public static final adtz d(defpackage.akkc akkcVar, akjh akjhVar) {
        aooh.f(akkcVar, "theme");
        aooh.f(akjhVar, "dialogUi");
        alat alatVar = akjhVar.j;
        aooh.e(alatVar, "getStylingSchemeList(...)");
        if (c(akkcVar, alatVar)) {
            return new adub(defpackage.akkc.UNSPECIFIED);
        }
        alat alatVar2 = akjhVar.j;
        aooh.e(alatVar2, "getStylingSchemeList(...)");
        adtv adtvVarA = a(akkcVar, alatVar2);
        if (adtvVarA instanceof adtv) {
            return adtvVarA;
        }
        java.util.Iterator it = akjhVar.g.iterator();
        while (it.hasNext()) {
            alat alatVar3 = ((akjc) it.next()).h;
            aooh.e(alatVar3, "getStylingSchemeList(...)");
            adtv adtvVarA2 = a(akkcVar, alatVar3);
            if (adtvVarA2 instanceof adtv) {
                return adtvVarA2;
            }
        }
        return new adub(akkcVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x001c, B:10:0x001f, B:11:0x0022), top: B:18:0x0001 }] */
    public final synchronized defpackage.akkc b(android.content.Context context) {
        defpackage.akkc akkcVar;
        aooh.f(context, "context");
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 0) {
            akkcVar = defpackage.akkc.UNSPECIFIED;
        } else if (i == 16) {
            akkcVar = defpackage.akkc.LIGHT;
        } else if (i == 32) {
            akkcVar = defpackage.akkc.DARK;
        } else {
            akkcVar = defpackage.akkc.UNSPECIFIED;
        }
        return akkcVar;
    }
}
