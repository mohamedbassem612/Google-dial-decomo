package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjv implements defpackage.acis {
    public final defpackage.acip a;
    private final aoss b;
    private final acal c;

    public acjv(defpackage.acip acipVar, aoss aossVar, acal acalVar) {
        aooh.f(acipVar, "promotionDisplayEventsListener");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(acalVar, "clearcutLogger");
        this.a = acipVar;
        this.b = aossVar;
        this.c = acalVar;
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
        akjh akjhVar = akjxVar.c == 2 ? (akjh) akjxVar.d : akjh.a;
        aooh.e(akjhVar, "getRatingPromptUi(...)");
        adtv adtvVarD = defpackage.acjh.d(akkcVar, akjhVar);
        int iR = anty.R(adtvVarD);
        if (iR != 0) {
            if (iR != 1) {
                throw new aois();
            }
            aoov.an(this.b, (aolr) null, 0, new defpackage.acju(this, promoContext, (aoln) null, 0), 3);
            return;
        }
        defpackage.akkc akkcVar2 = (defpackage.akkc) ((adub) adtvVarD).a;
        akjx akjxVar2 = promoContext.c().h;
        if (akjxVar2 == null) {
            akjxVar2 = akjx.a;
        }
        if (akjxVar2.f) {
            aoov.an(this.b, (aolr) null, 0, new defpackage.acju(this, promoContext, (aoln) null, 1, (byte[]) null), 3);
            return;
        }
        this.c.k(promoContext);
        defpackage.acjy acjyVarAU = defpackage.acjy.aU(promoContext, akkcVar2);
        if (anfq.g()) {
            acjyVarAU.r(azVar.a(), "PromoUiDialogFragment");
        } else {
            acjyVarAU.q(azVar.a(), "PromoUiDialogFragment");
        }
    }

    @Override // defpackage.acis
    public final boolean c(akjw akjwVar) {
        return akjwVar == akjw.o;
    }
}
