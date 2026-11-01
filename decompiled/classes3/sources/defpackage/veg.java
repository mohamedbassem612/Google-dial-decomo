package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class veg {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/scheduler/VvmTaskWorker$VvmTaskWorkerDelegate");
    public final java.util.concurrent.Executor c;
    public final java.util.concurrent.Executor d;
    public final zjv e;
    public final aoin f;
    public final aoin g;
    public final vea h;
    public final aogc j;
    private final j$.util.Optional k;
    public final java.util.Map b = new aca();
    public final ahda i = new ahda();

    public veg(java.util.concurrent.Executor executor, aogc aogcVar, vea veaVar, zjv zjvVar, j$.util.Optional optional, aoin aoinVar, aoin aoinVar2) {
        this.c = executor;
        this.d = new ajdc(executor);
        this.j = aogcVar;
        this.h = veaVar;
        this.e = zjvVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.k = optional;
    }

    public final ajcq a() {
        j$.util.Optional optional = this.k;
        optional.isPresent();
        optional.isPresent();
        return ajcm.a;
    }
}
