package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ude implements jye {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;
    private final java.lang.Object c;
    private final java.lang.Object d;
    private final java.lang.Object e;

    public ude(mau mauVar, rlv rlvVar, zjm zjmVar, tkl tklVar, rsr rsrVar, int i) {
        this.$cid = i;
        aooh.f(mauVar, "actionProvider");
        aooh.f(rlvVar, "loggingBindings");
        this.b = mauVar;
        this.e = rlvVar;
        this.a = zjmVar;
        this.c = tklVar;
        this.d = rsrVar;
    }

    public final jyd a(kiu kiuVar) {
        jyd jydVar;
        int i = this.$cid;
        if (i == 0) {
            aooh.f(kiuVar, "row");
            kit kitVarB = kit.b(kiuVar.v);
            if (kitVarB == null) {
                kitVarB = kit.a;
            }
            if (kitVarB == kit.d || !afsq.cf(kiuVar) || !afsq.cg(kiuVar)) {
                return null;
            }
            java.lang.String str = kiuVar.g;
            aooh.e(str, "getRawNumber(...)");
            if (str.length() <= 0) {
                return null;
            }
            kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            if (kiwVar.j) {
                return null;
            }
            kiw kiwVar2 = kiuVar.r;
            if (kiwVar2 == null) {
                kiwVar2 = kiw.a;
            }
            if (kiwVar2.r || kiuVar.s) {
                return null;
            }
            tkl tklVar = (tkl) this.d;
            if (!tklVar.s(kiuVar) || !tklVar.t(kiuVar)) {
                return null;
            }
            jydVar = new jyd(2131231051, new jyk(2132017569), (java.lang.String) null, java.lang.Integer.valueOf(urg.c((android.content.Context) this.c, 2130968948)), abja.N, 2);
        } else if (i != 1) {
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
            kiw kiwVar3 = kiuVar.r;
            if (kiwVar3 == null) {
                kiwVar3 = kiw.a;
            }
            if (kiwVar3.j) {
                return null;
            }
            kiw kiwVar4 = kiuVar.r;
            if (kiwVar4 == null) {
                kiwVar4 = kiw.a;
            }
            if (kiwVar4.r || kiuVar.s) {
                return null;
            }
            if (((!kiuVar.A || ((tkl) this.d).u(kiuVar)) && !((tkl) this.d).s(kiuVar)) || ((tkl) this.d).t(kiuVar)) {
                return null;
            }
            jydVar = new jyd(2131231051, new jyk(2132017577), (java.lang.String) null, (java.lang.Integer) null, abja.N, 1);
        } else {
            aooh.f(kiuVar, "row");
            aooh.f(kiuVar, "<this>");
            kit kitVarB3 = kit.b(kiuVar.v);
            if (kitVarB3 == null) {
                kitVarB3 = kit.a;
            }
            if (kitVarB3 == kit.d || !kiuVar.z || !afsq.cf(kiuVar) || !afsq.cg(kiuVar)) {
                return null;
            }
            java.lang.String str3 = kiuVar.g;
            aooh.e(str3, "getRawNumber(...)");
            if (str3.length() <= 0 || ((tkl) this.c).u(kiuVar)) {
                return null;
            }
            kiw kiwVar5 = kiuVar.r;
            if (kiwVar5 == null) {
                kiwVar5 = kiw.a;
            }
            if (kiwVar5.j) {
                return null;
            }
            kiw kiwVar6 = kiuVar.r;
            if (kiwVar6 == null) {
                kiwVar6 = kiw.a;
            }
            if (kiwVar6.r || kiuVar.s) {
                return null;
            }
            aooh.f(kiuVar, "<this>");
            j$.util.Optional optionalG = ((zjm) this.a).g();
            aooh.e(optionalG, "getFeature(...)");
            if (((mnp) aooh.q(optionalG)) != null && ((rsr) this.d).O(kiuVar).l) {
                return null;
            }
            jydVar = new jyd(2131231747, new jyk(2132018163), (java.lang.String) null, (java.lang.Integer) null, abja.dY, 1);
        }
        return jydVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, rlv] */
    public final void b(jyg jygVar) {
        int i = this.$cid;
        if (i == 0) {
            this.a.o(rmx.uC);
            java.lang.Object obj = this.b;
            kiu kiuVar = jygVar.a;
            jhw jhwVarD = hht.d(((rsr) obj).aq(kiuVar, 10).p());
            kir kirVar = kiuVar.D;
            if (kirVar == null) {
                kirVar = kir.a;
            }
            jhwVarD.c(kirVar.g || ((rsr) this.e).O(kiuVar).h);
            jmc.a((android.content.Context) this.c, jhwVarD.b());
            return;
        }
        if (i == 1) {
            this.e.o(rmx.lR);
            ((mau) this.b).n(jygVar.c, jygVar.a, false);
            return;
        }
        this.a.o(rmx.ul);
        java.lang.Object obj2 = this.b;
        kiu kiuVar2 = jygVar.a;
        jhw jhwVarD2 = hht.d(((rsr) obj2).aq(kiuVar2, 10).p());
        kir kirVar2 = kiuVar2.D;
        if (kirVar2 == null) {
            kirVar2 = kir.a;
        }
        jhwVarD2.c(kirVar2.g || ((rsr) this.e).O(kiuVar2).h);
        jmc.b((android.content.Context) this.c, jhwVarD2.b());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, rlv] */
    public final java.lang.Object c(jyd jydVar) {
        int i = this.$cid;
        if (i == 0) {
            this.a.o(rmx.uB);
            return aojh.a;
        }
        if (i != 1) {
            this.a.o(rmx.uk);
            return aojh.a;
        }
        this.e.n(rmw.hM);
        return aojh.a;
    }

    public ude(rlv rlvVar, rsr rsrVar, android.content.Context context, tkl tklVar, rsr rsrVar2, int i) {
        this.$cid = i;
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(context, "appContext");
        this.a = rlvVar;
        this.b = rsrVar;
        this.c = context;
        this.d = tklVar;
        this.e = rsrVar2;
    }

    public ude(rlv rlvVar, rsr rsrVar, android.content.Context context, tkl tklVar, rsr rsrVar2, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(context, "appContext");
        this.a = rlvVar;
        this.b = rsrVar;
        this.c = context;
        this.d = tklVar;
        this.e = rsrVar2;
    }
}
