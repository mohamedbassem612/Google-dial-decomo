package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyj {
    public final aw a;
    public final aoin b;
    private final ems d;
    private final ahpz f;
    private final zpm g;
    private j$.util.Optional e = j$.util.Optional.empty();
    private final ahzi c = ahvr.bI(new exm(this, 13));

    public pyj(ems emsVar, aw awVar, zpm zpmVar, ahpz ahpzVar, aoin aoinVar) {
        this.d = emsVar;
        this.a = awVar;
        this.g = zpmVar;
        this.f = ahpzVar;
        this.b = aoinVar;
    }

    public final aihd a(defpackage.pyi pyiVar) {
        zpm zpmVar = this.g;
        j$.util.Objects.requireNonNull(zpmVar);
        defpackage.pnh pnhVar = new defpackage.pnh(zpmVar, 14);
        j$.util.Optional optionalOfNullable = pyiVar.h;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = ((zpm) pnhVar.a).e((java.lang.String) optionalOfNullable.get());
            optionalOfNullable.getClass();
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.pyg) ((defpackage.apqr) optionalOfNullable.get()).a(defpackage.pyg.class)).ke().e());
        }
        return (aihd) (true != optionalOfNullable.isPresent() ? aikn.a : optionalOfNullable.get());
    }

    public final j$.util.Optional b() {
        return j$.util.Optional.ofNullable(this.a.I().e("tidepods_dialpad_fragment"));
    }

    public final void c(defpackage.pyi pyiVar) {
        aw awVar;
        j$.util.Optional optionalOfNullable = this.e;
        defpackage.pnh pnhVar = new defpackage.pnh(pyiVar, 13);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(pnhVar.a.equals(optionalOfNullable.get())));
        }
        if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
            return;
        }
        j$.util.Optional optional = this.e;
        defpackage.puo puoVar = new defpackage.puo(pyiVar, 8);
        if (true == optional.isPresent()) {
            ahvr.bN(((defpackage.pyi) optional.get()).b == ((defpackage.pyi) puoVar.a).b, "the animator only supports one and only one container");
        }
        if (pyiVar.a) {
            aw awVar2 = this.a;
            u uVar = new u(awVar2.I());
            j$.util.Optional optionalB = b();
            if (optionalB.isPresent()) {
                u uVar2 = new u(awVar2.I());
                uVar2.k((aw) optionalB.orElseThrow());
                uVar2.c();
            }
            akzx akzxVarM = defpackage.pyk.a.m();
            int i = pyiVar.c;
            akzxVarM.u();
            defpackage.pyk pykVar = (defpackage.pyk) akzxVarM.b;
            pykVar.b |= 1;
            pykVar.c = i;
            boolean z = pyiVar.d;
            akzxVarM.u();
            defpackage.pyk pykVar2 = (defpackage.pyk) akzxVarM.b;
            pykVar2.b |= 2;
            pykVar2.d = z;
            int i2 = pyiVar.i;
            akzxVarM.u();
            defpackage.pyk pykVar3 = (defpackage.pyk) akzxVarM.b;
            if (i2 == 0) {
                throw null;
            }
            pykVar3.e = i2 - 1;
            pykVar3.b |= 4;
            boolean z2 = pyiVar.e;
            akzxVarM.u();
            defpackage.pyk pykVar4 = (defpackage.pyk) akzxVarM.b;
            pykVar4.b |= 8;
            pykVar4.f = z2;
            boolean z3 = pyiVar.f;
            akzxVarM.u();
            defpackage.pyk pykVar5 = (defpackage.pyk) akzxVarM.b;
            pykVar5.b |= 16;
            pykVar5.g = z3;
            boolean z4 = pyiVar.g;
            akzxVarM.u();
            defpackage.pyk pykVar6 = (defpackage.pyk) akzxVarM.b;
            pykVar6.b |= 32;
            pykVar6.h = z4;
            defpackage.pyk pykVar7 = (defpackage.pyk) akzxVarM.p();
            aimz aimzVar = defpackage.pyu.a;
            j$.util.Optional optionalOf = j$.util.Optional.of(defpackage.pyn.q(pykVar7));
            uVar.e(pyiVar.b, (aw) optionalOf.orElseThrow(), "tidepods_dialpad_fragment", 1);
            uVar.c();
            aw awVar3 = (aw) optionalOf.orElseThrow();
            com.android.dialer.dialpadview.DialpadView dialpadViewFindViewById = awVar2.N().findViewById(2131427997);
            android.view.View viewN = awVar3.N();
            viewN.startAnimation(((defpackage.pyf) this.c.eZ()).a);
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = viewN.animate();
            ahpz ahpzVar = this.f;
            ems emsVar = this.d;
            hrv hrvVar = new hrv();
            hrvVar.d(new rh(this, pyiVar, 10, (byte[]) null));
            hrvVar.c(new obo(this, pyiVar, 3));
            viewPropertyAnimatorAnimate.setListener(new defpackage.ahpv(new hry(emsVar, hrvVar.a()), ahpzVar, 561, "In call dialpad show animation")).start();
            if (d() || e()) {
                dialpadViewFindViewById.e = false;
            }
            dialpadViewFindViewById.a();
        } else {
            j$.util.Optional optionalB2 = b();
            if (!((java.lang.Boolean) (true != optionalB2.isPresent() ? optionalB2 : j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(!((aw) optionalB2.get()).aK()))).orElse(java.lang.Boolean.TRUE)).booleanValue() && (awVar = (aw) optionalB2.orElse((java.lang.Object) null)) != null) {
                ahzi ahziVar = this.c;
                android.view.View viewN2 = awVar.N();
                viewN2.startAnimation(((defpackage.pyf) ahziVar.eZ()).b);
                android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewN2.animate();
                ahpz ahpzVar2 = this.f;
                ems emsVar2 = this.d;
                hrv hrvVar2 = new hrv();
                hrvVar2.d(new rh(this, pyiVar, 11, (byte[]) null));
                hrvVar2.c(new hrn(this, awVar, pyiVar, 4));
                viewPropertyAnimatorAnimate2.setListener(new defpackage.ahpv(new hry(emsVar2, hrvVar2.a()), ahpzVar2, 560, "In call dialpad hide animation")).start();
            }
        }
        this.e = j$.util.Optional.of(pyiVar);
    }

    public final boolean d() {
        return this.a.dX().getBoolean(2131034147);
    }

    public final boolean e() {
        return this.a.dX().getBoolean(2131034171);
    }
}
