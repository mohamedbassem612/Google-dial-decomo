package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class khe {
    public final agsm a;
    public final android.content.Context b;
    public final khr c;
    public final khn d;
    public final aoss e;
    public final rlv f;
    private final lqz g;

    public khe(agsm agsmVar, android.content.Context context, khr khrVar, khn khnVar, lqz lqzVar, aoss aossVar, rlv rlvVar) {
        aooh.f(agsmVar, "androidFutures");
        aooh.f(context, "appContext");
        aooh.f(lqzVar, "haloCallLogDataIntegration");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        this.a = agsmVar;
        this.b = context;
        this.c = khrVar;
        this.d = khnVar;
        this.g = lqzVar;
        this.e = aossVar;
        this.f = rlvVar;
    }

    public final kgu a(kiu kiuVar) {
        return (kgu) defpackage.hgt.w(kiuVar, this.g);
    }

    public final defpackage.khd b(boolean z, java.lang.String str, java.lang.String str2) {
        if (str2.length() > 0) {
            return new defpackage.khd(this, z, str, str2);
        }
        return null;
    }
}
