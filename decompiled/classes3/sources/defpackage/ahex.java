package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahex {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public ahex(android.content.Context context, ahyn ahynVar, defpackage.aevz aevzVar, com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.e = context;
        this.b = ahvr.bI(new aell(context, 13));
        this.a = ((java.lang.Boolean) ((ahys) ahynVar).a).booleanValue();
        this.c = aevzVar;
        this.d = clearcutMetricSnapshotTransmitter;
    }

    public static final java.lang.String d(int i) {
        return i + (-1) != 0 ? "retry" : "onetry";
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(int i, java.lang.String str) {
        return !this.a ? ajcm.a : ahvr.H(((defpackage.ahid) this.e).a(), new defpackage.ahds(new defpackage.abpk(this, i, str, 3), 5), (java.util.concurrent.Executor) this.c);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq b(ajcq ajcqVar, java.lang.String str, int i, j$.time.Duration duration) {
        aooh.f(str, "listenerKey");
        aooh.f(duration, "duration");
        return !this.a ? ajcm.a : ahvr.H(((defpackage.ahid) this.e).a(), new defpackage.ahds(new cpj(this, ajcqVar, str, i, duration, 2), 3), (java.util.concurrent.Executor) this.c);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq c(java.lang.String str, int i) {
        aooh.f(str, "listenerKey");
        return !this.a ? ajcm.a : ahvr.H(((defpackage.ahid) this.e).a(), new defpackage.ahds(new defpackage.abpk(this, str, i, 2), 4), (java.util.concurrent.Executor) this.c);
    }

    public ahex(boolean z, aoin aoinVar, ajct ajctVar, defpackage.ahid ahidVar, aogc aogcVar) {
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(ahidVar, "checkboxChecker");
        aooh.f(aogcVar, "streamzFields");
        this.a = z;
        this.b = aoinVar;
        this.c = ajctVar;
        this.e = ahidVar;
        this.d = aogcVar;
    }

    public ahex(boolean z, aoin aoinVar, ajct ajctVar, defpackage.ahid ahidVar, aogc aogcVar, byte[] bArr) {
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(ahidVar, "checkboxChecker");
        aooh.f(aogcVar, "streamzFields");
        this.a = z;
        this.b = aoinVar;
        this.c = ajctVar;
        this.e = ahidVar;
        this.d = aogcVar;
    }

    public ahex(android.content.Context context, java.lang.String str, oqf oqfVar, java.lang.String str2, boolean z) {
        this.e = context;
        this.b = str;
        this.c = oqfVar;
        this.d = str2;
        this.a = z;
    }
}
