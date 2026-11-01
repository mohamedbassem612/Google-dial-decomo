package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qwh implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ defpackage.zpo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ android.content.Context d;

    public /* synthetic */ qwh(boolean z, defpackage.zpo zpoVar, android.content.Context context, boolean z2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = zpoVar;
        this.d = context;
        this.c = z2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        boolean z = this.a;
        if (i != 0) {
            if (!z) {
                return j$.util.Optional.empty();
            }
            android.content.Context context = this.d;
            boolean z2 = this.b == defpackage.zpo.e;
            defpackage.qmu qmuVarA = defpackage.qmy.a();
            qmuVarA.a = defpackage.qmz.BUTTON_HOLD;
            qmuVarA.d(context.getString(2132020775));
            qmuVarA.c(2131231978);
            java.lang.String string = z2 ? context.getString(2132019058) : context.getString(2132019050);
            boolean z3 = this.c;
            qmuVarA.b(string);
            defpackage.qmv qmvVarA = defpackage.qmw.a();
            qmvVarA.c(!z3);
            qmvVarA.b(z2);
            qmuVarA.b = qmvVarA.a();
            return j$.util.Optional.of(qmuVarA.a());
        }
        if (!z || this.b == defpackage.zpo.e || this.c) {
            return j$.util.Optional.empty();
        }
        android.content.Context context2 = this.d;
        akzx akzxVarM = defpackage.quf.a.m();
        defpackage.qug qugVar = defpackage.qug.BUTTON_HOLD;
        akzxVarM.u();
        defpackage.quf qufVar = (defpackage.quf) akzxVarM.b;
        qufVar.e = qugVar.H;
        qufVar.b |= 1;
        java.lang.String string2 = context2.getString(2132019067);
        akzxVarM.u();
        defpackage.quf qufVar2 = (defpackage.quf) akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        qufVar2.b |= 4;
        qufVar2.g = string2;
        akzxVarM.u();
        defpackage.quf qufVar3 = (defpackage.quf) akzxVarM.b;
        qufVar3.c = 2;
        qufVar3.d = 2131231528;
        java.lang.String string3 = context2.getString(2132019050);
        akzxVarM.u();
        defpackage.quf qufVar4 = (defpackage.quf) akzxVarM.b;
        j$.util.Objects.requireNonNull(string3);
        qufVar4.b |= 8;
        qufVar4.h = string3;
        defpackage.que queVar = defpackage.que.MORE;
        akzxVarM.u();
        defpackage.quf qufVar5 = (defpackage.quf) akzxVarM.b;
        qufVar5.l = queVar.g;
        qufVar5.b |= 512;
        akzxVarM.u();
        defpackage.quf qufVar6 = (defpackage.quf) akzxVarM.b;
        qufVar6.b |= 16;
        qufVar6.i = true;
        return j$.util.Optional.of((defpackage.quf) akzxVarM.p());
    }

    public /* synthetic */ qwh(boolean z, defpackage.zpo zpoVar, boolean z2, android.content.Context context, int i) {
        this.$cid = i;
        this.a = z;
        this.b = zpoVar;
        this.c = z2;
        this.d = context;
    }
}
