package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acwm implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ acwm(acwx acwxVar, boolean z, defpackage.acvj acvjVar, java.lang.String str, int i) {
        this.$cid = i;
        this.b = acwxVar;
        this.a = false;
        this.c = acvjVar;
        this.d = str;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid == 0) {
            return (defpackage.acui) obj;
        }
        if (!((java.lang.Boolean) obj).booleanValue() || !this.a) {
            return defpackage.vrr.c;
        }
        return ((gat) this.d).y((android.content.Context) this.c, (android.telecom.PhoneAccountHandle) this.b) ? defpackage.vrr.a : defpackage.vrr.b;
    }

    public /* synthetic */ acwm(boolean z, gat gatVar, android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.a = z;
        this.d = gatVar;
        this.c = context;
        this.b = phoneAccountHandle;
    }
}
