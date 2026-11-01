package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lte implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lte(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v65, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v68, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v76, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v82, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v87, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        oel oelVarK = null;
        switch (this.$cid) {
            case 0:
                gin ginVarA = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA);
                    if (ginVarA.m()) {
                        oelVarK = defpackage.lti.k(ginVarA);
                        break;
                    }
                    return oelVarK;
                } finally {
                    ginVarA.close();
                }
            case 1:
                ?? r0 = this.a;
                return java.lang.Integer.valueOf(((defpackage.lti) this.b).b.c((gjh) obj, (java.lang.Iterable) r0));
            case 2:
                ?? r1 = this.a;
                return ((defpackage.lti) this.b).a.c((gjh) obj, (java.util.Collection) r1);
            case 3:
                ?? r2 = this.a;
                return java.lang.Integer.valueOf(((defpackage.lti) this.b).c.c((gjh) obj, (java.lang.Iterable) r2));
            case 4:
                gin ginVarA2 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA2.m()) {
                        arrayList.add(defpackage.lti.k(ginVarA2));
                    }
                    ginVarA2.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA2.close();
                    throw th;
                }
            case 5:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.o(diqVar, 0);
                dfb.h(diqVar, (java.lang.String) this.b, new defpackage.kgq(this.a, 18));
                dfb.q(diqVar, "");
                return aojh.a;
            case 6:
                aooh.f((wsc) obj, "bamPhaseOne");
                java.lang.Object obj2 = this.b;
                aooh.c(obj2);
                android.view.View view = (android.view.View) obj2;
                android.view.View viewFindViewById = view.findViewById(2131427748);
                aooh.e(viewFindViewById, "findViewById(...)");
                defpackage.nvi nviVar = ((defpackage.nvl) this.a).d;
                ((android.widget.TextView) viewFindViewById).setText(nviVar.A().getString(2132017493));
                android.view.View viewFindViewById2 = view.findViewById(2131427747);
                aooh.e(viewFindViewById2, "findViewById(...)");
                ((android.widget.TextView) viewFindViewById2).setText(nviVar.A().getString(2132017492));
                return aojh.a;
            case 7:
                alin alinVar = (alin) obj;
                aooh.f(alinVar, "suggestion");
                if (aooh.n(this.b, alinVar.c)) {
                    zoe zoeVar = (zoe) this.a;
                    uzx uzxVarCu = aehj.cu(zoeVar.b().p());
                    akzx akzxVar = (akzx) uzxVarCu.a;
                    java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(akzxVar.b.j));
                    aooh.e(mapUnmodifiableMap, "getStringInCallUiIntentExtrasMap(...)");
                    new alcv(mapUnmodifiableMap);
                    java.lang.String strName = ((svi) alinVar.b).name();
                    aooh.f(strName, "value");
                    j$.util.Objects.requireNonNull("sim_suggestion_reason");
                    j$.util.Objects.requireNonNull(strName);
                    akzxVar.u();
                    zsf zsfVar = akzxVar.b;
                    albe albeVar = zsfVar.j;
                    if (!albeVar.b) {
                        zsfVar.j = albeVar.a();
                    }
                    zsfVar.j.put("sim_suggestion_reason", strName);
                    zoeVar.d(uzxVarCu.T());
                }
                return aojh.a;
            case 8:
                gin ginVarA3 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA3);
                    if (ginVarA3.m()) {
                        oelVarK = nxm.l(ginVarA3);
                        break;
                    }
                    return oelVarK;
                } finally {
                    ginVarA3.close();
                }
            case 9:
                ?? r3 = this.a;
                return ((nxm) this.b).a.c((gjh) obj, (java.util.Collection) r3);
            case 10:
                gin ginVarA4 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA4);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (ginVarA4.m()) {
                        arrayList2.add(nxm.l(ginVarA4));
                    }
                    ginVarA4.close();
                    return arrayList2;
                } catch (java.lang.Throwable th2) {
                    ginVarA4.close();
                    throw th2;
                }
            case 11:
                ?? r4 = this.a;
                return java.lang.Integer.valueOf(((nxm) this.b).b.c((gjh) obj, (java.lang.Iterable) r4));
            case 12:
                ?? r5 = this.a;
                return java.lang.Integer.valueOf(((nxm) this.b).c.c((gjh) obj, (java.lang.Iterable) r5));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ?? r6 = this.a;
                return ((oej) this.b).a.c((gjh) obj, (java.util.Collection) r6);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ?? r7 = this.a;
                return java.lang.Integer.valueOf(((oej) this.b).b.c((gjh) obj, (java.lang.Iterable) r7));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                gin ginVarA5 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA5);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (ginVarA5.m()) {
                        arrayList3.add(oej.l(ginVarA5));
                    }
                    ginVarA5.close();
                    return arrayList3;
                } catch (java.lang.Throwable th3) {
                    ginVarA5.close();
                    throw th3;
                }
            case 16:
                java.lang.Object obj3 = this.a;
                return aazc.g((abwx) this.b, (java.lang.String) obj3, (aoln) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ?? r8 = this.a;
                return java.lang.Integer.valueOf(((oej) this.b).c.c((gjh) obj, (java.lang.Iterable) r8));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                gin ginVarA6 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA6);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    while (ginVarA6.m()) {
                        arrayList4.add(oej.l(ginVarA6));
                    }
                    ginVarA6.close();
                    return arrayList4;
                } catch (java.lang.Throwable th4) {
                    ginVarA6.close();
                    throw th4;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                gin ginVarA7 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA7);
                    if (ginVarA7.m()) {
                        oelVarK = oej.l(ginVarA7);
                        break;
                    }
                    return oelVarK;
                } finally {
                    ginVarA7.close();
                }
            default:
                gin ginVarA8 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA8);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    while (ginVarA8.m()) {
                        arrayList5.add(oer.k(ginVarA8));
                    }
                    ginVarA8.close();
                    return arrayList5;
                } catch (java.lang.Throwable th5) {
                    ginVarA8.close();
                    throw th5;
                }
        }
    }

    public /* synthetic */ lte(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
