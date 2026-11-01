package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class gwo implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ gwo(java.lang.String str, int i) {
        this.$cid = i;
        this.a = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v49, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v54, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v60, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v65, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v81, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        jrj jrjVarK;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(ils.i((java.lang.String) this.a, (java.lang.String) this.b, (gjh) obj));
            case 1:
                return java.lang.Boolean.valueOf(ils.i((java.lang.String) this.a, (java.lang.String) this.b, (gjh) obj));
            case 2:
                aca acaVar = (aca) obj;
                aooh.f(acaVar, "_tmpMap");
                ((gwx) this.b).b((gjh) this.a, acaVar);
                return aojh.a;
            case 3:
                aca acaVar2 = (aca) obj;
                aooh.f(acaVar2, "_tmpMap");
                ((gwx) this.b).c((gjh) this.a, acaVar2);
                return aojh.a;
            case 4:
                return ils.e((java.lang.String) this.a, (java.lang.String) this.b, (gjh) obj);
            case 5:
                gin ginVarA = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        arrayList.add(iui.k(ginVarA));
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            case 6:
                return aazc.g((abwx) this.a, (java.lang.String) this.b, (aoln) obj);
            case 7:
                gin ginVarA2 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA2);
                    jrjVarK = ginVarA2.m() ? iui.k(ginVarA2) : null;
                } finally {
                    ginVarA2.close();
                }
                break;
            case 8:
                gin ginVarA3 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA3);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (ginVarA3.m()) {
                        arrayList2.add(iui.k(ginVarA3));
                    }
                    ginVarA3.close();
                    return arrayList2;
                } catch (java.lang.Throwable th2) {
                    ginVarA3.close();
                    throw th2;
                }
            case 9:
                return ((iui) this.a).a.c((gjh) obj, (java.util.Collection) this.b);
            case 10:
                return java.lang.Integer.valueOf(((iui) this.a).b.c((gjh) obj, (java.lang.Iterable) this.b));
            case 11:
                return java.lang.Integer.valueOf(((iui) this.a).c.c((gjh) obj, (java.lang.Iterable) this.b));
            case 12:
                return aazc.g((abwx) this.a, (java.lang.String) this.b, (aoln) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                gin ginVarA4 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA4);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (ginVarA4.m()) {
                        arrayList3.add(jrh.l(ginVarA4));
                    }
                    ginVarA4.close();
                    return arrayList3;
                } catch (java.lang.Throwable th3) {
                    ginVarA4.close();
                    throw th3;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                gin ginVarA5 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA5);
                    jrjVarK = ginVarA5.m() ? jrh.l(ginVarA5) : null;
                } finally {
                    ginVarA5.close();
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                gin ginVarA6 = ((gjh) obj).a((java.lang.String) this.b);
                try {
                    ((rsr) this.a).b.a(ginVarA6);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    while (ginVarA6.m()) {
                        arrayList4.add(jrh.l(ginVarA6));
                    }
                    ginVarA6.close();
                    return arrayList4;
                } catch (java.lang.Throwable th4) {
                    ginVarA6.close();
                    throw th4;
                }
            case 16:
                return java.lang.Integer.valueOf(((jrh) this.a).b.c((gjh) obj, (java.lang.Iterable) this.b));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Integer.valueOf(((jrh) this.a).c.c((gjh) obj, (java.lang.Iterable) this.b));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((jrh) this.a).a.c((gjh) obj, (java.util.Collection) this.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                bar barVar = (bar) obj;
                aooh.f(barVar, "$this$LazyRow");
                defpackage.jak jakVar = new defpackage.jak(15);
                ?? r1 = this.a;
                barVar.b(r1.size(), new defpackage.dev(jakVar, (java.lang.Object) r1, 4), new lwl((java.lang.Object) r1, 1), new cja(802480018, true, new defpackage.ablj((java.util.List) r1, (aonj) this.b, 1)));
                return aojh.a;
            default:
                return ((kib) this.a).a.c((gjh) obj, (java.util.Collection) this.b);
        }
        return jrjVarK;
    }

    public /* synthetic */ gwo(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ gwo(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ gwo(java.lang.String str, int i, char[] cArr) {
        this.$cid = i;
        this.a = "SELECT name FROM workname WHERE work_spec_id=?";
        this.b = str;
    }
}
