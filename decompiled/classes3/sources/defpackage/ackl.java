package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackl implements defpackage.acis {
    public final defpackage.acip a;
    private final aoss b;
    private final acal c;
    private final defpackage.vqf d;

    public ackl(defpackage.vqf vqfVar, defpackage.acip acipVar, aoss aossVar, acal acalVar, aduu aduuVar) {
        aooh.f(acipVar, "promotionDisplayEventsListener");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(acalVar, "clearcutLogger");
        aooh.f(aduuVar, "gnpConfig");
        this.d = vqfVar;
        this.a = acipVar;
        this.b = aossVar;
        this.c = acalVar;
    }

    @Override // defpackage.acis
    public final android.view.View a(az azVar, akjx akjxVar) {
        aooh.f(akjxVar, "ui");
        return this.d.J(azVar, akjxVar.c == 5 ? (defpackage.akkh) akjxVar.d : defpackage.akkh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    @Override // defpackage.acis
    public final void b(az azVar, android.view.View view, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.akkc akkcVar) throws aois {
        adub adubVar;
        aooh.f(azVar, "activity");
        aooh.f(promoContext, "promoContext");
        aooh.f(akkcVar, "theme");
        if (view == null) {
            aoov.an(this.b, (aolr) null, 0, new defpackage.acju(this, promoContext, (aoln) null, 7), 3);
            return;
        }
        akjx akjxVar = promoContext.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        defpackage.akkh akkhVar = akjxVar.c == 5 ? (defpackage.akkh) akjxVar.d : defpackage.akkh.a;
        aooh.e(akkhVar, "getTooltipUi(...)");
        aooh.f(akkcVar, "theme");
        aooh.f(akkhVar, "tooltipUi");
        alat alatVar = akkhVar.j;
        aooh.e(alatVar, "getStylingSchemeList(...)");
        if (defpackage.acjh.c(akkcVar, alatVar)) {
            adubVar = new adub(defpackage.akkc.UNSPECIFIED);
        } else {
            alat alatVar2 = akkhVar.j;
            aooh.e(alatVar2, "getStylingSchemeList(...)");
            adub adubVarA = defpackage.acjh.a(akkcVar, alatVar2);
            if (adubVarA instanceof adtv) {
                adubVar = (adtv) adubVarA;
            } else if ((akkhVar.b & 32) == 0) {
                adubVar = new adub(akkcVar);
            } else {
                akjc akjcVar = akkhVar.k;
                if (akjcVar == null) {
                    akjcVar = akjc.a;
                }
                alat alatVar3 = akjcVar.h;
                aooh.e(alatVar3, "getStylingSchemeList(...)");
                adub adubVarA2 = defpackage.acjh.a(akkcVar, alatVar3);
                if (adubVarA2 instanceof adtv) {
                    adubVar = (adtv) adubVarA2;
                } else {
                    adubVar = new adub(akkcVar);
                }
            }
        }
        int iR = anty.R(adubVar);
        if (iR != 0) {
            if (iR != 1) {
                throw new aois();
            }
            aoov.an(this.b, (aolr) null, 0, new defpackage.acju(this, promoContext, (aoln) null, 9, (char[]) null), 3);
            return;
        }
        defpackage.akkc akkcVar2 = (defpackage.akkc) adubVar.a;
        akjx akjxVar2 = promoContext.c().h;
        if (akjxVar2 == null) {
            akjxVar2 = akjx.a;
        }
        if (akjxVar2.f) {
            aoov.an(this.b, (aolr) null, 0, new defpackage.acju(this, promoContext, (aoln) null, 8, (byte[]) null), 3);
            return;
        }
        this.c.k(promoContext);
        defpackage.ackk ackkVar = new defpackage.ackk();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("promo_context", promoContext);
        bundle.putInt("theme", akkcVar2.d);
        ackkVar.au(bundle);
        u uVar = new u(azVar.a());
        uVar.e(0, ackkVar, "TooltipFragment", 1);
        uVar.i(true, true);
    }

    @Override // defpackage.acis
    public final boolean c(akjw akjwVar) {
        return akjwVar == akjw.q;
    }
}
