package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qod implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ qod(boolean z, boolean z2, android.content.Context context, boolean z3, boolean z4, boolean z5, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
        this.f = context;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        boolean z = this.a;
        if (i != 0) {
            if (z || this.b) {
                return j$.util.Optional.empty();
            }
            if (this.c) {
                ((defpackage.qbe) this.f).c(qbc.gA);
            }
            return (this.d || this.e) ? j$.util.Optional.of(defpackage.pzp.EMERGENCY_CALLING_SCREEN) : j$.util.Optional.empty();
        }
        if (!z || !this.b) {
            return j$.util.Optional.empty();
        }
        boolean z2 = this.c;
        java.lang.Object obj = this.f;
        defpackage.qmu qmuVarA = defpackage.qmy.a();
        qmuVarA.a = defpackage.qmz.BUTTON_CAMERA_OFF;
        android.content.Context context = (android.content.Context) obj;
        qmuVarA.d(context.getString(2132020772));
        qmuVarA.c(2131231078);
        java.lang.String string = z2 ? context.getString(2132019043) : context.getString(2132019042);
        boolean z3 = this.e;
        boolean z4 = this.d;
        qmuVarA.b(string);
        defpackage.qmv qmvVarA = defpackage.qmw.a();
        qmvVarA.c(z4);
        qmvVarA.b(z2);
        qmvVarA.d(!z3);
        qmuVarA.b = qmvVarA.a();
        return j$.util.Optional.of(qmuVarA.a());
    }

    public /* synthetic */ qod(boolean z, boolean z2, boolean z3, defpackage.qbe qbeVar, boolean z4, boolean z5, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f = qbeVar;
        this.d = z4;
        this.e = z5;
    }
}
