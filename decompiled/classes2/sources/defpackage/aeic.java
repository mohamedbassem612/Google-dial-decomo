package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aeic {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public aeic(android.content.Context context, java.lang.Runnable runnable, java.lang.Boolean bool) {
        android.media.AudioManager audioManagerAH = context == null ? null : defpackage.hgt.aH(context);
        if (audioManagerAH == null || (bool != null && bool.booleanValue())) {
            this.d = null;
            this.a = false;
            this.c = null;
            this.b = null;
            return;
        }
        android.media.Spatializer spatializerM = ebc$.ExternalSyntheticApiModelOutline7.m(audioManagerAH);
        this.d = spatializerM;
        this.a = ebc$.ExternalSyntheticApiModelOutline7.m(ebc$.ExternalSyntheticApiModelOutline7.m(spatializerM)) != 0;
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        ahvr.ci(looperMyLooper);
        android.os.Handler handler = new android.os.Handler(looperMyLooper);
        this.c = handler;
        defpackage.fjc fjcVar = new defpackage.fjc(this, runnable);
        this.b = fjcVar;
        j$.util.Objects.requireNonNull(handler);
        ebc$.ExternalSyntheticApiModelOutline7.m(ebc$.ExternalSyntheticApiModelOutline7.m(spatializerM), new defpackage.fbk(handler, 2), fjcVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.media.Spatializer$OnSpatializerStateChangedListener, java.lang.Object] */
    public final void a() {
        ?? r1;
        java.lang.Object obj;
        java.lang.Object obj2 = this.d;
        if (obj2 == null || (r1 = this.b) == 0 || (obj = this.c) == null) {
            return;
        }
        ebc$.ExternalSyntheticApiModelOutline7.m(ebc$.ExternalSyntheticApiModelOutline7.m(obj2), (android.media.Spatializer$OnSpatializerStateChangedListener) r1);
        ((android.os.Handler) obj).removeCallbacksAndMessages(null);
    }

    public final boolean b() {
        java.lang.Object obj = this.d;
        return obj != null && ebc$.ExternalSyntheticApiModelOutline7.m(ebc$.ExternalSyntheticApiModelOutline7.m(obj));
    }

    public final boolean c() {
        java.lang.Object obj = this.d;
        return obj != null && ebc$.ExternalSyntheticApiModelOutline7.m$1(ebc$.ExternalSyntheticApiModelOutline7.m(obj));
    }

    public final boolean d() {
        return this.d != null && this.a && b() && c();
    }

    public aeic(android.content.res.Resources resources, boolean z) {
        aooh.f(resources, "resources");
        this.b = resources;
        this.a = z;
        this.c = aooc.ag(new addr(this, 3));
        this.d = aooc.ag(new addr(this, 4));
        aooc.ag(new addr(this, 5));
    }
}
