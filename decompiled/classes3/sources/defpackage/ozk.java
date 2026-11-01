package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ozk {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/ui/horizontalswipe/impl/HorizontalSwipeAnswerMethodFragmentPeer");
    public final defpackage.ozg b;
    public final defpackage.agzc c;
    public final odo d;
    public final tec e;
    public final aoin f;
    public final ccp g;
    public final iyh h;
    public final gpd i;
    public final defpackage.afpl j;
    private final aoin k;
    private final ccp l;
    private final zpm m;

    public ozk(defpackage.ozg ozgVar, defpackage.agzc agzcVar, defpackage.afpl afplVar, odo odoVar, gpd gpdVar, zpm zpmVar, tec tecVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zpmVar, "callScopes");
        aooh.f(aoinVar, "enableFlippablesVideoCalling");
        aooh.f(aoinVar2, "enableIncomingCallLandscape");
        this.b = ozgVar;
        this.c = agzcVar;
        this.j = afplVar;
        this.d = odoVar;
        this.i = gpdVar;
        this.m = zpmVar;
        this.e = tecVar;
        this.k = aoinVar;
        this.f = aoinVar2;
        cdu cduVar = cdu.c;
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cduVar);
        this.h = new iyh(this, 15);
    }

    private final defpackage.ozi h() {
        java.lang.String str;
        defpackage.own ownVarA = a();
        if (ownVarA != null && (str = ownVarA.a) != null) {
            j$.util.Optional optionalE = this.m.e(str);
            aooh.e(optionalE, "get(...)");
            defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
            if (apqrVar != null) {
                return (defpackage.ozi) apqrVar.a(defpackage.ozi.class);
            }
        }
        return null;
    }

    public final defpackage.own a() {
        return (defpackage.own) this.g.a();
    }

    public final defpackage.ozn b() {
        defpackage.ozi oziVarH = h();
        if (oziVarH != null) {
            return oziVarH.ab();
        }
        return null;
    }

    public final void c(cav cavVar, int i) {
        int i2;
        cdk cdkVarI;
        kmg kmgVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1110134885);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.own ownVarA = a();
            if (ownVarA == null) {
                a.b().l("com/android/dialer/incall/answer/method/ui/horizontalswipe/impl/HorizontalSwipeAnswerMethodFragmentPeer", "AnswerMethodContent", 148, "HorizontalSwipeAnswerMethodFragmentPeer.kt").v("Model was never received, so we show nothing for now.");
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    kmgVar = new kmg(this, i, 10);
                }
            } else {
                gus.aG(false, false, cfo.j(-1144028, new dqv(this, ownVarA, 18), cavVarB), cavVarB, 384, 3);
            }
            cdkVarI.c = kmgVar;
        }
        cavVarB.s();
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            kmgVar = new kmg(this, i, 11);
            cdkVarI.c = kmgVar;
        }
    }

    public final void d(boolean z) {
        this.l.b(java.lang.Boolean.valueOf(z));
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.l.a()).booleanValue();
    }

    public final boolean f(defpackage.own ownVar) {
        android.content.Context contextZ;
        if (ownVar.n != defpackage.owy.SELECTED_ANSWER_METHOD_TAP) {
            return ownVar.f && ((java.lang.Boolean) this.k.a()).booleanValue() && (contextZ = this.b.z()) != null && this.e.a(contextZ);
        }
        return true;
    }

    public final defpackage.qbe g() {
        defpackage.ozi oziVarH = h();
        if (oziVarH != null) {
            return oziVarH.cp();
        }
        return null;
    }
}
