package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class afnc implements aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ afnc(afpl afplVar, aonj aonjVar, agf agfVar, agg aggVar, defpackage.afk afkVar, aono aonoVar, int i) {
        this.$cid = i;
        this.d = afplVar;
        this.c = aonjVar;
        this.f = agfVar;
        this.a = aggVar;
        this.b = afkVar;
        this.e = aonoVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [afk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid != 0) {
            cyb cybVar = (cyb) obj;
            cav cavVar = (cav) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            aooh.f(cybVar, "$this$LookaheadScope");
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != ((iIntValue & 8) == 0 ? cavVar.B(cybVar) : cavVar.D(cybVar)) ? 2 : 4;
            }
            if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
                for (abef abefVar : ((afpl) this.d).G()) {
                    java.lang.Object obj4 = this.e;
                    ?? r10 = this.b;
                    java.lang.Object obj5 = this.a;
                    java.lang.Object obj6 = this.f;
                    ?? r8 = this.c;
                    afsq.bt(cybVar, r8.a(abefVar.a), abefVar, (agf) obj6, (agg) obj5, (defpackage.afk) r10, cfo.j(-791513483, new ped(obj4, 16), cavVar), cavVar, 1572864 | (iIntValue & 14));
                }
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        cav cavVar2 = (cav) obj2;
        int iIntValue2 = ((java.lang.Integer) obj3).intValue();
        aooh.f((awy) obj, "$this$ModalBottomSheet");
        if (cavVar2.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
            java.lang.Object obj7 = this.a;
            com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity = (com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity) obj7;
            vaa vaaVar = googlePhotosBottomSheetActivity.r;
            acmg acmgVar = null;
            if (vaaVar == null) {
                aooh.j("ve");
                vaaVar = null;
            }
            acmg acmgVar2 = googlePhotosBottomSheetActivity.p;
            if (acmgVar2 == null) {
                aooh.j("interactionLogger");
            } else {
                acmgVar = acmgVar2;
            }
            java.lang.Object obj8 = this.e;
            cmw cmwVarB = vn.b(cmw.c);
            boolean zD = cavVar2.D(obj8) | cavVar2.D(obj7);
            java.lang.Object objG = cavVar2.g();
            if (zD || objG == cau.a) {
                objG = new abdu(obj8, obj7, 16);
                cavVar2.w(objG);
            }
            vaa vaaVar2 = vaaVar;
            afny.n(vaaVar2, acmgVar, (defpackage.fvx) this.f, cmwVarB, (android.accounts.Account) this.b, false, (akpg) this.c, (akoq) this.d, (afov) null, (afow) null, (aonj) objG, cavVar2, 0, 0);
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public /* synthetic */ afnc(com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity, defpackage.fvx fvxVar, android.accounts.Account account, akpg akpgVar, akoq akoqVar, aoss aossVar, int i) {
        this.$cid = i;
        this.a = googlePhotosBottomSheetActivity;
        this.f = fvxVar;
        this.b = account;
        this.c = akpgVar;
        this.d = akoqVar;
        this.e = aossVar;
    }
}
