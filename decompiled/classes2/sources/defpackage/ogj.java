package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ogj {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ogj(defpackage.ogo ogoVar) {
        this.a = ogoVar;
        android.view.View.inflate(ogoVar.getContext(), 2131624214, ogoVar);
        android.view.View viewFindViewById = ogoVar.findViewById(2131428232);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.b = (android.widget.TextView) viewFindViewById;
        java.lang.Object objFindViewById = ogoVar.findViewById(2131428216);
        aooh.e(objFindViewById, "findViewById(...)");
        this.c = (com.airbnb.lottie.LottieAnimationView) objFindViewById;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nle nleVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.nle) {
            nleVar = (defpackage.nle) aolnVar;
            int i = nleVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nleVar.b = i - Integer.MIN_VALUE;
            } else {
                nleVar = new defpackage.nle(this, aolnVar);
            }
        } else {
            nleVar = new defpackage.nle(this, aolnVar);
        }
        java.lang.Object obj2 = nleVar.a;
        defpackage.nmu nmuVarB = aolu.a;
        int i2 = nleVar.b;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                java.lang.Object obj3 = this.c;
                apdp apdpVar = (apdp) obj3;
                nleVar.c = apdpVar;
                nleVar.b = 1;
                if (apdpVar.b(nleVar) != nmuVarB) {
                    obj = obj3;
                }
                return nmuVarB;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = nleVar.c;
            aooc.af(obj2);
            ?? r4 = this.b;
            defpackage.nmu nmuVarS = mni.J(defpackage.nmu.a.m()).s();
            java.util.Iterator it = r4.iterator();
            nmuVarB = nmuVarS;
            while (it.hasNext()) {
                nmuVarB = ((defpackage.nmm) it.next()).b(nmuVarB);
            }
            ((apdp) obj).d();
            return nmuVarB;
        } catch (java.lang.Throwable th) {
            ((apdp) obj).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object b(defpackage.nmk nmkVar, aoln aolnVar) {
        defpackage.nlf nlfVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.nlf) {
            nlfVar = (defpackage.nlf) aolnVar;
            int i = nlfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nlfVar.b = i - Integer.MIN_VALUE;
            } else {
                nlfVar = new defpackage.nlf(this, aolnVar);
            }
        } else {
            nlfVar = new defpackage.nlf(this, aolnVar);
        }
        java.lang.Object obj2 = nlfVar.a;
        aojh aojhVar = aolu.a;
        int i2 = nlfVar.b;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                obj = this.c;
                nlfVar.c = nmkVar;
                apdp apdpVar = (apdp) obj;
                nlfVar.d = apdpVar;
                nlfVar.b = 1;
                if (apdpVar.b(nlfVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = nlfVar.d;
            defpackage.nmk nmkVar2 = nlfVar.c;
            aooc.af(obj2);
            obj = apdpVar2;
            nmkVar = nmkVar2;
            ?? r0 = this.b;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r0, 10));
            java.util.Iterator it = r0.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.nmm) it.next()).a(nmkVar));
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((defpackage.nml) it2.next()) == defpackage.nml.b) {
                        ((zpz) this.a).a(ajcm.a);
                        break;
                    }
                }
            }
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [aonj, java.lang.Object] */
    public final j$.util.Optional c(android.net.Uri uri) {
        aooh.f(uri, "uri");
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.ojz) this.a).a(uri));
        defpackage.nzu nzuVar = new defpackage.nzu(new defpackage.npi(this, 18), 12);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(nzuVar.a.a(optionalOfNullable.get()));
        }
        zjv.i((zjv) this.c, mgv.ex, ajsz.aY(gus.aw(uri.toString())), (mhc) null, 0, 28);
        aooh.e(optionalOfNullable, "also(...)");
        return optionalOfNullable;
    }

    public final void d() {
        ((android.media.Ringtone) this.b).play();
        zjv.i((zjv) this.c, mgv.ey, (java.util.List) null, (mhc) null, 0, 30);
    }

    public final void e(float f) {
        ft$.ExternalSyntheticApiModelOutline0.m((android.media.Ringtone) this.b, f);
        zjv.i((zjv) this.c, mgv.eA, ajsz.aY(gus.at(f)), (mhc) null, 0, 28);
    }

    public final void f() {
        ((android.media.Ringtone) this.b).stop();
        zjv.i((zjv) this.c, mgv.ez, (java.util.List) null, (mhc) null, 0, 30);
    }

    public final void g() {
        ft$.ExternalSyntheticApiModelOutline0.m((android.media.Ringtone) this.b, true);
        zjv.i((zjv) this.c, mgv.eB, ajsz.aY(gus.ax(true)), (mhc) null, 0, 28);
    }

    public ogj(zjv zjvVar, mgu mguVar, defpackage.ojz ojzVar) {
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(mguVar, "scopedDiffRecorder");
        aooh.f(ojzVar, "ringtoneProviderMixin");
        this.c = zjvVar;
        this.b = mguVar;
        this.a = ojzVar;
    }

    public ogj(zpz zpzVar, java.util.Set set) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(set, "stateHolders");
        this.a = zpzVar;
        this.b = set;
        this.c = new apdp();
    }

    public ogj(zjv zjvVar, mgu mguVar, android.media.Ringtone ringtone) {
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(mguVar, "scopedDiffRecorder");
        aooh.f(ringtone, "ringtone");
        this.c = zjvVar;
        this.a = mguVar;
        this.b = ringtone;
    }
}
