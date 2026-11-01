package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dgu implements defpackage.emv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    public dgu(defpackage.aoss aossVar, defpackage.ccx ccxVar, defpackage.cds cdsVar, defpackage.aoot aootVar, int i) {
        this.$cid = i;
        this.a = aossVar;
        this.b = ccxVar;
        this.c = cdsVar;
        this.d = aootVar;
    }

    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, oi] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aoss, java.lang.Object] */
    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        if (this.$cid != 0) {
            java.lang.Object obj = this.a;
            java.lang.Object obj2 = this.c;
            if (defpackage.emp.ON_START != empVar) {
                if (defpackage.emp.ON_STOP == empVar) {
                    ((defpackage.on) obj2).d.remove(obj);
                    return;
                } else {
                    if (defpackage.emp.ON_DESTROY == empVar) {
                        ((defpackage.on) obj2).d((java.lang.String) obj);
                        return;
                    }
                    return;
                }
            }
            java.lang.Object obj3 = this.d;
            ?? r11 = this.b;
            defpackage.on onVar = (defpackage.on) obj2;
            defpackage.or orVar = (defpackage.or) obj3;
            onVar.d.put(obj, new defpackage.nf((defpackage.oi) r11, orVar));
            java.util.Map map = onVar.e;
            if (map.containsKey(obj)) {
                java.lang.Object obj4 = map.get(obj);
                map.remove(obj);
                r11.a(obj4);
            }
            android.os.Bundle bundle = onVar.f;
            java.lang.String str = (java.lang.String) obj;
            androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) defpackage.dpe.t(bundle, str, androidx.activity.result.ActivityResult.class);
            if (activityResult != null) {
                bundle.remove(str);
                r11.a(orVar.parseResult(activityResult.a, activityResult.b));
                return;
            }
            return;
        }
        defpackage.aosb aosbVarC = null;
        switch (empVar.ordinal()) {
            case 0:
                defpackage.aoov.an(this.a, null, 4, new defpackage.eeb((defpackage.aoot) this.d, (defpackage.cds) this.c, emxVar, this, (defpackage.aoln) null, 1), 1);
                return;
            case 1:
                java.lang.Object obj5 = this.b;
                if (obj5 != null) {
                    java.lang.Object obj6 = ((defpackage.ccx) obj5).b;
                    synchronized (((defpackage.cce) obj6).a) {
                        if (!((defpackage.cce) obj6).b()) {
                            java.util.List list = ((defpackage.cce) obj6).b;
                            ((defpackage.cce) obj6).b = ((defpackage.cce) obj6).c;
                            ((defpackage.cce) obj6).c = list;
                            ((defpackage.cce) obj6).d = true;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ((defpackage.aoln) list.get(i)).w(defpackage.aojh.a);
                            }
                            list.clear();
                        }
                        break;
                    }
                }
                java.lang.Object obj7 = this.c;
                synchronized (((defpackage.cds) obj7).b) {
                    if (((defpackage.cds) obj7).h) {
                        ((defpackage.cds) obj7).h = false;
                        aosbVarC = ((defpackage.cds) obj7).C();
                    }
                    break;
                }
                if (aosbVarC != null) {
                    aosbVarC.w(defpackage.aojh.a);
                    return;
                }
                return;
            case 2:
            case 3:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return;
            case 4:
                ((defpackage.cds) this.c).F();
                return;
            case 5:
                ((defpackage.cds) this.c).D();
                return;
            default:
                throw new defpackage.aois();
        }
    }

    public /* synthetic */ dgu(defpackage.on onVar, java.lang.String str, defpackage.oi oiVar, defpackage.or orVar, int i) {
        this.$cid = i;
        this.c = onVar;
        this.a = str;
        this.b = oiVar;
        this.d = orVar;
    }
}
