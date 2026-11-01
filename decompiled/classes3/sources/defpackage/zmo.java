package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmo {
    public static final aimz a = aimz.i("com/google/android/dialershared/incall/core/addcall/AddCallController");
    public final zpz b;
    public final zzx c;
    private final android.content.Context d;
    private final zmq e;
    private final zms f;
    private final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean();

    public zmo(zzx zzxVar, android.content.Context context, zmq zmqVar, zms zmsVar, zpz zpzVar) {
        this.c = zzxVar;
        this.d = context;
        this.e = zmqVar;
        this.f = zmsVar;
        this.b = zpzVar;
    }

    public final void a() {
        if (!this.c.d().isPresent()) {
            a.bI(a.c().m(aioa.b), "inCallService is empty.", "com/google/android/dialershared/incall/core/addcall/AddCallController", "addCall", 'T', "AddCallController.java", zct.b);
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.addFlags(268435456);
        intent.putExtra("add_call_mode", true);
        try {
            a.b().l("com/google/android/dialershared/incall/core/addcall/AddCallController", "addCall", 94, "AddCallController.java").v("Sending the add DialerCall intent");
            ahqx.l(this.d, intent);
        } catch (android.content.ActivityNotFoundException e) {
            a.bq(a.c(), "Activity for adding calls isn't found.", "com/google/android/dialershared/incall/core/addcall/AddCallController", "addCall", 'h', "AddCallController.java", e, zct.b);
        }
    }

    public final void b() {
        if (this.f.g()) {
            return;
        }
        this.e.c(true, true);
        this.g.set(true);
        this.b.a(ajcm.a);
    }

    public final void c() {
        if (this.g.getAndSet(false)) {
            this.e.c(false, true);
            this.b.a(ajcm.a);
        }
    }
}
