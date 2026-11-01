package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackd implements defpackage.acis {
    private static final aiof b = aiof.i("GnpSdk");
    public final defpackage.acip a;
    private final android.content.Context c;
    private final aoss d;
    private final acal e;

    public ackd(android.content.Context context, defpackage.acip acipVar, aoss aossVar, acal acalVar) {
        aooh.f(context, "context");
        aooh.f(acipVar, "promotionDisplayEventsListener");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(acalVar, "clearcutLogger");
        this.c = context;
        this.a = acipVar;
        this.d = aossVar;
        this.e = acalVar;
    }

    private final void d(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar) {
        aoov.an(this.d, (aolr) null, 0, new defpackage.xhb(this, promoContext, acirVar, (aoln) null, 14), 3);
    }

    @Override // defpackage.acis
    public final android.view.View a(az azVar, akjx akjxVar) {
        aooh.f(akjxVar, "ui");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.acis
    public final void b(az azVar, android.view.View view, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.akkc akkcVar) throws aois {
        aooh.f(azVar, "activity");
        aooh.f(promoContext, "promoContext");
        aooh.f(akkcVar, "theme");
        akjx akjxVar = promoContext.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        aooh.e(akjxVar, "getUi(...)");
        defpackage.akju akjuVar = akjxVar.c == 6 ? (defpackage.akju) akjxVar.d : defpackage.akju.a;
        aooh.e(akjuVar, "getPermissionUi(...)");
        defpackage.akjt akjtVar = akjuVar.e;
        if (akjtVar == null) {
            akjtVar = defpackage.akjt.b;
        }
        alam alamVar = new alam(akjtVar.c, defpackage.akjt.a);
        if (alamVar.isEmpty()) {
            d(promoContext, defpackage.acir.k);
            return;
        }
        alamVar.size();
        java.lang.Object obj = alamVar.get(0);
        aooh.e(obj, "get(...)");
        java.lang.String strX = defpackage.abxl.x((akgw) obj);
        if (agab.bA(this.c, strX)) {
            b.d().y("Permissions for %s are already granted.", strX);
            d(promoContext, defpackage.acir.m);
            return;
        }
        if (!azVar.shouldShowRequestPermissionRationale(strX) || akjuVar.c) {
            if (akjxVar.f) {
                d(promoContext, defpackage.acir.a);
                return;
            }
            this.e.k(promoContext);
            aiof aiofVar = defpackage.ackf.a;
            defpackage.ackf ackfVarJ = defpackage.abxl.j(promoContext);
            u uVar = new u(azVar.a());
            uVar.e(0, ackfVarJ, "PermissionRequestFrag", 1);
            uVar.i(true, true);
            aoov.an(this.d, (aolr) null, 0, new defpackage.acju(this, promoContext, (aoln) null, 6), 3);
            return;
        }
        akjh akjhVar = akjuVar.d;
        if (akjhVar == null) {
            akjhVar = akjh.a;
        }
        aooh.e(akjhVar, "getWarmupPromptUi(...)");
        adtv adtvVarD = defpackage.acjh.d(akkcVar, akjhVar);
        int iR = anty.R(adtvVarD);
        if (iR != 0) {
            if (iR != 1) {
                throw new aois();
            }
            d(promoContext, defpackage.acir.f);
            return;
        }
        defpackage.akkc akkcVar2 = (defpackage.akkc) ((adub) adtvVarD).a;
        if (akjxVar.f) {
            d(promoContext, defpackage.acir.a);
            return;
        }
        this.e.k(promoContext);
        defpackage.acjy acjyVarAU = defpackage.acjy.aU(promoContext, akkcVar2);
        if (anfq.g()) {
            acjyVarAU.r(azVar.a(), "PromoUiDialogFragment");
        } else {
            acjyVarAU.q(azVar.a(), "PromoUiDialogFragment");
        }
    }

    @Override // defpackage.acis
    public final boolean c(akjw akjwVar) {
        return akjwVar == akjw.n;
    }
}
