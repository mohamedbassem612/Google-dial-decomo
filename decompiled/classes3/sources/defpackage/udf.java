package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class udf implements jye {
    private final /* synthetic */ int $cid;
    private final android.content.Context a;
    private final java.lang.Object b;
    private final java.lang.Object c;
    private final java.lang.Object d;

    public udf(android.content.Context context, j$.util.Optional optional, gpd gpdVar, rlv rlvVar, int i) {
        this.$cid = i;
        aooh.f(context, "appContext");
        aooh.f(optional, "transcriptAudioFeedback");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.b = optional;
        this.d = gpdVar;
        this.c = rlvVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    public final jyd a(kiu kiuVar) {
        jyd jydVar;
        boolean z;
        boolean z2;
        int i = this.$cid;
        if (i == 0) {
            aooh.f(kiuVar, "row");
            aooh.f(kiuVar, "row");
            kit kitVarB = kit.b(kiuVar.v);
            if (kitVarB == null) {
                kitVarB = kit.a;
            }
            if (kitVarB == kit.d) {
                return null;
            }
            aooh.f(kiuVar, "row");
            kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            rmt rmtVarB = rmt.b(kiwVar.o);
            if (rmtVarB == null) {
                rmtVarB = rmt.a;
            }
            if (rmtVarB != rmt.a) {
                return null;
            }
            aooh.f(kiuVar, "row");
            if (kiuVar.i != 1) {
                return null;
            }
            java.lang.String str = kiuVar.g;
            aooh.e(str, "getRawNumber(...)");
            if (str.length() <= 0) {
                return null;
            }
            tkl tklVar = (tkl) this.c;
            if (!tklVar.u(kiuVar) || kiuVar.q == 2) {
                return null;
            }
            kiw kiwVar2 = kiuVar.r;
            if (kiwVar2 == null) {
                kiwVar2 = kiw.a;
            }
            if (kiwVar2.r || kiuVar.s || tklVar.t(kiuVar)) {
                return null;
            }
            jydVar = new jyd(2131231749, new jyk(2132019870), (java.lang.String) null, (java.lang.Integer) null, abja.eH, 1);
        } else if (i != 1) {
            aooh.f(kiuVar, "row");
            android.content.Context context = this.a;
            if (kon.f(context).b && !kon.e(context)) {
                return null;
            }
            defpackage.wxp wxpVar = kiuVar.C;
            if (wxpVar == null) {
                wxpVar = defpackage.wxp.a;
            }
            if (wxpVar.e) {
                defpackage.wxp wxpVar2 = kiuVar.C;
                if (wxpVar2 == null) {
                    wxpVar2 = defpackage.wxp.a;
                }
                if (wxpVar2.g) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            defpackage.wgu wguVar = kiuVar.I;
            if (wguVar == null) {
                wguVar = defpackage.wgu.a;
            }
            if (wguVar.e) {
                defpackage.wgu wguVar2 = kiuVar.I;
                if (wguVar2 == null) {
                    wguVar2 = defpackage.wgu.a;
                }
                if (wguVar2.c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            kir kirVar = kiuVar.D;
            if (kirVar == null) {
                kirVar = kir.a;
            }
            boolean z3 = kirVar.g;
            boolean z4 = kon.b(context, kiuVar).h;
            boolean z5 = ((kom) agab.aH(context, kom.class)).in() && kon.a(context, kiuVar).k;
            if (!z && !z2 && !z3 && !z4 && !z5 && !kon.g(context)) {
                return null;
            }
            jydVar = new jyd(2131231722, new jyk(2132020594), (java.lang.String) null, (java.lang.Integer) null, abja.bO, 1);
        } else {
            aooh.f(kiuVar, "row");
            kit kitVarB2 = kit.b(kiuVar.v);
            if (kitVarB2 == null) {
                kitVarB2 = kit.a;
            }
            if (kitVarB2 == kit.d || !afsq.cf(kiuVar) || !afsq.cg(kiuVar)) {
                return null;
            }
            java.lang.String str2 = kiuVar.g;
            aooh.e(str2, "getRawNumber(...)");
            if (str2.length() <= 0) {
                return null;
            }
            tkl tklVar2 = (tkl) this.c;
            if (!tklVar2.t(kiuVar) || !tklVar2.s(kiuVar)) {
                return null;
            }
            kiw kiwVar3 = kiuVar.r;
            if (kiwVar3 == null) {
                kiwVar3 = kiw.a;
            }
            if (kiwVar3.r || kiuVar.s) {
                return null;
            }
            jydVar = new jyd(2131231749, new jyk(2132019867), (java.lang.String) null, (java.lang.Integer) null, abja.eH, 1);
        }
        return jydVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r0v22, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r4v5, types: [aonj, java.lang.Object] */
    public final void b(jyg jygVar) {
        j$.util.Optional optionalEmpty;
        j$.util.Optional optionalG;
        int i = this.$cid;
        if (i == 0) {
            this.b.o(rmx.lL);
            jmc.d(this.a, ((rsr) this.d).aq(jygVar.a, 10));
            return;
        }
        if (i == 1) {
            this.b.o(rmx.lM);
            jmc.c(this.a, ((rsr) this.d).aq(jygVar.a, 10));
            return;
        }
        this.c.o(rmx.lO);
        if (((wsc) aooh.q((j$.util.Optional) this.b)) != null) {
            kiu kiuVar = jygVar.a;
            az azVar = jygVar.c;
            defpackage.vqf vqfVarBy = wsc.by(defpackage.utu.a.m());
            vqfVarBy.z(kiuVar.e);
            vqfVarBy.C(3);
            android.content.Context context = this.a;
            java.lang.String strD = kon.d(context, kiuVar);
            aooh.e(strD, "getUniqueCallId(...)");
            vqfVarBy.B(strD);
            alad aladVarP = ((gpd) this.d).a(kiuVar, 1).p();
            aooh.e(aladVarP, "build(...)");
            vqfVarBy.A((defpackage.abwd) aladVarP);
            kom komVar = (kom) agab.aH(context, kom.class);
            if (kon.g(context)) {
                optionalEmpty = komVar.mW().g();
                if (true == optionalEmpty.isPresent()) {
                    optionalEmpty = j$.util.Optional.ofNullable(((omq) optionalEmpty.get()).a());
                }
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
            defpackage.ubv ubvVar = new defpackage.ubv(new tge(vqfVarBy, 11), 16);
            if (true == optionalEmpty.isPresent()) {
                ubvVar.a.a(optionalEmpty.get());
            }
            if (kon.g(context)) {
                optionalG = ((kom) agab.aH(context, kom.class)).mW().g();
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(((omq) optionalG.get()).b());
                }
            } else {
                optionalG = j$.util.Optional.empty();
            }
            defpackage.ubv ubvVar2 = new defpackage.ubv(new tge(vqfVarBy, 12), 17);
            if (true == optionalG.isPresent()) {
                ubvVar2.a.a(optionalG.get());
            }
            wsc.bg(azVar, vqfVarBy.x());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, rlv] */
    public final java.lang.Object c(jyd jydVar) {
        int i = this.$cid;
        if (i == 0) {
            this.b.o(rmx.lK);
            return aojh.a;
        }
        if (i != 1) {
            this.c.o(rmx.lP);
        }
        return aojh.a;
    }

    public udf(android.content.Context context, rlv rlvVar, tkl tklVar, rsr rsrVar, int i) {
        this.$cid = i;
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.b = rlvVar;
        this.c = tklVar;
        this.d = rsrVar;
    }

    public udf(android.content.Context context, rlv rlvVar, tkl tklVar, rsr rsrVar, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.b = rlvVar;
        this.c = tklVar;
        this.d = rsrVar;
    }
}
