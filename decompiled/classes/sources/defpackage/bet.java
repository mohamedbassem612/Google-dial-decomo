package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bet implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bet(java.lang.String str, int i) {
        this.$cid = i;
        this.b = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [cjt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [cjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aonj, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Exception {
        java.lang.Long lValueOf = null;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                defpackage.ady adyVar = ((defpackage.beu) obj2).a;
                java.lang.Object obj3 = this.a;
                adyVar.e(obj3);
                return new defpackage.kcp(obj2, obj3, 1);
            case 1:
                defpackage.czb czbVar = (defpackage.czb) obj;
                defpackage.ayv ayvVar = (defpackage.ayv) this.b;
                boolean z = ayvVar.e;
                java.lang.Object obj4 = this.a;
                if (z) {
                    czbVar.u((defpackage.czc) obj4, defpackage.dfd.p(czbVar, ayvVar.a), defpackage.dfd.p(czbVar, ayvVar.b), 0.0f);
                } else {
                    czbVar.s((defpackage.czc) obj4, defpackage.dfd.p(czbVar, ayvVar.a), defpackage.dfd.p(czbVar, ayvVar.b), 0.0f);
                }
                return defpackage.aojh.a;
            case 2:
                ?? r0 = this.b;
                return new defpackage.beu(this.a, (java.util.Map) obj, r0);
            case 3:
                defpackage.aozj aozjVar = defpackage.cds.j;
                ((defpackage.cbb) this.a).s(obj);
                java.lang.Object obj5 = this.b;
                if (obj5 != null) {
                    ((defpackage.ady) obj5).j(obj);
                }
                return defpackage.aojh.a;
            case 4:
                defpackage.aonj aonjVar = defpackage.ckw.a;
                this.b.a(obj);
                this.a.a(obj);
                return defpackage.aojh.a;
            case 5:
                defpackage.aonj aonjVar2 = defpackage.ckw.a;
                this.b.a(obj);
                this.a.a(obj);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj6 = this.b;
                ((defpackage.clj) this.a).d(obj, (defpackage.cbg) obj6);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.czb.z((defpackage.czb) obj, (defpackage.czc) this.a, 0, 0, ((defpackage.cre) this.b).E, 4);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                final defpackage.dfl dflVar = (defpackage.dfl) obj;
                ?? r1 = this.b;
                final defpackage.dha dhaVar = (defpackage.dha) r1;
                if (!dhaVar.c) {
                    final ?? r6 = this.a;
                    defpackage.ems emsVarP = dflVar.b().P();
                    dhaVar.e = r6;
                    if (dhaVar.d == null) {
                        android.view.View view = dflVar.a;
                        if (defpackage.aooh.n(android.os.Looper.myLooper(), view.getHandler().getLooper())) {
                            dhaVar.d = emsVarP;
                            emsVarP.c(r1);
                        } else {
                            view.post(new defpackage.ad((java.lang.Object) r1, emsVarP, 15, (byte[]) null));
                        }
                    } else if (emsVarP.a().a(defpackage.emq.c)) {
                        dhaVar.b.e(new defpackage.cja(-1723985096, true, new defpackage.aonn() { // from class: dgy
                            @Override // defpackage.aonn
                            public final java.lang.Object a(java.lang.Object obj7, java.lang.Object obj8) {
                                defpackage.cav cavVar = (defpackage.cav) obj7;
                                int iIntValue = ((java.lang.Integer) obj8).intValue();
                                int i = iIntValue & 3;
                                if (cavVar.H(i != 2, iIntValue & 1)) {
                                    defpackage.dha dhaVar2 = dhaVar;
                                    boolean zD = cavVar.D(dhaVar2);
                                    java.lang.Object objG = cavVar.g();
                                    if (zD || objG == defpackage.cau.a) {
                                        objG = new defpackage.dgz(dhaVar2, (defpackage.aoln) null, 1, (byte[]) null);
                                        cavVar.w(objG);
                                    }
                                    defpackage.deg degVar = dhaVar2.a;
                                    defpackage.cbp.g(degVar, (defpackage.aonn) objG, cavVar);
                                    boolean zD2 = cavVar.D(dhaVar2);
                                    java.lang.Object objG2 = cavVar.g();
                                    if (zD2 || objG2 == defpackage.cau.a) {
                                        objG2 = new defpackage.dgz(dhaVar2, (defpackage.aoln) null, 0);
                                        cavVar.w(objG2);
                                    }
                                    defpackage.aonn aonnVar = r6;
                                    defpackage.dfl dflVar2 = dflVar;
                                    defpackage.cbp.g(degVar, (defpackage.aonn) objG2, cavVar);
                                    dflVar2.e(degVar, aonnVar, cavVar, 520);
                                } else {
                                    cavVar.s();
                                }
                                return defpackage.aojh.a;
                            }
                        }));
                    }
                }
                return defpackage.aojh.a;
            case 9:
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = ((defpackage.enr) obj7).a;
                defpackage.dnm dnmVar = (defpackage.dnm) obj;
                java.lang.Object obj9 = this.b;
                synchronized (obj8) {
                    if (dnmVar.b()) {
                    }
                }
                return defpackage.aojh.a;
            case 10:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (entry == null) {
                    defpackage.aooh.i("<destruct>");
                }
                defpackage.emw emwVar = (defpackage.emw) entry.getKey();
                defpackage.ajxw ajxwVar = (defpackage.ajxw) entry.getValue();
                while (true) {
                    java.lang.Object obj10 = this.a;
                    defpackage.emy emyVar = (defpackage.emy) obj10;
                    if (((defpackage.emq) ajxwVar.c).compareTo(emyVar.d) >= 0 || emyVar.b || !emyVar.e.f(emwVar)) {
                        return defpackage.aojh.a;
                    }
                    java.util.List list = emyVar.c;
                    list.add(ajxwVar.c);
                    defpackage.emo emoVar = defpackage.emp.Companion;
                    defpackage.emp empVarB = defpackage.emo.b((defpackage.emq) ajxwVar.c);
                    if (empVarB == null) {
                        java.lang.Object obj11 = ajxwVar.c;
                        java.util.Objects.toString(obj11);
                        throw new java.lang.IllegalStateException("no event up from ".concat(java.lang.String.valueOf(obj11)));
                    }
                    ajxwVar.e(this.b, empVarB);
                    defpackage.ajsz.bx(list);
                }
                break;
            case 11:
                java.lang.Object obj12 = this.a;
                return defpackage.ils.e((java.lang.String) this.b, (java.lang.String) obj12, (defpackage.gjh) obj);
            case 12:
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                if (gjhVar == null) {
                    defpackage.aooh.i("_connection");
                }
                ((defpackage.gwu) this.a).a.e(gjhVar, this.b);
                return defpackage.aojh.a;
            case 13:
                defpackage.gjh gjhVar2 = (defpackage.gjh) obj;
                java.lang.Object obj13 = this.a;
                if (gjhVar2 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar2.a((java.lang.String) this.b);
                try {
                    ginVarA.j(1, (java.lang.String) obj13);
                    if (ginVarA.m() && !ginVarA.l(0)) {
                        lValueOf = java.lang.Long.valueOf(ginVarA.c(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    ginVarA.close();
                }
            case 14:
                defpackage.gjh gjhVar3 = (defpackage.gjh) obj;
                defpackage.aooh.f(gjhVar3, "_connection");
                ((defpackage.gxc) this.a).b.e(gjhVar3, this.b);
                return defpackage.aojh.a;
            case 15:
                java.lang.Object obj14 = this.a;
                return defpackage.ils.f((java.lang.String) this.b, (java.lang.String) obj14, (defpackage.gjh) obj);
            case 16:
                defpackage.gjh gjhVar4 = (defpackage.gjh) obj;
                if (gjhVar4 == null) {
                    defpackage.aooh.i("_connection");
                }
                ((defpackage.gxg) this.a).a.e(gjhVar4, this.b);
                return defpackage.aojh.a;
            case 17:
                java.lang.Object obj15 = this.a;
                return defpackage.ils.f((java.lang.String) this.b, (java.lang.String) obj15, (defpackage.gjh) obj);
            case 18:
                java.lang.Object obj16 = this.a;
                return defpackage.ils.f((java.lang.String) this.b, (java.lang.String) obj16, (defpackage.gjh) obj);
            case 19:
                defpackage.gjh gjhVar5 = (defpackage.gjh) obj;
                java.lang.Object obj17 = this.a;
                if (gjhVar5 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA2 = gjhVar5.a((java.lang.String) this.b);
                try {
                    ginVarA2.j(1, (java.lang.String) obj17);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA2.m()) {
                        arrayList.add(new defpackage.gxj(ginVarA2.e(0), defpackage.gus.p((int) ginVarA2.c(1))));
                    }
                    ginVarA2.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA2.close();
                    throw th;
                }
            default:
                java.lang.Object obj18 = this.a;
                return defpackage.ils.e((java.lang.String) this.b, (java.lang.String) obj18, (defpackage.gjh) obj);
        }
    }

    public /* synthetic */ bet(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bet(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ bet(java.lang.String str, int i, byte[] bArr) {
        this.$cid = i;
        this.b = "SELECT long_value FROM Preference where `key`=?";
        this.a = str;
    }

    public /* synthetic */ bet(java.lang.String str, int i, char[] cArr) {
        this.$cid = i;
        this.b = "DELETE FROM SystemIdInfo where work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ bet(java.lang.String str, int i, float[] fArr) {
        this.$cid = i;
        this.b = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.a = str;
    }

    public /* synthetic */ bet(java.lang.String str, int i, int[] iArr) {
        this.$cid = i;
        this.b = "DELETE FROM workspec WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ bet(java.lang.String str, int i, short[] sArr) {
        this.$cid = i;
        this.b = "DELETE from WorkProgress where work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ bet(java.lang.String str, int i, boolean[] zArr) {
        this.$cid = i;
        this.b = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.a = str;
    }
}
