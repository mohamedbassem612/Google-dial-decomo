package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lcb implements defpackage.ols {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/demo/CallScreenDemoController");
    private final android.content.Context b;
    private j$.util.Optional c = j$.util.Optional.empty();

    public lcb(android.content.Context context) {
        this.b = context;
    }

    @Override // defpackage.ols
    public final olq a(int i) {
        if (i == 0) {
            olp olpVarA = olq.a();
            olpVarA.d(66);
            olpVarA.b(154);
            return olpVarA.a();
        }
        if (i == 1) {
            olp olpVarA2 = olq.a();
            olpVarA2.d(253);
            olpVarA2.b(279);
            return olpVarA2.a();
        }
        if (i == 2) {
            olp olpVarA3 = olq.a();
            olpVarA3.d(339);
            olpVarA3.b(377);
            return olpVarA3.a();
        }
        if (i != 3) {
            throw new java.lang.AssertionError(java.lang.String.format(java.util.Locale.US, "No loop clip for page: %d", java.lang.Integer.valueOf(i)));
        }
        olp olpVarA4 = olq.a();
        olpVarA4.d(436);
        olpVarA4.b(474);
        return olpVarA4.a();
    }

    @Override // defpackage.ols
    public final defpackage.aify b() {
        if (!this.c.isPresent()) {
            lcg lcgVar = lcg.a;
            defpackage.akzx akzxVarM = lcgVar.m();
            akzxVarM.u();
            lcg lcgVar2 = akzxVarM.b;
            lcgVar2.b |= 1;
            lcgVar2.c = 2132017788;
            akzxVarM.u();
            lcg lcgVar3 = akzxVarM.b;
            lcgVar3.b |= 2;
            lcgVar3.d = 2132017787;
            lcc lccVarC = lcc.c(akzxVarM.r());
            defpackage.akzx akzxVarM2 = lcgVar.m();
            akzxVarM2.u();
            lcg lcgVar4 = akzxVarM2.b;
            lcgVar4.b |= 1;
            lcgVar4.c = 2132017790;
            akzxVarM2.u();
            lcg lcgVar5 = akzxVarM2.b;
            lcgVar5.b |= 2;
            lcgVar5.d = 2132017789;
            akzxVarM2.u();
            lcg lcgVar6 = akzxVarM2.b;
            lcgVar6.e = 1;
            lcgVar6.b |= 4;
            lcc lccVarC2 = lcc.c(akzxVarM2.r());
            defpackage.akzx akzxVarM3 = lcgVar.m();
            akzxVarM3.u();
            lcg lcgVar7 = akzxVarM3.b;
            lcgVar7.b |= 1;
            lcgVar7.c = 2132017792;
            akzxVarM3.u();
            lcg lcgVar8 = akzxVarM3.b;
            lcgVar8.b |= 2;
            lcgVar8.d = 2132017791;
            akzxVarM3.u();
            lcg lcgVar9 = akzxVarM3.b;
            lcgVar9.e = 2;
            lcgVar9.b |= 4;
            lcc lccVarC3 = lcc.c(akzxVarM3.r());
            defpackage.akzx akzxVarM4 = lcgVar.m();
            akzxVarM4.u();
            lcg lcgVar10 = akzxVarM4.b;
            lcgVar10.b |= 1;
            lcgVar10.c = 2132017794;
            akzxVarM4.u();
            lcg lcgVar11 = akzxVarM4.b;
            lcgVar11.b |= 2;
            lcgVar11.d = 2132017793;
            akzxVarM4.u();
            lcg lcgVar12 = akzxVarM4.b;
            lcgVar12.b |= 8;
            lcgVar12.f = true;
            this.c = j$.util.Optional.of(defpackage.aify.s(lccVarC, lccVarC2, lccVarC3, lcc.c(akzxVarM4.r())));
        }
        return (defpackage.aify) this.c.orElseThrow();
    }

    @Override // defpackage.ols
    public final j$.util.Optional c() {
        otm otmVar = new otm((byte[]) null, (byte[]) null);
        otmVar.b = "call_screen_demo_animation.json";
        otmVar.h();
        return j$.util.Optional.of(otmVar.g());
    }

    @Override // defpackage.ols
    public final /* synthetic */ j$.util.Optional d() {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.ols
    public final /* synthetic */ j$.util.Optional e() {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.ols
    public final /* synthetic */ j$.util.Optional f() {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.ols
    public final j$.util.Optional g(int i) {
        if (i == 0) {
            olp olpVarA = olq.a();
            olpVarA.d(0);
            olpVarA.b(66);
            olpVarA.c(500L);
            return j$.util.Optional.of(olpVarA.a());
        }
        if (i == 1) {
            olp olpVarA2 = olq.a();
            olpVarA2.d(154);
            olpVarA2.b(253);
            return j$.util.Optional.of(olpVarA2.a());
        }
        if (i == 2) {
            olp olpVarA3 = olq.a();
            olpVarA3.d(279);
            olpVarA3.b(339);
            return j$.util.Optional.of(olpVarA3.a());
        }
        if (i != 3) {
            throw new java.lang.AssertionError(java.lang.String.format(java.util.Locale.US, "No transition clip for page: %d", java.lang.Integer.valueOf(i)));
        }
        olp olpVarA4 = olq.a();
        olpVarA4.d(377);
        olpVarA4.b(436);
        return j$.util.Optional.of(olpVarA4.a());
    }

    @Override // defpackage.ols
    public final /* bridge */ /* synthetic */ java.lang.CharSequence h() {
        return this.b.getString(2132017797);
    }

    @Override // defpackage.ols
    public final void i(int i) {
        lhl lhlVar;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/demo/CallScreenDemoController", "endDemo", 98, "CallScreenDemoController.java")).v("endDemo");
        if (!this.c.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/demo/CallScreenDemoController", "endDemo", 'o', "CallScreenDemoController.java")).v("callScreenDemoFragments not present when ending demo");
            return;
        }
        lcc lccVar = (lcc) ((defpackage.aify) this.c.orElseThrow()).get(i);
        if (!lccVar.aG() || (lhlVar = lccVar.f().f.c) == null) {
            return;
        }
        lhlVar.b();
    }

    @Override // defpackage.ols
    public final boolean j() {
        return false;
    }
}
