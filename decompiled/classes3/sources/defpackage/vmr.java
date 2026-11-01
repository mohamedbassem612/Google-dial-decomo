package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vmr implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vmr(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, int i) {
        this.$cid = i;
        this.b = phoneAccountHandle;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.$cid == 0) {
            ((vcc) obj).k((android.telecom.PhoneAccountHandle) this.b, this.a);
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object obj2 = this.b;
        if (this.a) {
            akzx akzxVar = (akzx) obj2;
            akzxVar.u();
            defpackage.abwd abwdVar = (defpackage.abwd) akzxVar.b;
            defpackage.abwd abwdVar2 = defpackage.abwd.a;
            j$.util.Objects.requireNonNull(str);
            abwdVar.b |= 1;
            abwdVar.c = str;
        }
        akzx akzxVar2 = (akzx) obj2;
        akzxVar2.u();
        defpackage.abwd abwdVar3 = (defpackage.abwd) akzxVar2.b;
        defpackage.abwd abwdVar4 = defpackage.abwd.a;
        j$.util.Objects.requireNonNull(str);
        abwdVar3.b |= 2;
        abwdVar3.d = str;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ vmr(boolean z, akzx akzxVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = akzxVar;
    }
}
