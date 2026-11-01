package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hwv {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public hwv() {
        this.e = new java.util.HashMap();
        this.c = new java.util.HashMap();
        this.d = new java.util.HashMap();
        this.a = new java.util.HashMap();
        this.b = new java.util.HashMap();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [dpf, java.lang.Object] */
    public static /* synthetic */ dkw d(defpackage.hwv hwvVar, java.lang.String str, dkz dkzVar, int i, long j) {
        dkv dkvVar = new dkv(new dji(str), dkzVar, aokc.a, i, true, 1, (dpf) hwvVar.b, (dpq) hwvVar.e, (gat) hwvVar.c, (dnx) hwvVar.d, j);
        defpackage.djp djpVar = new defpackage.djp(dkvVar);
        add addVar = (add) ((defpackage.vk) hwvVar.a).a;
        dkw dkwVar = (dkw) addVar.a(djpVar);
        if (dkwVar == null || dkwVar.b.a.c()) {
            dkwVar = null;
        }
        if (dkwVar != null) {
            djy djyVar = dkwVar.b;
            return dkwVar.k(dkvVar, dpe.d(j, (((long) defpackage.xa.e(djyVar.d)) << 32) | (((long) defpackage.xa.e(djyVar.e)) & 4294967295L)));
        }
        dji djiVar = dkvVar.a;
        dkz dkzVar2 = dkvVar.b;
        dpq dpqVar = dkvVar.h;
        dpf dpfVar = dkvVar.g;
        gat gatVar = dkvVar.k;
        dnx dnxVar = dkvVar.i;
        java.util.List list = dkvVar.c;
        boolean z = dkvVar.e;
        djz djzVar = new djz(djiVar, dff.f(dkzVar2, dpqVar), list, dpfVar, gatVar, z, dnxVar);
        long j2 = dkvVar.j;
        int iB = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        if ((z || mni.bo(dkvVar.f)) && dpd.h(j2)) {
            iB = dpd.b(j2);
        }
        int i2 = (z || !mni.bo(dkvVar.f)) ? dkvVar.d : 1;
        int iD = dpd.d(j2);
        if (iD != iB) {
            iB = aooc.w(defpackage.xa.e(djzVar.a()), iD, iB);
        }
        djy djyVar2 = new djy(djzVar, dpe.k(0, iB, 0, dpd.a(j2)), i2, dkvVar.f);
        dkw dkwVar2 = new dkw(dkvVar, djyVar2, dpe.d(j2, (((long) ((int) java.lang.Math.ceil(djyVar2.d))) << 32) | (((long) ((int) java.lang.Math.ceil(djyVar2.e))) & 4294967295L)));
        addVar.b(new defpackage.djp(dkvVar), dkwVar2);
        return dkwVar2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final agtc q() {
        return new agtc(new plx(this, 2), (java.util.concurrent.Executor) this.c);
    }

    public final android.widget.Button a() {
        android.app.Dialog dialog = ((defpackage.al) this.c).d;
        if (dialog != null) {
            return (android.widget.Button) dialog.findViewById(2131428098);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object b(java.lang.Class cls) {
        java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) this.c.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        ?? r0 = this.e;
        defpackage.vf vfVar = (defpackage.vf) r0.get(cls);
        if (vfVar != null) {
            return vfVar;
        }
        defpackage.vg vgVar = (defpackage.vg) this.d.get(cls);
        if (vgVar == null) {
            throw new java.lang.IllegalArgumentException(a.bg(cls, "The class '", "' does not correspond to a car service"));
        }
        try {
            defpackage.vf vfVarA = vgVar.a();
            r0.put(cls, vfVarA);
            return vfVarA;
        } catch (java.lang.RuntimeException e) {
            this.c.put(cls, e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void c(java.lang.Class cls, java.lang.String str, defpackage.vg vgVar) {
        this.d.put(cls, vgVar);
        if (str != null) {
            this.a.put(str, cls);
            this.b.put(cls, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq e() {
        return !((java.lang.Boolean) this.e.a()).booleanValue() ? aiql.z(java.lang.Boolean.FALSE) : ahvr.H(this.c.eU(ahqx.i(new sws(this, 11))), new syf(13), (java.util.concurrent.Executor) this.d);
    }

    public final void f(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnShowListener onShowListener) {
        afsn afsnVar = new afsn(context, 0);
        afsnVar.x(2132018095);
        afsnVar.r(2132018094);
        ahpz ahpzVar = (ahpz) this.a;
        afsnVar.w(2132018093, new ahpt(ahpzVar, 866, "Positive button clicked in Revelio confirmation dialog", onClickListener));
        afsnVar.t(android.R.string.cancel, new ahpt(ahpzVar, 867, "Negative button clicked in Revelio confirmation dialog", new rjt(2)));
        afsnVar.p(true);
        defpackage.cy cyVarCreate = afsnVar.create();
        cyVarCreate.setOnShowListener(new defpackage.acjr(ahpzVar, onShowListener, 2));
        cyVarCreate.show();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ajct, java.lang.Object] */
    public final ajcq g() {
        return this.c.eU(ahqx.i(new sws(this, 10)));
    }

    public final void h() {
        ((java.util.concurrent.atomic.AtomicReference) this.d).set(q());
        ((zpz) this.e).a(ajcm.a);
        ((pvf) this.a).g();
    }

    public final zmx i() {
        return (zmx) ((java.util.concurrent.atomic.AtomicReference) this.b).get();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq j(zmx zmxVar) {
        return ahvr.E(new pmw(this, zmxVar, 6, (byte[]) null), (java.util.concurrent.Executor) this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq k(boolean z) {
        return ahvr.E(new defpackage.gql(this, z, 5), (java.util.concurrent.Executor) this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void l(boolean z) {
        agsm.i(531, ahvr.E(new defpackage.gql(this, z, 6), (java.util.concurrent.Executor) this.a), "failed setting received video request", new java.lang.Object[0]);
    }

    public final boolean m() {
        return ((java.util.concurrent.atomic.AtomicBoolean) this.c).get();
    }

    public final boolean n() {
        return ((java.util.concurrent.atomic.AtomicBoolean) this.d).get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aoin, java.lang.Object] */
    public final ppb o(pzp pzpVar) {
        gpd gpdVar = (gpd) this.b.a();
        gpdVar.getClass();
        gat gatVar = (gat) this.e.a();
        gatVar.getClass();
        android.content.Context context = (android.content.Context) this.a.a();
        context.getClass();
        zpm zpmVar = (zpm) this.c.a();
        zpmVar.getClass();
        pnr pnrVar = (pnr) this.d.a();
        pnrVar.getClass();
        return new ppb(gpdVar, gatVar, context, zpmVar, pnrVar, pzpVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aoin, java.lang.Object] */
    public final ahdv p(java.lang.String str, alin alinVar, aihd aihdVar) {
        ((android.app.Application) this.b.a()).getClass();
        ajct ajctVar = (ajct) this.a.a();
        ajctVar.getClass();
        svm svmVar = (svm) this.e.a();
        svmVar.getClass();
        rlv rlvVar = (rlv) this.d.a();
        rlvVar.getClass();
        ojo ojoVar = (ojo) this.c.a();
        ojoVar.getClass();
        aihdVar.getClass();
        return new ahdv(ajctVar, svmVar, rlvVar, ojoVar, str, alinVar, aihdVar);
    }

    public hwv(android.content.Context context, ahpz ahpzVar, ajct ajctVar, ajct ajctVar2, aoin aoinVar) {
        this.b = context;
        this.a = ahpzVar;
        this.c = ajctVar;
        this.d = ajctVar2;
        this.e = aoinVar;
    }

    public hwv(android.content.Context context, kvy kvyVar, kvw kvwVar, rwi rwiVar, ajct ajctVar) {
        this.b = context;
        this.e = kvyVar;
        this.c = kvwVar;
        this.d = rwiVar;
        this.a = ajctVar;
    }

    public hwv(defpackage.hda hdaVar, defpackage.hdb hdbVar, defpackage.hdb hdbVar2, defpackage.hdb hdbVar3, defpackage.hdb hdbVar4) {
        this.b = hdaVar;
        this.c = hdbVar;
        this.d = hdbVar2;
        this.e = hdbVar3;
        this.a = hdbVar4;
    }

    public hwv(ajct ajctVar, kjr kjrVar, jsk jskVar, defpackage.jiv jivVar, rlv rlvVar) {
        this.d = ajctVar;
        this.c = kjrVar;
        this.b = jskVar;
        this.a = jivVar;
        this.e = rlvVar;
    }

    public hwv(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, char[] cArr) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.e = aoinVar2;
        aoinVar3.getClass();
        this.a = aoinVar3;
        aoinVar4.getClass();
        this.c = aoinVar4;
        this.d = aoinVar5;
    }

    public hwv(java.lang.String str, android.content.Context context, defpackage.hws hwsVar) {
        this.a = str;
        this.b = context;
        this.c = hwsVar;
        this.d = new android.text.SpannableString(str);
        this.e = new android.text.style.ForegroundColorSpan(urg.c(context, android.R.attr.textColorPrimary));
    }

    public hwv(ajct ajctVar, aoin aoinVar) {
        this.b = new java.util.concurrent.atomic.AtomicReference(zmx.a);
        this.d = new java.util.concurrent.atomic.AtomicBoolean();
        this.c = new java.util.concurrent.atomic.AtomicBoolean();
        this.a = new ajdc(ajctVar);
        this.e = aoinVar;
    }

    public hwv(gat gatVar, dnx dnxVar, dpf dpfVar, dpq dpqVar) {
        this.c = gatVar;
        this.d = dnxVar;
        this.b = dpfVar;
        this.e = dpqVar;
        this.a = new defpackage.vk();
    }

    public hwv(android.content.Context context, ajct ajctVar, zpz zpzVar, pvf pvfVar) {
        this.b = context;
        this.c = ajctVar;
        this.e = zpzVar;
        this.a = pvfVar;
        this.d = new java.util.concurrent.atomic.AtomicReference(q());
    }

    public hwv(android.content.Context context, aolr aolrVar, riv rivVar, uzx uzxVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        this.b = context;
        this.d = aolrVar;
        this.a = rivVar;
        this.e = uzxVar;
        this.c = aooc.ag(new pqf(this, 7));
    }

    public hwv(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, byte[] bArr) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.c = aoinVar2;
        aoinVar3.getClass();
        this.e = aoinVar3;
        aoinVar4.getClass();
        this.d = aoinVar4;
        aoinVar5.getClass();
        this.a = aoinVar5;
    }

    public hwv(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
        aoinVar3.getClass();
        this.e = aoinVar3;
        aoinVar4.getClass();
        this.d = aoinVar4;
        aoinVar5.getClass();
        this.c = aoinVar5;
    }
}
