package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ahxq implements defpackage.ahyc {
    private transient defpackage.ahxq a;

    protected /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        akia akiaVar = (akia) obj;
        defpackage.akzx akzxVarM = akvg.a.m();
        if ((akiaVar.b & 1) != 0) {
            defpackage.ahxq ahxqVarE = acam.a.e();
            akhy akhyVarB = akhy.b(akiaVar.c);
            if (akhyVarB == null) {
                akhyVarB = akhy.a;
            }
            akve akveVar = (akve) ahxqVarE.d(akhyVarB);
            akzxVarM.u();
            akvg akvgVar = akzxVarM.b;
            akvgVar.c = akveVar.d;
            akvgVar.b |= 1;
        }
        if ((akiaVar.b & 2) != 0) {
            defpackage.ahxq ahxqVarE2 = acam.b.e();
            akhz akhzVarB = akhz.b(akiaVar.d);
            if (akhzVarB == null) {
                akhzVarB = akhz.a;
            }
            akvf akvfVar = (akvf) ahxqVarE2.d(akhzVarB);
            akzxVarM.u();
            akvg akvgVar2 = akzxVarM.b;
            akvgVar2.d = akvfVar.d;
            akvgVar2.b |= 2;
        }
        return akzxVarM.r();
    }

    @Override // defpackage.ahyc
    @java.lang.Deprecated
    public final java.lang.Object apply(java.lang.Object obj) {
        return d(obj);
    }

    protected /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        akvg akvgVar = (akvg) obj;
        defpackage.akzx akzxVarM = akia.a.m();
        if ((akvgVar.b & 1) != 0) {
            defpackage.ahxq ahxqVar = acam.a;
            akve akveVarB = akve.b(akvgVar.c);
            if (akveVarB == null) {
                akveVarB = akve.a;
            }
            akhy akhyVar = (akhy) ahxqVar.d(akveVarB);
            akzxVarM.u();
            akia akiaVar = akzxVarM.b;
            akiaVar.c = akhyVar.d;
            akiaVar.b |= 1;
        }
        if ((akvgVar.b & 2) != 0) {
            defpackage.ahxq ahxqVar2 = acam.b;
            akvf akvfVarB = akvf.b(akvgVar.d);
            if (akvfVarB == null) {
                akvfVarB = akvf.a;
            }
            akhz akhzVar = (akhz) ahxqVar2.d(akvfVarB);
            akzxVarM.u();
            akia akiaVar2 = akzxVarM.b;
            akiaVar2.d = akhzVar.d;
            akiaVar2.b |= 2;
        }
        return akzxVarM.r();
    }

    public java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.lang.Object objA = a(obj);
        defpackage.ahvr.ci(objA);
        return objA;
    }

    public java.lang.Object d(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.lang.Object objB = b(obj);
        defpackage.ahvr.ci(objB);
        return objB;
    }

    public final defpackage.ahxq e() {
        defpackage.ahxq ahxqVar = this.a;
        if (ahxqVar != null) {
            return ahxqVar;
        }
        ahxp ahxpVar = new ahxp(this);
        this.a = ahxpVar;
        return ahxpVar;
    }
}
