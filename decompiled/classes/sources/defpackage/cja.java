package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cja implements defpackage.aonn, defpackage.aono, defpackage.aonp, defpackage.aonq, defpackage.aonr, defpackage.aons, defpackage.aont, defpackage.aonu, defpackage.aomz, defpackage.aona, defpackage.aonc, defpackage.aond, defpackage.aone, defpackage.aonf, defpackage.aong, defpackage.aonh, defpackage.aoni, defpackage.aonk, defpackage.aonl {
    public final boolean a;
    public java.lang.Object b;
    public java.util.List c;
    public defpackage.cdk d;
    private final int e;

    public cja(int i, boolean z, java.lang.Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void h(defpackage.cav cavVar) {
        defpackage.cdk cdkVarO;
        if (!this.a || (cdkVarO = ((defpackage.cbt) cavVar).O()) == null) {
            return;
        }
        cdkVarO.r();
        if (defpackage.cfo.i(this.d, cdkVarO)) {
            this.d = cdkVarO;
            return;
        }
        java.util.List list = this.c;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.c = arrayList;
            arrayList.add(cdkVarO);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (defpackage.cfo.i((defpackage.cdk) list.get(i), cdkVarO)) {
                list.set(i, cdkVarO);
                return;
            }
        }
        list.add(cdkVarO);
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return b((defpackage.cav) obj, ((java.lang.Number) obj2).intValue());
    }

    public final java.lang.Object b(defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(this.e);
        h(cavVarB);
        int i2 = true != cavVarB.B(this) ? 2 : 4;
        java.lang.Object obj = this.b;
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        }
        defpackage.aoov.f(obj, 2);
        java.lang.Object objA = ((defpackage.aonn) obj).a(cavVarB, java.lang.Integer.valueOf(i | i2));
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.tce(this, 1, null);
        }
        return objA;
    }

    public final java.lang.Object c(java.lang.Object obj, defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(this.e);
        h(cavVarB);
        int i2 = true != cavVarB.B(this) ? 16 : 32;
        java.lang.Object obj2 = this.b;
        if (obj2 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        }
        defpackage.aoov.f(obj2, 3);
        java.lang.Object objA = ((defpackage.aono) obj2).a(obj, cavVarB, java.lang.Integer.valueOf(i2 | i));
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bdx(this, obj, i, 2);
        }
        return objA;
    }

    public final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(this.e);
        h(cavVarB);
        int i2 = true != cavVarB.B(this) ? 128 : 256;
        java.lang.Object obj3 = this.b;
        if (obj3 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        }
        defpackage.aoov.f(obj3, 4);
        java.lang.Object objA = ((defpackage.aonp) obj3).a(obj, obj2, cavVarB, java.lang.Integer.valueOf(i2 | i));
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciz(this, obj, obj2, i, 0);
        }
        return objA;
    }

    public final java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(this.e);
        h(cavVarB);
        int i2 = true != cavVarB.B(this) ? 1024 : 2048;
        java.lang.Object obj4 = this.b;
        if (obj4 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        }
        defpackage.aoov.f(obj4, 5);
        java.lang.Object objA = ((defpackage.aonq) obj4).a(obj, obj2, obj3, cavVarB, java.lang.Integer.valueOf(i2 | i));
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new biu(this, obj, obj2, obj3, i, 4);
        }
        return objA;
    }

    public final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(this.e);
        h(cavVarB);
        int i2 = true != cavVarB.B(this) ? 8192 : 16384;
        java.lang.Object obj5 = this.b;
        if (obj5 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        }
        defpackage.aoov.f(obj5, 6);
        java.lang.Object objA = ((defpackage.aonr) obj5).a(obj, obj2, obj3, obj4, cavVarB, java.lang.Integer.valueOf(i2 | i));
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(this, obj, obj2, obj3, obj4, i, 6);
        }
        return objA;
    }

    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(this.e);
        h(cavVarB);
        int i2 = true != cavVarB.B(this) ? 524288 : 1048576;
        java.lang.Object obj7 = this.b;
        if (obj7 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        }
        defpackage.aoov.f(obj7, 8);
        java.lang.Object objA = ((defpackage.aont) obj7).a(obj, obj2, obj3, obj4, obj5, obj6, cavVarB, java.lang.Integer.valueOf(i | i2));
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciy(this, obj, obj2, obj3, obj4, obj5, obj6, i, 0);
        }
        return objA;
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return c(obj, (defpackage.cav) obj2, ((java.lang.Number) obj3).intValue());
    }

    @Override // defpackage.aonp
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return d(obj, obj2, (defpackage.cav) obj3, ((java.lang.Number) obj4).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aonq
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return e(obj, obj2, obj3, obj4, ((java.lang.Number) obj5).intValue());
    }

    @Override // defpackage.aonr
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return f(obj, obj2, obj3, obj4, (defpackage.cav) obj5, ((java.lang.Number) obj6).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aont
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return g(obj, obj2, obj3, obj4, obj5, obj6, obj7, ((java.lang.Number) obj8).intValue());
    }
}
