package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vvg extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.vtt c;
    final /* synthetic */ defpackage.vvk d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvg(defpackage.vtt vttVar, defpackage.vvk vvkVar, boolean z, aoln aolnVar) {
        super(2, aolnVar);
        this.c = vttVar;
        this.d = vvkVar;
        this.e = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:47:0x016d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0173  */
    /* JADX WARN: Code duplicated, block: B:50:0x0201  */
    /* JADX WARN: Code duplicated, block: B:52:0x028a  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        android.telecom.PhoneAccountHandle phoneAccountHandleAt;
        java.lang.Object obj2;
        defpackage.vvd vvdVar;
        defpackage.vvk vvkVar;
        int iOrdinal;
        defpackage.vtx vtxVarA;
        android.content.Context context;
        defpackage.vqf vqfVarAs;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.a;
                aooc.af(obj);
            } else if (i == 2) {
                obj2 = this.a;
                aooc.af(obj);
                vvdVar = (defpackage.vvd) obj;
                vvkVar = this.d;
                if (vvdVar == null) {
                    iOrdinal = vvdVar.ordinal();
                    if (iOrdinal == 0) {
                        vvkVar.g.o(rmx.oh);
                        defpackage.vqu vquVarAr = wsc.ar(defpackage.vtx.a.m());
                        android.content.Context context2 = vvkVar.b;
                        java.lang.String string = context2.getString(2132020891);
                        aooh.e(string, "getString(...)");
                        vquVarAr.f(string);
                        java.lang.String string2 = context2.getString(2132020894);
                        aooh.e(string2, "getString(...)");
                        vquVarAr.b(string2);
                        defpackage.vqf vqfVarAs2 = wsc.as(defpackage.vtw.a.m());
                        vqfVarAs2.c(10);
                        java.lang.String string3 = context2.getString(2132020927);
                        aooh.e(string3, "getString(...)");
                        vqfVarAs2.b(string3);
                        vquVarAr.d(vqfVarAs2.a());
                        defpackage.vqu vquVarAi = wsc.ai(vzi.a.m());
                        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj2;
                        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                        aooh.e(strFlattenToString, "flattenToString(...)");
                        vquVarAi.j(strFlattenToString);
                        java.lang.String id = phoneAccountHandle.getId();
                        aooh.e(id, "getId(...)");
                        vquVarAi.k(id);
                        vquVarAr.g(vquVarAi.i());
                        vtxVarA = vquVarAr.a();
                    } else if (iOrdinal == 1) {
                        vvkVar.g.o(rmx.oj);
                        defpackage.vqu vquVarAr2 = wsc.ar(defpackage.vtx.a.m());
                        android.content.Context context3 = vvkVar.b;
                        java.lang.String string4 = context3.getString(2132020928);
                        aooh.e(string4, "getString(...)");
                        vquVarAr2.b(string4);
                        vquVarAr2.h();
                        java.lang.String string5 = context3.getString(2132020966);
                        aooh.e(string5, "getString(...)");
                        vquVarAr2.c(string5);
                        defpackage.vtw vtwVar = defpackage.vtw.a;
                        defpackage.vqf vqfVarAs3 = wsc.as(vtwVar.m());
                        vqfVarAs3.c(12);
                        vquVarAr2.d(vqfVarAs3.a());
                        defpackage.vqf vqfVarAs4 = wsc.as(vtwVar.m());
                        vqfVarAs4.c(4);
                        java.lang.String string6 = context3.getString(2132020860);
                        aooh.e(string6, "getString(...)");
                        vqfVarAs4.b(string6);
                        vquVarAr2.e(vqfVarAs4.a());
                        defpackage.vqu vquVarAi2 = wsc.ai(vzi.a.m());
                        android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj2;
                        java.lang.String strFlattenToString2 = phoneAccountHandle2.getComponentName().flattenToString();
                        aooh.e(strFlattenToString2, "flattenToString(...)");
                        vquVarAi2.j(strFlattenToString2);
                        java.lang.String id2 = phoneAccountHandle2.getId();
                        aooh.e(id2, "getId(...)");
                        vquVarAi2.k(id2);
                        vquVarAr2.g(vquVarAi2.i());
                        vtxVarA = vquVarAr2.a();
                    } else {
                        if (iOrdinal != 2) {
                            throw new aois();
                        }
                        vvkVar.g.o(rmx.oo);
                        defpackage.vqu vquVarAr3 = wsc.ar(defpackage.vtx.a.m());
                        context = vvkVar.b;
                        java.lang.String string7 = context.getString(2132020919);
                        aooh.e(string7, "getString(...)");
                        vquVarAr3.f(string7);
                        java.lang.String string8 = context.getString(2132020918);
                        aooh.e(string8, "getString(...)");
                        vquVarAr3.b(string8);
                        defpackage.vtw vtwVar2 = defpackage.vtw.a;
                        defpackage.vqf vqfVarAs5 = wsc.as(vtwVar2.m());
                        vqfVarAs5.c(4);
                        java.lang.String string9 = context.getString(2132020860);
                        aooh.e(string9, "getString(...)");
                        vqfVarAs5.b(string9);
                        vquVarAr3.d(vqfVarAs5.a());
                        vqfVarAs = wsc.as(vtwVar2.m());
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            vqfVarAs.c(13);
                            java.lang.String string10 = context.getString(2132020844);
                            aooh.e(string10, "getString(...)");
                            vqfVarAs.b(string10);
                        } else {
                            vqfVarAs.c(12);
                            java.lang.String string11 = context.getString(2132020966);
                            aooh.e(string11, "getString(...)");
                            vqfVarAs.b(string11);
                        }
                        vquVarAr3.e(vqfVarAs.a());
                        defpackage.vqu vquVarAi3 = wsc.ai(vzi.a.m());
                        android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) obj2;
                        java.lang.String strFlattenToString3 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString3, "flattenToString(...)");
                        vquVarAi3.j(strFlattenToString3);
                        java.lang.String id3 = phoneAccountHandle3.getId();
                        aooh.e(id3, "getId(...)");
                        vquVarAi3.k(id3);
                        vquVarAr3.g(vquVarAi3.i());
                        vtxVarA = vquVarAr3.a();
                    }
                    j$.util.Optional optionalOf = j$.util.Optional.of(vtxVarA);
                    aooh.e(optionalOf, "of(...)");
                    return optionalOf;
                }
                boolean z = this.e;
                this.a = null;
                this.b = 4;
                obj = vvkVar.b((android.telecom.PhoneAccountHandle) obj2, z, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            } else if (i != 3) {
                aooc.af(obj);
            } else {
                obj2 = this.a;
                aooc.af(obj);
                vvdVar = (defpackage.vvd) obj;
                vvkVar = this.d;
                if (vvdVar == null) {
                    iOrdinal = vvdVar.ordinal();
                    if (iOrdinal == 0) {
                        vvkVar.g.o(rmx.oh);
                        defpackage.vqu vquVarAr4 = wsc.ar(defpackage.vtx.a.m());
                        android.content.Context context4 = vvkVar.b;
                        java.lang.String string12 = context4.getString(2132020891);
                        aooh.e(string12, "getString(...)");
                        vquVarAr4.f(string12);
                        java.lang.String string13 = context4.getString(2132020894);
                        aooh.e(string13, "getString(...)");
                        vquVarAr4.b(string13);
                        defpackage.vqf vqfVarAs6 = wsc.as(defpackage.vtw.a.m());
                        vqfVarAs6.c(10);
                        java.lang.String string14 = context4.getString(2132020927);
                        aooh.e(string14, "getString(...)");
                        vqfVarAs6.b(string14);
                        vquVarAr4.d(vqfVarAs6.a());
                        defpackage.vqu vquVarAi4 = wsc.ai(vzi.a.m());
                        android.telecom.PhoneAccountHandle phoneAccountHandle4 = (android.telecom.PhoneAccountHandle) obj2;
                        java.lang.String strFlattenToString4 = phoneAccountHandle4.getComponentName().flattenToString();
                        aooh.e(strFlattenToString4, "flattenToString(...)");
                        vquVarAi4.j(strFlattenToString4);
                        java.lang.String id4 = phoneAccountHandle4.getId();
                        aooh.e(id4, "getId(...)");
                        vquVarAi4.k(id4);
                        vquVarAr4.g(vquVarAi4.i());
                        vtxVarA = vquVarAr4.a();
                    } else if (iOrdinal == 1) {
                        vvkVar.g.o(rmx.oj);
                        defpackage.vqu vquVarAr5 = wsc.ar(defpackage.vtx.a.m());
                        android.content.Context context5 = vvkVar.b;
                        java.lang.String string15 = context5.getString(2132020928);
                        aooh.e(string15, "getString(...)");
                        vquVarAr5.b(string15);
                        vquVarAr5.h();
                        java.lang.String string16 = context5.getString(2132020966);
                        aooh.e(string16, "getString(...)");
                        vquVarAr5.c(string16);
                        defpackage.vtw vtwVar3 = defpackage.vtw.a;
                        defpackage.vqf vqfVarAs7 = wsc.as(vtwVar3.m());
                        vqfVarAs7.c(12);
                        vquVarAr5.d(vqfVarAs7.a());
                        defpackage.vqf vqfVarAs8 = wsc.as(vtwVar3.m());
                        vqfVarAs8.c(4);
                        java.lang.String string17 = context5.getString(2132020860);
                        aooh.e(string17, "getString(...)");
                        vqfVarAs8.b(string17);
                        vquVarAr5.e(vqfVarAs8.a());
                        defpackage.vqu vquVarAi5 = wsc.ai(vzi.a.m());
                        android.telecom.PhoneAccountHandle phoneAccountHandle5 = (android.telecom.PhoneAccountHandle) obj2;
                        java.lang.String strFlattenToString5 = phoneAccountHandle5.getComponentName().flattenToString();
                        aooh.e(strFlattenToString5, "flattenToString(...)");
                        vquVarAi5.j(strFlattenToString5);
                        java.lang.String id5 = phoneAccountHandle5.getId();
                        aooh.e(id5, "getId(...)");
                        vquVarAi5.k(id5);
                        vquVarAr5.g(vquVarAi5.i());
                        vtxVarA = vquVarAr5.a();
                    } else {
                        if (iOrdinal != 2) {
                            throw new aois();
                        }
                        vvkVar.g.o(rmx.oo);
                        defpackage.vqu vquVarAr6 = wsc.ar(defpackage.vtx.a.m());
                        context = vvkVar.b;
                        java.lang.String string18 = context.getString(2132020919);
                        aooh.e(string18, "getString(...)");
                        vquVarAr6.f(string18);
                        java.lang.String string19 = context.getString(2132020918);
                        aooh.e(string19, "getString(...)");
                        vquVarAr6.b(string19);
                        defpackage.vtw vtwVar4 = defpackage.vtw.a;
                        defpackage.vqf vqfVarAs9 = wsc.as(vtwVar4.m());
                        vqfVarAs9.c(4);
                        java.lang.String string20 = context.getString(2132020860);
                        aooh.e(string20, "getString(...)");
                        vqfVarAs9.b(string20);
                        vquVarAr6.d(vqfVarAs9.a());
                        vqfVarAs = wsc.as(vtwVar4.m());
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            vqfVarAs.c(13);
                            java.lang.String string110 = context.getString(2132020844);
                            aooh.e(string110, "getString(...)");
                            vqfVarAs.b(string110);
                        } else {
                            vqfVarAs.c(12);
                            java.lang.String string111 = context.getString(2132020966);
                            aooh.e(string111, "getString(...)");
                            vqfVarAs.b(string111);
                        }
                        vquVarAr6.e(vqfVarAs.a());
                        defpackage.vqu vquVarAi6 = wsc.ai(vzi.a.m());
                        android.telecom.PhoneAccountHandle phoneAccountHandle6 = (android.telecom.PhoneAccountHandle) obj2;
                        java.lang.String strFlattenToString6 = phoneAccountHandle6.getComponentName().flattenToString();
                        aooh.e(strFlattenToString6, "flattenToString(...)");
                        vquVarAi6.j(strFlattenToString6);
                        java.lang.String id6 = phoneAccountHandle6.getId();
                        aooh.e(id6, "getId(...)");
                        vquVarAi6.k(id6);
                        vquVarAr6.g(vquVarAi6.i());
                        vtxVarA = vquVarAr6.a();
                    }
                    j$.util.Optional optionalOf2 = j$.util.Optional.of(vtxVarA);
                    aooh.e(optionalOf2, "of(...)");
                    return optionalOf2;
                }
                boolean z2 = this.e;
                this.a = null;
                this.b = 4;
                obj = vvkVar.b((android.telecom.PhoneAccountHandle) obj2, z2, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            }
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(obj);
            aooh.e(optionalOfNullable, "ofNullable(...)");
            return optionalOfNullable;
        }
        aooc.af(obj);
        defpackage.vtt vttVar = this.c;
        if ((vttVar.b & 2) != 0) {
            defpackage.vtq vtqVar = vttVar.d;
            if (vtqVar == null) {
                vtqVar = defpackage.vtq.a;
            }
            phoneAccountHandleAt = wsc.at(vtqVar);
        } else {
            phoneAccountHandleAt = null;
        }
        if (phoneAccountHandleAt == null) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        ajcq ajcqVarL = this.d.i.l(phoneAccountHandleAt);
        this.a = phoneAccountHandleAt;
        this.b = 1;
        java.lang.Object objD = aosv.D(ajcqVarL, this);
        if (objD == aoluVar) {
            return aoluVar;
        }
        obj2 = phoneAccountHandleAt;
        obj = objD;
        aooh.e(obj, "await(...)");
        vcg vcgVar = (vcg) aooh.q((j$.util.Optional) obj);
        defpackage.vvk vvkVar2 = this.d;
        if (vcgVar != null) {
            this.a = obj2;
            this.b = 2;
            obj = vvkVar2.c(vcgVar, (android.telecom.PhoneAccountHandle) obj2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            vvdVar = (defpackage.vvd) obj;
        } else if (((java.lang.Boolean) vvkVar2.h.a()).booleanValue()) {
            this.a = obj2;
            this.b = 3;
            obj = vvkVar2.d((android.telecom.PhoneAccountHandle) obj2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            vvdVar = (defpackage.vvd) obj;
        } else {
            vvdVar = null;
        }
        vvkVar = this.d;
        if (vvdVar == null) {
            boolean z3 = this.e;
            this.a = null;
            this.b = 4;
            obj = vvkVar.b((android.telecom.PhoneAccountHandle) obj2, z3, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(obj);
            aooh.e(optionalOfNullable2, "ofNullable(...)");
            return optionalOfNullable2;
        }
        iOrdinal = vvdVar.ordinal();
        if (iOrdinal == 0) {
            vvkVar.g.o(rmx.oh);
            defpackage.vqu vquVarAr7 = wsc.ar(defpackage.vtx.a.m());
            android.content.Context context6 = vvkVar.b;
            java.lang.String string112 = context6.getString(2132020891);
            aooh.e(string112, "getString(...)");
            vquVarAr7.f(string112);
            java.lang.String string113 = context6.getString(2132020894);
            aooh.e(string113, "getString(...)");
            vquVarAr7.b(string113);
            defpackage.vqf vqfVarAs10 = wsc.as(defpackage.vtw.a.m());
            vqfVarAs10.c(10);
            java.lang.String string114 = context6.getString(2132020927);
            aooh.e(string114, "getString(...)");
            vqfVarAs10.b(string114);
            vquVarAr7.d(vqfVarAs10.a());
            defpackage.vqu vquVarAi7 = wsc.ai(vzi.a.m());
            android.telecom.PhoneAccountHandle phoneAccountHandle7 = (android.telecom.PhoneAccountHandle) obj2;
            java.lang.String strFlattenToString7 = phoneAccountHandle7.getComponentName().flattenToString();
            aooh.e(strFlattenToString7, "flattenToString(...)");
            vquVarAi7.j(strFlattenToString7);
            java.lang.String id7 = phoneAccountHandle7.getId();
            aooh.e(id7, "getId(...)");
            vquVarAi7.k(id7);
            vquVarAr7.g(vquVarAi7.i());
            vtxVarA = vquVarAr7.a();
        } else if (iOrdinal == 1) {
            vvkVar.g.o(rmx.oj);
            defpackage.vqu vquVarAr8 = wsc.ar(defpackage.vtx.a.m());
            android.content.Context context7 = vvkVar.b;
            java.lang.String string115 = context7.getString(2132020928);
            aooh.e(string115, "getString(...)");
            vquVarAr8.b(string115);
            vquVarAr8.h();
            java.lang.String string116 = context7.getString(2132020966);
            aooh.e(string116, "getString(...)");
            vquVarAr8.c(string116);
            defpackage.vtw vtwVar5 = defpackage.vtw.a;
            defpackage.vqf vqfVarAs11 = wsc.as(vtwVar5.m());
            vqfVarAs11.c(12);
            vquVarAr8.d(vqfVarAs11.a());
            defpackage.vqf vqfVarAs12 = wsc.as(vtwVar5.m());
            vqfVarAs12.c(4);
            java.lang.String string117 = context7.getString(2132020860);
            aooh.e(string117, "getString(...)");
            vqfVarAs12.b(string117);
            vquVarAr8.e(vqfVarAs12.a());
            defpackage.vqu vquVarAi8 = wsc.ai(vzi.a.m());
            android.telecom.PhoneAccountHandle phoneAccountHandle8 = (android.telecom.PhoneAccountHandle) obj2;
            java.lang.String strFlattenToString8 = phoneAccountHandle8.getComponentName().flattenToString();
            aooh.e(strFlattenToString8, "flattenToString(...)");
            vquVarAi8.j(strFlattenToString8);
            java.lang.String id8 = phoneAccountHandle8.getId();
            aooh.e(id8, "getId(...)");
            vquVarAi8.k(id8);
            vquVarAr8.g(vquVarAi8.i());
            vtxVarA = vquVarAr8.a();
        } else {
            if (iOrdinal != 2) {
                throw new aois();
            }
            vvkVar.g.o(rmx.oo);
            defpackage.vqu vquVarAr9 = wsc.ar(defpackage.vtx.a.m());
            context = vvkVar.b;
            java.lang.String string118 = context.getString(2132020919);
            aooh.e(string118, "getString(...)");
            vquVarAr9.f(string118);
            java.lang.String string119 = context.getString(2132020918);
            aooh.e(string119, "getString(...)");
            vquVarAr9.b(string119);
            defpackage.vtw vtwVar6 = defpackage.vtw.a;
            defpackage.vqf vqfVarAs13 = wsc.as(vtwVar6.m());
            vqfVarAs13.c(4);
            java.lang.String string21 = context.getString(2132020860);
            aooh.e(string21, "getString(...)");
            vqfVarAs13.b(string21);
            vquVarAr9.d(vqfVarAs13.a());
            vqfVarAs = wsc.as(vtwVar6.m());
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                vqfVarAs.c(13);
                java.lang.String string1110 = context.getString(2132020844);
                aooh.e(string1110, "getString(...)");
                vqfVarAs.b(string1110);
            } else {
                vqfVarAs.c(12);
                java.lang.String string1111 = context.getString(2132020966);
                aooh.e(string1111, "getString(...)");
                vqfVarAs.b(string1111);
            }
            vquVarAr9.e(vqfVarAs.a());
            defpackage.vqu vquVarAi9 = wsc.ai(vzi.a.m());
            android.telecom.PhoneAccountHandle phoneAccountHandle9 = (android.telecom.PhoneAccountHandle) obj2;
            java.lang.String strFlattenToString9 = phoneAccountHandle9.getComponentName().flattenToString();
            aooh.e(strFlattenToString9, "flattenToString(...)");
            vquVarAi9.j(strFlattenToString9);
            java.lang.String id9 = phoneAccountHandle9.getId();
            aooh.e(id9, "getId(...)");
            vquVarAi9.k(id9);
            vquVarAr9.g(vquVarAi9.i());
            vtxVarA = vquVarAr9.a();
        }
        j$.util.Optional optionalOf3 = j$.util.Optional.of(vtxVarA);
        aooh.e(optionalOf3, "of(...)");
        return optionalOf3;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.vvg(this.c, this.d, this.e, aolnVar);
    }
}
