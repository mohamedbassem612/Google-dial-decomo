package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijk {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/exclusivity/impl/AudioPrismExclusivityDialogsImpl");
    public final aoss b;
    public final java.util.concurrent.atomic.AtomicReference c;
    public final apni d;
    private final zpz e;

    public ijk(defpackage.ihr ihrVar, apni apniVar, aoss aossVar, zpz zpzVar) {
        aooh.f(ihrVar, "audioPrismSession");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zpzVar, "inCallStatePropagator");
        this.d = apniVar;
        this.b = aossVar;
        this.e = zpzVar;
        this.c = new java.util.concurrent.atomic.AtomicReference(null);
    }

    public final defpackage.igk a() {
        return (defpackage.igk) this.c.get();
    }

    public final void b() {
        a.b().l("com/android/dialer/audioprism/internal/exclusivity/impl/AudioPrismExclusivityDialogsImpl", "clearDialogConfig", 44, "AudioPrismExclusivityDialogsImpl.kt").v("Clear dialog config");
        this.c.set(null);
        this.e.a(ajcm.a);
    }
}
