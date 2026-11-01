package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class voc {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public voc(aoss aossVar, defpackage.waw wawVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(wawVar, "crossDeviceMetricsWearMetricsStorage");
        this.b = aossVar;
        this.a = wawVar;
    }

    public final void a(defpackage.uyp uypVar) {
        ((java.util.concurrent.atomic.AtomicReference) this.b).set(uypVar);
        ((zpz) this.a).a(ajcm.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.vzs vzsVar;
        java.lang.Object obj;
        defpackage.amsw amswVar;
        if (aolnVar instanceof defpackage.vzs) {
            vzsVar = (defpackage.vzs) aolnVar;
            int i = vzsVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzsVar.b = i - Integer.MIN_VALUE;
            } else {
                vzsVar = new defpackage.vzs(this, aolnVar);
            }
        } else {
            vzsVar = new defpackage.vzs(this, aolnVar);
        }
        java.lang.Object obj2 = vzsVar.a;
        defpackage.amsw amswVar2 = aolu.a;
        int i2 = vzsVar.b;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                java.lang.Object obj3 = this.a;
                apdp apdpVar = (apdp) obj3;
                vzsVar.c = apdpVar;
                vzsVar.b = 1;
                if (apdpVar.b(vzsVar) != amswVar2) {
                    obj = obj3;
                }
                return amswVar2;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = vzsVar.c;
            aooc.af(obj2);
            ?? r4 = this.b;
            if (r4.isEmpty()) {
                amswVar = null;
            } else {
                akzx akzxVarM = defpackage.amsw.a.m();
                aooh.f(akzxVarM, "builder");
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.amsw) akzxVarM.b).b);
                aooh.e(listUnmodifiableList, "getWearDeviceVerificationInfosList(...)");
                new alct(listUnmodifiableList);
                akzxVarM.u();
                defpackage.amsw amswVar3 = (defpackage.amsw) akzxVarM.b;
                alat alatVar = amswVar3.b;
                if (!alatVar.c()) {
                    amswVar3.b = alad.J(alatVar);
                }
                akyl.i((java.lang.Iterable) r4, amswVar3.b);
                aolu aoluVarP = akzxVarM.p();
                aooh.e(aoluVarP, "build(...)");
                amswVar = (defpackage.amsw) aoluVarP;
            }
            amswVar2 = amswVar;
            return amswVar2;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object c(boolean z, j$.time.Instant instant, j$.time.Instant instant2, defpackage.amsr amsrVar, aoln aolnVar) {
        defpackage.vzt vztVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.vzt) {
            vztVar = (defpackage.vzt) aolnVar;
            int i = vztVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vztVar.c = i - Integer.MIN_VALUE;
            } else {
                vztVar = new defpackage.vzt(this, aolnVar);
            }
        } else {
            vztVar = new defpackage.vzt(this, aolnVar);
        }
        java.lang.Object obj2 = vztVar.b;
        aojh aojhVar = aolu.a;
        int i2 = vztVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                obj = this.a;
                vztVar.d = instant;
                vztVar.e = instant2;
                vztVar.f = amsrVar;
                apdp apdpVar = (apdp) obj;
                vztVar.g = apdpVar;
                vztVar.a = z;
                vztVar.c = 1;
                if (apdpVar.b(vztVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = vztVar.a;
            apdp apdpVar2 = vztVar.g;
            amsrVar = vztVar.f;
            instant2 = vztVar.e;
            j$.time.Instant instant3 = vztVar.d;
            aooc.af(obj2);
            obj = apdpVar2;
            instant = instant3;
            ?? r5 = this.b;
            ajyi ajyiVarV = anar.V(amsv.a.m());
            ajyiVarV.ay(z);
            ajyiVarV.ax(wsc.ah(instant, instant2));
            ajyi ajyiVarU = anar.U(defpackage.amsu.a.m());
            akzx akzxVarM = defpackage.amss.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.f(amsrVar, "value");
            akzxVarM.u();
            defpackage.amss amssVar = (defpackage.amss) akzxVarM.b;
            amssVar.c = amsrVar.j;
            amssVar.b |= 1;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.amss amssVar2 = (defpackage.amss) aladVarP;
            aooh.f(amssVar2, "value");
            java.lang.Object obj3 = ajyiVarU.a;
            ((akzx) obj3).u();
            defpackage.amsu amsuVar = (defpackage.amsu) ((akzx) obj3).b;
            j$.util.Objects.requireNonNull(amssVar2);
            amsuVar.c = amssVar2;
            amsuVar.b = 2;
            ajyiVarV.az(ajyiVarU.av());
            r5.add(ajyiVarV.aw());
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object d(boolean z, j$.time.Instant instant, j$.time.Instant instant2, boolean z2, aoln aolnVar) {
        defpackage.vzu vzuVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.vzu) {
            vzuVar = (defpackage.vzu) aolnVar;
            int i = vzuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzuVar.d = i - Integer.MIN_VALUE;
            } else {
                vzuVar = new defpackage.vzu(this, aolnVar);
            }
        } else {
            vzuVar = new defpackage.vzu(this, aolnVar);
        }
        java.lang.Object obj2 = vzuVar.c;
        aojh aojhVar = aolu.a;
        int i2 = vzuVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                obj = this.a;
                vzuVar.e = instant;
                vzuVar.f = instant2;
                apdp apdpVar = (apdp) obj;
                vzuVar.g = apdpVar;
                vzuVar.a = z;
                vzuVar.b = z2;
                vzuVar.d = 1;
                if (apdpVar.b(vzuVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = vzuVar.b;
            z = vzuVar.a;
            apdp apdpVar2 = vzuVar.g;
            instant2 = vzuVar.f;
            j$.time.Instant instant3 = vzuVar.e;
            aooc.af(obj2);
            obj = apdpVar2;
            instant = instant3;
            ?? r4 = this.b;
            ajyi ajyiVarV = anar.V(amsv.a.m());
            ajyiVarV.ay(z);
            ajyiVarV.ax(wsc.ah(instant, instant2));
            ajyi ajyiVarU = anar.U(defpackage.amsu.a.m());
            akzx akzxVarM = defpackage.amst.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            defpackage.amst amstVar = (defpackage.amst) akzxVarM.b;
            amstVar.b |= 1;
            amstVar.c = z2;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.amst amstVar2 = (defpackage.amst) aladVarP;
            aooh.f(amstVar2, "value");
            java.lang.Object obj3 = ajyiVarU.a;
            ((akzx) obj3).u();
            defpackage.amsu amsuVar = (defpackage.amsu) ((akzx) obj3).b;
            j$.util.Objects.requireNonNull(amstVar2);
            amsuVar.c = amstVar2;
            amsuVar.b = 1;
            ajyiVarV.az(ajyiVarU.av());
            r4.add(ajyiVarV.aw());
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq e(java.lang.String str) {
        return ahvr.F(new vms(this, str, 18, (byte[]) null), (java.util.concurrent.Executor) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(final java.lang.String str, final java.util.function.Consumer consumer) {
        agsm.i(1053, ahvr.E(new java.lang.Runnable() { // from class: whp
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
            @Override // java.lang.Runnable
            public final void run() {
                ?? r0 = this.c.a;
                java.lang.String str2 = str;
                akzx akzxVar = (akzx) r0.get(str2);
                java.util.function.Consumer consumer2 = consumer;
                if (akzxVar != null) {
                    aa$.ExternalSyntheticApiModelOutline1.m(consumer2, akzxVar);
                    return;
                }
                akzx akzxVarM = defpackage.amto.a.m();
                aa$.ExternalSyntheticApiModelOutline1.m(consumer2, akzxVarM);
                r0.put(str2, akzxVarM);
            }
        }, (java.util.concurrent.Executor) this.b), "failed to update", new java.lang.Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final defpackage.wde g(com.airbnb.lottie.LottieAnimationView lottieAnimationView) {
        android.content.Context context = (android.content.Context) this.a.a();
        context.getClass();
        tkl tklVar = (tkl) this.b.a();
        tklVar.getClass();
        lottieAnimationView.getClass();
        return new defpackage.wde(context, tklVar, lottieAnimationView);
    }

    public voc(afhf afhfVar, ajct ajctVar) {
        this.b = afhfVar;
        this.a = ajctVar;
    }

    public voc(defpackage.vny vnyVar, ucm ucmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        this.a = vnyVar;
        this.b = ucmVar;
    }

    public voc() {
        this.a = new apdp();
        this.b = new java.util.ArrayList();
    }

    public voc(aoin aoinVar, aoin aoinVar2) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
    }

    public voc(zpz zpzVar) {
        this.b = new java.util.concurrent.atomic.AtomicReference(defpackage.uyp.UNSPECIFIED);
        this.a = zpzVar;
    }

    public voc(ajct ajctVar, byte[] bArr) {
        this.a = new aca();
        this.b = new ajdc(ajctVar);
    }

    public voc(ajct ajctVar) {
        this.a = new aca();
        this.b = new ajdc(ajctVar);
    }
}
