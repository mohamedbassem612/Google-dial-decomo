package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abjg extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjg(android.content.Context context, aonj aonjVar, android.net.Uri uri, dpp dppVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = context;
        this.b = aonjVar;
        this.c = uri;
        this.d = dppVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((cdi) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((defpackage.srn) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            cdi cdiVar = (cdi) this.e;
            defpackage.xsv xsvVarB = defpackage.xrr.c((android.content.Context) this.a).b();
            java.lang.Object obj2 = this.d;
            if (obj2 != null) {
                long j = ((dpp) obj2).a;
                defpackage.yeh yehVarZ = xsvVarB.z((int) (j >> 32), (int) (j & 4294967295L));
                aooh.e(yehVarZ, "override(...)");
                xsvVarB = (defpackage.xsv) ((defpackage.xsv) yehVarZ).v();
            } else {
                aooh.c(xsvVarB);
            }
            ((defpackage.xsv) this.b.a(xsvVarB)).e((android.net.Uri) this.c).k(new defpackage.abjf(cdiVar));
            return aojh.a;
        }
        if (i != 1) {
            aooc.af(obj);
            java.lang.Object obj3 = this.b;
            return new java.lang.Integer(((apni) ((aogc) this.d).a).k((android.net.Uri) this.c, (android.content.ContentValues) this.a, (java.lang.String) obj3, (java.lang.String[]) null));
        }
        aooc.af(obj);
        defpackage.srn srnVar = (defpackage.srn) this.e;
        defpackage.spn spnVar = srnVar != null ? srnVar.b : null;
        java.lang.Object obj4 = this.a;
        if (aooh.n(spnVar, obj4)) {
            return srnVar;
        }
        if (obj4 == null) {
            return null;
        }
        java.lang.Object obj5 = this.b;
        java.lang.Object obj6 = this.d;
        return new defpackage.srn((java.lang.String) obj5, (defpackage.spn) obj4, obj6 != null ? ((java.lang.Long) obj6).longValue() : j$.time.Instant.now().toEpochMilli());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [aonj, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.abjg abjgVar;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.a;
            android.content.Context context = (android.content.Context) obj2;
            abjgVar = new defpackage.abjg(context, (aonj) this.b, (android.net.Uri) this.c, (dpp) this.d, aolnVar, 0);
            abjgVar.e = obj;
        } else {
            if (i != 1) {
                java.lang.Object obj3 = this.d;
                java.lang.Object obj4 = this.c;
                android.net.Uri uri = (android.net.Uri) obj4;
                aogc aogcVar = (aogc) obj3;
                defpackage.abjg abjgVar2 = new defpackage.abjg(aolnVar, aogcVar, uri, (android.content.ContentValues) this.a, (java.lang.String) this.b, 2);
                abjgVar2.e = obj;
                return abjgVar2;
            }
            java.lang.Object obj5 = this.a;
            java.lang.Object obj6 = this.b;
            java.lang.Long l = (java.lang.Long) this.d;
            defpackage.spn spnVar = (defpackage.spn) obj5;
            abjgVar = new defpackage.abjg(spnVar, (java.lang.String) obj6, l, (rsr) this.c, aolnVar, 1);
            abjgVar.e = obj;
        }
        return abjgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjg(aoln aolnVar, aogc aogcVar, android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aogcVar;
        this.c = uri;
        this.a = contentValues;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjg(defpackage.spn spnVar, java.lang.String str, java.lang.Long l, rsr rsrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = spnVar;
        this.b = str;
        this.d = l;
        this.c = rsrVar;
    }
}
