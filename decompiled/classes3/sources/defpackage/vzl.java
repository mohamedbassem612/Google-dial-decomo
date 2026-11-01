package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vzl implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vzl(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid != 0) {
            java.lang.Integer num = (java.lang.Integer) obj;
            long jIntValue = num.intValue();
            long j = this.a;
            if (jIntValue == j) {
                nzh.a.b().l("com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabaseWorker", "syncDatabase", 82, "EligibilityExpansionDatabaseWorker.java").x("database has latest version: %d", j);
                return ajcm.a;
            }
            java.lang.Object obj2 = this.b;
            defpackage.acvm acvmVarA = defpackage.acvn.a();
            nzh nzhVar = (nzh) obj2;
            nzm nzmVar = nzhVar.d;
            acvmVarA.b((java.lang.String) nzmVar.e.a());
            return ahvr.I(ahvr.I(nzmVar.f.G(acvmVarA.a()), new ocj(nzmVar, 1), nzmVar.c), new ljp(obj2, num, 14), nzhVar.b);
        }
        akzx akzxVarM = miu.a.m();
        akzxVarM.u();
        miu miuVar = akzxVarM.b;
        miuVar.b |= 64;
        miuVar.i = this.a;
        defpackage.vzn vznVar = (defpackage.vzn) this.b;
        java.lang.String string = vznVar.b.getString(2132019793);
        akzxVarM.u();
        miu miuVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        miuVar2.b |= 2;
        miuVar2.d = string;
        miv mivVar = miv.c;
        akzxVarM.u();
        miu miuVar3 = akzxVarM.b;
        miuVar3.c = mivVar.g;
        miuVar3.b |= 1;
        miy miyVar = miy.c;
        akzxVarM.u();
        miu miuVar4 = akzxVarM.b;
        miuVar4.h = miyVar.g;
        miuVar4.b |= 32;
        java.lang.CharSequence text = ((android.content.Context) ((defpackage.vqu) ((ucm) vznVar.c.g().orElseThrow()).a).a).getText(2132020584);
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[1];
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        defpackage.urv urvVar = ((defpackage.urw) obj).c;
        if (urvVar == null) {
            urvVar = defpackage.urv.a;
        }
        charSequenceArr[0] = java.lang.String.valueOf(((long) urvVar.d) / 60);
        java.lang.String string2 = android.text.TextUtils.expandTemplate(text, charSequenceArr).toString();
        akzxVarM.u();
        miu miuVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        miuVar5.b |= 4;
        miuVar5.e = string2;
        return new java.util.HashSet((java.util.Collection) new aile(akzxVarM.p()));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
