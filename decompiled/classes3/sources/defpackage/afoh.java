package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afoh {
    private final aklt a;
    private final android.accounts.Account b;
    private java.lang.String c;
    private final boolean d;
    private java.lang.String e;
    private boolean f = true;
    private final defpackage.agpj g;

    public afoh(defpackage.agpj agpjVar, aklt akltVar, android.accounts.Account account, java.lang.String str, boolean z) {
        this.g = agpjVar;
        this.a = akltVar;
        this.b = account;
        this.c = str;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(boolean z, aoln aolnVar) {
        defpackage.afog afogVar;
        java.lang.String str;
        boolean z2;
        if (aolnVar instanceof defpackage.afog) {
            afogVar = (defpackage.afog) aolnVar;
            int i = afogVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afogVar.c = i - Integer.MIN_VALUE;
            } else {
                afogVar = new defpackage.afog(this, aolnVar);
            }
        } else {
            afogVar = new defpackage.afog(this, aolnVar);
        }
        java.lang.Object objE = afogVar.a;
        aolu aoluVar = aolu.a;
        int i2 = afogVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            if (!this.f) {
                throw new java.lang.IllegalStateException("No more photo pages.");
            }
            java.lang.String str2 = this.c;
            akzx akzxVarM = defpackage.akma.a.m();
            aooh.f(akzxVarM, "builder");
            aklt akltVar = this.a;
            akzxVarM.u();
            defpackage.akma akmaVar = (defpackage.akma) akzxVarM.b;
            j$.util.Objects.requireNonNull(akltVar);
            akmaVar.e = akltVar;
            akmaVar.b |= 1;
            akzx akzxVarM2 = defpackage.akmd.a.m();
            aooh.f(akzxVarM2, "builder");
            akzxVarM2.u();
            defpackage.akmd akmdVar = (defpackage.akmd) akzxVarM2.b;
            akmdVar.b |= 1;
            akmdVar.c = z;
            alad aladVarP = akzxVarM2.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.akmd akmdVar2 = (defpackage.akmd) aladVarP;
            aooh.f(akmdVar2, "value");
            akzxVarM.u();
            defpackage.akma akmaVar2 = (defpackage.akma) akzxVarM.b;
            j$.util.Objects.requireNonNull(akmdVar2);
            akmaVar2.g = akmdVar2;
            akmaVar2.b |= 4;
            java.lang.String str3 = this.e;
            if (str3 != null) {
                akzxVarM.u();
                defpackage.akma akmaVar3 = (defpackage.akma) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                akmaVar3.b |= 2;
                akmaVar3.f = str3;
            }
            if (str2 != null) {
                akzxVarM.u();
                defpackage.akma akmaVar4 = (defpackage.akma) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                akmaVar4.c = 3;
                akmaVar4.d = str2;
            } else if (this.d) {
                akzxVarM.u();
                defpackage.akma akmaVar5 = (defpackage.akma) akzxVarM.b;
                akmaVar5.c = 4;
                akmaVar5.d = java.lang.Boolean.TRUE;
            }
            alad aladVarP2 = akzxVarM.p();
            aooh.e(aladVarP2, "build(...)");
            java.lang.Object objA = this.g.a(this.b);
            afogVar.c = 1;
            objE = ((defpackage.zoe) objA).E(new defpackage.uke((defpackage.akma) aladVarP2, (aoln) null, 18), afogVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        defpackage.akme akmeVar = ((defpackage.akmb) objE).b;
        if (akmeVar == null) {
            akmeVar = defpackage.akme.a;
        }
        aooh.e(akmeVar, "getPhotoPage(...)");
        int i3 = akmeVar.b;
        if ((i3 & 1) != 0) {
            str = akmeVar.c;
            z2 = false;
        } else {
            str = null;
            z2 = true;
        }
        this.e = str;
        this.f = !z2;
        this.c = (i3 & 2) != 0 ? akmeVar.d : null;
        return objE;
    }
}
