package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class thi extends aomh implements aonr {
    java.lang.Object a;
    int b;
    /* synthetic */ java.lang.Object c;
    /* synthetic */ java.lang.Object d;
    /* synthetic */ java.lang.Object e;
    /* synthetic */ java.lang.Object f;
    /* synthetic */ boolean g;
    final /* synthetic */ defpackage.thj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thi(defpackage.thj thjVar, aoln aolnVar) {
        super(6, aolnVar);
        this.h = thjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        defpackage.tei teiVar = (defpackage.tei) obj;
        java.util.List list = (java.util.List) obj2;
        defpackage.tgx tgxVar = (defpackage.tgx) obj3;
        java.lang.String str = tgxVar != null ? tgxVar.a : null;
        boolean zBooleanValue = ((java.lang.Boolean) obj5).booleanValue();
        defpackage.thi thiVar = new defpackage.thi(this.h, (aoln) obj6);
        thiVar.c = teiVar;
        thiVar.d = list;
        thiVar.e = str;
        thiVar.f = (defpackage.tgy) obj4;
        thiVar.g = zBooleanValue;
        return thiVar.b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01c0  */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List list;
        java.lang.String str;
        java.lang.Object objA;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i;
        int i2;
        aolu aoluVar = aolu.a;
        int i3 = 10;
        if (this.b != 0) {
            obj3 = this.a;
            obj2 = (defpackage.tei) this.f;
            list = (java.util.List) this.e;
            str = (java.lang.String) this.d;
            java.lang.Object obj5 = this.c;
            aooc.af(obj);
            objA = obj;
            obj4 = obj5;
        } else {
            aooc.af(obj);
            obj2 = this.c;
            list = (java.util.List) this.d;
            str = (java.lang.String) this.e;
            defpackage.tgy tgyVar = (defpackage.tgy) this.f;
            if (!this.g) {
                return defpackage.tgz.a;
            }
            aooh.f(list, "<this>");
            if (tgyVar != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    defpackage.thb thbVar = (defpackage.thb) it.next();
                    java.util.List<defpackage.thc> list2 = thbVar.b;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list2, i3));
                    for (defpackage.thc thcVar : list2) {
                        java.util.List list3 = thcVar.b;
                        if (list3.isEmpty()) {
                            break;
                            break;
                        }
                        java.util.Iterator it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (aooh.n(((defpackage.tgy) it2.next()).a(), tgyVar.a())) {
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(list3, 10));
                                java.util.Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    defpackage.tgy tgyVar2 = (defpackage.tgy) it3.next();
                                    java.util.Iterator it4 = it3;
                                    if (true == aooh.n(tgyVar2.a(), tgyVar.a())) {
                                        tgyVar2 = tgyVar;
                                    }
                                    arrayList3.add(tgyVar2);
                                    it3 = it4;
                                }
                                thcVar = new defpackage.thc(thcVar.a, arrayList3);
                                break;
                            }
                        }
                        arrayList2.add(thcVar);
                        it = it;
                    }
                    java.util.Iterator it5 = it;
                    if (!aooh.n(arrayList2, list2)) {
                        thbVar = new defpackage.thb(thbVar.a, arrayList2);
                    }
                    arrayList.add(thbVar);
                    it = it5;
                    i3 = 10;
                }
                list = arrayList;
            }
            defpackage.thj thjVar = this.h;
            this.c = obj2;
            this.d = str;
            this.e = list;
            this.f = obj2;
            android.content.Context context = thjVar.b;
            this.a = context;
            this.b = 1;
            objA = thjVar.j.a(this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj3 = context;
            obj4 = obj2;
        }
        java.util.List<defpackage.thb> list4 = list;
        boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
        aooh.f(obj2, "<this>");
        aooh.f(obj3, "context");
        aokv aokvVar = new aokv(10);
        defpackage.tei teiVar = (defpackage.tei) obj2;
        java.lang.String str2 = teiVar.a;
        if (aoov.H(str2)) {
            i = 1;
        } else {
            i = 1;
            if (str2.length() != 1) {
                android.content.Context context2 = (android.content.Context) obj3;
                boolean zIsGlobalPhoneNumber = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(vwb.j(context2, str2));
                int i4 = teiVar.c;
                if (i4 != 1 || zIsGlobalPhoneNumber) {
                    if (i4 - 1 != 0) {
                        java.lang.String string = context2.getString(2132020049);
                        aooh.e(string, "getString(...)");
                        aokvVar.add(new defpackage.tgs(string));
                        java.lang.String string2 = context2.getString(2132020048);
                        aooh.e(string2, "getString(...)");
                        aokvVar.add(new defpackage.tgr(string2));
                        i = 1;
                    } else {
                        i = 1;
                        java.lang.CharSequence charSequenceAq = pez.aq(context2, context2.getString(2132020053, str2));
                        aooh.c(charSequenceAq);
                        aokvVar.add(new defpackage.tgu(zBooleanValue, charSequenceAq));
                    }
                    if (uyb.c(context2)) {
                        java.lang.String string3 = context2.getString(2132020052);
                        aooh.e(string3, "getString(...)");
                        aokvVar.add(new defpackage.tgt(zBooleanValue, string3));
                    }
                    java.lang.String string4 = context2.getString(2132020054);
                    aooh.e(string4, "getString(...)");
                    aokvVar.add(new defpackage.tgv(string4));
                } else {
                    i = 1;
                }
            }
        }
        aokv aokvVarAX = ajsz.aX(aokvVar);
        defpackage.thj thjVar2 = this.h;
        int i5 = 0;
        for (defpackage.thb thbVar2 : list4) {
            java.util.List<defpackage.thc> list5 = thbVar2.b;
            if (list5.isEmpty()) {
                i2 = 0;
            } else {
                java.lang.Object obj6 = thjVar2.h.get(thbVar2.a);
                if (obj6 == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                int i6 = ((defpackage.teu) obj6).d() != null ? i : 0;
                int size = 0;
                for (defpackage.thc thcVar2 : list5) {
                    size += (thcVar2.a != null ? i : 0) + thcVar2.b.size();
                }
                i2 = i6 + size;
            }
            i5 += i2;
        }
        return new defpackage.tha((defpackage.tei) obj4, str, list4, aokvVarAX, ((java.lang.Number) thjVar2.n.c()).longValue(), i5 + aokvVarAX.b);
    }
}
