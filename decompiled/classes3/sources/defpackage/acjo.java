package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjo implements defpackage.acis {
    public final defpackage.acip a;
    private final aoss b;

    public acjo(defpackage.acip acipVar, acal acalVar, aoss aossVar) {
        aooh.f(acipVar, "promotionDisplayEventsListener");
        aooh.f(acalVar, "clearcutLogger");
        aooh.f(aossVar, "backgroundScope");
        this.a = acipVar;
        this.b = aossVar;
    }

    @Override // defpackage.acis
    public final android.view.View a(az azVar, akjx akjxVar) {
        aooh.f(akjxVar, "ui");
        return null;
    }

    @Override // defpackage.acis
    public final void b(az azVar, android.view.View view, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.akkc akkcVar) {
        aooh.f(azVar, "activity");
        aooh.f(promoContext, "promoContext");
        aooh.f(akkcVar, "theme");
        aoov.an(this.b, (aolr) null, 0, new defpackage.abvg(this, promoContext, (aoln) null, 20), 3);
    }

    @Override // defpackage.acis
    public final boolean c(akjw akjwVar) {
        return akjwVar == akjw.r;
    }
}
