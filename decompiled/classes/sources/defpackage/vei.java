package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vei {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/scheduler/VvmTimeProvider");
    public final android.content.Context b;
    private final java.util.concurrent.Executor c;

    public vei(android.content.Context context, java.util.concurrent.Executor executor) {
        this.b = context;
        this.c = executor;
    }

    public final defpackage.ajcq a() {
        return defpackage.ahvr.F(new vdp(this, 3), this.c);
    }
}
