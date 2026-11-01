package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackc implements defpackage.acis {
    public final defpackage.acip a;
    public final acal b;
    public final aoss c;
    public final defpackage.ageo d;
    private final ajct e;

    public ackc(defpackage.ageo ageoVar, ajct ajctVar, defpackage.acip acipVar, acal acalVar, aoss aossVar) {
        aooh.f(ajctVar, "backgroundExecutor");
        aooh.f(acipVar, "promotionDisplayEventsListener");
        aooh.f(acalVar, "clearcutLogger");
        aooh.f(aossVar, "backgroundScope");
        this.d = ageoVar;
        this.e = ajctVar;
        this.a = acipVar;
        this.b = acalVar;
        this.c = aossVar;
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
        this.d.b().n(this.e, new defpackage.ackb(promoContext, this, azVar, 0));
    }

    @Override // defpackage.acis
    public final boolean c(akjw akjwVar) {
        return akjwVar == akjw.h;
    }
}
