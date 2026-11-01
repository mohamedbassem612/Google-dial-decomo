package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tlu extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.tlw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlu(defpackage.tlw tlwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = tlwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        aolu aoluVar = aolu.a;
        if (this.e != 0) {
            java.lang.Object obj6 = this.d;
            java.lang.Object obj7 = this.c;
            java.lang.Object obj8 = this.b;
            obj2 = this.a;
            aooc.af(obj);
            obj5 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        } else {
            aooc.af(obj);
            defpackage.tlw tlwVar = this.f;
            akzx akzxVarM = aiym.a.m();
            aooh.f(akzxVarM, "builder");
            ajyi ajyiVar = new ajyi(akzxVarM);
            if (tlwVar.b) {
                akzx akzxVar = (akzx) ajyiVar.a;
                akzxVar.u();
                aiym aiymVar = akzxVar.b;
                aiymVar.b |= 1;
                aiymVar.c = true;
            }
            if (tlwVar.c) {
                akzx akzxVar2 = (akzx) ajyiVar.a;
                akzxVar2.u();
                aiym aiymVar2 = akzxVar2.b;
                aiymVar2.b |= 2;
                aiymVar2.d = true;
            }
            if (tlwVar.d) {
                akzx akzxVar3 = (akzx) ajyiVar.a;
                akzxVar3.u();
                aiym aiymVar3 = akzxVar3.b;
                aiymVar3.b |= 4;
                aiymVar3.e = true;
            }
            if (tlwVar.e) {
                akzx akzxVar4 = (akzx) ajyiVar.a;
                akzxVar4.u();
                aiym aiymVar4 = akzxVar4.b;
                aiymVar4.b |= 8;
                aiymVar4.f = true;
            }
            if (tlwVar.f) {
                akzx akzxVar5 = (akzx) ajyiVar.a;
                akzxVar5.u();
                aiym aiymVar5 = akzxVar5.b;
                aiymVar5.b |= 16;
                aiymVar5.g = true;
            }
            if (tlwVar.g) {
                akzx akzxVar6 = (akzx) ajyiVar.a;
                akzxVar6.u();
                aiym aiymVar6 = akzxVar6.b;
                aiymVar6.b |= 32;
                aiymVar6.h = true;
            }
            aogc aogcVar = tlwVar.j;
            this.a = tlwVar;
            this.b = ajyiVar;
            this.c = ajyiVar;
            this.d = ajyiVar;
            this.e = 1;
            java.lang.Object objAu = aogcVar.au(this);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            obj = objAu;
            obj2 = tlwVar;
            ajyi ajyiVar2 = ajyiVar;
            obj3 = ajyiVar2;
            obj5 = ajyiVar2;
            obj4 = ajyiVar;
        }
        defpackage.trt trtVarB = defpackage.trt.b(((tru) obj).c);
        if (trtVarB == null) {
            trtVarB = defpackage.trt.UNRECOGNIZED;
        }
        akzx akzxVar7 = (akzx) ((ajyi) obj5).a;
        akzxVar7.u();
        aiym aiymVar7 = akzxVar7.b;
        aiym aiymVar8 = aiym.a;
        aiymVar7.i = trtVarB.a();
        aiymVar7.b |= 64;
        java.lang.Integer num = ((defpackage.tlw) obj2).h;
        if (num != null) {
            int iIntValue = num.intValue();
            akzx akzxVar8 = (akzx) ((ajyi) obj3).a;
            akzxVar8.u();
            aiym aiymVar9 = akzxVar8.b;
            aiymVar9.b |= 128;
            aiymVar9.j = iIntValue;
        }
        aiym aiymVarP = ((akzx) ((ajyi) obj4).a).p();
        aooh.e(aiymVarP, "build(...)");
        return aiymVarP;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.tlu(this.f, aolnVar);
    }
}
