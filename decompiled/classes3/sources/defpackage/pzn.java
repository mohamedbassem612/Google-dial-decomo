package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzn {
    public static final aimz a = aimz.i("com/android/dialer/incall/earpieceondisplay/EarpieceOnDisplayTracker");
    public final java.util.concurrent.atomic.AtomicReference b;
    public final zpz c;

    public pzn(zpz zpzVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        this.c = zpzVar;
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((java.lang.Boolean) this.b.get());
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final void b(aw awVar, aoss aossVar) {
        aooh.f(aossVar, "coroutineScope");
        az azVarG = awVar.G();
        if (azVarG == null) {
            a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/earpieceondisplay/EarpieceOnDisplayTracker", "startTracking", 49, "EarpieceOnDisplayTracker.kt").v("Ignored because Activity is not available");
            return;
        }
        this.b.set(null);
        aimz aimzVar = zih.a;
        aoov.al(aossVar, zih.b.plus(aols.a), 1, new fxp((aoln) null, awVar, azVarG, this, 7));
    }
}
