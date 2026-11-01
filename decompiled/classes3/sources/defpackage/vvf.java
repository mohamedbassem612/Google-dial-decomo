package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vvf extends aomh implements aonn {
    java.lang.Object a;
    boolean b;
    boolean c;
    int d;
    final /* synthetic */ aify e;
    final /* synthetic */ defpackage.vvk f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvf(aify aifyVar, defpackage.vvk vvkVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = aifyVar;
        this.f = vvkVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x014f  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objAm;
        java.lang.Object objA;
        aosy aosyVar;
        java.lang.Object objA2;
        aosy aosyVar2;
        boolean z;
        boolean zBooleanValue;
        java.lang.Object objA3;
        boolean z2;
        defpackage.vvc vvcVar;
        aolu aoluVar = aolu.a;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                objAm = this.a;
                aosyVar = (aosy) this.g;
                aooc.af(obj);
                objA = obj;
            } else if (i != 2) {
                z2 = this.c;
                z = this.b;
                aooc.af(obj);
                objA3 = obj;
            } else {
                z = this.b;
                aosy aosyVar3 = (aosy) this.g;
                aooc.af(obj);
                objA2 = obj;
                aosyVar2 = aosyVar3;
                aooh.e(objA2, "await(...)");
                zBooleanValue = ((java.lang.Boolean) objA2).booleanValue();
                this.g = null;
                this.b = z;
                this.c = zBooleanValue;
                this.d = 3;
                objA3 = aosyVar2.a(this);
                if (objA3 != aoluVar) {
                    return aoluVar;
                }
                z2 = zBooleanValue;
            }
            aooh.e(objA3, "await(...)");
            vvcVar = new defpackage.vvc(z, z2, ((java.lang.Boolean) objA3).booleanValue());
            if (!vvcVar.a && vvcVar.b && vvcVar.c) {
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
                return optionalEmpty;
            }
            defpackage.vvk.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorDataServiceImpl", "getDeviceVoicemailErrorModel$<anonymous>", 163, "VoicemailErrorDataServiceImpl.kt").v("Missing permissions or somehow not the default dialer");
            defpackage.vvk vvkVar = this.f;
            vvkVar.g.o(rmx.ol);
            defpackage.vqu vquVarAr = wsc.ar(defpackage.vtx.a.m());
            android.content.Context context = vvkVar.b;
            java.lang.String string = context.getString(2132020891);
            aooh.e(string, "getString(...)");
            vquVarAr.f(string);
            java.lang.String string2 = context.getString(2132020965);
            aooh.e(string2, "getString(...)");
            vquVarAr.b(string2);
            defpackage.vqf vqfVarAs = wsc.as(defpackage.vtw.a.m());
            vqfVarAs.c(8);
            java.lang.String string3 = context.getString(2132020966);
            aooh.e(string3, "getString(...)");
            vqfVarAs.b(string3);
            vquVarAr.d(vqfVarAs.a());
            j$.util.Optional optionalOf = j$.util.Optional.of(vquVarAr.a());
            aooh.e(optionalOf, "of(...)");
            return optionalOf;
        }
        aooc.af(obj);
        aoss aossVar = (aoss) this.g;
        boolean zIsEmpty = this.e.isEmpty();
        defpackage.vvk vvkVar2 = this.f;
        if (zIsEmpty) {
            vvkVar2.g.o(rmx.om);
            defpackage.vqu vquVarAr2 = wsc.ar(defpackage.vtx.a.m());
            android.content.Context context2 = vvkVar2.b;
            java.lang.String string4 = context2.getString(2132020891);
            aooh.e(string4, "getString(...)");
            vquVarAr2.f(string4);
            java.lang.String string5 = context2.getString(2132020914);
            aooh.e(string5, "getString(...)");
            vquVarAr2.b(string5);
            vquVarAr2.h();
            java.lang.String string6 = context2.getString(2132020966);
            aooh.e(string6, "getString(...)");
            vquVarAr2.c(string6);
            defpackage.vtw vtwVar = defpackage.vtw.a;
            defpackage.vqf vqfVarAs2 = wsc.as(vtwVar.m());
            vqfVarAs2.c(6);
            java.lang.String string7 = context2.getString(2132020841);
            aooh.e(string7, "getString(...)");
            vqfVarAs2.b(string7);
            vquVarAr2.e(vqfVarAs2.a());
            defpackage.vqf vqfVarAs3 = wsc.as(vtwVar.m());
            vqfVarAs3.c(12);
            vquVarAr2.d(vqfVarAs3.a());
            defpackage.vqu vquVarAi = wsc.ai(vzi.a.m());
            akzx akzxVar = (akzx) vquVarAi.a;
            akzxVar.u();
            vzi vziVar = akzxVar.b;
            j$.util.Objects.requireNonNull("com.google.android.dialer");
            vziVar.b |= 1;
            vziVar.c = "com.google.android.dialer";
            vquVarAr2.g(vquVarAi.i());
            j$.util.Optional optionalOf2 = j$.util.Optional.of(vquVarAr2.a());
            aooh.e(optionalOf2, "of(...)");
            return optionalOf2;
        }
        aosy aosyVarAm = aoov.am(aossVar, 0, new ung(vvkVar2, (aoln) null, 10, (char[]) null), 3);
        aosy aosyVarAm2 = aoov.am(aossVar, 0, new ung(vvkVar2, (aoln) null, 8), 3);
        objAm = aoov.am(aossVar, 0, new ung(vvkVar2, (aoln) null, 9, (byte[]) null), 3);
        this.g = aosyVarAm2;
        this.a = objAm;
        this.d = 1;
        objA = aosyVarAm.a(this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aosyVar = aosyVarAm2;
        boolean zBooleanValue2 = ((java.lang.Boolean) objA).booleanValue();
        this.g = objAm;
        this.a = null;
        this.b = zBooleanValue2;
        this.d = 2;
        objA2 = aosyVar.a(this);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        aosyVar2 = objAm;
        z = zBooleanValue2;
        aooh.e(objA2, "await(...)");
        zBooleanValue = ((java.lang.Boolean) objA2).booleanValue();
        this.g = null;
        this.b = z;
        this.c = zBooleanValue;
        this.d = 3;
        objA3 = aosyVar2.a(this);
        if (objA3 != aoluVar) {
            return aoluVar;
        }
        z2 = zBooleanValue;
        aooh.e(objA3, "await(...)");
        vvcVar = new defpackage.vvc(z, z2, ((java.lang.Boolean) objA3).booleanValue());
        if (!vvcVar.a) {
        }
        defpackage.vvk.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailErrorDataServiceImpl", "getDeviceVoicemailErrorModel$<anonymous>", 163, "VoicemailErrorDataServiceImpl.kt").v("Missing permissions or somehow not the default dialer");
        defpackage.vvk vvkVar3 = this.f;
        vvkVar3.g.o(rmx.ol);
        defpackage.vqu vquVarAr3 = wsc.ar(defpackage.vtx.a.m());
        android.content.Context context3 = vvkVar3.b;
        java.lang.String string8 = context3.getString(2132020891);
        aooh.e(string8, "getString(...)");
        vquVarAr3.f(string8);
        java.lang.String string9 = context3.getString(2132020965);
        aooh.e(string9, "getString(...)");
        vquVarAr3.b(string9);
        defpackage.vqf vqfVarAs4 = wsc.as(defpackage.vtw.a.m());
        vqfVarAs4.c(8);
        java.lang.String string10 = context3.getString(2132020966);
        aooh.e(string10, "getString(...)");
        vqfVarAs4.b(string10);
        vquVarAr3.d(vqfVarAs4.a());
        j$.util.Optional optionalOf3 = j$.util.Optional.of(vquVarAr3.a());
        aooh.e(optionalOf3, "of(...)");
        return optionalOf3;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.vvf vvfVar = new defpackage.vvf(this.e, this.f, aolnVar);
        vvfVar.g = obj;
        return vvfVar;
    }
}
