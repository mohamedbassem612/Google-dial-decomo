package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ies {
    public final android.media.AudioFocusRequest a;
    final /* synthetic */ defpackage.apnt b;
    final /* synthetic */ defpackage.aogc c;
    private final defpackage.ier d;

    public ies(defpackage.apnt apntVar, defpackage.aogc aogcVar) {
        this.b = apntVar;
        this.c = aogcVar;
        defpackage.ier ierVar = new defpackage.ier(apntVar);
        this.d = ierVar;
        android.media.AudioFocusRequest.Builder builder = new android.media.AudioFocusRequest.Builder(2);
        java.lang.String str = defpackage.eum.a;
        android.media.AudioAttributes audioAttributesBuild = new android.media.AudioAttributes.Builder().setContentType(1).setUsage(2).build();
        defpackage.aooh.e(audioAttributesBuild, "build(...)");
        this.a = da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m$1(da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(builder, audioAttributesBuild), ierVar), false));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aoss, java.lang.Object] */
    public final void a() {
        this.b.m(5);
        defpackage.aogc aogcVar = this.c;
        ((defpackage.apni) aogcVar.b).i(defpackage.aoov.an(aogcVar.a, null, 0, new defpackage.huk(aogcVar, this, (defpackage.aoln) null, 9), 3));
    }
}
