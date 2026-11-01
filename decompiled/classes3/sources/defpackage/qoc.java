package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qoc implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ android.content.Context b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qoc(boolean z, android.content.Context context, boolean z2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = context;
        this.c = z2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            if (!this.a) {
                return j$.util.Optional.empty();
            }
            boolean z = this.c;
            android.content.Context context = this.b;
            defpackage.qmu qmuVarA = defpackage.qmy.a();
            qmuVarA.a = defpackage.qmz.BUTTON_MERGE;
            qmuVarA.d(context.getString(2132020777));
            qmuVarA.c(2131231935);
            qmuVarA.b(context.getString(2132019051));
            defpackage.qmv qmvVarA = defpackage.qmw.a();
            qmvVarA.c(z);
            qmuVarA.b = qmvVarA.a();
            return j$.util.Optional.of(qmuVarA.a());
        }
        if (i == 1) {
            if (!this.a) {
                return j$.util.Optional.empty();
            }
            boolean z2 = this.c;
            android.content.Context context2 = this.b;
            defpackage.qmu qmuVarA2 = defpackage.qmy.a();
            qmuVarA2.a = defpackage.qmz.BUTTON_MUTE;
            qmuVarA2.d(context2.getString(2132020778));
            qmuVarA2.c(2131231973);
            qmuVarA2.b(context2.getString(2132020778));
            defpackage.qmv qmvVarA2 = defpackage.qmw.a();
            qmvVarA2.b(z2);
            qmuVarA2.b = qmvVarA2.a();
            return j$.util.Optional.of(qmuVarA2.a());
        }
        if (i == 2) {
            if (!this.a) {
                return j$.util.Optional.empty();
            }
            boolean z3 = this.c;
            android.content.Context context3 = this.b;
            defpackage.qmu qmuVarA3 = defpackage.qmy.a();
            qmuVarA3.a = defpackage.qmz.BUTTON_ADD_CALL;
            qmuVarA3.d(context3.getString(2132020771));
            qmuVarA3.c(2131231049);
            qmuVarA3.b(context3.getString(2132020771));
            defpackage.qmv qmvVarA3 = defpackage.qmw.a();
            qmvVarA3.c(true);
            qmvVarA3.d(z3);
            qmuVarA3.b = qmvVarA3.a();
            return j$.util.Optional.of(qmuVarA3.a());
        }
        boolean z4 = this.a;
        if (i == 3) {
            if (!z4) {
                return j$.util.Optional.empty();
            }
            boolean z5 = this.c;
            android.content.Context context4 = this.b;
            defpackage.qmu qmuVarA4 = defpackage.qmy.a();
            qmuVarA4.a = defpackage.qmz.BUTTON_DOWNGRADE_TO_AUDIO;
            qmuVarA4.d(context4.getString(2132020773));
            qmuVarA4.c(2131231060);
            qmuVarA4.b(context4.getString(2132019044));
            defpackage.qmv qmvVarA4 = defpackage.qmw.a();
            qmvVarA4.c(z5);
            qmuVarA4.b = qmvVarA4.a();
            return j$.util.Optional.of(qmuVarA4.a());
        }
        if (!z4) {
            return j$.util.Optional.empty();
        }
        boolean z6 = this.c;
        android.content.Context context5 = this.b;
        akzx akzxVarM = defpackage.quf.a.m();
        defpackage.qug qugVar = defpackage.qug.BUTTON_UPGRADE_TO_CARRIER_VIDEO;
        akzxVarM.u();
        defpackage.quf qufVar = (defpackage.quf) akzxVarM.b;
        qufVar.e = qugVar.H;
        qufVar.b |= 1;
        java.lang.String string = context5.getString(2132019080);
        akzxVarM.u();
        defpackage.quf qufVar2 = (defpackage.quf) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        qufVar2.b |= 4;
        qufVar2.g = string;
        akzxVarM.u();
        defpackage.quf qufVar3 = (defpackage.quf) akzxVarM.b;
        qufVar3.c = 2;
        qufVar3.d = 2131231658;
        java.lang.String string2 = context5.getString(2132019080);
        akzxVarM.u();
        defpackage.quf qufVar4 = (defpackage.quf) akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        qufVar4.b |= 8;
        qufVar4.h = string2;
        defpackage.que queVar = defpackage.que.MORE;
        akzxVarM.u();
        defpackage.quf qufVar5 = (defpackage.quf) akzxVarM.b;
        qufVar5.l = queVar.g;
        qufVar5.b |= 512;
        akzxVarM.u();
        defpackage.quf qufVar6 = (defpackage.quf) akzxVarM.b;
        qufVar6.b |= 16;
        qufVar6.i = z6;
        return j$.util.Optional.of((defpackage.quf) akzxVarM.p());
    }
}
