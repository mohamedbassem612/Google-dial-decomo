package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ktb extends da {
    private xtq n;

    private final xtq w() {
        xtq xtqVar = this.n;
        if (xtqVar != null) {
            return xtqVar;
        }
        aigb aigbVar = new aigb(4);
        afbe afbeVar = afbe.a;
        java.lang.String str = (java.lang.String) j$.util.Objects.requireNonNull("com.android.dialer.calloptions.ui.CallOptionsActivity");
        aimz aimzVar = defpackage.ksv.a;
        aigb aigbVar2 = new aigb(4);
        defpackage.afbd afbdVar = new defpackage.afbd();
        afbdVar.a();
        afbdVar.a = defpackage.afbc.a;
        afcd.e("android.intent.action.DIAL", afbdVar, aigbVar2);
        defpackage.afbd afbdVar2 = new defpackage.afbd();
        afbdVar2.a();
        afpl afplVar = new afpl((byte[]) null);
        aigb aigbVar3 = (aigb) afplVar.b;
        aigbVar3.i("add_call_mode", new afcd());
        java.lang.Object obj = afplVar.a;
        aigf aigfVarE = aigbVar3.e(true);
        aihd aihdVarF = ((aigb) obj).e(true).f();
        aild aildVarAn = ahvr.an(aihdVarF, aigfVarE.f());
        if (!aildVarAn.isEmpty()) {
            throw new java.lang.IllegalArgumentException("ExtraSpecSet contains extras that are both typed and untyped: ".concat(aildVarAn.toString()));
        }
        afbdVar2.a = new defpackage.afbc(aigfVarE, aihdVarF);
        afcd.e("android.intent.action.VIEW", afbdVar2, aigbVar2);
        aigbVar.i(str, afcd.d(aigbVar2));
        aljf aljfVar = new aljf(str, aigbVar.e(true), afbeVar, afbeVar);
        ajxi ajxiVarOw = ((afbg) aooc.ar(getApplicationContext(), afbg.class)).ow();
        java.lang.Object obj2 = ajxiVarOw.c;
        java.lang.Object obj3 = ajxiVarOw.a;
        java.lang.Object obj4 = ajxiVarOw.b;
        afmm afmmVar = new afmm();
        afmmVar.b = aljfVar;
        if (obj2 == null) {
            throw new java.lang.NullPointerException("Null resultLogger");
        }
        afmmVar.a = obj2;
        j$.util.Objects.requireNonNull(afmmVar);
        j$.util.Optional optional = (j$.util.Optional) obj3;
        optional.isPresent();
        optional.get();
        j$.util.Objects.requireNonNull(afmmVar);
        j$.util.Optional optional2 = (j$.util.Optional) obj4;
        optional2.isPresent();
        optional2.get();
        java.lang.Object obj5 = afmmVar.b;
        if (obj5 != null && afmmVar.a != null) {
            xtq xtqVar2 = new xtq(obj5, (byte[]) null);
            this.n = xtqVar2;
            return xtqVar2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (afmmVar.b == null) {
            sb.append(" extrasAllowlist");
        }
        if (afmmVar.a == null) {
            sb.append(" resultLogger");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public void A(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void C(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    public final android.content.Intent getIntent() {
        return w().O(super.getIntent(), 1);
    }

    public final void onActivityReenter(int i, android.content.Intent intent) {
        super.onActivityReenter(i, w().O(intent, 3));
    }

    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        A(i, i2, w().O(intent, 2));
    }

    protected final void onNewIntent(android.content.Intent intent) {
        C(w().O(intent, 1));
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent, android.app.ComponentCaller componentCaller) {
        super.onActivityResult(i, i2, w().O(intent, 2), componentCaller);
    }

    public final void onNewIntent(android.content.Intent intent, android.app.ComponentCaller componentCaller) {
        super.onNewIntent(w().O(intent, 1), componentCaller);
    }
}
