package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abge implements aonn {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ abfs b;
    public final /* synthetic */ aomy c;
    public final /* synthetic */ java.util.List d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ aomy f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;

    public /* synthetic */ abge(boolean z, abfs abfsVar, aomy aomyVar, java.util.List list, boolean z2, aomy aomyVar2, java.lang.String str, long j, long j2, float f, float f2) {
        this.a = z;
        this.b = abfsVar;
        this.c = aomyVar;
        this.d = list;
        this.e = z2;
        this.f = aomyVar2;
        this.g = str;
        this.h = j;
        this.i = j2;
        this.j = f;
        this.k = f2;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        aws awsVar;
        cmw cmwVarBd;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
            aomy aomyVar = this.c;
            abfs abfsVar = this.b;
            boolean z = this.a;
            cmt cmtVar = cmw.c;
            cmw cmwVarC = azm.c(cmtVar, 1.0f);
            boolean zD = cavVar.D(abfsVar) | cavVar.C(z) | cavVar.B(aomyVar);
            java.lang.Object objG = cavVar.g();
            if (zD || objG == cau.a) {
                objG = new ozh(abfsVar, z, aomyVar, 4);
                cavVar.w(objG);
            }
            cmw cmwVarK = cfd.K(cmwVarC, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, new defpackage.abhc(z, (aomy) objG), true, 0, 1042431);
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cavVar.a());
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarK);
            aomy aomyVar2 = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar2);
            } else {
                cavVar.x();
            }
            java.util.List list = this.d;
            cev.c(cavVar, cyeVarB, dam.e);
            cev.c(cavVar, cjeVarM, dam.d);
            cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVar, dam.g);
            cev.c(cavVar, cmwVarM, dam.c);
            aws awsVar2 = awt.a;
            boolean zB = cavVar.B(list);
            java.lang.Object objG2 = cavVar.g();
            if (zB || objG2 == cau.a) {
                i = 4;
                awsVar = awsVar2;
                defpackage.abgh abghVar = new defpackage.abgh(this.h, list, this.j, z, this.i);
                cavVar.w(abghVar);
                objG2 = abghVar;
            } else {
                awsVar = awsVar2;
                i = 4;
            }
            cqd cqdVar = (cqd) objG2;
            cmw cmwVarA = awsVar.a(cmtVar, z ? defpackage.cmg.c : defpackage.cmg.d);
            boolean zD2 = cavVar.D(abfsVar) | cavVar.C(z) | cavVar.B(aomyVar);
            java.lang.Object objG3 = cavVar.g();
            if (zD2 || objG3 == cau.a) {
                objG3 = new defpackage.bfv(z, aomyVar, 2);
                cavVar.w(objG3);
            }
            boolean z2 = this.e;
            cmw cmwVarAN = aehj.aN(cmwVarA, (aomy) objG3);
            if (z2) {
                cmwVarAN = cmwVarAN.a(azm.l(cmtVar, Float.NaN, this.k));
            }
            if (z) {
                ajh ajhVar = defpackage.abft.a;
                cmwVarBd = den.bd(defpackage.abft.c, 0.0f, 14);
            } else {
                ajh ajhVar2 = defpackage.abft.a;
                cmwVarBd = den.bd(0.0f, defpackage.abft.c, 11);
            }
            aomy aomyVar3 = this.f;
            cmw cmwVarA2 = cmwVarAN.a(cmwVarBd);
            boolean zB2 = cavVar.B(aomyVar3) | cavVar.D(abfsVar) | cavVar.C(z) | cavVar.B(aomyVar);
            java.lang.Object objG4 = cavVar.g();
            if (zB2 || objG4 == cau.a) {
                objG4 = new defpackage.bud(aomyVar3, z, aomyVar, i);
                cavVar.w(objG4);
            }
            cmw cmwVarA3 = cmwVarA2.a(new defpackage.ayq((aonj) objG4, false));
            int i2 = 2 >>> (z ? 1 : 0);
            dkz dkzVar = den.an(cavVar).h;
            dkz dkzVar2 = dkz.a;
            dks dksVar = dkzVar.b;
            float fA = dksVar.a();
            long j = dksVar.b;
            dnd dndVar = dksVar.c;
            dmw dmwVar = dksVar.d;
            dmx dmxVar = dksVar.e;
            dmq dmqVar = dksVar.f;
            java.lang.String str = dksVar.g;
            long j2 = dksVar.h;
            dok dokVar = dksVar.i;
            doz dozVar = dksVar.j;
            dnx dnxVar = dksVar.k;
            long j3 = dksVar.l;
            dou douVar = dksVar.m;
            crc crcVar = dksVar.n;
            den denVar = dksVar.p;
            dkd dkdVar = dkzVar.c;
            int i3 = dkdVar.a;
            int i4 = dkdVar.b;
            long j4 = dkdVar.c;
            dpa dpaVar = dkdVar.d;
            dki dkiVar = dkzVar.d;
            dos dosVar = dkdVar.f;
            int i5 = dkdVar.g;
            int i6 = dkdVar.h;
            dpc dpcVar = dkdVar.i;
            abrz.k(this.g, cmwVarA3, 0L, dpy.g(16), (dnd) null, (dmq) null, 0L, new dot(i2), 0L, true != z2 ? 3 : 2, false, 1, 0, (aonj) null, new dkz(new dks(dow.b(cqdVar, fA), j, dndVar, dmwVar, dmxVar, dmqVar, str, j2, dokVar, dozVar, dnxVar, j3, douVar, crcVar, denVar), new dkd(i3, i4, j4, dpaVar, dkiVar != null ? dkiVar.b : null, dosVar, i5, i6, dpcVar), dkiVar), cavVar, 24576, 24576, 109548);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
