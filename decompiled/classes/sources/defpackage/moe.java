package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class moe implements defpackage.kel {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public moe(android.content.Context context, defpackage.rsr rsrVar, int i) {
        this.$cid = i;
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.b = rsrVar;
        this.a = defpackage.ken.EXPRESSO;
        defpackage.odu oduVar = defpackage.odu.a;
        defpackage.albn albnVarM = defpackage.alad.M(defpackage.odu.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        this.c = new defpackage.ker(albnVarM);
    }

    @Override // defpackage.kes
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        return (i == 0 || i != 1) ? this.a : this.c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aolu] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aolu] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v6, types: [aolu] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v8, types: [aolu] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v13, types: [aolr, java.lang.Object] */
    @Override // defpackage.kes
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        mod modVar;
        ?? arrayList;
        ?? r10;
        jqs jqsVar;
        ?? r11;
        jqp jqpVarH;
        odt odtVar;
        ?? r12;
        tkm tkmVar;
        ?? r13;
        int i = this.$cid;
        if (i == 0) {
            if (aolnVar instanceof mod) {
                modVar = (mod) aolnVar;
                int i2 = modVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    modVar.d = i2 - Integer.MIN_VALUE;
                } else {
                    modVar = new mod(this, aolnVar);
                }
            } else {
                modVar = new mod(this, aolnVar);
            }
            java.lang.Object objAQ = modVar.b;
            arrayList = defpackage.aolu.a;
            int i3 = modVar.d;
            if (i3 == 0) {
                defpackage.aooc.af(objAQ);
                java.lang.Object obj = this.b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new java.lang.Long(((kdy) it.next()).b));
                }
                modVar.a = list;
                modVar.d = 1;
                objAQ = ((defpackage.aogc) obj).aQ(arrayList2, modVar);
                r10 = list;
                if (objAQ != arrayList) {
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = modVar.a;
                defpackage.aooc.af(objAQ);
                r10 = obj2;
            }
            defpackage.aigf aigfVar = (defpackage.aigf) objAQ;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r10, 10));
            java.util.Iterator it2 = r10.iterator();
            while (it2.hasNext()) {
                arrayList.add((defpackage.mmy) aigfVar.get(new java.lang.Long(((kdy) it2.next()).b)));
            }
        } else if (i == 1) {
            if (aolnVar instanceof jqs) {
                jqsVar = (jqs) aolnVar;
                int i4 = jqsVar.c;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    jqsVar.c = i4 - Integer.MIN_VALUE;
                } else {
                    jqsVar = new jqs(this, aolnVar);
                }
            } else {
                jqsVar = new jqs(this, aolnVar);
            }
            java.lang.Object objF = jqsVar.b;
            arrayList = defpackage.aolu.a;
            int i5 = jqsVar.c;
            if (i5 == 0) {
                defpackage.aooc.af(objF);
                java.lang.Object obj3 = this.a;
                jqsVar.a = list;
                jqsVar.c = 1;
                objF = ((defpackage.kgl) obj3).f(jqsVar);
                if (objF != arrayList) {
                }
            } else {
                if (i5 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj4 = jqsVar.a;
                defpackage.aooc.af(objF);
                r11 = obj4;
            }
            r11 = list;
            java.util.Map map = (java.util.Map) objF;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r11, 10));
            java.util.Iterator it3 = r11.iterator();
            while (it3.hasNext()) {
                ztf ztfVar = (ztf) map.get(new java.lang.Long(((kdy) it3.next()).b));
                if (ztfVar != null) {
                    ni niVarP = hhv.p(jqp.a.m());
                    niVarP.I(ztfVar);
                    jqpVarH = niVarP.H();
                } else {
                    jqpVarH = null;
                }
                arrayList.add(jqpVarH);
            }
        } else if (i != 2) {
            if (aolnVar instanceof tkm) {
                tkmVar = (tkm) aolnVar;
                int i6 = tkmVar.c;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    tkmVar.c = i6 - Integer.MIN_VALUE;
                } else {
                    tkmVar = new tkm(this, aolnVar);
                }
            } else {
                tkmVar = new tkm(this, aolnVar);
            }
            java.lang.Object objAj = tkmVar.b;
            arrayList = defpackage.aolu.a;
            int i7 = tkmVar.c;
            if (i7 == 0) {
                defpackage.aooc.af(objAj);
                java.lang.Object obj5 = this.b;
                tkmVar.a = list;
                tkmVar.c = 1;
                defpackage.tts ttsVar = (defpackage.tts) obj5;
                objAj = defpackage.aoov.aj(ttsVar.b, new tpd(ttsVar, (defpackage.aoln) null, 15), tkmVar);
                if (objAj != arrayList) {
                }
            } else {
                if (i7 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj6 = tkmVar.a;
                defpackage.aooc.af(objAj);
                r13 = obj6;
            }
            r13 = list;
            java.util.Map map2 = (java.util.Map) objAj;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r13, 10));
            java.util.Iterator it4 = r13.iterator();
            while (it4.hasNext()) {
                ttk ttkVar = (ttk) map2.get(j$.time.Instant.ofEpochMilli(((kdy) it4.next()).b));
                arrayList.add(ttkVar != null ? defpackage.ttj.a(ttkVar) : null);
            }
        } else {
            if (aolnVar instanceof odt) {
                odtVar = (odt) aolnVar;
                int i8 = odtVar.c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    odtVar.c = i8 - Integer.MIN_VALUE;
                } else {
                    odtVar = new odt(this, aolnVar);
                }
            } else {
                odtVar = new odt(this, aolnVar);
            }
            java.lang.Object objAj2 = odtVar.b;
            arrayList = defpackage.aolu.a;
            int i9 = odtVar.c;
            if (i9 == 0) {
                defpackage.aooc.af(objAj2);
                java.lang.Object obj7 = this.b;
                odtVar.a = list;
                odtVar.c = 1;
                defpackage.rsr rsrVar = (defpackage.rsr) obj7;
                objAj2 = defpackage.aoov.aj(rsrVar.a, new defpackage.nto(rsrVar, (defpackage.aoln) null, 15), odtVar);
                if (objAj2 != arrayList) {
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj8 = odtVar.a;
                defpackage.aooc.af(objAj2);
                r12 = obj8;
            }
            r12 = list;
            java.util.Map map3 = (java.util.Map) objAj2;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r12, 10));
            java.util.Iterator it5 = r12.iterator();
            while (it5.hasNext()) {
                arrayList.add((defpackage.odu) map3.get(new java.lang.Long(((kdy) it5.next()).b)));
            }
        }
        r11 = list;
        r12 = list;
        r13 = list;
        return arrayList;
    }

    @Override // defpackage.kel
    public final /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.mmy mmyVar = (defpackage.mmy) obj;
            defpackage.aooh.f(mmyVar, "data1");
            if (mmyVar.j) {
                return false;
            }
        } else {
            if (i != 1) {
                return i != 2 ? hgt.x(obj) : hgt.x(obj);
            }
            jqp jqpVar = (jqp) obj;
            defpackage.aooh.f(jqpVar, "data1");
            ztf ztfVarB = ztf.b(jqpVar.c);
            if (ztfVarB == null) {
                ztfVarB = ztf.d;
            }
            if (ztfVarB == ztf.b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.kes
    public final defpackage.ker d() {
        int i = this.$cid;
        java.lang.Object obj = (i == 0 || i != 1) ? this.c : this.b;
        return (defpackage.ker) obj;
    }

    public moe(defpackage.aogc aogcVar, int i) {
        this.$cid = i;
        this.b = aogcVar;
        this.a = defpackage.ken.DOBBY;
        defpackage.mmy mmyVar = defpackage.mmy.a;
        defpackage.albn albnVarM = defpackage.alad.M(defpackage.mmy.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        this.c = new defpackage.ker(albnVarM);
    }

    public moe(defpackage.kgl kglVar, int i) {
        this.$cid = i;
        defpackage.aooh.f(kglVar, "stirShakenStorage");
        this.a = kglVar;
        this.c = defpackage.ken.STIR_SHAKEN;
        jqp jqpVar = jqp.a;
        defpackage.albn albnVarM = defpackage.alad.M(jqp.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        this.b = new defpackage.ker(albnVarM);
    }

    public moe(defpackage.tts ttsVar, int i) {
        this.$cid = i;
        this.b = ttsVar;
        this.a = defpackage.ken.SHARPIE;
        defpackage.tkj tkjVar = defpackage.tkj.a;
        defpackage.albn albnVarM = defpackage.alad.M(defpackage.tkj.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        this.c = new defpackage.ker(albnVarM);
    }
}
