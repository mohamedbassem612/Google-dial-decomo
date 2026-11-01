package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqe implements defpackage.sqn {
    public final android.content.Context a;
    public final defpackage.ajct b;
    public final defpackage.rsr c;
    public final defpackage.ahbv d;

    public sqe(android.content.Context context, defpackage.ajct ajctVar, defpackage.ahbv ahbvVar, defpackage.rsr rsrVar) {
        this.a = context;
        this.b = ajctVar;
        this.d = ahbvVar;
        this.c = rsrVar;
    }

    public static spb i(rxc rxcVar) {
        defpackage.akzx akzxVarM = spb.a.m();
        java.lang.String str = rxcVar.a;
        if (!android.text.TextUtils.isEmpty(str)) {
            akzxVarM.u();
            spb spbVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            spbVar.b |= 1;
            spbVar.c = str;
        }
        java.lang.String str2 = rxcVar.b;
        if (!android.text.TextUtils.isEmpty(str2)) {
            akzxVarM.u();
            spb spbVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            spbVar2.b |= 2;
            spbVar2.d = str2;
        }
        java.lang.String str3 = rxcVar.c;
        if (!android.text.TextUtils.isEmpty(str3)) {
            akzxVarM.u();
            spb spbVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            spbVar3.b |= 4;
            spbVar3.e = str3;
        }
        return akzxVarM.r();
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        return defpackage.anar.w(aigfVar);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        return defpackage.ahvr.I(rxe.b(this.a), new phd(this, hkdVar, 11, (byte[]) null), this.b);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return defpackage.ahvr.I(rxe.b(context), new jsc(this, context, details, ajcqVar, 5), this.b);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spb spbVar = spnVar.j;
        return spbVar == null ? spb.a : spbVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "CequintPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spb spbVar = (spb) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(spbVar);
        spnVar.j = spbVar;
        spnVar.b |= 128;
    }
}
