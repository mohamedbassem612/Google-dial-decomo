package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzv extends defpackage.aomh implements defpackage.aono {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzv(defpackage.aoln aolnVar, defpackage.gat gatVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = gatVar;
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.jzv jzvVar = new defpackage.jzv((defpackage.aoln) obj3, (defpackage.jzx) this.c, 0);
            jzvVar.d = (defpackage.aoxi) obj;
            jzvVar.b = obj2;
            return jzvVar.b(defpackage.aojh.a);
        }
        if (i != 1) {
            defpackage.jzv jzvVar2 = new defpackage.jzv((defpackage.aoln) obj3, (defpackage.unb) this.c, 2);
            jzvVar2.d = (defpackage.aoxi) obj;
            jzvVar2.b = obj2;
            return jzvVar2.b(defpackage.aojh.a);
        }
        defpackage.jzv jzvVar3 = new defpackage.jzv((defpackage.aoln) obj3, (defpackage.gat) this.c, 1);
        jzvVar3.d = (defpackage.aoxi) obj;
        jzvVar3.b = obj2;
        return jzvVar3.b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v8, types: [aoxh[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aolr, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        ?? r5;
        defpackage.aoxh gdcVar;
        int i = this.$cid;
        if (i == 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i2 = this.a;
            defpackage.aooc.af(obj);
            if (i2 == 0) {
                ?? r14 = this.d;
                defpackage.aowy aowyVar = new defpackage.aowy(new defpackage.jzw((java.lang.Long) this.b, (defpackage.jzx) this.c, (defpackage.aoln) null, 0));
                this.a = 1;
                if (defpackage.aoov.aG(r14, aowyVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            ?? r0 = this.d;
            java.lang.Object obj3 = this.b;
            defpackage.aolu aoluVar2 = defpackage.aolu.a;
            int i3 = this.a;
            defpackage.aooc.af(obj);
            if (i3 == 0) {
                defpackage.aogc aogcVar = (defpackage.aogc) obj3;
                java.lang.Object obj4 = aogcVar.a;
                java.lang.Object obj5 = aogcVar.c;
                defpackage.kgl kglVar = new defpackage.kgl(new defpackage.gdc(((defpackage.gbl) obj4).g, new defpackage.fys((defpackage.aoln) null, 2, (char[]) null), 12), new defpackage.gak(), new defpackage.kaw(obj4));
                this.d = null;
                this.b = null;
                this.a = 1;
                if (r0.a(kglVar, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return defpackage.aojh.a;
        }
        defpackage.aolu aoluVar3 = defpackage.aolu.a;
        int i4 = this.a;
        if (i4 != 0) {
            if (i4 != 1) {
                defpackage.aooc.af(obj);
            } else {
                java.lang.Object obj6 = this.d;
                defpackage.aooc.af(obj);
                r5 = obj6;
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        obj2 = this.d;
        java.lang.Object obj7 = this.c;
        this.a = 1;
        obj = ((defpackage.unb) obj7).a(this);
        if (obj == aoluVar3) {
            r5 = obj2;
            return aoluVar3;
        }
        r5 = obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.lang.Object obj8 = this.c;
            defpackage.unb unbVar = (defpackage.unb) obj8;
            defpackage.gpd gpdVar = unbVar.k;
            java.lang.Object obj9 = gpdVar.b;
            android.net.Uri uri = android.provider.ContactsContract.Contacts.CONTENT_URI;
            defpackage.aooh.e(uri, "CONTENT_URI");
            defpackage.aoxh[] aoxhVarArr = {new defpackage.aowy(new defpackage.fyx(gpdVar, (defpackage.aoln) null, 3)), new defpackage.gdc(((defpackage.ojo) obj9).k(uri), gpdVar, 5)};
            int i5 = defpackage.aoyc.a;
            defpackage.gdc gdcVar2 = new defpackage.gdc(defpackage.aoxo.a(defpackage.aoov.aC(new defpackage.apab(new defpackage.aojz(aoxhVarArr)), gpdVar.a)), obj8, 4);
            gdcVar = new defpackage.gdc((java.lang.Object) new defpackage.aoxh[]{gdcVar2, unbVar.l.a, unbVar.h, unbVar.i}, new defpackage.una(unbVar, null), 13);
        } else {
            gdcVar = new defpackage.aowy(new zgp((defpackage.aoln) null, 1, (byte[]) null));
        }
        this.d = null;
        this.a = 2;
        if (defpackage.aoov.aG(r5, gdcVar, this) == aoluVar3) {
            return aoluVar3;
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzv(defpackage.aoln aolnVar, defpackage.jzx jzxVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = jzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzv(defpackage.aoln aolnVar, defpackage.unb unbVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = unbVar;
    }
}
