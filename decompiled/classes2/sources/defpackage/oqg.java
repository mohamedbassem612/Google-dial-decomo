package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class oqg implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ oqg(defpackage.afjo afjoVar, com.google.android.libraries.surveys.SurveyData surveyData, defpackage.oql oqlVar, aify aifyVar, int i) {
        this.$cid = i;
        this.a = afjoVar;
        this.b = surveyData;
        this.c = oqlVar;
        this.d = aifyVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oql] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, oql] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.libraries.surveys.SurveyData, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        int i = this.$cid;
        java.lang.Integer num = 340;
        if (i == 0) {
            aogc aogcVar = (aogc) obj;
            if (j$.util.Collection.-EL.stream(((zzx) aogcVar.c).e()).allMatch(new defpackage.mif(5))) {
                ?? r7 = this.c;
                java.lang.Object obj2 = aogcVar.a;
                defpackage.naa naaVar = new defpackage.naa(r7, 20);
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                arrayDeque.add(((android.app.Activity) obj2).findViewById(android.R.id.content));
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        optionalEmpty = j$.util.Optional.empty();
                        break;
                    }
                    android.view.View view = (android.view.View) arrayDeque.poll();
                    if (((java.lang.Boolean) aa$.ExternalSyntheticApiModelOutline1.m(naaVar, view)).booleanValue()) {
                        optionalEmpty = j$.util.Optional.of(view);
                        break;
                    } else if (view instanceof android.view.ViewGroup) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            arrayDeque.offer(viewGroup.getChildAt(i2));
                        }
                    }
                }
                defpackage.oqh oqhVar = new defpackage.oqh((defpackage.afjo) this.a, (defpackage.oql) r7, aogcVar, (com.google.android.libraries.surveys.SurveyData) this.b, (aify) this.d, 0);
                if (true == optionalEmpty.isPresent()) {
                    java.lang.Object obj3 = optionalEmpty.get();
                    java.lang.Object obj4 = oqhVar.a;
                    ?? r0 = oqhVar.b;
                    java.lang.Object obj5 = oqhVar.c;
                    ?? r9 = oqhVar.d;
                    java.lang.Object obj6 = oqhVar.e;
                    oqi.a.b().l("com/android/dialer/hats/DialerHatsEventProcessor$3", "onSuccess", 364, "DialerHatsEventProcessor.java").y("Present HaTS survey with trigger ID = %s", r0.e());
                    defpackage.oqg oqgVar = new defpackage.oqg((aogc) obj5, (com.google.android.libraries.surveys.SurveyData) r9, (android.view.View) obj3, (aify) obj6, 2);
                    j$.util.Optional optional = ((oqi) ((defpackage.afjo) obj4).c).g;
                    optional.isPresent();
                    java.lang.Object obj7 = oqgVar.c;
                    ?? r6 = oqgVar.b;
                    java.lang.Object obj8 = oqgVar.a;
                    ?? r8 = oqgVar.d;
                    boolean z = r6 != 0;
                    java.lang.Object obj9 = optional.get();
                    ahvr.bN(z, "Survey data is null.");
                    afja afjaVar = afja.b;
                    afiz afizVar = afiz.a;
                    int id = ((android.view.View) obj8).getId();
                    num.getClass();
                    ((ipc) obj9).bl(new defpackage.afjb((android.app.Activity) ((aogc) obj7).a, id, num, oqi.o, r6, r8, afjaVar, afizVar));
                    return;
                }
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 2) {
                ipc ipcVar = (ipc) obj;
                ?? r10 = this.b;
                ahvr.bN(r10 != 0, "Survey data is null.");
                java.lang.Object obj10 = this.a;
                afja afjaVar2 = afja.b;
                afiz afizVar2 = afiz.a;
                int id2 = ((android.view.View) obj10).getId();
                num.getClass();
                ipcVar.bl(new defpackage.afjb((android.app.Activity) ((aogc) this.c).a, id2, num, oqi.o, r10, this.d, afjaVar2, afizVar2));
                return;
            }
            if (i == 3) {
                alnz alnzVar = (alnz) obj;
                alln allnVar = ((alkr) this.c).f;
                java.lang.String str = ((almm) this.d).c;
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(allnVar.d(str).j).map(new alki(12)).map(new aite(str, 12));
                j$.util.stream.Collector collector = aido.b;
                aihd aihdVar = (aihd) alkt.c((allf) this.b, alnzVar.b, alnzVar.c).i(new alks((aihd) map.collect(collector), 0)).j(new alks(alnzVar, 2)).d(new aitf(2)).collect(collector);
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                almm almmVar = akzxVar.b;
                alat alatVar = almmVar.e;
                if (!alatVar.c()) {
                    almmVar.e = alad.J(alatVar);
                }
                akyl.i(aihdVar, almmVar.e);
                return;
            }
            if (i != 4) {
                ((alkv) this.a).k((java.lang.String) this.d, (alnu) this.b, (almy) this.c);
                return;
            }
            alia aliaVarA = ((allb) this.c).b.a((java.lang.String) this.d);
            aify aifyVar = (aify) j$.util.stream.IntStream.-CC.range(0, aliaVarA.e.size()).mapToObj(new alkz(aliaVarA, (allf) this.b, (almk) obj)).collect(aido.a);
            akzx akzxVar2 = (akzx) this.a;
            akzxVar2.u();
            almn almnVar = akzxVar2.b;
            almn almnVar2 = almn.a;
            alat alatVar2 = almnVar.d;
            if (!alatVar2.c()) {
                almnVar.d = alad.J(alatVar2);
            }
            akyl.i(aifyVar, almnVar.d);
            return;
        }
        defpackage.iny inyVar = (defpackage.iny) obj;
        akzx akzxVarM = defpackage.iob.a.m();
        defpackage.iok iokVar = (defpackage.iok) this.c;
        long millis = iokVar.f.c().toMillis();
        akzxVarM.u();
        defpackage.iob iobVar = (defpackage.iob) akzxVarM.b;
        iobVar.b |= 4;
        iobVar.e = millis;
        long millis2 = iokVar.g.c().toMillis();
        akzxVarM.u();
        defpackage.iob iobVar2 = (defpackage.iob) akzxVarM.b;
        iobVar2.b |= 8;
        iobVar2.f = millis2;
        akzxVarM.u();
        defpackage.iob iobVar3 = (defpackage.iob) akzxVarM.b;
        java.lang.Object obj11 = this.d;
        j$.util.Objects.requireNonNull(obj11);
        iobVar3.b |= 1;
        iobVar3.c = (java.lang.String) obj11;
        int i3 = true == iokVar.e.get() ? 2 : 3;
        akzxVarM.u();
        defpackage.iob iobVar4 = (defpackage.iob) akzxVarM.b;
        iobVar4.g = i3 - 1;
        iobVar4.b |= 16;
        java.lang.Object objOfNullable = this.b;
        j$.util.Optional optional2 = (j$.util.Optional) objOfNullable;
        if (true == optional2.isPresent()) {
            objOfNullable = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((android.telecom.DisconnectCause) optional2.get()).getCode()));
        }
        int iIntValue = ((java.lang.Integer) ((j$.util.Optional) objOfNullable).orElse(0)).intValue();
        akzxVarM.u();
        defpackage.iob iobVar5 = (defpackage.iob) akzxVarM.b;
        iobVar5.b |= 2;
        iobVar5.d = iIntValue;
        int i4 = iokVar.h;
        akzxVarM.u();
        defpackage.iob iobVar6 = (defpackage.iob) akzxVarM.b;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        java.lang.Object obj12 = this.a;
        iobVar6.h = i5;
        iobVar6.b |= 32;
        inyVar.c((android.os.Bundle) obj12, (defpackage.iob) akzxVarM.p());
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 3) {
            return i != 4 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ oqg(akzx akzxVar, allb allbVar, allf allfVar, java.lang.String str, int i) {
        this.$cid = i;
        this.a = akzxVar;
        this.c = allbVar;
        this.b = allfVar;
        this.d = str;
    }

    public /* synthetic */ oqg(alkr alkrVar, akzx akzxVar, allf allfVar, almm almmVar, int i) {
        this.$cid = i;
        this.c = alkrVar;
        this.a = akzxVar;
        this.b = allfVar;
        this.d = almmVar;
    }

    public /* synthetic */ oqg(alkv alkvVar, java.lang.String str, alnu alnuVar, almy almyVar, int i) {
        this.$cid = i;
        this.a = alkvVar;
        this.d = str;
        this.b = alnuVar;
        this.c = almyVar;
    }

    public /* synthetic */ oqg(aogc aogcVar, com.google.android.libraries.surveys.SurveyData surveyData, android.view.View view, aify aifyVar, int i) {
        this.$cid = i;
        this.c = aogcVar;
        this.b = surveyData;
        this.a = view;
        this.d = aifyVar;
    }

    public /* synthetic */ oqg(defpackage.iok iokVar, android.os.Bundle bundle, java.lang.String str, j$.util.Optional optional, int i) {
        this.$cid = i;
        this.c = iokVar;
        this.a = bundle;
        this.d = str;
        this.b = optional;
    }
}
