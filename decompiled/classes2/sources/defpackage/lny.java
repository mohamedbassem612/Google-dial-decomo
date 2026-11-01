package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lny {
    public static final aimz a = aimz.i("com/android/dialer/chocolatechip/impl/dataservice/QuickContactsAppChecker");
    public final aoss b;
    public final android.content.Context c;
    public final agtc d;
    private final ajct e;

    public lny(aoss aossVar, ajct ajctVar, android.content.Context context) {
        aooh.f(aossVar, "blockingScope");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(context, "appContext");
        this.b = aossVar;
        this.e = ajctVar;
        this.c = context;
        this.d = new agtc(new defpackage.ibg(this, 14), ajctVar);
    }
}
